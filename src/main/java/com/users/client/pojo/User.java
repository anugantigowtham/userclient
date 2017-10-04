
package com.users.client.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Keys",
    "UserAccessServer",
    "UserID",
    "UserProfile"
})
public class User {

    @JsonProperty("Keys")
    private Keys keys;
    @JsonProperty("UserAccessServer")
    private String userAccessServer;
    @JsonProperty("UserID")
    private String userID;
    @JsonProperty("UserProfile")
    private UserProfile userProfile;
    
    @JsonProperty("Keys")
    public Keys getKeys() {
        return keys;
    }

    @JsonProperty("Keys")
    public void setKeys(Keys keys) {
        this.keys = keys;
    }

    @JsonProperty("UserAccessServer")
    public String getUserAccessServer() {
        return userAccessServer;
    }

    @JsonProperty("UserAccessServer")
    public void setUserAccessServer(String userAccessServer) {
        this.userAccessServer = userAccessServer;
    }

    @JsonProperty("UserID")
    public String getUserID() {
        return userID;
    }

    @JsonProperty("UserID")
    public void setUserID(String userID) {
        this.userID = userID;
    }

    @JsonProperty("UserProfile")
    public UserProfile getUserProfile() {
        return userProfile;
    }

    @JsonProperty("UserProfile")
    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

}
