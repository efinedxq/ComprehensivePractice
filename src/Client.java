import java.util.Observable;
import java.util.Observer;

import edu.qtech.dng.cn.guancha.Watched;
import edu.qtech.dng.cn.guancha.Watcher;
import edu.qtech.dng.cn.jianzao.Director;
import edu.qtech.dng.cn.jianzao.FaceProduct;
import edu.qtech.dng.cn.zujian.Arcircle;
import edu.qtech.dng.cn.zujian.Canves;
import edu.qtech.dng.cn.zujian.Line;
import edu.qtech.dng.cn.zujian.View;
import edu.qtech.dng.cn.zujian.ViewGroup;
import edu.qtech.dng.cn.zujian.Words;

public class Client {
     public static void main(String[] args) {
//		Canves face = new Canves("��");
//		
//	    Line line = new Line("1");
//	    Arcircle arcircle = new Arcircle("1");
//	    
//	    face.addView(line);
//	    face.addView(arcircle);
//	    
//	    Canves canves = new Canves("���");
//	    Words words = new Words("����һ�λ�...");
//	    
//	    canves.addView(face);
//	    canves.addView(words);
	    
	    Director director = new Director();
	    //����һ����
	    ViewGroup vg = director.getFaceProduct();
	    //��¡һ����
	    ViewGroup vgClone = vg.clone();
	    for(View v:vgClone.getChildren()){
	    	v.operation();
	    }
	    //����һ�������ֵĻ�
	    Watched watched = new Watched();
	    Watcher watcher = new Watcher(watched);
	    watcher.operation();
	    ViewGroup namedVg = director.getNamedFaceProduct(watcher);
	    watched.setData("Tom");
	    for(View v:namedVg.getChildren()){
	    	v.operation();
	    }
	 }
}
