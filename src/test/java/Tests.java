import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Tests {
    @Test
    public void creationOfNewUsers()
    {
        RequestSpecification request1=new CreateRequest().constructRequest("test1","testing");
        Response response1=request1.post("https://reqres.in/api/users");
        Assert.assertEquals(response1.statusCode(),201);

        RequestSpecification request2=new CreateRequest().constructRequest("test@gmail.com","test1234","test1");
        Response response2=request2.post("https://reqres.in/api/users");
        Assert.assertEquals(response2.statusCode(),201);

        RequestSpecification request3=new CreateRequest().constructRequest("test3@gmail.com");
        Response response3=request3.post("https://reqres.in/api/users");
        Assert.assertEquals(response3.statusCode(),201);

    }
}
