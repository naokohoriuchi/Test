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
	public List<String> boardingDate;

	/** 行き先 */
	public List<String> destination;

	/** 乗車種別 */
	public List<String> type;

	/** 出発地 */
	public List<String> departure;

	/** 目的地 */
	public List<String> destinationStation;

	/** 金額 */
	public List<String> money;

	/** 備考欄 */
	public List<String> remarks;

}
