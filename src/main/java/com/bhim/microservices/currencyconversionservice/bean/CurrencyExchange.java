package com.bhim.microservices.currencyconversionservice.bean;

import java.math.BigDecimal;

public class CurrencyExchange {

	private Long id;
	private String from;
	private String to;
	private BigDecimal ConvertedValue;
	private String enviorment;
	private BigDecimal totalCalcAmount;
	
	public CurrencyExchange(Long id, String from, String to, BigDecimal convertedValue, String enviorment,
			BigDecimal totalCalcAmount) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		ConvertedValue = convertedValue;
		this.enviorment = enviorment;
		this.totalCalcAmount = totalCalcAmount;
	}



	public BigDecimal getTotalCalcAmount() {
		return totalCalcAmount;
	}



	public void setTotalCalcAmount(BigDecimal totalCalcAmount) {
		this.totalCalcAmount = totalCalcAmount;
	}



	public CurrencyExchange() {
		super();
		// TODO Auto-generated constructor stub
	}



	public CurrencyExchange(Long id, String from, String to, BigDecimal convertedValue) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		ConvertedValue = convertedValue;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getFrom() {
		return from;
	}



	public void setFrom(String from) {
		this.from = from;
	}



	public String getTo() {
		return to;
	}



	public void setTo(String to) {
		this.to = to;
	}



	public BigDecimal getConvertedValue() {
		return ConvertedValue;
	}



	public void setConvertedValue(BigDecimal convertedValue) {
		ConvertedValue = convertedValue;
	}



	public String getEnviorment() {
		return enviorment;
	}



	public void setEnviorment(String enviorment) {
		this.enviorment = enviorment;
	}
	
	
	
}
