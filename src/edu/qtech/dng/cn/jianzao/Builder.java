package edu.qtech.dng.cn.jianzao;

import edu.qtech.dng.cn.zujian.View;
import edu.qtech.dng.cn.zujian.ViewGroup;

public abstract class Builder {
	//设置产品的不同部分，以获得不同的产品
    public abstract void setPart(View v);
    //建造产品
    public abstract ViewGroup buildProduct();
}
