package com.cloud.feign.fallback;

import org.springframework.stereotype.Component;

import com.cloud.feign.server.EurekaClientServer;

@Component
public class EurekaClientFall implements EurekaClientServer{

	@Override
	public String testFunction(String value) {
		return "Sorry Server Error [Feign]";
	}
}
