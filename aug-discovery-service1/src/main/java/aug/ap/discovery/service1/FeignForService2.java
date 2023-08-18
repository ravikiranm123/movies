package aug.ap.discovery.service1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="AP-SERVICE2-APP")
public interface FeignForService2 {
	
	@GetMapping("service2/greet")
	public String getGreeting();

	@GetMapping("service2/loadBalencedFromRibbon")
	public String getLoadBalencedResponse();

}
