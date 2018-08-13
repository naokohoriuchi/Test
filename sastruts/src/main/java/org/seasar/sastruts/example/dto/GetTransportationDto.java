package org.seasar.sastruts.example.dto;

import java.util.List;

/**
 * 取得結果格納DTO
 *
 * @author Naoko Horiuchi
 */
public class GetTransportationDto {

	/** 日付（申請日） */
	public String writeDate;

	/** 部署 */
	public String department;

	/** 名前 */
	public String name;

	/** 日付（乗車日） */
	public List<String> boardingDateList;

	/** 行き先 */
	public List<String> destinationList;

	/** 乗車種別 */
	public List<String> typeList;

	/** 出発地 */
	public List<String> departureList;

	/** 目的地 */
	public List<String> destinationStationList;

	/** 金額 */
	public List<String> moneyList;

	/** 備考欄 */
	public List<String> remarksList;

}
