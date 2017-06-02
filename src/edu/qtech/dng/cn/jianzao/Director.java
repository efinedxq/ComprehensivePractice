package edu.qtech.dng.cn.jianzao;

import java.util.List;

import edu.qtech.dng.cn.zujian.Arcircle;
import edu.qtech.dng.cn.zujian.Line;
import edu.qtech.dng.cn.zujian.View;
import edu.qtech.dng.cn.zujian.ViewGroup;

public class Director {
	//通用建造者
    private Builder builder;
    //特定建造者
    private Builder fBuilder;
    public Director(){
    	fBuilder = new FaceProduct();
    }
    public Director(Builder b){
    	this.builder = b;
    }
    //通用建造流程，构建通用产品
    public ViewGroup getProduct(List<View> list){
       for(View v:list){
    	   builder.setPart(v);
       }
       return builder.buildProduct();
    }
    //特定建造流程，建造特定产品
    public ViewGroup getFaceProduct(){
    	fBuilder.setPart(new Line("线段"));
    	fBuilder.setPart(new Arcircle("圆弧"));
    	return fBuilder.buildProduct();
    }
}
