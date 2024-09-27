import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.InputStream;

import static org.hamcrest.MatcherAssert.*;
public class Amruta {
	
	RequestSpecification ReqSpec;
	
	@BeforeTest
	
	public void initiateRequest()
	{
		 ReqSpec = given().baseUri("https://reqres.in");
		
	}
	
	@Test
	
	public void m1()
	{
		Response  Res = ReqSpec.when()
		 .get("/api/users")
		 .then()
		 //.log().all()
		.extract()
		.response();
		
		JsonPath js = Res.jsonPath();
		
		
		String name = JsonPath.from((InputStream) Res).get("data[2].first_name");
		// System.out.println(name);
		 assertThat(name, equalTo("Emma"));

}
}
