package com.currexch.model;
//Class which represents a row from the database where currencies and their values for other currencies are stored.
public class Currency {
	
	private double huf;
	private double hufb;
	private double usd;
	private double usdb;
	private double gbp;
	private double gbpb;
	private double eur;
	private double eurb;
	private double chf;
	private double chfb;
		//giving results based on the parameters given by user.	
	public double getValueOfAmount(String exchangeRate, double amount, String requiredCurrencyName) {
		double result=0;
		//giving results based on sell or buy rates.
			switch (exchangeRate) {
			case "sell":result=sell(amount, requiredCurrencyName);			
				break;

			case "buy":result=buy(amount, requiredCurrencyName);
				break;
			}
								
			return result;							
	}
	//Exchange rate for selling from the bank or shroff side.
	public double sell(double amount, String requiredCurrencyName) {
		double result=0;
		switch (requiredCurrencyName) {
        case "usd":  result =amount*usd;
                 break;
        case "eur":  result =amount*eur;
        		break;
        case "gbp":  result =amount*gbp;
        		break;
        case "chf":  result =amount*chf;
        		break;
        case "huf":  result =amount*huf;
        		break;
		}
		return result;
	}
	//Exchange rate for buying from the bank or shroff side.
	public double buy(double amount, String requiredCurrencyName) {
		double result=0;
		switch (requiredCurrencyName) {
		case "usd":  result =amount*usdb;
             	break;
		case "eur":  result =amount*eurb;
    			break;
		case "gbp":  result =amount*gbpb;
    			break;
		case "chf":  result =amount*chfb;
    			break;
		case "huf":  result =amount*hufb;
    			break;
	}
	return result;
	}

}
