package RestAssuredTests;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;


import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class RegressAPI extends BaseTest {

    @Test
    public void listUsers(){
        try {
            given().when().get(baseURI + "/api/users?page=2").then().log().body();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Test
    public void singleUser(){
        try {
            given().when().get(baseURI + "/api/users/2").then().log().body();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Test
    public void singleUserNotFound(){
        try {
            given().when().get(baseURI + "/api/users/23").then().log().body();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Test
    public void listResource(){
        try {
            Response response = given().when().get(baseURI + "/api/unknown").then().extract().response();
            JsonPath jsonPath = response.jsonPath();
            JSONObject jsonObject = new JSONObject(jsonPath);

            HashMap<String, Object> hashMap = new HashMap<>(jsonObject.toMap());
            System.out.println(hashMap);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Test
    public void singleResource(){
        try {
            given().when().get(baseURI +"/api/unknown/2").then().log().body();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Test
    public void singleResourceNotFound(){
        try {
            given().when().get(baseURI +"/api/unknown/23").then().log().body();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Test
    public void createUsers(){
        try {
            given().when().body("{\n" +
                    "    \"name\": \"morpheus\",\n" +
                    "    \"job\": \"leader\"\n" +
                    "}").post(baseURI +"/api/users").then().log().body();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
