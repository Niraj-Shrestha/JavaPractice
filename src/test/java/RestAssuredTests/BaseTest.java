package RestAssuredTests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    @BeforeTest
    public void setUp(){
        RestAssured.baseURI = "https://reqres.in";
    }
}
