package in.reqres.api.tc;

import org.testng.annotations.Test;
import utilities.Data;

public class SingleUserEndPointValidation {


    String resourceEndPoint  = "/api/users/";
    int pageNumber = 2;

    String GETListOfUsersEndPoint = Data.SERVICE_END_POINT + resourceEndPoint + pageNumber ;

    @Test
    public void singleUserEndPointValidation(){

        //https://reqres.in/api/users/2

        System.out.println(GETListOfUsersEndPoint);



    }
}
