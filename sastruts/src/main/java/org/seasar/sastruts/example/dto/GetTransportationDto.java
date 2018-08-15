package org.seasar.sastruts.example.dto;

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
	public String boardingDate;

	/** 行き先 */
	public String destination;

	/** 乗車種別 */
	public String type;

	/** 出発地 */
	public String departure;

	/** 目的地 */
	public String destinationStation;

	/** 金額 */
	public String money;

	/** 備考欄 */
	public String remarks;

	/** 合計金額 */
	public String total;

}
