package com.homeywell.sms.ws.config;

public interface Constants {
	public final String BaseURL = "http://13.54.148.72:44001/UserManagement";
	public final String ALL_USERS = "/Contact/AllUsers";
	public final String USER_DATA="/Contact/User";
	public final String ADD_USER="/Contact/User/Add";
	public final String REMOVE_USER="/Contact/User/Remove";
	public final String SEARCH_USERS="/Users/Search";
	public final String GET_USER_DATA="/Users/User";
	public final String DELETE_USER_ID="/Users/User/{USERID}";
	public final String USER_PROFILE="/Users/User/Profile";
	public final String UPDATE_USER="/Users/User/Profile/{UPDATETYPE}/{USERPASSWORD}";
	public final String USER_SIGNIN="/Users/User/Signin";
	public final String USER_SIGNOUT="/User/SignOut";
}
