package org.embed;

import org.springframework.boot.Banner;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMyApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SpringMyApplication.class);
		application.setBannerMode(Mode.OFF);
		application.setAdditionalProfiles("myprofile");
		application.run(args);
	}

}
