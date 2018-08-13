package org.seasar.sastruts.example.action;

import org.seasar.struts.annotation.Execute;

/**
 * 交通費精算アクション
 *
 * @author Naoko Horiuchi
 *
 */
public class TransportationAction {

//	@Resource
//	protected TransportationService transportationService;

//	@Resource
//	@ActionForm
//	protected TransportationForm transportationForm;
//
//	@Resource
//	protected PrmTransportationDto prmTransportationDto;

	/**
	 * 初期表示
	 *
	 * @return
	 */
	@Execute(validator = false)
	public String index() {
		//GetTransportationDto getDto = transportationServecice.doGetTransportationData();
		return "index.jsp";
	}

	/**
	 * 確認画面表示
	 *
	 * @return
	 */
	@Execute(validator = false)
	public String confirm() {
//		prmTransportationDto = Beans.createAndCopy(PrmTransportationDto.class, transportationForm).execute();
		return "confirm.jsp";
	}

	/**
	 * 登録処理
	 *
	 * @return
	 */
	@Execute(validator = false)
	public String complete() {
//		transportationServecice.setTransportaionData(prmTransportationDto);
		return "complete.jsp";
	}

}
