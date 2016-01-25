package com.techfort.sigyn;

import java.util.List;

public interface ICollection {
	public OperationResult insert(Document doc);
	public OperationResult update(Document doc);
	public OperationResult delete(Document doc);
	public List<Document> findAll();
	public List<Document> find(IQuery query);
	public Document findOne(IQuery query);
}
