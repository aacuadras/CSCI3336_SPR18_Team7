package GUI;
import java.sql.*;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class StudentCalendar extends JFrame{

	private JTextArea textArea1, textArea2, textArea3, textArea4;		//Text Areas for Tasks descriptions
	private JTextField textField1, textField2, textField3, textField4, textField5;  	//Text fields for "event" tab
	private JTextField sunF, monF, tueF, wedF, thuF, friF, satF;	//Text fields for the day of the month number
	private JTextField hwTF1, hwTF2, hwTF3, hwTF4;		//Text fields for "homework" tab
	private JTextField rmTF1, rmTF2, rmTF3;		//Text fields for "reminder" tab
	private JTextField evDTF1, evDTF2, evDTF3, evDTF4, evDTF5;		//Text fields for the display of "event", "homework" or "reminder"
	private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9;		//Labels for "event" tab
	private JLabel evDL1, evDL2, evDL3, evDL4, evDL5, evDL6, evDL7;		//Labels for the display of "event", "homework" or "reminder"
	private JLabel hwL1, hwL2, hwL3, hwL4, hwL5, hwL6;		//Labels for "homework" tab
	private JLabel rmL1, rmL2, rmL3, rmL4;		//Labels for "reminder" tab
	private JScrollPane scroll1;		//Scroll for button table
	private JRadioButton yeah, nah;		//Radio buttons in "homework" tab
	private JPanel buttonPanel;			//Button panel for radio buttons
	private GridBagConstraints constraint;		//Constraints for button table
	private JButton button1, sunB, monB, tueB, wedB, thuB, friB, satB, delB, comB;	//"Add task" button, buttons for the days of the week and button to delete task
	private JTabbedPane tabbedPane;		//Tabs variable
	private JPanel event, homework, reminder;		//Panels necessary for tabs
	private JPanel test = new JPanel();
	private JSeparator sep, sep2, sep3, sep4, sep5, sep6, sep7, sep8, sep9, sep10;	//Lines
	private boolean ev = false, hw = false, rm = false;		//Temporal variables to display middle panels
	EventBase base = new EventBase();
	
	private JButton buttons[] = new JButton[30];
	String[][] data = new String[30][8];
	String currentDate = "04-29-2018";
	
	public StudentCalendar() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
	{
		//Setting size for the window
		super("GSO");
		setSize(895,680);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - getHeight()) / 2);
		setLocation(x, y);
	
		
		////////////Days
		
		//Sunday
<<<<<<< HEAD
				sunF = new JTextField();
				sunF.setSize(30,30);
				sunF.setLocation(70,0);
				sunF.setEditable(false);
				add(sunF);
				//Pressing this button changes the table to the tasks for sunday
				sunB = new JButton("Sunday");
				sunB.setSize(100,70);
				sunB.setLocation(0,30);
				sunB.addActionListener(new getDay("04-29-2018"));
				add(sunB);
				
				//Monday
				monF = new JTextField();
				monF.setSize(30,30);
				monF.setLocation(200,0);
				monF.setEditable(false);
				add(monF);
				//Pressing this button changes the table to the tasks for monday
				monB = new JButton("Monday");
				monB.setSize(100,70);
				monB.setLocation(130,30);
				monB.addActionListener(new getDay("04-30-2018"));
				add(monB);
				
				//Tuesday
				tueF = new JTextField();
				tueF.setSize(30,30);
				tueF.setLocation(330,0);
				tueF.setEditable(false);
				add(tueF);
				//Pressing this button changes the table to the tasks for tuesday
				tueB = new JButton("Tuesday");
				tueB.setSize(100,70);
				tueB.setLocation(260,30);
				tueB.addActionListener(new getDay("05-01-2018"));
				add(tueB);
				
				//Wednesday
				wedF = new JTextField();
				wedF.setSize(30,30);
				wedF.setLocation(465,0);
				wedF.setEditable(false);
				add(wedF);
				//Pressing this button changes the table to the tasks for wednesday
				wedB = new JButton("Wednesday");
				wedB.setSize(105,70);
				wedB.setLocation(390,30);
				wedB.addActionListener(new getDay("05-02-2018"));
				add(wedB);
				
				//Thursday
				thuF = new JTextField();
				thuF.setSize(30,30);
				thuF.setLocation(590,0);
				thuF.setEditable(false);
				add(thuF);
				//Pressing this button changes the table to the tasks for thursday
				thuB = new JButton("Thursday");
				thuB.setSize(100,70);
				thuB.setLocation(520,30);
				thuB.addActionListener(new getDay("05-03-2018"));
				add(thuB);
				
				//Friday
				friF = new JTextField();
				friF.setSize(30,30);
				friF.setLocation(720,0);
				friF.setEditable(false);
				add(friF);
				//Pressing this button changes the table to the tasks for friday
				friB = new JButton("Friday");
				friB.setSize(100,70);
				friB.setLocation(650,30);
				friB.addActionListener(new getDay("05-04-2018"));
				add(friB);
				
				//Saturday
				satF = new JTextField();
				satF.setSize(30,30);
				satF.setLocation(850,0);
				satF.setEditable(false);
				add(satF);
				//Pressing this button changes the table to the tasks for saturday
				satB = new JButton("Saturday");
				satB.setSize(100,70);
				satB.setLocation(780,30);
				satB.addActionListener(new getDay("05-05-2018"));
				add(satB);
=======
		sunF = new JTextField();
		sunF.setSize(30,30);
		sunF.setLocation(70,0);
		sunF.setEditable(false);
		add(sunF);
		//Pressing this button changes the table to the tasks for sunday
		sunB = new JButton("Sunday");
		sunB.setSize(100,70);
		sunB.setLocation(0,30);
		SunB.addActionListener(new getDay("04-29-2018"));
		add(sunB);
		
		//Monday
		monF = new JTextField();
		monF.setSize(30,30);
		monF.setLocation(200,0);
		monF.setEditable(false);
		add(monF);
		//Pressing this button changes the table to the tasks for monday
		monB = new JButton("Monday");
		monB.setSize(100,70);
		monB.setLocation(130,30);
		monB.addActionListener(new getDay("04-30-2018"));
		add(monB);
		
		//Tuesday
		tueF = new JTextField();
		tueF.setSize(30,30);
		tueF.setLocation(330,0);
		tueF.setEditable(false);
		add(tueF);
		//Pressing this button changes the table to the tasks for tuesday
		tueB = new JButton("Tuesday");
		tueB.setSize(100,70);
		tueB.setLocation(260,30);
		tueB.addActionListener(new getDay("05-01-2018"));
		add(tueB);
		
		//Wednesday
		wedF = new JTextField();
		wedF.setSize(30,30);
		wedF.setLocation(465,0);
		wedF.setEditable(false);
		add(wedF);
		//Pressing this button changes the table to the tasks for wednesday
		wedB = new JButton("Wednesday");
		wedB.setSize(105,70);
		wedB.setLocation(390,30);
		wedB.addActionListener(new getDay("05-02-2018"));
		add(wedB);
		
		//Thursday
		thuF = new JTextField();
		thuF.setSize(30,30);
		thuF.setLocation(590,0);
		thuF.setEditable(false);
		add(thuF);
		//Pressing this button changes the table to the tasks for thursday
		thuB = new JButton("Thursday");
		thuB.setSize(100,70);
		thuB.setLocation(520,30);
		thuB.addActionListener(new getDay("05-03-2018"));
		add(thuB);
		
		//Friday
		friF = new JTextField();
		friF.setSize(30,30);
		friF.setLocation(720,0);
		friF.setEditable(false);
		add(friF);
		//Pressing this button changes the table to the tasks for friday
		friB = new JButton("Friday");
		friB.setSize(100,70);
		friB.setLocation(650,30);
		friB.addActionListener(new getDay("05-04-2018"));
		add(friB);
		
		//Saturday
		satF = new JTextField();
		satF.setSize(30,30);
		satF.setLocation(850,0);
		satF.setEditable(false);
		add(satF);
		//Pressing this button changes the table to the tasks for saturday
		satB = new JButton("Saturday");
		satB.setSize(100,70);
		satB.setLocation(780,30);
		satB.addActionListener(new getDay("05-05-2018"));
		add(satB);
>>>>>>> branch 'master' of https://github.com/Ciper997/CMPE3326_SPR18_Team7.git
		
		
		//////////Separators for "Tasks", "Task Description", "Add Task"
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
		
		//////////Separators for days
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

	    
	    
	    /////////////////////////////////////////////////////////////
	    //Dynamically adds buttons
	    data = base.getDataByDate(currentDate);
	    
	    for(int i = 0; i < data.length; i++)
	    {
	    	buttons[i] = new JButton();
	        
	        buttons[i].setText(data[i][2]);
	        
	        buttons[i].setHorizontalAlignment(SwingConstants.LEFT);
	        
	        if(data[i][1].equals("1"))
	        {
	        	buttons[i].addActionListener(new displayEventButton(i));
	        	
	        }
	        else if(data[i][1].equals("2"))
	        {
	        	buttons[i].addActionListener(new displayHomeworkButton(i));
	        }
	        else 
	        {
	        	buttons[i].addActionListener(new displayReminderButton(i));
	        }
	        
	        buttons[i].validate();
     		buttons[i].repaint();
     		
	        buttonPanel.add(buttons[i], constraint);
	        
	        buttonPanel.validate();
			buttonPanel.repaint();
	    }

	    scroll1.setViewportView(buttonPanel);
	    this.rootPane.add(scroll1);
	    scroll1.updateUI();
	   
		scroll1.validate();
		scroll1.repaint();
		/////////////////////////////////////////////////////////////////////////
		
		
		////////////Task Description Area
		label5 = new JLabel("Task Description");
		label5.setSize(100,30);
		label5.setLocation(300, 120);
		add(label5);

		/////////////////////////////////////	
		
		///////////
		//Task Name
		///////////
		label4 = new JLabel("Add Task");
		label4.setSize(100,30);
		label4.setLocation(560, 120);
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
		nah = new JRadioButton("No", false);
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
		textArea3.setLineWrap(true);
	    textArea3.setWrapStyleWord(true);
	    textArea3.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
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
		button1.addActionListener(new addTaskButton());
		add(button1);
		
		setVisible(true);
		
	}
	
	
	//////////////////////
	//If event is selected
	//////////////////////
	private void addEvPan(String name, String date, String pri, String location, String time, String desc)
	{
		//test = new JPanel();
		test.setSize(250,495);
		test.setLocation(300,150);
		test.setLayout(null);
		add(test);
		
		
		evDL1 = new JLabel("Event");
		evDL1.setSize(100,30);
		test.add(evDL1);
		
		//Name
		evDL2 = new JLabel("Name: ");
		evDL2.setSize(100,30);
		evDL2.setLocation(0,30);
		test.add(evDL2);
		evDTF1 = new JTextField(name);
		evDTF1.setSize(200,30);
		evDTF1.setLocation(40,30);
		evDTF1.setEditable(false);
		test.add(evDTF1);
		
		//Date
		evDL3 = new JLabel("Date:");
		evDL3.setSize(100,30);
		evDL3.setLocation(0,60);
		test.add(evDL3);
		evDTF2 = new JTextField(date);
		evDTF2.setSize(90,30);
		evDTF2.setLocation(40,60);
		evDTF2.setEditable(false);
		test.add(evDTF2);
		
		//Priority
		evDL4 = new JLabel("Priority: ");
		evDL4.setSize(100,30);
		evDL4.setLocation(140,60);
		test.add(evDL4);
		evDTF3 = new JTextField(pri);
		evDTF3.setSize(50,30);
		evDTF3.setLocation(190,60);
		evDTF3.setEditable(false);
		test.add(evDTF3);
		
		//Location
		evDL5 = new JLabel("Location: ");
		evDL5.setSize(100,30);
		evDL5.setLocation(0,90);
		test.add(evDL5);
		evDTF4 = new JTextField(location);
		evDTF4.setSize(180,30);
		evDTF4.setLocation(60,90);
		evDTF4.setEditable(false);
		test.add(evDTF4);
		
		//Time
		evDL6 = new JLabel("Time:");
		evDL6.setSize(100,30);
		evDL6.setLocation(0,120);
		test.add(evDL6);
		evDTF5 = new JTextField(time);
		evDTF5.setSize(80,30);
		evDTF5.setLocation(40,120);
		evDTF5.setEditable(false);
		test.add(evDTF5);
		
		//Description
		evDL7 = new JLabel("Description:");
		evDL7.setSize(100,30);
		evDL7.setLocation(0,150);
		test.add(evDL7);
		textArea2 = new JTextArea(desc);
		textArea2.setSize(270,255);
		textArea2.setLocation(0,180);
		textArea2.setEditable(false);
		textArea2.setLineWrap(true);
	    textArea2.setWrapStyleWord(true);
	    textArea2.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
	    test.add(textArea2);
	    
	    delB = new JButton("Delete Task");
	    delB.setSize(120,30);
	    delB.setLocation(70,450);
	    test.add(delB);
	    
	    test.validate();
		test.repaint();
	    
	}
	
	/////////////////////////
	//If homework is selected
	/////////////////////////
	private void addHwPan(String name, String date, String pri, String deadline, String complete, String desc)
	{
		
		test.setSize(250,495);
		test.setLocation(300,150);
		test.setLayout(null);
		add(test);
		
		evDL1 = new JLabel("Homework");
		evDL1.setSize(100,30);
		test.add(evDL1);		
		
		//Name
		evDL2 = new JLabel("Name: ");
		evDL2.setSize(100,30);
		evDL2.setLocation(0,30);
		test.add(evDL2);
		evDTF1 = new JTextField(name);
		evDTF1.setSize(200,30);
		evDTF1.setLocation(40,30);
		evDTF1.setEditable(false);
		test.add(evDTF1);
				
		//Date
		evDL3 = new JLabel("Date:");
		evDL3.setSize(100,30);
		evDL3.setLocation(0,60);
		test.add(evDL3);
		evDTF2 = new JTextField(date);
		evDTF2.setSize(90,30);
		evDTF2.setLocation(40,60);
		evDTF2.setEditable(false);
		test.add(evDTF2);
				
		//Priority
		evDL4 = new JLabel("Priority: ");
		evDL4.setSize(100,30);
		evDL4.setLocation(140,60);
		test.add(evDL4);
		evDTF3 = new JTextField(pri);
		evDTF3.setSize(50,30);
		evDTF3.setLocation(190,60);
		evDTF3.setEditable(false);
		test.add(evDTF3);
		
		//Deadline
		evDL5 = new JLabel("Deadline: ");
		evDL5.setSize(100,30);
		evDL5.setLocation(0,90);
		test.add(evDL5);
		evDTF4 = new JTextField(deadline);
		evDTF4.setSize(90,30);
		evDTF4.setLocation(60,90);
		evDTF4.setEditable(false);
		test.add(evDTF4);
		
		//Complete
		evDL6 = new JLabel("Complete:");
		evDL6.setSize(100,30);
		evDL6.setLocation(0,120);
		test.add(evDL6);
		evDTF5 = new JTextField(complete);
		evDTF5.setSize(30,30);
		evDTF5.setLocation(60,120);
		evDTF5.setEditable(false);
		test.add(evDTF5);
		comB = new JButton("Complete");
		comB.setSize(100,30);
		comB.setLocation(140,120);
		
		if(evDTF5.getText().equals("No"))
			test.add(comB);
		
		//Description
		evDL7 = new JLabel("Description:");
		evDL7.setSize(100,30);
		evDL7.setLocation(0,150);
		test.add(evDL7);
		textArea2 = new JTextArea();
		textArea2.setSize(270,255);
		textArea2.setLocation(0,180);
		textArea2.setEditable(false);
		textArea2.setLineWrap(true);
	    textArea2.setWrapStyleWord(true);
	    textArea2.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
	    test.add(textArea2);
			    
		delB = new JButton("Delete Task");
	    delB.setSize(120,30);
	    delB.setLocation(70,450);
	    test.add(delB);		
<<<<<<< HEAD
		
=======

>>>>>>> branch 'master' of https://github.com/Ciper997/CMPE3326_SPR18_Team7.git
	    test.validate();
	    test.repaint();
	}

	//////////////////////////
	//If reminder is selected
	//////////////////////////	
	private void addRmPan(String name, String date, String pri, String desc)
	{
		test.setSize(250,495);
		test.setLocation(300,150);
		test.setLayout(null);
		add(test);
		
		evDL1 = new JLabel("Reminder");
		evDL1.setSize(100,30);
		test.add(evDL1);		
		
		//Name
		evDL2 = new JLabel("Name: ");
		evDL2.setSize(100,30);
		evDL2.setLocation(0,30);
		test.add(evDL2);
		evDTF1 = new JTextField(name);
		evDTF1.setSize(200,30);
		evDTF1.setLocation(40,30);
		evDTF1.setEditable(false);
		test.add(evDTF1);
				
		//Date
		evDL3 = new JLabel("Date:");
		evDL3.setSize(100,30);
		evDL3.setLocation(0,60);
		test.add(evDL3);
		evDTF2 = new JTextField(date);
		evDTF2.setSize(90,30);
		evDTF2.setLocation(40,60);
		evDTF2.setEditable(false);
		test.add(evDTF2);
		
		//Priority
		evDL4 = new JLabel("Priority: ");
		evDL4.setSize(100,30);
		evDL4.setLocation(140,60);
		test.add(evDL4);
		evDTF3 = new JTextField(pri);
		evDTF3.setSize(50,30);
		evDTF3.setLocation(190,60);
		evDTF3.setEditable(false);
		test.add(evDTF3);
		
		//Description
		evDL7 = new JLabel("Description:");
		evDL7.setSize(100,30);
		evDL7.setLocation(0,90);
		test.add(evDL7);
		textArea2 = new JTextArea(desc);
		textArea2.setSize(270,255);
		textArea2.setLocation(0,120);
		textArea2.setEditable(false);
		textArea2.setLineWrap(true);
	    textArea2.setWrapStyleWord(true);
		textArea2.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
	    test.add(textArea2);
					    
		delB = new JButton("Delete Task");
	    delB.setSize(120,30);
	    delB.setLocation(70,450);
	    test.add(delB);	

	    test.validate();
	    test.repaint();
	}


	private class addTaskButton implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

			try {

				if (tabbedPane.getSelectedIndex() == 0)
				{
					base.addEvent("1", textField2.getText(), textArea1.getText(), textField3.getText(), textField1.getText(), textField4.getText(), textField5.getText());
					textField2.setText("");
					textField1.setText("MM-DD-YYYY");
					textField3.setText("1,2 or 3");
					textField4.setText("");
					textField5.setText("HH:MM");
					textArea1.setText("");
				}
				else if (tabbedPane.getSelectedIndex() == 1)
				{
					JRadioButton selected;
					if (yeah.isSelected())
						selected = yeah;
					else
						selected = nah;

					base.addHomework("2", hwTF1.getText(), textArea3.getText(), hwTF3.getText(), hwTF2.getText(), hwTF4.getText(), selected.getText());
					hwTF1.setText("");
					hwTF2.setText("MM-DD-YYYY");
					hwTF3.setText("1,2 or 3");
					hwTF4.setText("MM-DD-YYYY");
					selected.setSelected(false);
					textArea3.setText("");
				}
				else if (tabbedPane.getSelectedIndex() == 2)
				{
					base.addReminder("3", rmTF1.getText(), textArea4.getText(), rmTF3.getText(), rmTF2.getText());
					rmTF1.setText("");
					rmTF2.setText("MM-DD-YYYY");
					rmTF3.setText("1,2 or 3");
					textArea4.setText("");
				}

			 } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	private class displayEventButton implements ActionListener 
	{
		private int i;

		public displayEventButton(int i) {
			this.i = i;
		}

		public void actionPerformed(ActionEvent arg0) {
			test.removeAll();
			test.validate();
			test.repaint();
			addEvPan(data[i][2], data[i][5], data[i][4], data[i][6], data[i][7], data[i][3]);
		}
		
	}
	
	private class displayHomeworkButton implements ActionListener 
	{
		private int i;

		public displayHomeworkButton(int i) {
			this.i = i;
		}

		public void actionPerformed(ActionEvent arg0) {
			test.removeAll();
			test.validate();
			test.repaint();
			addHwPan(data[i][2], data[i][5], data[i][4], data[i][6], data[i][7], data[i][3]);
		}
		
	}
	
	private class displayReminderButton implements ActionListener 
	{
		private int i;

		public displayReminderButton(int i) {
			this.i = i;
		}

		public void actionPerformed(ActionEvent arg0) {
			test.removeAll();
			test.validate();
			test.repaint();
			addRmPan(data[i][2], data[i][5], data[i][4], data[i][3]);
		}
		
	}
	
	private class getDay implements ActionListener {
		private String day;

		public getDay(String day){
			this.day = day;
		}

		public void actionPerformed(ActionEvent arg0) 
		{
			currentDate = day;
		}
	}

	private class displayEventButton implements ActionListener {
		private int index;

		public displayEventButton(int index) {
			this.index = index;
		}

		public void actionPerformed(ActionEvent arg0) {
			test.removeAll();
			addEvPan(name, date, pri, location, time, desc);
		}

	private class getDay implements ActionListener {
		private String day;

		public getDay(String day){
			this.day = day;
		}

		public void actionPerformed(ActionEvent arg0) {

		}
	}

}
