import edu.qtech.dng.cn.zujian.Arcircle;
import edu.qtech.dng.cn.zujian.Canves;
import edu.qtech.dng.cn.zujian.Line;
import edu.qtech.dng.cn.zujian.Words;

public class Client {
     public static void main(String[] args) {
		Canves face = new Canves("��");
		
	    Line line = new Line("1");
	    Arcircle arcircle = new Arcircle("1");
	    
	    face.addView(line);
	    face.addView(arcircle);
	    
	    Canves canves = new Canves("���");
	    Words words = new Words("����һ�λ�...");
	    
	    canves.addView(face);
	    canves.addView(words);
	    
	 }
}
