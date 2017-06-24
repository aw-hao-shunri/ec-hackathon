package com.github.echackathon.libs.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.ListIterator;

import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * 
 * 
 *
 */
public class RakutenShopInfoHttpClient extends AbstractHttpClient {

	
	@Override
	public HttpRequestBase createRequest() {
		return new HttpGet("https://directory.rakuten.co.jp/rms/sd/directory/vc?s=19&tz=100371&v=2&f=0&p=0&o=33&oid=000&k=0&a=0");
	}

	@Override
	public Object convertContents(InputStream content, String encodeName) throws IOException {
		StringWriter writer = new StringWriter();
		if(encodeName == null){
			encodeName = "EUC-JP";
		}
		
		IOUtils.copy(content, writer, encodeName);
		
		Document docs = Jsoup.parse(writer.toString());
		Elements elements = docs.select("table tr td font a");
		ListIterator<Element> iterator = elements.listIterator();
		System.out.println("start---------");
		while (iterator.hasNext()) {
			Element element = iterator.next();
			if("_top".equals(element.attr("target"))){
				System.out.println("url - >" + element.attr("href"));
				System.out.println("name - >" + element.text());
			}
		}
		return null;
	}

}
