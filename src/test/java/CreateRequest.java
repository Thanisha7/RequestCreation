import io.restassured.specification.RequestSpecification;
import lombok.Getter;
import lombok.Setter;

import java.security.PublicKey;

import static io.restassured.RestAssured.given;

@Getter
@Setter
public class CreateRequest {

    public String name;
    public String job;
    public String email;
    public String password;

    public RequestSpecification constructRequest(String name, String job)
    {
       RequestSpecification request= given()
                .body("{\n" +
                "    \"name\":"+name+ ",\n" +
                "    \"job\":"+job +
                "\n}");
        System.out.println("{\n" + "\"name\":"+name+ ",\n" + "\"job\":"+job + "\n}");
       return request;
    }
    public RequestSpecification constructRequest(String email , String password , String name)
    {
        RequestSpecification request=given()
                .body("{\n" +
                        "    \"email\":" + email +",\n" +
                        "    \"password\":"+password+"\n" +
                                "    \"name\":"+name+ "\n}");
        System.out.println("{\n" +
                "    \"email\":" + email +",\n" +
                "    \"password\":"+password+"\n" +
                        "    \"name\":"+name+ "\n}");
        return request;

    }
    public RequestSpecification constructRequest(String email)
    {
        RequestSpecification request=given()
                .body("{\n" +
                        "    \"email\":" + email +"\n}");
        System.out.println("{\n" +
                "    \"email\":" + email +"\n}");
        return request;
    }

}
