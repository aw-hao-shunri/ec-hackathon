package com.github.echackathon.libs.http;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * HTTPクライアントの抽象クラス
 *
 */
public abstract class AbstractHttpClient<T> {

	/**
	 * リクエスト情報を生成する
	 * 
	 * @return
	 */
	public abstract HttpRequestBase createRequest();// https://aw-pluralism.github.io/ec-hackathon/http_client_test/

	/**
	 * 取得したコンテンツの変換処理を行う
	 * 
	 * @param content
	 * @return
	 */
	public abstract T convertContents(InputStream content);

	public CookieStore createCookieStore() {
		return new BasicCookieStore();
	}

	/**
	 * メイン処理
	 * 
	 * @return
	 */
	public T execute() {
		CloseableHttpClient httpClient = HttpClients.custom().setDefaultCookieStore(createCookieStore()).build();

		CookieStore cookie = createCookieStore();
		if (cookie != null) {

		}

		CloseableHttpResponse response = null;
		try {

			response = httpClient.execute(createRequest());

			HttpEntity entity = response.getEntity();

			return convertContents(entity.getContent());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				response.close();
			} catch (IOException e) {}
		}
		return (T) null;
	}
}