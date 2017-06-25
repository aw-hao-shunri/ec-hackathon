package com.github.echackathon.datastore;

import java.util.List;

public class Result<K> {
	public String cursor;
	public List<K> result;
	public Result(String cursor, List<K> result) {
		this.cursor = cursor;
		this.result = result;
	}
	public Result(List<K> result) {
		this.result = result;
		this.cursor = null;
	}
	
}
