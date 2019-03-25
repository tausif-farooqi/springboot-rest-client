package com.springboot.service.springbootrestclient;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Proxy for Company Stock History service. This will make use Eureka Naming server to
 * get the endpoint of the service.
 * 
 * @author Tausif Farooqi
 *
 */
@FeignClient(name="company-stock-history", configuration=FeignClientConfig.class)
@RibbonClient("company-stock-history")
public interface CompanyServiceProxy {
	@GetMapping("/companies")
	Object getCompanies();
	
	@GetMapping("/companies/{symbol}")
	Object getOneCompany(@PathVariable("symbol") String symbol);
}
