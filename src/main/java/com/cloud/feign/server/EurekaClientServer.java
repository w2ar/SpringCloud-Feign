package com.cloud.feign.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cloud.feign.fallback.EurekaClientFall;

// FallBack 斷路器
@FeignClient(value = "eureka-client", fallback = EurekaClientFall.class)
public interface EurekaClientServer {

	@GetMapping(value = "api/client/{value}", produces = { "application/json" })
	public String testFunction(@PathVariable(value = "value", required = true) String value);
}
