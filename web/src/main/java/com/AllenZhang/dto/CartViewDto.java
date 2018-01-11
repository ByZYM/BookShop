package com.AllenZhang.dto;

import java.math.BigDecimal;

public class CartViewDto {
	private Integer user_cart_id;
	private String user_account;
	private Integer goods_id;
	private String book_name;
	private Integer num;
	private BigDecimal money;
	private BigDecimal total_prices;
	
	
	public CartViewDto(Integer user_cart_id, String user_account, Integer goods_id, String book_name, Integer num, BigDecimal money, BigDecimal total_prices) {
		super();
		this.user_cart_id = user_cart_id;
		this.user_account = user_account;
		this.goods_id = goods_id;
		this.book_name = book_name;
		this.num = num;
		this.money = money;
		this.total_prices = total_prices;
	}
	
	public Integer getUser_cart_id() {
		return user_cart_id;
	}
	public void setUser_cart_id(Integer user_cart_id) {
		this.user_cart_id = user_cart_id;
	}
	public String getUser_account() {
		return user_account;
	}
	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}
	public Integer getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(Integer goods_id) {
		this.goods_id = goods_id;
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
