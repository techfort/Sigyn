package com.techfort.sigyn;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.json.JSONException;

import android.content.Context;

public class FileSystemStorageEngine implements IStorageEngine {

	private String mFilename;
	private Context mContext;
	
	public FileSystemStorageEngine(Context ctx, String file) {
		mFilename = file;
		mContext = ctx;
	}
	
	@Override
	public boolean insert(Document doc, OperationCallback cb) {
		try {
			FileOutputStream fos = mContext.openFileOutput(mFilename, Context.MODE_PRIVATE);
			fos.write(doc.toString(2).getBytes());
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Document doc, OperationCallback cb) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Document doc, OperationCallback cb) {
		// TODO Auto-generated method stub
		return false;
	}

}
