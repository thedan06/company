package com.company.departments;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.company.departments.DepartmentsClient;

@Configuration
public class DepartmentsConfiguration {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.cellulant.wsdl");
		return marshaller;
	}
	
	@Bean
	public DepartmentsClient departmentsClient(Jaxb2Marshaller marshaller) {
		DepartmentsClient client = new DepartmentsClient();
		client.setDefaultUri("https://beep2.cellulant.com:9001/assessments/Company");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}
