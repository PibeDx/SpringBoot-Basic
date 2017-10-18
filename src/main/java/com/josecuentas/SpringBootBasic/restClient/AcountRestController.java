package com.josecuentas.SpringBootBasic.restClient;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcountRestController {

	@RequestMapping("/login")
	public @ResponseBody ResponseEntity<String> login(@AuthenticationPrincipal UserDetails user) {
		String message = "Hello " + user.getUsername();
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}
	
}
