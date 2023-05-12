package oauth2.dto.request;

public class ExchangeTokenRequest {
    private String code;
    private String redirectUri;


    public String getCode() {
        return this.code;
    }

    public String getRedirectUri() {
        return this.redirectUri;
    }

}
