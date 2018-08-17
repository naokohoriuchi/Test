package org.seasar.sastruts.example.service;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.sastruts.example.dto.GetEmployeeDto;
import org.seasar.sastruts.example.dto.GetTransportationDto;
import org.seasar.sastruts.example.dto.PrmTransportationDto;

/**
 * 交通費精算サービス
 *
 * @author Naoko Horiuchi
 *
 */
public class TransportationService {

	/*
	 * 定数
	 */
	// SQLファイルのルートパス
	private static final String SQL_FILE_ROOT_PATH = "org/seasar/sastruts/example/service/";

	// 前回登録データ取得用SQLのパス
	private static final String GET_TRANSPORTATION_DATA = SQL_FILE_ROOT_PATH + "getTransportationData.sql";

	// 交通費情報登録用SQLのパス
	private static final String SET_TRANSPORTATION_DATA = SQL_FILE_ROOT_PATH + "setTransportationData.sql";

	// 部署名全取得用SQLのパス
	private static final String GET_DEPARTMENT_MASTER_DATA = SQL_FILE_ROOT_PATH + "getDepartmentData.sql";

	// 社員名全取得用SQLのパス
	private static final String GET_EMPLOYEE_DATA = SQL_FILE_ROOT_PATH + "getEmployeeData.sql";

	/*
	 * DI
	 */
	@Resource
	protected JdbcManager jdbcManager;

	/**
	 * 前回登録したデータを取得する。
	 *
	 * @return
	 */
	public List<GetTransportationDto> doGetTransportationData() {
		return jdbcManager.selectBySqlFile(GetTransportationDto.class, GET_TRANSPORTATION_DATA).getResultList();
	}

	/**
	 * 部署名をテーブルから全取得する。
	 *
	 * @return
	 */
	public List<String> getDepartment() {
		return jdbcManager.selectBySqlFile(String.class, GET_DEPARTMENT_MASTER_DATA).getResultList();
	}

	/**
	 * 社員名をテーブルから全取得する。
	 *
	 * @return
	 */
	public List<GetEmployeeDto>getEmployee() {
		return jdbcManager.selectBySqlFile(GetEmployeeDto.class, GET_EMPLOYEE_DATA).getResultList();
	}

	/**
	 * 交通費の情報を登録する。
	 */
	public void setTransportaionData(PrmTransportationDto prmDto) {
		jdbcManager.updateBySqlFile(SET_TRANSPORTATION_DATA, prmDto).execute();
	}

}
