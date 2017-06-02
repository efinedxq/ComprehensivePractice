package edu.qtech.dng.cn.zujian;

import java.util.ArrayList;
import java.util.List;

public class ViewGroup extends View {
	 
    private List<View> viewList = new ArrayList<View>();
    
    public ViewGroup(){
    	this.name = "����";
    }
    public ViewGroup(String name){
    	this.name = "����"+name;
    }
    
    public void addView(View view){
   	 viewList.add(view);
   	 System.out.println("����"+this.name+"���������һ�����:"+view.getName());
    }
    
    public void removeView(View view){
   	 viewList.remove(view);
   	 System.out.println("����"+this.name+"����ɾ����һ�����:"+view.getName());
    }
    
    public List<View> getChildren(){
   	 System.out.println("����"+this.name+"���ҷ��������еĹ���...");
   	 return this.viewList;
    }
    
    public View getChild(int i){
   	
   	 if(viewList==null) {
   		 System.out.println("����"+this.name+"����Ϊ��");
   		 return null;
   	 }
   	 if(i>=viewList.size()){
   		 System.out.println("����"+this.name+"���Ҳ�����:"+i);
   		 return null;
   	 }
   	 System.out.println("����"+this.name+"���ҷ�����һ���ӹ���:"+i);
        return viewList.get(i);
    }
} 

