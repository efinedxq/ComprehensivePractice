package edu.qtech.dng.cn.jianzao;

import edu.qtech.dng.cn.zujian.View;
import edu.qtech.dng.cn.zujian.ViewGroup;

public class FaceProduct extends Builder {
    
	private ViewGroup faceGraph;
	
	public  FaceProduct() {
		// TODO Auto-generated constructor stub
		System.out.println("����һ��С����...");
		faceGraph = new ViewGroup("С����");
	}
	public  FaceProduct(String s) {
		// TODO Auto-generated constructor stub
		System.out.println("����һ��С����...:"+s);
		faceGraph = new ViewGroup("С���� "+s);
	}
	@Override
	public void setPart(View v) {
		// TODO Auto-generated method stub
       faceGraph.addView(v);
	}

	@Override
	public ViewGroup buildProduct() {
		// TODO Auto-generated method stub
		return faceGraph;
	}

}
