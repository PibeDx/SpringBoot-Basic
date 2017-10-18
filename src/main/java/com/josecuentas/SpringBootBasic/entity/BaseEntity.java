package com.josecuentas.SpringBootBasic.entity;

public class BaseEntity<Data> {
	
	public static final Integer SUCCESS = 1;
	public static final Integer ERROR = 0;
	
	public Integer status;
	public String msg;
	public Data data;
	
}
