package com.github.echackathon.libs.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 *
 *
 */
public class HttpClient {

	public static void main(String args[]) {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet("https://aw-pluralism.github.io/ec-hackathon/http_client_test/");
		CloseableHttpResponse response = null;
		try {

			response = httpClient.execute(httpGet);
			HttpEntity entity = response.getEntity();
			BufferedReader reader = new BufferedReader(new InputStreamReader(entity.getContent(), "UTF-8"));
			String line = null;
			System.out.println("content start: ");
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
				System.out.flush();
			}
			System.out.println("content end: ");
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				response.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}