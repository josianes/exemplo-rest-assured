package restassured.stepdefinition;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScenarioContext {

    private RequestSpecification requestSpecification;
    private Response response;
    private ValidatableResponse validatableResponse;
}
