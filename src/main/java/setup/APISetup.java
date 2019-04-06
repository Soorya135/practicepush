package setup;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.specification.RequestSpecification;

public class APISetup {


	@Test
	public static RequestSpecification setup() {
		RequestSpecification res = given().auth().basic("sk_test_Mk8ZqJJp6vy4jRm7pKiCA4vt", "");
		return res;

	}
}
