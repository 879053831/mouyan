package com.mode.bo;

public class CardMassage {

	
	public static int CARDNUMBERLENGTH_8 = 8;
	public static String CARDNUMBERLENGTH_8_PREFIX = "";
	
	// 体检卡固有的编号
	private String cardNumber;
	// 系统可认卡号
	private String systemNumber;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		if(cardNumber.length()==CARDNUMBERLENGTH_8) {
			this.cardNumber = cardNumber;
			this.systemNumber = CARDNUMBERLENGTH_8_PREFIX + cardNumber;
		}
	}

	public String getSystemNumber() {
		return systemNumber;
	}

	public void setSystemNumber(String systemNumber) {
		this.systemNumber = systemNumber;
	}

}
