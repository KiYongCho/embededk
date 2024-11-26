package javabasic.gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class GsonTest2 {
	
	public static void main(String[] args) {
		
		// 무료 JSON서버 : http://jsonplaceholder.typicode.com
		//                        JSON 데이터를 송수신할 수 있는 서버
		
		String uriStr = "https://jsonplaceholder.typicode.com/posts";
		
		try {
			
			URL url = new URI(uriStr).toURL();
			
			URLConnection conn = url.openConnection();
			
			BufferedReader br 
				= new BufferedReader(
						new InputStreamReader(conn.getInputStream())
					);
			
			String jsonStr = "";
			String line = "";
			while ((line=br.readLine()) != null) {
				jsonStr += line;
			}
			
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			
			// List<Post> 타입으로 변환하려면 TypeToken 사용해야 함
			List<Post> postList = gson.fromJson(jsonStr, new TypeToken<List<Post>>() {}.getType());
			
			for (Post post : postList) {
				System.out.println(post);
			}			
			
		} catch (MalformedURLException mue) {
			mue.printStackTrace();
		} catch (URISyntaxException urise) {
			urise.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	} // main

} // class






































