package com.baidu.demo;

import java.nio.IntBuffer;

public class BufferTest {

	public static void main(String[] args) {
		
		IntBuffer buffer = IntBuffer.allocate(11);
		//放入数据
		for(int i=0;i<5;i++) {
			System.out.println(buffer.mark());
			buffer.put(i+1);
		}
		//取数据
		buffer.flip();
		while(buffer.hasRemaining()) {
			System.out.println(buffer.mark());
			System.out.println(buffer.get());
		}
		
		
		

	}

}
