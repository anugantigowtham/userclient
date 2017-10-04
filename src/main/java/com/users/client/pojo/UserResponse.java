
package com.users.client.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "error_code",
    "error_message",
    "long_msg",
    "short_msg"
})
public class UserResponse {

    @JsonProperty("error_code")
    private Integer errorCode;
    @JsonProperty("error_message")
    private String errorMessage;
    @JsonProperty("long_msg")
    private String longMsg;
    @JsonProperty("short_msg")
    private String shortMsg;
    @JsonProperty("UsersList")
    private List<Users> usersList;
    
    @JsonProperty("UsersList")
    public List<Users> getUsersList() {
		return usersList;
	}

    @JsonProperty("UsersList")
	public void setUsersList(List<Users> usersList) {
		this.usersList = usersList;
	}

	@JsonProperty("error_code")
    public Integer getErrorCode() {
        return errorCode;
    }

    @JsonProperty("error_code")
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    @JsonProperty("error_message")
    public String getErrorMessage() {
        return errorMessage;
    }

    @JsonProperty("error_message")
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @JsonProperty("long_msg")
    public String getLongMsg() {
        return longMsg;
    }

    @JsonProperty("long_msg")
    public void setLongMsg(String longMsg) {
        this.longMsg = longMsg;
    }

    @JsonProperty("short_msg")
    public String getShortMsg() {
        return shortMsg;
    }

    @JsonProperty("short_msg")
    public void setShortMsg(String shortMsg) {
        this.shortMsg = shortMsg;
    }

}
