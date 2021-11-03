package protocallObjectModel;

import java.util.Random;

public class PostMethods {

    public static String raGivennames[] = {"abcde", "fghij", "klmno", "pqrst", "uvwxyx"};
    public static String randomGivenUserName =  raGivennames[ new Random().nextInt(raGivennames.length)];


    public static String createRandomUser ( String username ){
        String createUsers =
                "{\n" +
                        "    \"name\": "+username+",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}";

        return createUsers ;

    }
}
