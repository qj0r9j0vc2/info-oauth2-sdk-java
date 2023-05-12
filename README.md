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
