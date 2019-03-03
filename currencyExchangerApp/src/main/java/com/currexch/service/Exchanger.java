package com.currexch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.currexch.dao.CurrencyMapper;
import com.currexch.model.Currency;
//Class for exchange the required amount of money based on the given parameters by the user.
@Service
public class Exchanger {
	
	@Autowired
	private CurrencyMapper currencyMapper;
	
	private Currency huf;
	private Currency usd;
	private Currency gbp;
	private Currency eur;
	private Currency chf;	

	public double exchanger(String exchangeRate, int amount, String base,String target) {
		
		double result=0;
		huf=currencyMapper.findAll().get(0); //loading data from database.
		usd=currencyMapper.findAll().get(1);
		gbp=currencyMapper.findAll().get(2);
		eur=currencyMapper.findAll().get(3);
		chf=currencyMapper.findAll().get(4);
		
		switch (base) {
        case "huf":  result = huf.getValueOfAmount(exchangeRate, amount, target);
                 break;		
        case "usd":  result = usd.getValueOfAmount(exchangeRate, amount, target);
        		 break;		
        case "eur":  result = eur.getValueOfAmount(exchangeRate, amount, target);
        		 break;		
        case "gbp":  result = gbp.getValueOfAmount(exchangeRate, amount, target);
        		 break;		
        case "chf":  result = chf.getValueOfAmount(exchangeRate, amount, target);
        		 break;		
					  }
	return result;
	}
			
}