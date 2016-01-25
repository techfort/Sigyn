package com.techfort.sigyn;

import java.util.HashMap;
import java.util.Set;

import org.json.JSONObject;

import android.content.Context;

public class Sygin extends JSONObject implements IDatabase {

	private HashMap<String, Collection> mCollections;
	private IStorageEngine mEngine;
	private Context mContext;
	
	public Sygin(Context ctx, String file) {
		mContext = ctx;
		FileSystemStorageEngine eng = new FileSystemStorageEngine(mContext, file);
		mEngine = eng;
	}
	
	@Override
	public ICollection add(String name) {
		
		if (mCollections == null) {
			mCollections = new HashMap<String, Collection>();
		}
		
		if (mCollections.get(name) != null) {
			mCollections.put(name, new Collection(name, mEngine));
		}
		return null;
	}

	@Override
	public ICollection getCollection(String name) {
		
		if (mCollections == null) {
			mCollections = new HashMap<String, Collection>();
		}
		return mCollections.get(name);
	}

}
