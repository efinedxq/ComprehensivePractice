package edu.qtech.dng.cn.zujian;

public abstract class View {
	protected String name;
	
	public void operation(){
    	System.out.println("����:"+name);
    }
	
	public String getName() {
			return name;
	}
	
}
