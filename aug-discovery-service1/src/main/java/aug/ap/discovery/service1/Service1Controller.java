package aug.ap.discovery.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;


@RestController
@RequestMapping("/service1")
public class Service1Controller {

	@Value("${Message: This is Default message}")
	private String message;

	@GetMapping("/message")
	public String getMessage() {
		return message;
	}

	@Autowired
	RestTemplateBuilder restTemplateBuilder;

	@Autowired
	EurekaClient eurekaClient;
	
	@Autowired
	FeignForService2 connectToService2;
	

	@GetMapping("/getService2APIusingEurekaClient")
	public String invokeService2Greet() {

		RestTemplate restTemplate = restTemplateBuilder.build();

		InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("AP-SERVICE2-APP", false);

		String baseUrl = instanceInfo.getHomePageUrl();

		baseUrl = baseUrl + "/service2/greet";

		return restTemplate.getForObject(baseUrl, String.class);

	}
	
	@GetMapping("/getservice2APIusingFeignClient")
	public String invokeService2greetUsingFeign() {
		return connectToService2.getGreeting();
		
	}
	@GetMapping("/demoClientSlideBalenced")
	public String invokeService2DemoLoadBalancing() {
		return connectToService2.getLoadBalencedResponse();
	}
}
		


