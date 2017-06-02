package edu.qtech.dng.cn.zujian;


public abstract class View implements Cloneable{
	protected String name;
	
	public void operation(){
    	System.out.println("Œ“ «:"+name);
    }
	
	public String getName() {
			return name;
	}
	
	
	public View clone() {
		View v = null;
		try {
			v = (View)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return v;
	}
}
