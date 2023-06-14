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
        .body("{\"Content\":\""+projectName + "\"}" )
        .post("https://todp.ly/api/projects.json");

        if (createProyectResponse.getStatusCode()=200){
            System.out.println("PROYECTO CREADO");

        }else{
            System.out.println("no se creo el proyecto");
            return;
        }
        Response deleteTpkenResponse = ReastAssured.given()
        .header("Token", token)
        .delete("https://todo.ly/api/authentication/token.json");

        if (deleteTpkenResponse.getStatusCode()==200){
            System.out.println("token eliminado")
        }else{
            System.out.println("no se elimino")
            return;
        }

        Response createProyectResponse2 = ReastAssured.given()
        .header("Token",token)
        .contentType("applicaction/json")
        .body("{\"Content\":\"Segundo proyecto \"}" )
        .post("https://todp.ly/api/projects.json");

        if(createProyectResponse2.getStatusCode==401){
            System.out.println("no se pudo crear el segundo proyecto")
        }else{
            System.out.println("se creo el segundo proyecto ")
        }



    }
}