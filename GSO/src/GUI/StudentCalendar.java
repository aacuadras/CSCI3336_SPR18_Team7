package GUI;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import java.awt.geom.Line2D;


public class StudentCalendar extends JFrame{

	private JTextArea textArea1, textArea2, textArea3, textArea4;
	private JTextField textField1, textField2, textField3, textField4, textField5;
	private JTextField sunF, monF, tueF, wedF, thuF, friF, satF;
	private JTextField hwTF1, hwTF2, hwTF3, hwTF4;
	private JTextField rmTF1, rmTF2, rmTF3;
	private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9;
	private JLabel hwL1, hwL2, hwL3, hwL4, hwL5, hwL6;
	private JLabel rmL1, rmL2, rmL3, rmL4;
	private JScrollPane scroll1;
	private JRadioButton yeah, nah;
	private JPanel buttonPanel;
	private GridBagConstraints constraint;
	private JButton button1, sunB, monB, tueB, wedB, thuB, friB, satB;
	private JTabbedPane tabbedPane;
	private JPanel event, homework, reminder, pan;
	private JSeparator sep, sep2, sep3, sep4, sep5, sep6, sep7, sep8, sep9, sep10;
	
	
	public StudentCalendar()
	{
		super("Student Calendar");
		setSize(895,680);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - getHeight()) / 2);
		setLocation(x, y);
		
		////////////Days
		sunF = new JTextField();
		sunF.setSize(30,30);
		sunF.setLocation(70,0);
		sunF.setEditable(false);
		add(sunF);
		sunB = new JButton("Sunday");
		sunB.setSize(100,70);
		sunB.setLocation(0,30);
		add(sunB);
		
		
		monF = new JTextField();
		monF.setSize(30,30);
		monF.setLocation(200,0);
		monF.setEditable(false);
		add(monF);
		monB = new JButton("Monday");
		monB.setSize(100,70);
		monB.setLocation(130,30);
		add(monB);
		

		tueF = new JTextField();
		tueF.setSize(30,30);
		tueF.setLocation(330,0);
		tueF.setEditable(false);
		add(tueF);
		tueB = new JButton("Tuesday");
		tueB.setSize(100,70);
		tueB.setLocation(260,30);
		add(tueB);
		
		
		wedF = new JTextField();
		wedF.setSize(30,30);
		wedF.setLocation(465,0);
		wedF.setEditable(false);
		add(wedF);
		wedB = new JButton("Wednesday");
		wedB.setSize(105,70);
		wedB.setLocation(390,30);
		add(wedB);
		
		
		thuF = new JTextField();
		thuF.setSize(30,30);
		thuF.setLocation(590,0);
		thuF.setEditable(false);
		add(thuF);
		thuB = new JButton("Thursday");
		thuB.setSize(100,70);
		thuB.setLocation(520,30);
		add(thuB);
		
		
		friF = new JTextField();
		friF.setSize(30,30);
		friF.setLocation(720,0);
		friF.setEditable(false);
		add(friF);
		friB = new JButton("Friday");
		friB.setSize(100,70);
		friB.setLocation(650,30);
		add(friB);
		
		
		satF = new JTextField();
		satF.setSize(30,30);
		satF.setLocation(850,0);
		satF.setEditable(false);
		add(satF);
		satB = new JButton("Saturday");
		satB.setSize(100,70);
		satB.setLocation(780,30);
		add(satB);
		
		
		sep = new JSeparator();
		sep.setOrientation(SwingConstants.HORIZONTAL);
		sep.setSize(900,30);
		sep.setLocation(0,150);
		add(sep);
		
		sep2 = new JSeparator();
		sep2.setOrientation(SwingConstants.HORIZONTAL);
		sep2.setSize(900,30);
		sep2.setLocation(0,120);
		add(sep2);
		
		sep3 = new JSeparator();
		sep3.setOrientation(SwingConstants.VERTICAL);
		sep3.setSize(50,550);
		sep3.setLocation(295,120);
		add(sep3);
		
		sep4 = new JSeparator();
		sep4.setOrientation(SwingConstants.VERTICAL);
		sep4.setSize(50,550);
		sep4.setLocation(555,120);
		add(sep4);
		
		sep5 = new JSeparator();
		sep5.setOrientation(SwingConstants.VERTICAL);
		sep5.setSize(30,100);
		sep5.setLocation(115,10);
		add(sep5);
		
		sep6 = new JSeparator();
		sep6.setOrientation(SwingConstants.VERTICAL);
		sep6.setSize(30,100);
		sep6.setLocation(245,10);
		add(sep6);
		
		sep7 = new JSeparator();
		sep7.setOrientation(SwingConstants.VERTICAL);
		sep7.setSize(30,100);
		sep7.setLocation(375,10);
		add(sep7);
		
		sep8 = new JSeparator();
		sep8.setOrientation(SwingConstants.VERTICAL);
		sep8.setSize(30,100);
		sep8.setLocation(505,10);
		add(sep8);
		
		sep9 = new JSeparator();
		sep9.setOrientation(SwingConstants.VERTICAL);
		sep9.setSize(30,100);
		sep9.setLocation(635,10);
		add(sep9);
		
		sep10 = new JSeparator();
		sep10.setOrientation(SwingConstants.VERTICAL);
		sep10.setSize(30,100);
		sep10.setLocation(765,10);
		add(sep10);
		
		////////////////////////////////////
		//Task table starts here
		////////////////////////////////////

		label6 = new JLabel("Tasks");
		label6.setSize(100,30);
		label6.setLocation(10, 120);
		add(label6);

		scroll1 = new JScrollPane();
		scroll1.setLocation(10, 160);
		scroll1.getVerticalScrollBar().setUnitIncrement(15);
	    scroll1.setSize(new Dimension(280, 430));

	    buttonPanel = new JPanel();
	    buttonPanel.setBorder(BorderFactory.createLineBorder(Color.black));
	    buttonPanel.setLayout(new GridBagLayout());
	    buttonPanel.setSize(new Dimension(300, 400));

	    constraint = new GridBagConstraints();
	    constraint.anchor = GridBagConstraints.CENTER;
	    constraint.fill = GridBagConstraints.HORIZONTAL;
	    constraint.ipady = 35;
	    constraint.gridx = 0;
	    constraint.gridy = GridBagConstraints.RELATIVE;
	    constraint.weightx = 1.0f;
	    constraint.weighty = 1.0f;

	    //Depends on events
	    int sizeOfButtons = 15;
	    for(int i = 0; i < sizeOfButtons; i++) {
	        JButton button = new JButton();

	        //Will set to task name
	        button.setText("Button #" + (i+1));

	        button.setHorizontalAlignment(SwingConstants.LEFT);
	        buttonPanel.add(button, constraint);
	    }

	    scroll1.setViewportView(buttonPanel);
	    this.rootPane.add(scroll1);
	    scroll1.updateUI();
		
		
		////////////Task Description Area
		label5 = new JLabel("Task Description");
		label5.setSize(100,30);
		label5.setLocation(300, 120);
		add(label5);
		textArea2 = new JTextArea();
		textArea2.setLineWrap(true);
	    textArea2.setWrapStyleWord(true);
	    textArea2.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		textArea2.setLocation(300, 180);
		textArea2.setSize(250, 405);
		add(textArea2);
		
		
		///////////
		//Task Name
		///////////
		label4 = new JLabel("Add Task");
		label4.setSize(100,30);
		label4.setLocation(600, 120);
		add(label4);
		////////////////////////////////////
		//Tabs start here
		////////////////////////////////////
		
		tabbedPane = new JTabbedPane();
		tabbedPane.setSize(320, 435);
		tabbedPane.setLocation(560, 150);
		
		event = new JPanel();
		event.setLayout(null);
		tabbedPane.addTab("Event", event);
		label3 = new JLabel("Event Name: ");
		label3.setSize(100,30);
		label3.setLocation(0,0);
		event.add(label3);
		
		//Text field for "Task"
		textField2 = new JTextField();
		textField2.setSize(250,30);
		textField2.setLocation(80,0);
		event.add(textField2);
		
		//////////
		//Date
		//////////
		label2 = new JLabel("Date: ");
		label2.setSize(100,30);
		label2.setLocation(0, 30);
		event.add(label2);
		
		//Text field for "Priority"
		textField1 = new JTextField("MM-DD-YYYY");
		textField1.setSize(100, 30);
		textField1.setLocation(35, 30);
		event.add(textField1);
		
		/////////////
		//Priority
		/////////////
		label1 = new JLabel("Priority: ");
		label1.setSize(100,30);
		label1.setLocation(150, 30);
		event.add(label1);

		textField3 = new JTextField("1,2 or 3");
		textField3.setSize(50,30);
		textField3.setLocation(200,30);
		event.add(textField3);
		
		/////////////
		//Location
		/////////////
		label7 = new JLabel("Location: ");
		label7.setSize(100, 30);
		label7.setLocation(0, 60);
		event.add(label7);
		
		textField4 = new JTextField();
		textField4.setSize(190, 30);
		textField4.setLocation(60, 60);
		event.add(textField4);
		
		/////////////
		//Time
		/////////////
		label8 = new JLabel("Time: ");
		label8.setSize(100,30);
		label8.setLocation(0, 90);
		event.add(label8);
		
		textField5 = new JTextField("HH:MM");
		textField5.setSize(70,30);
		textField5.setLocation(60, 90);
		event.add(textField5);
		
		/////////////
		//Description
		/////////////
		label9 = new JLabel("Description: ");
		label9.setSize(100,30);
		label9.setLocation(0, 120);
		event.add(label9);
		
		textArea1 = new JTextArea();
		textArea1.setLineWrap(true);
	    textArea1.setWrapStyleWord(true);
	    textArea1.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		textArea1.setLocation(0, 150);
		textArea1.setSize(315, 260);
		event.add(textArea1);
		
		tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
		
		////////////////////////////////
		//Homework Tab
		////////////////////////////////
		homework = new JPanel();
		homework.setLayout(null);
		tabbedPane.addTab("Homework", homework);
		
		/////////////////
		//Assignment
		/////////////////
		hwL1 = new JLabel("Homework Assign.: ");
		hwL1.setSize(120,30);
		hwL1.setLocation(0,0);
		homework.add(hwL1);
		
		hwTF1 = new JTextField();
		hwTF1.setSize(200, 30);
		hwTF1.setLocation(120, 0);
		homework.add(hwTF1);
		
		//////////////////
		//Date
		//////////////////
		hwL2 = new JLabel("Date: ");
		hwL2.setSize(100,30);
		hwL2.setLocation(0,30);
		homework.add(hwL2);
		
		hwTF2 = new JTextField("MM-DD-YYYY");
		hwTF2.setSize(100,30);
		hwTF2.setLocation(35,30);
		homework.add(hwTF2);
		
		/////////////
		//Priority
		/////////////
		hwL3 = new JLabel("Priority: ");
		hwL3.setSize(100,30);
		hwL3.setLocation(150, 30);
		homework.add(hwL3);
	
		hwTF3 = new JTextField("1,2 or 3");
		hwTF3.setSize(50,30);
		hwTF3.setLocation(200,30);
		homework.add(hwTF3);
		
		/////////////
		//Deadline
		/////////////
		hwL4 = new JLabel("Deadline: ");
		hwL4.setSize(100,30);
		hwL4.setLocation(0,60);
		homework.add(hwL4);
		
		hwTF4 = new JTextField("MM-DD-YYYY");
		hwTF4.setSize(100,30);
		hwTF4.setLocation(60,60);
		homework.add(hwTF4);
		
		/////////////
		//Complete
		/////////////
		hwL5 = new JLabel("Complete: ");
		hwL5.setSize(100,30);
		hwL5.setLocation(0,90);
		homework.add(hwL5);
		
		yeah = new JRadioButton("Yes", false);
		nah = new JRadioButton("No", true);
		ButtonGroup group = new ButtonGroup();
		yeah.setSize(60,30);
		nah.setSize(60,30);
		homework.add(yeah);
        homework.add(nah);
        group.add(yeah);
        group.add(nah);
        
        Insets insets = homework.getInsets();
        Dimension size = yeah.getSize();
        yeah.setBounds(90 + insets.left, 90 + insets.top, size.width, size.height);
        size = nah.getSize();
        nah.setBounds(170 + insets.left, 90 + insets.top, size.width, size.height);
		
		/////////////
		//Description
		/////////////
		hwL6 = new JLabel("Description: ");
		hwL6.setSize(100,30);
		hwL6.setLocation(0,120);
		homework.add(hwL6);
		
		textArea3 = new JTextArea();
		textArea1.setLineWrap(true);
	    textArea1.setWrapStyleWord(true);
	    textArea1.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		textArea3.setSize(315,260);
		textArea3.setLocation(0,150);
		homework.add(textArea3);
		
		tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
		
		////////////////////////////////
		//Reminder Tab
		////////////////////////////////
		reminder = new JPanel();
		reminder.setLayout(null);
		tabbedPane.addTab("Reminder", reminder);
		
		/////////////////
		//Reminder
		/////////////////
		rmL1 = new JLabel("Reminder: ");
		rmL1.setSize(100,30);
		rmL1.setLocation(0,0);
		reminder.add(rmL1);
		
		rmTF1 = new JTextField();
		rmTF1.setSize(250,30);
		rmTF1.setLocation(70,0);
		reminder.add(rmTF1);
		
		/////////////////
		//Date
		/////////////////
		rmL2 = new JLabel("Date: ");
		rmL2.setSize(100,30);
		rmL2.setLocation(0,30);
		reminder.add(rmL2);
		
		rmTF2 = new JTextField("MM-DD-YYYY");
		rmTF2.setSize(100,30);
		rmTF2.setLocation(35,30);
		reminder.add(rmTF2);
		
		/////////////////
		//Priority
		/////////////////
		rmL3 = new JLabel("Priority: ");
		rmL3.setSize(100,30);
		rmL3.setLocation(150,30);
		reminder.add(rmL3);
		
		rmTF3 = new JTextField("1,2 or 3");
		rmTF3.setSize(50,30);
		rmTF3.setLocation(200,30);
		reminder.add(rmTF3);
		
		/////////////////
		//Description
		/////////////////
		rmL4 = new JLabel("Description: ");
		rmL4.setSize(100,30);
		rmL4.setLocation(0,60);
		reminder.add(rmL4);
		
		textArea4 = new JTextArea();
		textArea4.setLineWrap(true);
	    textArea4.setWrapStyleWord(true);
	    textArea4.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		textArea4.setSize(315,320);
		textArea4.setLocation(0,90);
		reminder.add(textArea4);
		
		tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
		add(tabbedPane);
		
		button1 = new JButton("Add Task");
		button1.setSize(100,30);
		button1.setLocation(750, 600);
		//button1.addActionListener(new Button1Clicked());
		add(button1);
		
		
		setVisible(true);
	}
	
}
