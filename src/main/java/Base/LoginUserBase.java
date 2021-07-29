package Base;


import Configs.DriverUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.net.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.openqa.selenium.Cookie;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.awt.*;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

public  abstract class  LoginUserBase {
    protected String username;
    protected String paswword = "NowLew97!";
    protected String userKey = "ad2d9589-8177-4656-a83a-2c82cf981faa";
    protected String userId;
    protected  String email;

  @BeforeMethod
  public  void LogedInWithNewUser(){
      DriverUtils.initDriver();
      DriverUtils.webDriver.get("https://picsartstage2.com");
      DriverUtils.webDriver.manage().addCookie(new Cookie("user_key",userKey));
      DriverUtils.webDriver.navigate().refresh();
  }

    @AfterMethod
    void closeDriver(){
        DriverUtils.quietDriver();
    }

//  private void newUser(){
//
//      OkHttpClient client = new OkHttpClient().newBuilder()
//              .build();
//      MediaType mediaType = MediaType.parse("application/json");
//      RequestBody body = RequestBody.create(mediaType, "{"'email':" + email+ "'password':"+ "}"");
//      Request request = new Request.Builder()
//              .url("https://api.picsart.com/preproduction/users/signup.json")
//              .method("POST", )
//              .addHeader("Content-Type", "application/json")
//              .addHeader("authority", "picsart.com")
//              .build();
//      Response response = client.newCall(request).execute();
//
//
//  }


}
