package Restapi;

import java.io.File;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Createincident {
	@Test
	public void getAllIncidents() {
		
	RestAssured.baseURI="https://dev117847.service-now.com/api/now/table/incident";
	
	RestAssured.authentication=RestAssured.basic("admin", "jqIO1JKv4Ezc");
	File file = new File("*./data/createinci.json");
	Response response = RestAssured
			.given()
			.contentType(ContentType.JSON)
			.body(file)
			.post();
	response.prettyPrint();
	System.out.println(response.statusCode());

}
}