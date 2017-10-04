
package com.users.client.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AvatarID",
    "EmailID",
    "FirstName",
    "LastName",
    "ProfileBytes"
})
public class UserProfile {

    @JsonProperty("AvatarID")
    private String avatarID;
    @JsonProperty("EmailID")
    private String emailID;
    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("LastName")
    private String lastName;
    @JsonProperty("ProfileBytes")
    private List<Integer> profileBytes = null;

    @JsonProperty("AvatarID")
    public String getAvatarID() {
        return avatarID;
    }

    @JsonProperty("AvatarID")
    public void setAvatarID(String avatarID) {
        this.avatarID = avatarID;
    }

    @JsonProperty("EmailID")
    public String getEmailID() {
        return emailID;
    }

    @JsonProperty("EmailID")
    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    @JsonProperty("FirstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("FirstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("LastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("LastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("ProfileBytes")
    public List<Integer> getProfileBytes() {
        return profileBytes;
    }

    @JsonProperty("ProfileBytes")
    public void setProfileBytes(List<Integer> profileBytes) {
        this.profileBytes = profileBytes;
    }

}
