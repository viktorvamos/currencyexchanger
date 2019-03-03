package com.currexch.dao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.currexch.model.Currency;

import java.util.List;
//Class responsible for loading data from the database
@Mapper
public interface CurrencyMapper {

 @Select("SELECT * FROM CURRENCIES")
 List<Currency> findAll( );
 
}