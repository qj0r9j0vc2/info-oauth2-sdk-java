package oauth2.feign;

import feign.Body;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import oauth2.dto.response.ResourceResponse;
import oauth2.dto.response.TokenResponse;

import java.util.List;
import java.util.Map;


public interface InfoOAuth2Server {
    @RequestLine("POST /oauth2/token")
    @Headers("Content-Type: application/x-www-form-urlencoded")
    TokenResponse exchange(Map<String, String> map);

    @RequestLine("POST /oauth2/token")
    @Headers("Content-Type: application/x-www-form-urlencoded")
    TokenResponse refresh(@Param("grant_type") String grantType, @Param("scope") String scope, @Param("refresh_token") String refreshToken);

    @RequestLine("GET /resource/user")
    ResourceResponse getUser();

}
