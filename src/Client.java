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
//		Canves face = new Canves("脸");
//		
//	    Line line = new Line("1");
//	    Arcircle arcircle = new Arcircle("1");
//	    
//	    face.addView(line);
//	    face.addView(arcircle);
//	    
//	    Canves canves = new Canves("组合");
//	    Words words = new Words("这是一段话...");
//	    
//	    canves.addView(face);
//	    canves.addView(words);
	    //创建一个画
	    Director director = new Director();
	    ViewGroup vg = director.getFaceProduct();
	    
	    ViewGroup vgClone = vg.clone();
	    for(View v:vgClone.getChildren()){
	    	v.operation();
	    }
	    
	 }
}
