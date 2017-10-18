package com.josecuentas.SpringBootBasic.restClient;

import com.josecuentas.SpringBootBasic.entity.BaseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	@RequestMapping("/")
	public BaseEntity<Object> hello() {
		BaseEntity<Object> hello = new BaseEntity<Object>();
		hello.status = BaseEntity.SUCCESS;
		hello.msg = "OK";
		hello.data = "";
		return hello;
	}
	
}
