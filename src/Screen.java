import javax.swing.JPanel;
import javax.swing.JFrame;
import java.util.List;
import java.util.ArrayList;

public class Screen extends JPanel{
//	private List<Screen> screens;
	private Screen otherScreen;
	private JFrame frame;
	
	public Screen getOtherScreen(){ return otherScreen; }
	public void setOtherScreen(Screen o){
		otherScreen = o;
	}
	public void setFrame(JFrame f){
		frame = f;
	}
}
