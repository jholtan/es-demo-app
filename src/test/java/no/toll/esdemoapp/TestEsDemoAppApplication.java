package no.toll.esdemoapp;

import org.springframework.boot.SpringApplication;

public class TestEsDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.from(EsDemoAppApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
