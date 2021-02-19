package restassured.stepdefinition;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class GetHelper {

    private final ScenarioContext scenarioContext;

    public GetHelper(ScenarioContext scenarioContext) {
        this.scenarioContext = scenarioContext;
    }

    public void callGetCorreios(String url){
        scenarioContext.setRequestSpecification(given().log().all().contentType(ContentType.JSON));
        scenarioContext.setResponse(scenarioContext.getRequestSpecification().when().get(url));
        scenarioContext.setValidatableResponse(scenarioContext.getResponse().then().log().all());
    }

    public void validateResponseCorreios(){
//        Exemplo validando status code
        scenarioContext.getValidatableResponse().statusCode(200);
//        Exemplo validando que o campo não está vazio
        assertThat(scenarioContext.getValidatableResponse().extract().path("logradouro"), notNullValue());
//        Exemplo de comparação de valores
        assertThat(scenarioContext.getValidatableResponse().extract().path("localidade").toString(), is("Campinas"));
    }
}
