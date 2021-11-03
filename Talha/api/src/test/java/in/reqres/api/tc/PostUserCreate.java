package in.reqres.api.tc;

import static org.testng.Assert.*;             //Must import for API
import static org.hamcrest.Matchers.*;        //Must import for API
import static io.restassured.RestAssured.*;  //Must import for API
import io.restassured.response.*;
import org.testng.annotations.Test;
import protocallObjectModel.PostMethods;
import utilities.Data;

public class PostUserCreate {

    String resourceEndPoint = "/api/users/";

    String POSTUsersEndPoint = Data.SERVICE_END_POINT + resourceEndPoint;

    @Test
    public void postUserCreate() {

        System.out.println(POSTUsersEndPoint);
        System.err.println("=======POST Operation Excution Start =============");

        Response PostCreateUserResponse = given().
                /*headers(Data.contentType, Data.ContentTypeValue,
                            Data.SubscriptionKey, Data.SubscriptionKeyValue,
                            Data.Authorization, Data.BearerToken + access_token)
                            */
                        given().
                        when().
                        body(PostMethods.createRandomUser(PostMethods.randomGivenUserName)).
                        post(POSTUsersEndPoint);

        PostCreateUserResponse.then()
                .assertThat()
                .time(lessThan(5000L))
                .statusCode(Data.SUCCESSFUL_CREATED_STATUS_CODE_201).log().all();
//                        .body("page", equalTo(2),
//                              "per_page", equalTo(6),
//                              "total", equalTo (12),
//                              "total_pages", equalTo (2));

        assertNotNull(PostCreateUserResponse);

    }
}

/*
import io.restassured.response.Response;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import static org.testng.Assert.*;
import protocallObjectModel.PostMethod;
import utilities.Data;

public class UserCreateEndPointValidation {

    */
/*https://reqres.in/api/users *//*

    String resourceEndPoint  = "/api/users/";

    String PostCreateEndPoint = Data.SERVICE_END_POINT + resourceEndPoint  ;

    @Test
    public void userCreateEndPointValidation(){

        System.out.println(PostCreateEndPoint);
        System.err.println("=======POST Operation Excution Start =============");

        Response PostCreateUserResponse = given().
                */
/*headers(Data.contentType, Data.ContentTypeValue,
                            Data.SubscriptionKey, Data.SubscriptionKeyValue,
                            Data.Authorization, Data.BearerToken + access_token)
                            *//*

                        body(PostMethod.createRandomUser(PostMethod.randomGivenUserName)).
                        when().
                        post(PostCreateEndPoint);

        PostCreateUserResponse.then()
                .assertThat()
                .time(lessThan(1000L))
                .statusCode(Data.SUCCESSFUL_CREATED_STATUS_CODE_201).log().all();
//        						.body("page", equalTo(2),
//        								"per_page", equalTo(6),
//        								"total", equalTo (12),
//        								"total_pages", equalTo (2));

        assertNotNull(PostCreateUserResponse);
    }
}
*/
