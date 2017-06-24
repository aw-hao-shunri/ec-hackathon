package com.github.echackathon.libs.http;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.lang.StringUtils;
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
	public abstract HttpRequestBase createRequest();

	/**
	 * 取得したコンテンツの変換処理を行う
	 * 
	 * @param content
	 * @return
	 */
	public abstract T convertContents(InputStream content, String encodeName) throws IOException;

	public CookieStore createCookieStore() {
		return new BasicCookieStore();
	}

	public void initRequestHeader(HttpRequestBase request) {
		request.addHeader("User-Agent",
				"Mozilla/5.0 (Windows NT 10.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36");
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

			HttpRequestBase request = createRequest();

			response = httpClient.execute(request);

			HttpEntity entity = response.getEntity();

			String contentType = entity.getContentType().getValue();
			String ime = null;
			String charset = null;
			if (StringUtils.isNotEmpty(contentType)) {
				String[] c = contentType.split(";");
				ime = c[0];
				if (c.length > 1) {
					charset = c[1].replace("charset=", "");
				}
			}

			return convertContents(entity.getContent(), charset);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				response.close();
			} catch (IOException e) {
			}
		}
		return (T) null;
	}
}