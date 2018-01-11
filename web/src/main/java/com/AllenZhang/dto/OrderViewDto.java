package com.AllenZhang.dto;

import java.math.BigDecimal;

public class OrderViewDto {
	private Integer id;
	private Integer user_order_id;
	private String status;
	private String user_account;
	private String book_name;
	private Integer num;
	private BigDecimal money;
	private BigDecimal total_prices;
	
	
	public OrderViewDto(Integer id, Integer user_order_id, String status, String user_account, String book_name, Integer num, BigDecimal money, BigDecimal total_prices) {
		super();
		this.id = id;
		this.user_order_id = user_order_id;
		this.status = status;
		this.user_account = user_account;
		this.book_name = book_name;
		this.num = num;
		this.money = money;
		this.total_prices = total_prices;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUser_order_id() {
		return user_order_id;
	}
	public void setUser_order_id(Integer user_order_id) {
		this.user_order_id = user_order_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUser_account() {
		return user_account;
	}
	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
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
	public BigDecimal getTotal_prices() {
		return total_prices;
	}
	public void setTotal_prices(BigDecimal total_prices) {
		this.total_prices = total_prices;
	}
	
	
}
