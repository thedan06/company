/**
 * 
 */
package com.company.departments;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.company.wsdl.FetchDepartmentsResponse;;
/**
 * @author Dustan.Kyala
 *
 */
public class DepartmentsClient extends WebServiceGatewaySupport{
	private static final Logger log = LoggerFactory.getLogger(DepartmentsClient.class);
	
	public FetchDepartmentsResponse getReturn() {
		
	}
}
