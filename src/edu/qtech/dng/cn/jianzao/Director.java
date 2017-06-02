package edu.qtech.dng.cn.jianzao;

import java.util.List;

import edu.qtech.dng.cn.zujian.Arcircle;
import edu.qtech.dng.cn.zujian.Line;
import edu.qtech.dng.cn.zujian.View;
import edu.qtech.dng.cn.zujian.ViewGroup;

public class Director {
	//ͨ�ý�����
    private Builder builder;
    //�ض�������
    private Builder fBuilder;
    public Director(){
    	fBuilder = new FaceProduct();
    }
    public Director(Builder b){
    	this.builder = b;
    }
    //ͨ�ý������̣�����ͨ�ò�Ʒ
    public ViewGroup getProduct(List<View> list){
       for(View v:list){
    	   builder.setPart(v);
       }
       return builder.buildProduct();
    }
    //�ض��������̣������ض���Ʒ
    public ViewGroup getFaceProduct(){
    	fBuilder.setPart(new Line("�߶�"));
    	fBuilder.setPart(new Arcircle("Բ��"));
    	return fBuilder.buildProduct();
    }
}
