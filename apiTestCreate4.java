import io.restassired.RestAssured;
import io.restassured.response.Response;

public class TodoLyTest{
    public class coid main(String []args){

        String token = "token":
        String conten1 = "Item1";
        String conten2 = "Item2";
        String conten3 = "Item3";
        String conten4 = "Item4";

        createItem(token, conten1);
        createItem(token, conten2);
        createItem(token, conten3);
        createItem(token, conten4);

        deleteAllItems(Token);

    }

    private static void createItem(String token,String content){
        Response response = RestAssured.given()
        .header("Token",token)
        .contentType("applicaction/json")
        .body("{\"Content\":\""+content + "\"}" )
        .post("https://todp.ly/api/pitems.json");

        if (response.getStatusCode()==200)
    }
}