package edu.qtech.dng.cn.jianzao;

import edu.qtech.dng.cn.zujian.View;
import edu.qtech.dng.cn.zujian.ViewGroup;

public abstract class Builder {
	//���ò�Ʒ�Ĳ�ͬ���֣��Ի�ò�ͬ�Ĳ�Ʒ
    public abstract void setPart(View v);
    //�����Ʒ
    public abstract ViewGroup buildProduct();
}
