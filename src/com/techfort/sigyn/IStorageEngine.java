package com.techfort.sigyn;

public interface IStorageEngine {
	
	public interface OperationCallback {
		public void process(Document doc);
	}
	
	public boolean insert(Document doc, OperationCallback cb);
	public boolean update(Document doc, OperationCallback cb);
	public boolean delete(Document doc, OperationCallback cb);
}
