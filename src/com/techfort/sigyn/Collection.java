package com.techfort.sigyn;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.techfort.sigyn.OperationResult.Type;

public class Collection extends JSONObject implements ICollection {
	public static final String DOCUMENTS = "documents";
	private JSONArray mDocuments;
	private String mName;
	private IStorageEngine mEngine;
	
	public Collection(String name, IStorageEngine engine) {
		mName = name;
		mEngine = engine;
	}
	
	public List<Document> getDocuments() throws JSONException {
		List<Document> docs = new ArrayList<Document>();
		if (mDocuments != null) {
			for (int i = 0; i < mDocuments.length(); i++) {
				docs.add( (Document) mDocuments.get(i) );
			}
			return docs;
		}
		return null;
	}
	
	private JSONArray getDocs() {
		try {
			if (this.getJSONArray(DOCUMENTS) == null) {
				this.put(DOCUMENTS, new JSONArray());
			}
			return this.getJSONArray(DOCUMENTS);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public OperationResult insert(Document doc) {
		OperationResult res = new OperationResult(Type.INSERT);
		
		getDocs().put(doc);
		
		return res;
	}

	@Override
	public OperationResult update(Document doc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OperationResult delete(Document doc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Document> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Document> find(IQuery query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Document findOne(IQuery query) {
		// TODO Auto-generated method stub
		return null;
	}

}
