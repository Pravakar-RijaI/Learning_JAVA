package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class StudentManagement extends JFrame
{
	//Declare components
	
	//Declare panel
	private JPanel panel1, panel2;
	
	//Working on panel1
	//Declare Menu
	private JMenu menu1, menu2,menu3;
	private JMenuBar menuBar;
	private JMenuItem menuItem1, menuItem2, menuItem3, menuItem4, menuItem5, menuItem6;
	
	//Declare Labels
	private JLabel label1, label2, label3, label4, label5, label6;
	
	//Declare TextField
	private JTextField field1;
	
	//Declare PasswordField
	private JPasswordField passwordField;
	
	//Declare ButtonGroup
	private ButtonGroup gender;
	
	//Declare RadioButton
	private JRadioButton button1, button2;
	
	//Declare ComboBox
	private String[] courses = {"Select","BScCSIT","BCA","BIT","BIM"};
	private JComboBox<String> course;
	
	//Declare List
	private  DefaultListModel<String> languages = new DefaultListModel<>(); 
	private JList<String> list1;
	
	//Declare TextArea
	private JTextArea area1;
	
	//Declare CheckBox
	private JCheckBox box1;
		
	//Declare button
	private JButton button;
	
	//Working on panel2
	//Declare Table
	private String data[][]={ {"Mike Tyson","Male","BScCSIT"} };    
	private String column[]={"Username","Gender","Course"};         
	private JTable table;
	
	//Declare ScrollPane
	private JScrollPane scrollPane1, scrollPane2;
	
	//Declare ScrollBar
	private JScrollBar scrollBar;
	
	//Declare ProgressBar
	private JProgressBar progressBar;
	
	public StudentManagement()
	{
		//Initialize Frame
		setTitle("Student Management System");
		setLocation(350,70);
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Set Frame Layout
		setLayout(new GridLayout(1,2));
		
		//Initialize Components
		//Initialize Panels
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(16,1));
		panel1.setBackground(Color.white);
		
		panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		
		//Initialize Panel1 Components
		//Initialize Menu
		menuBar = new JMenuBar();
		
		menu1 = new JMenu("User");
		menu2 = new JMenu("Student");
		menu3 = new JMenu("Exit");
		
		menuItem1 = new JMenuItem("Create");
		menuItem2 = new JMenuItem("Update");
		menuItem3 = new JMenuItem("Delete");
		
		menuItem4 = new JMenuItem("Create");
		menuItem5 = new JMenuItem("Update");
		menuItem6 = new JMenuItem("Delete");
		
		menu1.add(menuItem1);
		menu1.add(menuItem2);
		menu1.add(menuItem3);
		
		menu2.add(menuItem4);
		menu2.add(menuItem5);
		menu2.add(menuItem6);
		
		menuBar.add(menu1);
		menuBar.add(menu2);
		menuBar.add(menu3);
		
		//Initialize Labels
		label1 = new JLabel("Username: ");
		label2 = new JLabel("Password: ");
		label3 = new JLabel("Gender: ");
		label4 = new JLabel("Course:");
		label5 = new JLabel("Programming Language:");
		label6 = new JLabel("Enter Message:");
		
		//Initialize TextField
		field1 = new JTextField(10);
		
		//Initialize PasswordField
		passwordField = new JPasswordField(10);
		
		//Initialize RadioButton
		gender = new ButtonGroup();
				
		//Initialize RadioButtons
		button1 = new JRadioButton("Male");
		button2 = new JRadioButton("Female");
		gender.add(button1);
		gender.add(button2);
		
		//Initialize ComboBox
		course = new JComboBox<String>(courses);
		
		//Initialize DefaultList
		languages.addElement("C");
		languages.addElement("C++");
		languages.addElement("Python");
		languages.addElement("JavaScript");
		
		//Initialize DefaultList to JList
		list1 = new JList<String>(languages);
		
		//Initialize TextArea
		area1 = new JTextArea();
		area1.setBackground(Color.lightGray);
		
		//Initialize CheckBox
		box1 = new JCheckBox("I agree to terms and conditions.");
		
		//Initialize Button
		button = new JButton("Register");
		button.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				panel2.add(progressBar, BorderLayout.SOUTH);
			}
			
		});
		
		//Initialize Panel2 Components
		//Initialize Table
		JTable table=new JTable(data,column);
		
		//Initialize ScrollPane
		scrollPane1 = new JScrollPane(list1);
		scrollPane2 = new JScrollPane(table);
		
		//Initialize ScrollBar
		scrollBar = new JScrollBar();
		
		//Initialize ProgressBar
		progressBar = new JProgressBar();
		progressBar.setValue(50);
		progressBar.setStringPainted(true);
		
		//Add Components to Panel1
		panel1.add(menuBar);
		panel1.add(label1);
		panel1.add(field1);
		panel1.add(label2);
		panel1.add(passwordField);
		panel1.add(label3);
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(label4);
		panel1.add(course);
		panel1.add(label5);
		panel1.add(scrollPane1);
		panel1.add(label6);
		panel1.add(area1);
		panel1.add(box1);
		panel1.add(button);
		
		//Add Components to Panel2
		panel2.add(scrollPane2, BorderLayout.CENTER);
		panel2.add(scrollBar, BorderLayout.EAST);
		
		//Add Panel Container to Frame
		add(panel1);
		add(panel2);
		
		//Make Frame Visible
		setVisible(true);
		
	}

	public static void main(String[] args) {
		StudentManagement frame = new StudentManagement();

	}

}
