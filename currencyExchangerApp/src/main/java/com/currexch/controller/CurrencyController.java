package com.currexch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.currexch.service.Exchanger;

@Controller
public class CurrencyController {
  
   private Exchanger exchangerObject;
   
   @Autowired
   public void setA(Exchanger exchangerObject) {
	   this.exchangerObject = exchangerObject;
   }

   @GetMapping("/")
   public String index() {
	   return "index";
   }
   @PostMapping("/result")
   public String writeRes(@RequestParam("exchangeRate") String exchangeRate,@RequestParam("base") String base,@RequestParam("target") String target,@RequestParam("amount") String amount, Model model) {
	   model.addAttribute("exchangeRate", exchangeRate);
	   model.addAttribute("base", base);
	   model.addAttribute("target", target);
	   model.addAttribute("amount", amount);
	   int am=Integer.parseInt(amount);
	   double result =exchangerObject.exchanger(exchangeRate, am, base, target);	   
	   model.addAttribute("result", result);
	   return "result";
   }
   
}
