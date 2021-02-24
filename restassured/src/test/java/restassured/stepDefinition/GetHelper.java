package restassured.stepDefinition;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.core.IsNull;
import org.junit.Assert;

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

    public void callGetLogradouro(String url){
        scenarioContext.setRequestSpecification(RestAssured.given().log().all().contentType(ContentType.JSON));
        scenarioContext.setResponse(scenarioContext.getRequestSpecification().when().get(url));
        scenarioContext.setValidatableResponse(scenarioContext.getResponse().then().log().all());
    }

    public void campoIsNotEmpty(){
        Assert.assertThat(scenarioContext.getValidatableResponse().extract().path("logradouro"), IsNull.notNullValue());
    }

    public void callGetBairro(String url){
        scenarioContext.setRequestSpecification(RestAssured.given().log().all().contentType(ContentType.JSON));
        scenarioContext.setResponse(scenarioContext.getRequestSpecification().when().get(url));
        scenarioContext.setValidatableResponse(scenarioContext.getResponse().then().log().all());
    }

    public void callGetCidade(String url) {
        scenarioContext.setRequestSpecification(RestAssured.given().log().all().contentType(ContentType.JSON));
        scenarioContext.setResponse(scenarioContext.getRequestSpecification().when().get(url));
        scenarioContext.setValidatableResponse(scenarioContext.getResponse().then().log().all());
    }

    public void callGetUf(String url) {
        scenarioContext.setRequestSpecification(RestAssured.given().log().all().contentType(ContentType.JSON));
        scenarioContext.setResponse(scenarioContext.getRequestSpecification().when().get(url));
        scenarioContext.setValidatableResponse(scenarioContext.getResponse().then().log().all());
    }
}
