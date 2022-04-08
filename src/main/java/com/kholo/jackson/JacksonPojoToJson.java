package com.kholo.jackson;


import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.kholo.jackson.model.User;
import java.io.File;
import java.io.IOException;


public class JacksonPojoToJson {

	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();

		User user = new User();
		user.createDummyUser();

		try{
			mapper.writeValue(new File("C:\\Users\\Kholofelo\\Documents\\practice\\jackson\\user.json"),user);

			String jsonInString = mapper.writeValueAsString(user);
			System.out.println(jsonInString);

			jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
			System.out.println(jsonInString);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}

		// TODO Auto-generated method stub
		MobilePhone mobilePhone = new MobilePhone();
		mobilePhone = getMobile(mobilePhone);
		System.out.println("The JSON representation of Object mobilePhone is ");
		System.out.println(new Gson().toJson(mobilePhone));


	}

	public static MobilePhone getMobile(MobilePhone mobile) {
		mobile.setBrand("SAMSUNG");
		mobile.setName("J2 Core");
		mobile.setRam(2);
		mobile.setRom(4);
		return mobile;
	}


}
