package edu.qtech.dng.cn.guancha;

import java.util.Observable;
import java.util.Observer;

import edu.qtech.dng.cn.zujian.View;

public class Watcher extends View implements Observer {
    
	public Watcher(){
		this.name = "����һ�����֣�ͬʱ���ǹ۲���:<û������>";
	}
	public Watcher(Observable o) {
		// TODO Auto-generated constructor stub
		o.addObserver(this);
		this.name = "����һ�����֣�ͬʱ���ǹ۲���:<û������>";
	}
	public Watcher(Observable o,String name) {
		// TODO Auto-generated constructor stub
		o.addObserver(this);
		this.name = "����һ�����֣�ͬʱ���ǹ۲���:<���֣�"+name+">";
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
        System.out.println("���ַ����ı䣺"+((Watched)o).getData());
        this.name = "����һ�����֣�ͬʱ���ǹ۲���:<���֣�"+((Watched)o).getData()+">";
	}

}
