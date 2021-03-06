package GUI;
import java.sql.*;

/*
ID = INT
NoteType = INT
EventName = VARCHAR(100)
EventDesc = TEXT
Priority = INT
theDate = DATE(YYYY-MM-DD)
Location = VARCHAR(100)
Duration = TIME(HH:MM:SS)
Deadline = DATE(YYYY-MM-DD)
Complete = BOOLEAN
*/



public class EventBase {

	int topID;

    EventBase() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

        topID = getTopId();
    }


	//Sets the given ID to the only id in the table TopId
	private void setTopId(int id) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection connection = DriverManager.getConnection("jdbc:mysql://35.225.154.164:3306/GSO?autoReconnect=true&useSSL=false","root", "12345");
        Statement statement = connection.createStatement();
        String change = "update TopId set ID = '" + id + "'";
        statement.executeUpdate(change);
        connection.close();
	}

    private int getTopId() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection connection = DriverManager.getConnection("jdbc:mysql://35.225.154.164:3306/GSO?autoReconnect=true&useSSL=false","root", "12345");
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from TopId");
        rs.next();
        return rs.getInt(1);
    }

	/////////////////////////////////////////////////////////////
	//Stores an Event, Homework, or Reminder to Event_Note
	//Stores the ID's by date in NoteDay
	public void addEvent(String type, String name, String desc, String priority, String date, String location, String duration) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

        int id = topID + 1;
        topID++;
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection connection = DriverManager.getConnection("jdbc:mysql://35.225.154.164:3306/GSO?autoReconnect=true&useSSL=false","root", "12345");
        Statement statement = connection.createStatement();
        String insert = "insert into Event_Note (ID, NoteType, EventName, EventDesc, Priority, theDate, Location, Duration) values ('" + id + "', '" + type + "', '" + name + "', '" + desc + "', '" + priority + "', '" + date + "', '" + location + "', '" + duration + "')";
		statement.executeUpdate(insert);
		setTopId(id);
		connection.close();
	}

	public void addHomework(String type, String name, String desc, String priority, String date, String deadline, String complete) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

		int id = topID + 1;
        topID++;
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection connection = DriverManager.getConnection("jdbc:mysql://35.225.154.164:3306/GSO?autoReconnect=true&useSSL=false","root", "12345");
        Statement statement = connection.createStatement();
        String insert = "insert into Event_Note (ID, NoteType, EventName, EventDesc, Priority, theDate, Deadline, Complete) values ('" + id + "', '" + type + "', '" + name + "', '" + desc + "', '" + priority + "', '" + date + "', '" + deadline + "', '" + complete + "')";
		statement.executeUpdate(insert);
		setTopId(id);
		connection.close();
	}

	public void addReminder(String type, String name, String desc, String priority, String date) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

		int id = topID + 1;
        topID++;
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection connection = DriverManager.getConnection("jdbc:mysql://35.225.154.164:3306/GSO?autoReconnect=true&useSSL=false","root", "12345");
        Statement statement = connection.createStatement();
        String insert = "insert into Event_Note (ID, NoteType, EventName, EventDesc, Priority, theDate) values ('" + id + "', '" + type + "', '" + name + "', '" + desc + "', '" + priority + "', '" + date + "')";
		statement.executeUpdate(insert);
		setTopId(id);
		connection.close();
	}
	/////////////////////////////////////////////////////////////


    /////////////////////////////////////////////////////////////
    //Returns the String
    public String[][] getDataByDate(String date) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection connection = DriverManager.getConnection("jdbc:mysql://35.225.154.164:3306/GSO?autoReconnect=true&useSSL=false","root", "12345");
        Statement statement = connection.createStatement();
        String sort = "select * from Event_Note where theDate = '" + date + "' order by Priority, NoteType";
        ResultSet rs = statement.executeQuery(sort);

        rs.last();
        int numRows = rs.getRow();
        rs.beforeFirst();

        String[][] sorted = new String[numRows][8];

        for (int i = 0; rs.next(); i++)
        {
            if (rs.getInt("NoteType") == 1)
            {
                sorted[i][0] = rs.getString("ID");
                sorted[i][1] = rs.getString("NoteType");
                sorted[i][2] = rs.getString("EventName");
                sorted[i][3] = rs.getString("EventDesc");
                sorted[i][4] = rs.getString("Priority");
                sorted[i][5] = rs.getString("theDate");
                sorted[i][6] = rs.getString("Location");
                sorted[i][7] = rs.getString("Duration");
            }
            else if (rs.getInt("NoteType") == 2)
            {
                sorted[i][0] = rs.getString("ID");
                sorted[i][1] = rs.getString("NoteType");
                sorted[i][2] = rs.getString("EventName");
                sorted[i][3] = rs.getString("EventDesc");
                sorted[i][4] = rs.getString("Priority");
                sorted[i][5] = rs.getString("theDate");
                sorted[i][6] = rs.getString("Deadline");
                sorted[i][7] = rs.getString("Complete");
            }
            else
            {
                sorted[i][0] = rs.getString("ID");
                sorted[i][1] = rs.getString("NoteType");
                sorted[i][2] = rs.getString("EventName");
                sorted[i][3] = rs.getString("EventDesc");
                sorted[i][4] = rs.getString("Priority");
                sorted[i][5] = rs.getString("theDate");
                sorted[i][6] = " ";
                sorted[i][7] = " ";
            }
        }

        return sorted;
    }

	public void testPrint() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection connection = DriverManager.getConnection("jdbc:mysql://35.225.154.164:3306/GSO?autoReconnect=true&useSSL=false","root", "12345");
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from Event_Note");

        System.out.println("Info in the Event_Note table");
        while (rs.next())
        {
        	if (rs.getInt(2) == 1)
        	{
        		System.out.print(rs.getString(1) + "/");
        		System.out.print(rs.getString(2) + "/");
        		System.out.print(rs.getString(3) + "/");
        		System.out.print(rs.getString(4) + "/");
        		System.out.print(rs.getString(5) + "/");
        		System.out.print(rs.getString(6) + "/");
        		System.out.print(rs.getString(7) + "/");
        		System.out.print(rs.getString(8) + "\n");
        	}
        	else if (rs.getInt(2) == 2)
        	{
        		System.out.print(rs.getString(1) + "/");
        		System.out.print(rs.getString(2) + "/");
        		System.out.print(rs.getString(3) + "/");
        		System.out.print(rs.getString(4) + "/");
        		System.out.print(rs.getString(5) + "/");
        		System.out.print(rs.getString(6) + "/");
        		System.out.print(rs.getString(9) + "/");
        		System.out.print(rs.getString(10) + "\n");
        	}
        	else if (rs.getInt(2) == 3)
        	{
        		System.out.print(rs.getString(1) + "/");
        		System.out.print(rs.getString(2) + "/");
        		System.out.print(rs.getString(3) + "/");
        		System.out.print(rs.getString(4) + "/");
        		System.out.print(rs.getString(5) + "/");
        		System.out.print(rs.getString(6) + "\n");
        	}
        	else
        	{
        		System.out.print(rs.getString(1) + "/");
        		System.out.print(rs.getString(2) + "/");
        		System.out.print(rs.getString(3) + "/");
        		System.out.print(rs.getString(4) + "/");
        		System.out.print(rs.getString(5) + "/");
        		System.out.print(rs.getString(6) + "/");
        		System.out.print(rs.getString(7) + "/");
        		System.out.print(rs.getString(8) + "/");
        		System.out.print(rs.getString(9) + "/");
        		System.out.print(rs.getString(10) + "\n");
        	}
        }
        connection.close();
	}

    public void updateBase(String id) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection connection = DriverManager.getConnection("jdbc:mysql://35.225.154.164:3306/GSO?autoReconnect=true&useSSL=false","root", "12345");
        Statement statement = connection.createStatement();
        String update = "update Event_Note set Complete = 'Yes' where ID = '" + id + "'";
        statement.executeUpdate(update);
        connection.close();
    }

    public void removeBase(String id) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection connection = DriverManager.getConnection("jdbc:mysql://35.225.154.164:3306/GSO?autoReconnect=true&useSSL=false","root", "12345");
        Statement statement = connection.createStatement();
        String update = "delete from Event_Note where ID = '" + id + "'";
        statement.executeUpdate(update);
        connection.close();
    }
	
	public String[][] getAllData() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection connection = DriverManager.getConnection("jdbc:mysql://35.225.154.164:3306/GSO?autoReconnect=true&useSSL=false","root", "12345");
        Statement statement = connection.createStatement();
        String sort = "select * from Event_Note order by Priority";
        ResultSet rs = statement.executeQuery(sort);

        rs.last();
        int numRows = rs.getRow();
        rs.beforeFirst();

        String[][] sorted = new String[numRows][8];

        for (int i = 0; rs.next(); i++)
        {
            if (rs.getInt("NoteType") == 1)
            {
                sorted[i][0] = rs.getString("ID");
                sorted[i][1] = rs.getString("NoteType");
                sorted[i][2] = rs.getString("EventName");
                sorted[i][3] = rs.getString("EventDesc");
                sorted[i][4] = rs.getString("Priority");
                sorted[i][5] = rs.getString("theDate");
                sorted[i][6] = rs.getString("Location");
                sorted[i][7] = rs.getString("Duration");
            }
            else if (rs.getInt("NoteType") == 2)
            {
                sorted[i][0] = rs.getString("ID");
                sorted[i][1] = rs.getString("NoteType");
                sorted[i][2] = rs.getString("EventName");
                sorted[i][3] = rs.getString("EventDesc");
                sorted[i][4] = rs.getString("Priority");
                sorted[i][5] = rs.getString("theDate");
                sorted[i][6] = rs.getString("Deadline");
                sorted[i][7] = rs.getString("Complete");
            }
            else
            {
                sorted[i][0] = rs.getString("ID");
                sorted[i][1] = rs.getString("NoteType");
                sorted[i][2] = rs.getString("EventName");
                sorted[i][3] = rs.getString("EventDesc");
                sorted[i][4] = rs.getString("Priority");
                sorted[i][5] = rs.getString("theDate");
                sorted[i][6] = " ";
                sorted[i][7] = " ";
            }
        }

        return sorted;
    }
}
