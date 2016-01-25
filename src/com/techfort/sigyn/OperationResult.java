package com.techfort.sigyn;

public class OperationResult {
	
	enum Type {
		INSERT, UPDATE, DELETE; 
	}
	
	private Document mDocument;
	private boolean mSuccessful;
	private String mErrorMessage;
	private Type mType;
	
	public Document getDocument() {
		return mDocument;
	}
	
	public OperationResult(Type type) {
		mType = type;
	}
	
	public Type getType() {
		return mType;
	}
	
	public boolean isSuccessful() {
		return mSuccessful;
	}
	
	public String getErrorMessage() {
		if (mSuccessful) {
			return null;
		}
		return mErrorMessage;
	}
}
