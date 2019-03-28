package com.cloud.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.feign.server.EurekaClientServer;

@RestController
@RequestMapping(value = "/api")
public class EurekaClientController {

	@Autowired
	private EurekaClientServer clientServer;

	/**
	 * 
	 */
	@GetMapping(value = "eurekaClient/{value}", produces = { "application/json" })
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public String testFunction(@PathVariable(value = "value", required = true) String value) {

		return clientServer.testFunction(value);
	}
}
