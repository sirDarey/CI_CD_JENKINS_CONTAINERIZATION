package sirdarey;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class Application {

	public static Logger logger = LoggerFactory.getLogger(Application.class);
	
	@GetMapping("/welcome")
	public String welcome () {
		return  "Running on Docker";
	}
	
	@PostConstruct
	public void init () {
		logger.info("Application Started...");
		logger.info("Application Started second time...");
	}
	
	public static void main(String[] args) {
		logger.info("Application Executed...");
		logger.info("Application Executed Second time...");
		SpringApplication.run(Application.class, args);
	}

}
