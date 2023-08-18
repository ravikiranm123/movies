package aug.ap.discovery.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class AugDiscoveryService1Application {

	public static void main(String[] args) {
		SpringApplication.run(AugDiscoveryService1Application.class, args);
	}

}
