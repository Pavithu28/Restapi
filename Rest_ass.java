package Restapi;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.sun.xml.xsom.impl.scd.Iterators.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Rest_ass {
@Test
	public void getAllIncidents() {
		//step1:get the url/endpoint for the services
	RestAssured.baseURI="https://dev117847.service-now.com/api/now/table/incident";
	//step2:authentication
	RestAssured.authentication=RestAssured.basic("admin", "jqIO1JKv4Ezc");
	//step3:request type: get->response
	HashMap<String, String> params=new HashMap<String,String>();
	params.put("sysparm_fields", "number,sys_id,category");
	Response response = RestAssured
			.given()
			//.queryParam("category", "software")
			//.get();
	
	.queryParams(params).get();
	//step4:validate
	System.out.println(response.getStatusCode());
	//check what is the response format
	System.out.println(response.getContentType());
	//print response time
	System.out.println(response.getTime());
	//print response
	//response.prettyPrint();

	}

}
