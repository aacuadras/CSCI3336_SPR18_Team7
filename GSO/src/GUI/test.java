import java.sql.SQLException;

public class test
{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
	{
		EventBase testing = new EventBase();

		//Events
		testing.addEvent("1", "TED Talk", "A speaker will be talking about cyber security", "2", "04-30-2018", "Student Union", "01:30:00");
	
		testing.addEvent("1", "Senior Project proposals", "Seniors will be showing off their projects", "3", "04-22-2018", "Engineering", "01:00:00");

		//Homework
		testing.addHomework("2", "Hw 4", "Create Carmax app using GUI", "1", "04-22-2018", "04-24-2018", "1");

		testing.addHomework("2", "Lab 14", "Learn how to use JFrame and Swing", "2", "04-21-2018", "04-29-2018", "0");

		//Reminder
		testing.addReminder("3", "Cook", "Cook dinner tonight to save money", "3", "04-25-2018");

		testing.addReminder("3", "Supplies", "Run to the store to get school supplies", "3", "04-22-2018");

		// String[][] data = testing.getDataByDate("2018-04-22");
		// for (int i = 0; i < data.length; i++)
		// {
		// 	for (int j = 0; j < 8; j++)
		// 	{
		// 		System.out.print(data[i][j]);
		// 	}
		// 	System.out.println();
		// }


		// testing.testPrint();



		//System.out.println(testing.reworkDate("04-22-2018"));

	}
}