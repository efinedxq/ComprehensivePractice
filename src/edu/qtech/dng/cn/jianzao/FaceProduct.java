package edu.qtech.dng.cn.jianzao;

import edu.qtech.dng.cn.zujian.View;
import edu.qtech.dng.cn.zujian.ViewGroup;

public class FaceProduct extends Builder {
    
	private ViewGroup faceGraph;
	
	public  FaceProduct() {
		// TODO Auto-generated constructor stub
		System.out.println("创建一个小丑脸...");
		faceGraph = new ViewGroup("小丑脸");
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
