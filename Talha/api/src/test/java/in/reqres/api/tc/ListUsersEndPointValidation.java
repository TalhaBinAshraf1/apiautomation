package in.reqres.api.tc;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import static org.testng.Assert.*;

import utilities.Data;


public class ListUsersEndPointValidation {

    // https://reqres.in/api/users?page=2
    String resourceEndPoint  = "/api/users?";
    String parameter = "page=";
    int pageNumber = 2;

    String GETListOfUsersEndPoint = Data.SERVICE_END_POINT + resourceEndPoint + parameter + pageNumber ;

    @Test
    public void listUsersEndPointValidation(){

        System.out.println(GETListOfUsersEndPoint);

        Response GetListResponse =
                        given().  //here we use Authentication token for login  like
                        when().   //here we use endpoint , which we want to validate.*qus korte hobe
                get(GETListOfUsersEndPoint);

        GetListResponse.then() // here we do assertion validation
                .assertThat()
                .time(lessThan(5000L)) //Given , By owner.SLA time(MLS ,S )
                                            // (service level agreement ) Fixed by product owner .
                .statusCode(Data.SUCCESSFUL_STATUS_CODE_200).log().all()
                .body("page", equalTo(2),
                        "per_page", equalTo(6),
                        "total", equalTo (12),
                        "total_pages", equalTo (2));
        assertNotNull(GetListResponse);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++ Code Execution Started Hare ++++++++++ ");
        String listResp = GetListResponse.getBody().asString();
        System.out.println(Data.RESPONSE_BODY_IS + listResp);

        int listStatusCode = GetListResponse.getStatusCode();
        System.err.println(Data.RESPONSE_STATUS_CODE_IS + listStatusCode);

        long listResponseTime = GetListResponse.getTime();
        System.out.println(Data.RESPONSE_TIME_IS + listResponseTime);





    }
}
