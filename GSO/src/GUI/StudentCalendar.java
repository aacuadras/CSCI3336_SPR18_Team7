//package GUI;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;


public class StudentCalendar extends JFrame{

	private JTextArea textArea1, textArea2;
	private JTextField textField1, textField2, textField3, textField4, textField5, textField6, textField7, textField8, textField9;
	private JTextField textField10, textField11, textField12, textField13, textField14, textField15, textField16, textField17, textField18;
	private JTextField sunF, monF, tueF, wedF, thuF, friF, satF;
	private JLabel sun, mon, tue, wed, thu, fri, sat;
	private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9;
	private JScrollPane scroll1;
	private JPanel buttonPanel;
	private GridBagConstraints constraint;
	private JButton button1;
	private JTabbedPane tabbedPane;
	JPanel event, homework, reminder;
	
	protected JComponent makeTextPanel(String text) {
	    JPanel panel = new JPanel(false);
	    JLabel filler = new JLabel(text);
	    filler.setHorizontalAlignment(JLabel.CENTER);
	    panel.setLayout(new GridLayout(1, 1));
	    panel.add(filler);
		return panel;
	}
	
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
	    textArea2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
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
	    textArea1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		textArea1.setLocation(0, 150);
		textArea1.setSize(315, 260);
		event.add(textArea1);
		
		tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
		
		JComponent panel2 = makeTextPanel("Panel2");
		tabbedPane.addTab("Homework", panel2);
		tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
		
		JComponent panel3 = makeTextPanel("Panel3");
		tabbedPane.addTab("Reminder", panel3);
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
