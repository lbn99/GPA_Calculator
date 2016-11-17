import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditButton extends JButton implements ActionListener{
	private Screen switchto;
	private Screen switchback;
	private JFrame frame;
	
	public EditButton(String label, Screen one, Screen two, JFrame f){
		super(label);
		addActionListener(this);
		switchto = one;
		switchback = two;
		frame = f;
	}
	public void actionPerformed(ActionEvent e){
		frame.remove(switchback);
		frame.add(switchto);
		frame.repaint();
		frame.revalidate();
	}
}
