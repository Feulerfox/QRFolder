package com.business.verce.vercia;

import com.business.verce.vercia.controller.VerController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableConfigurationProperties
//@EntityScan(basePackages = {"com/business/verce/vercia/model"})     //essendo in un pacchetto diverso ho dovuto aggiungere queste ultime due annotazioni
//@ComponentScan(basePackageClasses = VerController.class)  //questi 3 non servono se sono nello stesso pacchetto
public class VerciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VerciaApplication.class, args);
	}

}
