# info-oauth2-sdk-java
[![](https://jitpack.io/v/qj0r9j0vc2/info-oauth2-sdk-java.svg)](https://jitpack.io/#qj0r9j0vc2/info-oauth2-sdk-java)


# Simple Use
```
   @GetMapping("/")
    fun test(): TokenResponse{
        val oauth2 = InfoOAuth2(${CLIENT_ID|test-service}, ${CLIENT_SECRET})
        return oauth2.exchangeTokenWithoutPKCE(
            ExchangeTokenRequest(
                ${CODE}, 
                ${REDIRECT_URI|http://localhost:8080})
        )
    }

```


# How to
To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

gradle
maven
sbt
leiningen
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.qj0r9j0vc2:info-oauth2-sdk-java:demo'
	}
