package org.seasar.sastruts.example.service;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.sastruts.example.dto.GetTransportationDto;
import org.seasar.sastruts.example.dto.PrmTransportationDto;

/**
 * 交通費精算サービス
 *
 * @author Naoko Horiuchi
 *
 */
public class TransportationService {

	// 前回登録データ取得用SQLのパス
	private final String GET_TRANSPORTATION_DATA = "org/seasar/sastruts/example/service/getTransportationData.sql";

	// 交通費情報登録用SQLのパス
	private final String SET_TRANSPORTATION_DATA = "org/seasar/sastruts/example/service/setTransportationData.sql";

	// DI
	@Resource
	protected JdbcManager jdbcManager;

	/**
	 * 前回登録したデータを取得する。
	 *
	 * @return
	 */
	public GetTransportationDto doGetTransportationData() {
		return jdbcManager.selectBySqlFile(GetTransportationDto.class, GET_TRANSPORTATION_DATA).getSingleResult();
	}

	/**
	 * 交通費の情報を登録する。
	 */
	public void setTransportaionData(List<PrmTransportationDto> prmTransportationDtoList) {
		jdbcManager.updateBySqlFile(SET_TRANSPORTATION_DATA, prmTransportationDtoList).execute();
	}

}
