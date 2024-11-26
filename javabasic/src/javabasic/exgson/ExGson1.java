package javabasic.exgson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import javabasic.gson.Post;

// 개인실습 1)
// https://jsonplaceholder.typicode.com/posts 에서 JSON문자열을 수신하여
// List에 저장한 후 id값에 대해 내림차순 정렬해서 화면 출력

public class ExGson1 {

	public static void main(String[] args) {
		
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
			
			// id 내림차순 정렬
			Collections.sort(postList, new Comparator<Post>() {
				@Override
				public int compare(Post post1, Post post2) {
					return Integer.parseInt(post2.getId()) 
							- Integer.parseInt(post1.getId());
				}
			});
			
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
	
}
