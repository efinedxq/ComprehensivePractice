package edu.qtech.dng.cn.guancha;

import java.util.Observable;
import java.util.Observer;

import edu.qtech.dng.cn.zujian.View;

public class Watcher extends View implements Observer {
    
	public Watcher(){
		this.name = "我是一段文字，同时我是观察者:<没有名字>";
	}
	public Watcher(Observable o) {
		// TODO Auto-generated constructor stub
		o.addObserver(this);
		this.name = "我是一段文字，同时我是观察者:<没有名字>";
	}
	public Watcher(Observable o,String name) {
		// TODO Auto-generated constructor stub
		o.addObserver(this);
		this.name = "我是一段文字，同时我是观察者:<名字："+name+">";
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
        System.out.println("名字发生改变："+((Watched)o).getData());
        this.name = "我是一段文字，同时我是观察者:<名字："+((Watched)o).getData()+">";
	}

}
