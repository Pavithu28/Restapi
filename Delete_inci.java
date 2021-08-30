package Chaining;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Delete_inci extends Baseclass{
	@Test(dependsOnMethods="Chaining.Create_in.getAllIncidents")
	public void delete() {
		
		Response response = request
				.get(sys_id);
			
		System.out.println(response.getStatusCode());
		response.prettyPrint();

}
}
