import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
//import java.awt.GraphicsEnvironment;

public class Main_Screen extends JFrame{
	public static void main(String[] args){
		Main_Screen start = new Main_Screen();
//		String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//		for(int i = 0; i < fonts.length; i++)
//			System.out.println(fonts[i]);
	}
	public Main_Screen(){
		setSize(500,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GPA Calculator v1.0");
		
//		List<Screen> screens = new ArrayList<Screen>();
		
		//initialize screens and data needed
		Screen home = new Screen();
		Screen inputGrades = new Screen();
		home.setOtherScreen(inputGrades);
		inputGrades.setOtherScreen(home);
		home.setFrame(this);
		inputGrades.setFrame(this);
		
		//setup the home screen
		home.setLayout(new BorderLayout());
		JPanel hButtons = new JPanel();
		hButtons.add(new CalculateButton("Calculate GPA"));
		hButtons.add(new EditButton("Edit Grades", inputGrades, home, this));
		hButtons.setBackground(Color.LIGHT_GRAY);
		home.add(hButtons, BorderLayout.SOUTH);
		JTextArea homeText = new JTextArea("Welcome to the GPA Calculator!"
				+ "\n- Click the 'Edit Grades' button to enter in or edit your"
				+ "\nsemester grades"
				+ "\n- Click the 'Calculate GPA' button to get your overall GPA");
		homeText.setEditable(false);
		homeText.setBackground(Color.LIGHT_GRAY);
		homeText.setFont(new Font("Myanmar Text", Font.PLAIN, 19));
		homeText.setLineWrap(true);
		home.add(homeText, BorderLayout.CENTER);
		add(home);
		
		//setup the input grades screen
		inputGrades.setLayout(new BorderLayout());                    //buttons
		inputGrades.setBackground(Color.LIGHT_GRAY);
		JPanel gButtons = new JPanel();
//		gButtons.add(new SaveButton("Save Grades"));
		gButtons.add(new JButton("Save Grades"));
		gButtons.setBackground(Color.LIGHT_GRAY);
		inputGrades.add(gButtons, BorderLayout.SOUTH); 
		JPanel header = new JPanel();                                 //labels for year and sems
		header.setLayout(new BoxLayout(header, BoxLayout.Y_AXIS));
		JPanel year = new JPanel();
		year.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 5));
		year.setBackground(Color.LIGHT_GRAY);
		year.add(new JLabel("9th"));
		year.add(new JLabel("10th"));
		year.add(new JLabel("11th"));
		year.add(new JLabel("12th"));
		header.add(year, BorderLayout.NORTH);
		JPanel sems = new JPanel();
		sems.setLayout(new FlowLayout(FlowLayout.CENTER, 22, 5));
		sems.setBackground(Color.LIGHT_GRAY);
		sems.add(new JLabel("Sem. 1"));
		sems.add(new JLabel("Sem. 2"));
		sems.add(new JLabel("Sem. 1"));
		sems.add(new JLabel("Sem. 2"));
		sems.add(new JLabel("Sem. 1"));
		sems.add(new JLabel("Sem. 2"));
		sems.add(new JLabel("Sem. 1"));
		sems.add(new JLabel("Sem. 2"));
		header.add(sems, BorderLayout.NORTH);
		inputGrades.add(header, BorderLayout.NORTH);
		
		
		
		
//		inputGrades.add(input, BorderLayout.CENTER);
		
		setVisible(true);
	}
}
