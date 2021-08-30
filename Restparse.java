package Restapi;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import com.sun.xml.xsom.impl.scd.Iterators.Map;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Restparse {
@Test
	public void getAllIncidents() {
		//step1:get the url/endpoint for the services
	RestAssured.baseURI="https://dev117847.service-now.com/api/now/table/incident";
	//step2:authentication
	RestAssured.authentication=RestAssured.basic("admin", "jqIO1JKv4Ezc");
	Response response = RestAssured
			.given()
			.get();
	//get the incident number
	JsonPath jsonPath = response.jsonPath();
	
	List<String> list = jsonPath.getList("result.number");
	System.out.println(list.size());
	System.out.println(list);
	
	


	}

}
