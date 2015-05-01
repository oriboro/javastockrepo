package com.oriborohov.javacourse;

import java.util.Date;

public class Stock {
	
	private static final int BUY = 0;
	private static final int SELL = 1;
	private static final int REMOVE = 2;
	private static final int HOLD = 3;
	
	private String symbol;
	private float ask;
	private float bid;
	private Date date;
	private int recommendation;
	private int stockQuantity;
	
	public Stock(String symbol, float ask, float bid, Date date){
		this.symbol = symbol;
		this.ask = ask;
		this.bid = bid;
		this.date = date;
	}
	
	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public float getAsk() {
		return ask;
	}

	public void setAsk(float ask) {
		this.ask = ask;
	}

	public float getBid() {
		return bid;
	}

	public void setBid(float bid) {
		this.bid = bid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getHtmlDescription(){
		return(new String("<b>Stock Symbol: </b>" + getSymbol()	+ " <b>Bid: </b>" + getBid() + " <b>Ask: </b>" + getAsk() + " <b>Date: </b>" + getDate()));
	}
}