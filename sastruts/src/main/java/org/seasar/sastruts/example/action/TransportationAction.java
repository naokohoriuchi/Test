package org.seasar.sastruts.example.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.seasar.sastruts.example.dto.GetTransportationDto;
import org.seasar.sastruts.example.dto.PrmTransportationDto;
import org.seasar.sastruts.example.form.TransportationForm;
import org.seasar.sastruts.example.service.TransportationService;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

/**
 * 交通費精算アクション
 *
 * @author Naoko Horiuchi
 *
 */
public class TransportationAction {

	/*
	 * DI
	 */
	// 交通費情報取得・登録用サービス
	@Resource
	protected TransportationService transportationService;

	// 入力フォーム
	@Resource
	@ActionForm
	protected TransportationForm transportationForm;

	// パラメータDTO
	@Resource
	protected PrmTransportationDto prmTransportationDto;

	@Resource
	protected HttpSession session;

	/*
	 * リスト
	 */
	// パラメータ用リスト
	public List<PrmTransportationDto> prmTransportationDtoList = new ArrayList<PrmTransportationDto>();

	// 交通費情報表示用リスト
	public List<GetTransportationDto> getTransportationDto = new ArrayList<GetTransportationDto>();

	// 部署一覧表示用リスト
	public List<String> departmentList = new ArrayList<String>();

	/**
	 * 初期表示
	 *
	 * @return
	 */
	@Execute(validator = false)
	public String index() {
		// 前回の登録情報を取得
		getTransportationDto = transportationService.doGetTransportationData();

		// 部署名一覧取得
		List<String> getList = transportationService.getDepartment();
		for (String list: getList) {
			departmentList.add(list);
		}
		return "index.jsp";
	}

	/**
	 * 確認画面表示
	 *
	 * @return
	 */
	@Execute(validator = false)
	public String confirm() {

		// 詰め替え
		for (int i = 0; i < transportationForm.boardingDate.size(); i++) {
			prmTransportationDto.writeDate = transportationForm.writeDate;
			prmTransportationDto.department = transportationForm.department;
			prmTransportationDto.name = transportationForm.name;
			prmTransportationDto.boardingDate = transportationForm.boardingDate.get(i);
			prmTransportationDto.destination = transportationForm.destination.get(i);
			prmTransportationDto.type = transportationForm.type.get(i);
			prmTransportationDto.departure = transportationForm.departure.get(i);
			prmTransportationDto.arrow = transportationForm.arrow.get(i);
			prmTransportationDto.destinationStation = transportationForm.destinationStation.get(i);
			prmTransportationDto.money = transportationForm.money.get(i);
			prmTransportationDto.remarks = transportationForm.remarks.get(i);
			prmTransportationDto.total = transportationForm.total;
			prmTransportationDtoList.add(prmTransportationDto);

		}
		session.setAttribute("session", prmTransportationDtoList);
		return "confirm.jsp";
	}

	/**
	 * 登録処理
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Execute(validator = false)
	public String complete() {
		List<PrmTransportationDto> prmTransportationDtoList = (List<PrmTransportationDto>) session
				.getAttribute("session");
		for (PrmTransportationDto prmDto : prmTransportationDtoList) {
			transportationService.setTransportaionData(prmDto);
		}

		return "complete.jsp";
	}

}
