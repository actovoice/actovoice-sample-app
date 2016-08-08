# actovoice-sample-app
A sample android app using ActoVoice android SDK

##Introduction about ActoVoice android sdk

Are you a large business trying to find that small business personal touch or are you a small business looking for feedback on a new product? Does your business have a need to improve your customer satisfaction scores? Are you concerned about social media impacting your brand? Switch the paradigm. Enable your customers to connect with you when THEY want. The SDK allowing businesses to stay continuously connected with their customers is finally here! Businesses and organizations of any size can establish a Continuous Feedback Loop allowing customers and employees to share their experiences when they are in-the-moment.

Actovoice android sdk mainly comprises of:-
- feedback
- ticketing

By integrating actovoice sdk into your app, it gives the power to your app user to give feedback and ask for assitance without you as a developer or business owner to define that solution.



##Setting up

1) First you need to register your business on [ActoVoice](http://live.actovoice.com/#/register)

2) Once registration is done and you are logged in, navigate to admin section (gear icon) and click on red "+Add object" at right    most and fill the necessary details. For example you added an object say "Lufthansa Airlines". Hence once start giving feedback or ask for assitance will be then attached to this object. 

  ![ActoVoice Admin Screen](https://github.com/actovoice/actovoice-sample-app/blob/master/app/src/main/res/drawable/screen1.png)

3) Now, you need to generate the SDK APP Key. Refer above screen shot and click on "SDK Configuration". Fill the details and click to generate the key. You will need this key while integrating the SDK with your APP.



##Installing SDK via Gradle

Add in your android app module build.gradle 

```sh
apply plugin: 'com.android.application'
...
...
repositories {
     maven {
       url  "http://dl.bintray.com/actovoice/maven"  
   }
}

...
...

dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    compile 'com.android.support:appcompat-v7:24.0.0'
    compile 'com.actovoice.android:sdk:0.1.1'
}

```

**Note:** - Actovoice SDK has min android sdk version as 18, please make sure that your app has min android sdk version as 18

##Add Your SDK APP Key

```
public class ApplicationClass extends  Application {

   @Override
   public void onCreate() {
       super.onCreate();
       
       //This method will authenticate your app & also you need to call this API whenever the app user changes.
       ActoVoice.init(this, "your_sdk_app_key", “your_app_user_id");
       
   }

}
```

- **your_sdk_app_key** - App key that was registered via actovoice.com business account
- **your_app_user_id** - This can be your own user id which can be anything. Some examples are emaild id, mobile number of app user. This id is opaque to ActoVoice. This id is shown in ActoVoice portal as consumer id.

**Note**: You can either add this in your application class or wherever you set the user data/object in your app



##Your app interaction with SDK

- In order to allow your app user to give feedback or ask for assitance you need the following things to do:-
	- Create two UI buttons one for feedback and other for ticket 
	- Add on click listeners on both the buttons
	- inside onClick() method add below lines of code repectively to invoke the create feedback and ticket screens

    ```
    @Override
    public void onClick(View view) {
      	ActoVoice.getInstance().setProductData(view, ActoVoice.Action.CREATE_FEEDBACK);  
    }
    ```

    ```
     @Override
    public void onClick(View view) {
      	ActoVoice.getInstance().setProductData(view, ActoVoice.Action.CREATE_TICKET);
    }
   
    ```
 
 - Once you build the app, and click on either button, you will see a list screen with FAB (plus button). On Clicking of that FAB plus button it will allow your users to give feedback or create tickets from respective list screens. Please scroll down to see the sample app screenshots.
 
    
**Note** - You can always have the UI as you want in your app, but make sure you create two entry points for the feedback and ticket functionality) instead of creating two buttons.

##Permissions in your app manifest

Make sure that you have added below permission in your app
```
<uses-permission android:name="android.permission.INTERNET" />
```

##Build

Build your project and see everything work!

To build and run ![ActoVoice Admin Screen](https://github.com/actovoice/actovoice-sample-app/blob/master/app/src/main/res/drawable/run.png)

##After installing your app on device

- If you run into any crash's or error's, please look into debug logs of your app (you may have missed something from this document)
- If all is well then, You will see empty feedback and ticket list
- However, user can submit feedback or create ticket (ask for assistance) from '+' plus FAB button from respective screens.
- Once feedback or tickets are created it will get associated/attached against the object that you created from Actovoice portal and this data will populate on your respective UI list screens later.
- Please refer screenshots here - 

![Buttons](https://github.com/actovoice/actovoice-sample-app/blob/master/1.png)
![Need Assistance List Screen](https://github.com/actovoice/actovoice-sample-app/blob/master/2.png)
![Create Assistance or Ticket](https://github.com/actovoice/actovoice-sample-app/blob/master/3.png)
![Create Feedback](https://github.com/actovoice/actovoice-sample-app/blob/master/4.png)

##Customize the Theme

The following attributes may be used to theme SDK (see sample app values/colors.xml)

Attribute | Effect
----------|------------
android:textColorPrimary | Title color
android:textColorSecondary | Description text and Term of Services text color
android:windowBackground | Background color
colorAccent | Image color, button color, and widget color

##LICENSE

- APACHE 2.0

##Contact us

- developer@actovoice.com
