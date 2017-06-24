package com.github.echackathon.libs.http;

import static org.junit.Assert.*;

import org.junit.Test;

public class RakutenShopInfoHttpClientTest {
	
	RakutenShopInfoHttpClient client;

	@Test
	public void test() {
		RakutenShopInfoHttpClient c = new RakutenShopInfoHttpClient();
		c.execute();
	}

}
