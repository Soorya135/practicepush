package TestCases;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import setup.APISetup;

public class CreateCustomerAPITest extends APISetup {

	@Test
	public void test1() {
		
	    RequestSpecification res1 = setup();	
	//	RequestSpecification res = given().auth().basic("sk_test_Mk8ZqJJp6vy4jRm7pKiCA4vt", "")
		//		.formParam("email", "goli@ahol.com")
			//	.formParam("description", "This is test description for the sampel customer").log().all();
		
		res1.formParam("email", "holigae@ahol.com")
		.formParam("description", "This is test description for the sampel customer").log().all();
		Response res11 = res1.post("https://api.stripe.com/v1/customers");
		System.out.println(res11.prettyPrint());
		System.out.println("To get the value in the respnse fied is");
		System.out.println(res11.jsonPath().get("subscriptions.total_count"));
		assertEquals(0,res11.jsonPath().get("subscriptions.total_count"));
		
		
	}

}
