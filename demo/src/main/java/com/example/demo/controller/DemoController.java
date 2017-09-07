package com.example.demo.controller;


import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BackendData;


@CrossOrigin(maxAge = 5000)
@RestController
public class DemoController {

	@RequestMapping(value = "/demo/callAdyen", method = RequestMethod.POST)		 
	public String callAdyen(@RequestBody Map<String, Object> payload) {	
		if (null != payload) {	
			for(Map.Entry<String, Object> entry: payload.entrySet()) {
				System.out.println(entry.getKey() +"--"+entry.getValue());
			}
			/*System.out.println(data.getCustomerId());
			System.out.println(data.getOrderId());
			System.out.println(data.getShippingId());
			System.out.println(data.getOtherDetails());*/
			return "{\"msg\":\"success\"}";	
		}else {
			return "{\"msg\":\"failed\"}";
		}
	}
}
