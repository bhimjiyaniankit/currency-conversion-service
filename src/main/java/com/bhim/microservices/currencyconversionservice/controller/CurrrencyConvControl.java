package com.bhim.microservices.currencyconversionservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bhim.microservices.currencyconversionservice.bean.CurrencyExchange;
import com.bhim.microservices.currencyconversionservice.proxy.CurrencyProxy;

@RestController
public class CurrrencyConvControl {

	
	@Autowired
	CurrencyProxy currencyProxy;
	
	@GetMapping("udtoinr")
	public CurrencyExchange getCurrencyDetails() {
		return currencyProxy.retriveValFromOtherService("USD", "INR");
	}
	
	@GetMapping("/currency-conversion/from/{from}/to/{to}/qty/{qty}")
	public CurrencyExchange getCurrencyDetails1(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal qty) {
		System.out.println("Request Received");
		Object cx = currencyProxy.retriveValFromOtherService(from, to);
		System.out.println("Resp received=========" + cx);
		CurrencyExchange cxs = (CurrencyExchange) cx;
		cxs.setTotalCalcAmount(qty.multiply(cxs.getConvertedValue()));
		return cxs;
	}
	
}
