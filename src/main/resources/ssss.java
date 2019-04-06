import static io.restassured.RestAssured.given;

import io.restassured.specification.RequestSpecification;

public class ssss {


	@Test
	public static RequestSpecification setup() {
		RequestSpecification res = given().auth().basic("sk_test_Mk8ZqJJp6vy4jRm7pKiCA4vt", "");
		return res;

	}

}
