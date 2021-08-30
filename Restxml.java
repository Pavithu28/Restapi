package Restapi;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Restxml {
	@Test
	public void getAllIncidents() {
		//step1:get the url/endpoint for the services
	RestAssured.baseURI="https://dev117847.service-now.com/api/now/table/incident";
	//step2:authentication
	RestAssured.authentication=RestAssured.basic("admin", "jqIO1JKv4Ezc");
	Response response = RestAssured
			.given()
			.accept(ContentType.XML)
		//	.accept("application/xml")
			.get();

	
	System.out.println(response.getStatusCode());
	response.prettyPrint();
	
	


	}

}
