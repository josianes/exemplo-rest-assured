package restassured.stepDefinition;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GetHelper {

    private final ScenarioContext scenarioContext;

    public GetHelper(ScenarioContext scenarioContext) {
        this.scenarioContext = scenarioContext;
    }

    public void callGetCorreios(String url){
        scenarioContext.setRequestSpecification(RestAssured.given().log().all().contentType(ContentType.JSON));
        scenarioContext.setResponse(scenarioContext.getRequestSpecification().when().get(url));
        scenarioContext.setValidatableResponse(scenarioContext.getResponse().then().log().all());
    }

    public void validateResponseCorreios(){
        scenarioContext.getValidatableResponse().statusCode(200);
    }

}
