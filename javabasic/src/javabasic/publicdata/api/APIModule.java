package javabasic.publicdata.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

// 공공데이터 포털에서 JSON 데이터 가져오는 클래스
public class APIModule {
	
	private static final String API_URL
		= "https://api.odcloud.kr/api/15037829/v1/uddi:855d80d1-55fb-4d8b-83ae-8075729f7c7b?page=1&perPage=10&returnType=JSON&serviceKey=J5Xq%2FKgF5WB4cC8Z7c8JkQyf%2B4eFHKSUJ8dpzfmW5VXRUOm41Bt8tj1FtDrD2LWsPA7iFVwqFHROkiAUjtUNJQ%3D%3D";
	
	private String getJsonStr() {
		try {
			URI uri = new URI(API_URL);
			URL url = uri.toURL();
			URLConnection conn = url.openConnection();
			BufferedReader br = 
					new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line = "";
			String jsonStr = "";
			while ((line=br.readLine()) != null) {
				jsonStr += line;
			}
			return jsonStr;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	} // getJsonStr
	
	public List<JsonElement> getSmokeList() {
		JsonObject jsonObj 
			= new GsonBuilder().create().fromJson(getJsonStr(), JsonObject.class);
		return jsonObj.get("data").getAsJsonArray().asList();
	}

} // class




















