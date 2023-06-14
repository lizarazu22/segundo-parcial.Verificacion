import io.restassired.RestAssured;
import io.restassured.response.Response;

public class TodoLyTest {
    public static void  main (String []args){

        String username = "nombre.de,usuario";
    
        String password = "contrasena";

        Response createUserResonde = RestAssured.given()
        .contentType("applicaction/json")
        .body("{\"email\": \""+username+"\", \"password\":\""+password+ "\"}")
        ,post ("https"://todo.ly/api/user.json);

        if (createUserResonde.getStatusCode()==200){
            System.out.println("USUARIO CRADO ");

        }else{
            System.out.println("no se creo usuario");
            return;
        }
        String toke ="";

        response getTokenResponse = RestAssured.given()
        .contentType("applicaction/json")
        .body("{\"email\": \""+username+"\", \"password\":\""+password+ "\"}")
        ,post ("https"://todo.ly/api/user.json);

        if(getTokenResponse.getStatusCode()==200){
            toke= getTokenResponse.jsonPath.getString.("Token");
            System.out.println("se tiene el token"+token);

        }else{
            System.out.println("no se tiene el token");
            return;

        }

        String project = "nuevo Proyecto";

        Response createProyectResponse =ReastAssured .given()
        .header("Token",token)
        .contentType("applicaction/json")
        .body("{\"Content\":\\""+projectName + "\"}" )


    }
}