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

2) Once registration is done and you are logged in, navigate to admin section and click on red "+Add object" at right    most and fill the necessary details. For example you added an object say "Lufthansa Airlines"

   ![screen1.png]({{site.baseurl}}/screen1.png)

3) Now, you need to generate the SDK APP Key. Refer above screen shot and click on "SDK Configuration". Fill the details and click to generate the key. You will need this key while integrating the SDK with your APP.



##Installing SDK via Gradle

Add in your android app module build.gradle 

```sh
apply plugin: com.android.application
….
….
repositories {
     maven {
       url  "http://dl.bintray.com/actovoice/maven"  
   }
}

….
....

dependencies {
   ….
   ….
   compile 'com.actovoice.android:sdk:0.0.6'
  ….
  ….
}

```
