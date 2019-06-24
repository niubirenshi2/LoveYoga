package org.team3.loveyoga.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/add")
public class AddressController {

	@RequestMapping("/getAddress")
	public String getAddress(String address) {
		System.out.println(address);
		return "";
	}
}
