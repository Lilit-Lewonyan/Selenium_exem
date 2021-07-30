package Base;


import Configs.DriverUtils;

import org.openqa.selenium.Cookie;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public  abstract class  LoginUserBase {
    protected String username;
    protected String paswword = "NowLew97!";
    protected String userKey = "ad2d9589-8177-4656-a83a-2c82cf981faa";
    protected String userId;
    protected  String email;

  @BeforeMethod
  public  void LogedInWithNewUser(){
      DriverUtils.intitDriver();
      DriverUtils.driver.get("https://picsartstage2.com");
      DriverUtils.driver.manage().addCookie(new Cookie("user_key",userKey));
      DriverUtils.driver.navigate().refresh();
  }

    @AfterMethod
    void closeDriver(){
        DriverUtils.killDriver();
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
