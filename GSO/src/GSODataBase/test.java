import java.sql.SQLException;

public class test
{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
	{
		EventBase testing = new EventBase();

		//Events
		testing.typeEvent(00001, 1, "TED Talk", "A speaker will be talking about cyber security", 2, "2018-04-30", "Student Union", "01:30:00", null, 1);
	
		testing.typeEvent(00002, 1, "Senior Project proposals", "Seniors will be showing off their projects", 3, "2018-04-22", "Engineering", "01:00:00", null, 0);

		//Homework
		testing.typeEvent(00003, 2, "Hw 4", "Create Carmax app using GUI", 1, "2018-04-22", null, null, "2018-04-24", 1);

		testing.typeEvent(00004, 2, "Lab 14", "Learn how to use JFrame and Swing", 2, "2018-04-21", null, null, "2018-04-29", 0);

		//Reminder
		testing.typeEvent(00005, 3, "Cook", "Cook dinner tonight to save money", 3, "2018-04-25", null, null, null, 0);

		testing.typeEvent(00006, 3, "Supplies", "Run to the store to get school supplies", 3, "2018-04-22", null, null, null, 0);

		String[][] data = testing.getDataByDate("2018-04-22");
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				System.out.print(data[i][j]);
			}
			System.out.println();
		}


		testing.testPrint();





	}
}