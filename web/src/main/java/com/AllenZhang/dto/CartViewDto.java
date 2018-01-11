package com.AllenZhang.dto;

import java.math.BigDecimal;

public class CartViewDto {
	private String userAccount;
	private String bookName;
	private Integer num;
	private BigDecimal money;
	private BigDecimal totalPrices;
	
	public CartViewDto(String userAccount, String bookName, Integer num, BigDecimal money, BigDecimal totalPrices) {
		super();
		this.userAccount = userAccount;
		this.bookName = bookName;
		this.num = num;
		this.money = money;
		this.totalPrices = totalPrices;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public BigDecimal getTotalPrices() {
		return totalPrices;
	}

	public void setTotalPrices(BigDecimal totalPrices) {
		this.totalPrices = totalPrices;
	}
	
	

}
