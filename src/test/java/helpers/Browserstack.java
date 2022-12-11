package helpers;
import static io.restassured.RestAssured.given;
import static java.lang.String.format;

public class Browserstack {

    //curl -u "YOUR_USERNAME:YOUR_ACCESS_KEY" -X GET "https://api.browserstack.com/app-automate/sessions/<session-id>.json"
    public static String getVideoUrl(String sessionID){


        String url = format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionID);
        return given()
                .log().all()
                .auth().basic("hwqa_uomRki", "u1VhNMZ58D8FuosP4XxR")
                .when()
                .get(url)
                .then()
                .log().all()
                .statusCode(200)
                .extract().path("automation_session.video.url");

    }
}
