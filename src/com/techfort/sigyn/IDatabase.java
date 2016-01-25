package com.techfort.sigyn;

public interface IDatabase {
	public ICollection add(String name);
	public ICollection getCollection(String name);
}
