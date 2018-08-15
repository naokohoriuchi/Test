package org.seasar.sastruts.example.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.seasar.framework.beans.util.Beans;
import org.seasar.sastruts.example.dto.DspTransportationDto;
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
	 * 表示用DTO
	 */
	public List<DspTransportationDto> dspTransportationDto = new ArrayList<DspTransportationDto>();

	private List<PrmTransportationDto> prmTransportationDtoList = new ArrayList<PrmTransportationDto>();

	/**
	 * 初期表示
	 *
	 * @return
	 */
	@Execute(validator = false)
	public String index() {
		// GetTransportationDto getDto =
		// transportationService.doGetTransportationData();
		return "index.jsp";
	}

	/**
	 * 確認画面表示
	 *
	 * @return
	 */
	@Execute(validator = false)
	public String confirm() {
		// prmTransportationDto =
		// Beans.createAndCopy(PrmTransportationDto.class,
		// transportationForm).execute();

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
		Beans.copy(prmTransportationDtoList, dspTransportationDto);
		session.setAttribute("session", prmTransportationDto);
		return "confirm.jsp";
	}

	/**
	 * 登録処理
	 *
	 * @return
	 */
	@Execute(validator = false)
	public String complete() {
		prmTransportationDto = (PrmTransportationDto) session.getAttribute("session");
		// List<PrmTransportationDto> prmTransportationDtoList = new
		// ArrayList<PrmTransportationDto>();
		prmTransportationDtoList.add(prmTransportationDto);
		transportationService.setTransportaionData(prmTransportationDtoList);
		return "complete.jsp";
	}

}
