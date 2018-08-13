package org.seasar.sastruts.example.action;

import javax.annotation.Resource;

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

	/*
	 * 表示用DTO
	 */
	public DspTransportationDto dspTransportationDto;

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
		prmTransportationDto = Beans.createAndCopy(PrmTransportationDto.class, transportationForm).execute();
		dspTransportationDto = Beans.createAndCopy(DspTransportationDto.class, prmTransportationDto).execute();
		return "confirm.jsp";
	}

	/**
	 * 登録処理
	 *
	 * @return
	 */
	@Execute(validator = false)
	public String complete() {
		transportationService.setTransportaionData(prmTransportationDto);
		return "complete.jsp";
	}

}
