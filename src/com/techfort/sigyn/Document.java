package com.techfort.sigyn;

import org.json.JSONException;
import org.json.JSONObject;

public class Document extends JSONObject implements IDocument {

	public Document() {
		
	}
	
	
	@Override
	public Object set(String key, Object value) {
		try {
			put(key, value);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
