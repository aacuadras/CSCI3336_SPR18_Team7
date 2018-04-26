package GUI;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;


public class StudentCalendar extends JFrame{

	private JTextArea textArea1, textArea2, textArea3, textArea4;
	private JTextField textField1, textField2, textField3, textField4, textField5, textField6, textField7, textField8, textField9;
	private JTextField textField10, textField11, textField12, textField13, textField14, textField15, textField16, textField17, textField18;
	private JTextField sunF, monF, tueF, wedF, thuF, friF, satF;
	private JTextField hwTF1, hwTF2, hwTF3, hwTF4;
	private JTextField rmTF1, rmTF2, rmTF3;
	private JLabel sun, mon, tue, wed, thu, fri, sat;
	private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9;
	private JLabel hwL1, hwL2, hwL3, hwL4, hwL5, hwL6;
	private JLabel rmL1, rmL2, rmL3, rmL4;
	private JScrollPane scroll1;
	private JRadioButton yeah, nah;
	private JPanel buttonPanel;
	private GridBagConstraints constraint;
	private JButton button1;
	private JTabbedPane tabbedPane;
	private JPanel event, homework, reminder;
	
	public StudentCalendar()
	{
		super("Student Calendar");
		setSize(900,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - getHeight()) / 2);
		setLocation(x, y);
		
		////////////Days
		sun = new JLabel("Sunday");
		sun.setSize(100,30);
		sun.setLocation(0,0);
		add(sun);
		sunF = new JTextField();
		sunF.setSize(30,30);
		sunF.setLocation(100,0);
		sunF.setEditable(false);
		add(sunF);
		textField3 = new JTextField();
		textField3.setSize(130,30);
		textField3.setLocation(0,35);
		textField3.setEditable(false);
		add(textField3);
		textField4 = new JTextField();
		textField4.setSize(130,30);
		textField4.setLocation(0,65);
		textField4.setEditable(false);
		add(textField4);
		
		
		mon = new JLabel("Monday");
		mon.setSize(100,30);
		mon.setLocation(150,0);
		add(mon);
		monF = new JTextField();
		monF.setSize(30,30);
		monF.setLocation(250,0);
		monF.setEditable(false);
		add(monF);
		textField5 = new JTextField();
		textField5.setSize(130,30);
		textField5.setLocation(150,35);
		textField5.setEditable(false);
		add(textField5);
		textField6 = new JTextField();
		textField6.setSize(130,30);
		textField6.setLocation(150,65);
		textField6.setEditable(false);
		add(textField6);
		
		
		tue = new JLabel("Tuesday");
		tue.setSize(100,30);
		tue.setLocation(300,0);
		add(tue);
		tueF = new JTextField();
		tueF.setSize(30,30);
		tueF.setLocation(400,0);
		tueF.setEditable(false);
		add(tueF);
		textField7 = new JTextField();
		textField7.setSize(130,30);
		textField7.setLocation(300,35);
		textField7.setEditable(false);
		add(textField7);
		textField8 = new JTextField();
		textField8.setSize(130,30);
		textField8.setLocation(300,65);
		textField8.setEditable(false);
		add(textField8);
		
		
		wed = new JLabel("Wednesday");
		wed.setSize(100,30);
		wed.setLocation(450,0);
		add(wed);
		wedF = new JTextField();
		wedF.setSize(30,30);
		wedF.setLocation(550,0);
		wedF.setEditable(false);
		add(wedF);
		textField9 = new JTextField();
		textField9.setSize(130,30);
		textField9.setLocation(450,35);
		textField9.setEditable(false);
		add(textField9);
		textField10 = new JTextField();
		textField10.setSize(130,30);
		textField10.setLocation(450,65);
		textField10.setEditable(false);
		add(textField10);
		
		
		thu = new JLabel("Thursday");
		thu.setSize(100,30);
		thu.setLocation(600,0);
		add(thu);
		thuF = new JTextField();
		thuF.setSize(30,30);
		thuF.setLocation(700,0);
		thuF.setEditable(false);
		add(thuF);
		textField11 = new JTextField();
		textField11.setSize(130,30);
		textField11.setLocation(600,35);
		textField11.setEditable(false);
		add(textField11);
		textField12 = new JTextField();
		textField12.setSize(130,30);
		textField12.setLocation(600,65);
		textField12.setEditable(false);
		add(textField12);
		
		
		fri = new JLabel("Friday");
		fri.setSize(100,30);
		fri.setLocation(750,0);
		add(fri);
		friF = new JTextField();
		friF.setSize(30,30);
		friF.setLocation(850,0);
		friF.setEditable(false);
		add(friF);
		textField12 = new JTextField();
		textField12.setSize(130,30);
		textField12.setLocation(750,35);
		textField12.setEditable(false);
		add(textField12);
		textField13 = new JTextField();
		textField13.setSize(130,30);
		textField13.setLocation(750,65);
		textField13.setEditable(false);
		add(textField13);
		
		
		sat = new JLabel("Saturday");
		sat.setSize(100,30);
		sat.setLocation(900,0);
		add(sat);
		satF = new JTextField();
		satF.setSize(30,30);
		satF.setLocation(950,0);
		satF.setEditable(false);
		add(satF);
		textField14 = new JTextField();
		textField14.setSize(130,30);
		textField14.setLocation(900,35);
		textField14.setEditable(false);
		add(textField14);
		textField15 = new JTextField();
		textField15.setSize(130,30);
		textField15.setLocation(900,65);
		textField15.setEditable(false);
		add(textField15);
		
		
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

		textField16 = new JTextField("1,2 or 3");
		textField16.setSize(50,30);
		textField16.setLocation(200,30);
		event.add(textField16);
		
		/////////////
		//Location
		/////////////
		label7 = new JLabel("Location: ");
		label7.setSize(100, 30);
		label7.setLocation(0, 60);
		event.add(label7);
		
		textField17 = new JTextField();
		textField17.setSize(190, 30);
		textField17.setLocation(60, 60);
		event.add(textField17);
		
		/////////////
		//Time
		/////////////
		label8 = new JLabel("Time: ");
		label8.setSize(100,30);
		label8.setLocation(0, 90);
		event.add(label8);
		
		textField18 = new JTextField("HH:MM");
		textField18.setSize(70,30);
		textField18.setLocation(60, 90);
		event.add(textField18);
		
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
