package augapresilience4j;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RefreshScope
@RequestMapping("/myresiliencedemo")
@RestController
public class AugApResilienceController {

	// let us that public domain available API==>bpredapi.com
	@Value("${Message :: Hello this is a abs DEFAULT message}")
	private String message;

	private String boredAPI = "http://www.boredapi.com/api/activity";

	RestTemplate restTemplate;

	public AugApResilienceController(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;

	}

	@GetMapping("/message")
	public String getMessage() {
		log.info("*************");
		return this.message;
	}

	@GetMapping("/getcircutebreaker")
	public String getRandomActivityFromBoredAPI() {

		ResponseEntity<BoredAPIActivityDTO> boredAPIresponse = restTemplate.getForEntity(boredAPI,
				BoredAPIActivityDTO.class);
		return boredAPIresponse.getBody().getActivity();

	}
}
