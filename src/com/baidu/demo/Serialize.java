package com.baidu.demo;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.channels.ServerSocketChannel;

public class Serialize implements Serializable {


	private static final long serialVersionUID = -2486479868441318327L;
	
	private int num=1000;
	public static void main(String[] args) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("d:/serialize.bat");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(new Serialize());
			objectOutputStream.flush();
			objectOutputStream.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
