/**
 * 
 */
package com.company.staffs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.company.staffs.StaffsClient;;

/**
 * @author Dustan.Kyala
 *
 */
@Configuration
public class StaffsConfiguration {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.cellulant.wsdl");
		return marshaller;
	}
	
	@Bean
	public StaffsClient staffClient(Jaxb2Marshaller marshaller) {
		StaffsClient client = new StaffsClient();
		client.setDefaultUri("https://beep2.cellulant.com:9001/assessments/Company");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}
