package com.jibran.asyntaskkoneksisharepreff.model.news;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserNewResponse{

	@SerializedName("UserNewResponse")
	private List<UserNewResponseItem> userNewResponse;

	public void setUserNewResponse(List<UserNewResponseItem> userNewResponse){
		this.userNewResponse = userNewResponse;
	}

	public List<UserNewResponseItem> getUserNewResponse(){
		return userNewResponse;
	}

	@Override
 	public String toString(){
		return 
			"UserNewResponse{" + 
			"userNewResponse = '" + userNewResponse + '\'' + 
			"}";
		}
}