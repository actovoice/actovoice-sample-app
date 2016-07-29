# actovoice-sample-app
A sample android app using ActoVoice android SDK

#Introduction about ActoVoice android sdk

Are you a large business trying to find that small business personal touch or are you a small business looking for feedback on a new product? Does your business have a need to improve your customer satisfaction scores? Are you concerned about social media impacting your brand? Switch the paradigm. Enable your customers to connect with you when THEY want. The SDK allowing businesses to stay continuously connected with their customers is finally here! Businesses and organizations of any size can establish a Continuous Feedback Loop allowing customers and employees to share their experiences when they are in-the-moment.

Actovoice android sdk mainly comprises of:-
- feedback
- ticketing

By integrating actovoice sdk into your app, it gives the power to your app user to give feedback and ask for assitance without you as a developer or business owner to define that solution.


##Setting up

1) First you need to register your business on [ActoVoice](http://live.actovoice.com/#/register)

2) Once registration is done and you are logged in, navigate to admin section (gear icon) and click on red "+Add object" at right    most and fill the necessary details. For example you added an object say "Lufthansa Airlines"

   ![ActoVoice Admin screen]({{site.baseurl}}//screen1.png)

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
   compile 'com.actovoice.android:sdk:0.0.1'
   ...
   ...
}

```

###Add Your SDK APP Key

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



###Your app interaction with SDK

- In order to allow your app user to give feedback or ask for assitance you need the following things to do:-
	- Create two UI buttons one for feedback and other for ticket 
	- Add on click listeners on both the buttons
	- inside onClick() method add below lines of code repectively to invoke the feedback and ticket list screens

    ```
    ActoVoice.getInstance().setProductData(view, ActoVoice.Action.SHOW_FEEDBACK_LIST);  
    ```

    ```
    ActoVoice.getInstance().setProductData(view, ActoVoice.Action.SHOW_TICKET_LIST);
    ```
    
**Note** - You can always have the UI as you want in your app, but make sure you create two entry points for the feedback and ticket functionality) instead of creating two buttons.

###Build

Build your project and see everything work!

To build and run ![]({{site.baseurl}}//run.png)