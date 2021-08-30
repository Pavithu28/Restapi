package Chaining;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Create_in extends Baseclass{
	@Test
	public void getAllIncidents() {
		
		File file = new File("./Data1/createinci.json");
		Response response = RestAssured
				.given()
				.contentType(ContentType.JSON)
				.body(file)
				.post();
		response.prettyPrint();
		System.out.println(response.statusCode());
		JsonPath jsonresponse = response.jsonPath();
		sys_id = jsonresponse.get("result.sys_id");
		System.out.println("The sys_id is: "+sys_id);

}
}


