package com.uni.chap04_assist.part02_object.run;

import com.uni.chap04_assist.part02_object.model.dao.ObjectDao;
import com.uni.chap04_assist.part02_object.model.dao.ObjectsDao;

public class Run {

	public static void main(String[] args) {

//		ObjectDao o = new ObjectDao();
//		o.fileSave();
//		o.fileOpen();
		
		ObjectsDao ob = new ObjectsDao();
		ob.fileOpen();
	}

}
