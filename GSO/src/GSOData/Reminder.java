package GSOData;

import java.util.*;

public class Reminder extends NoteBase{
	public String Location;
	public int DurationHours, DurationMinutes;//Make sure to limit Hours to 12 or 24 depending on what format you want, 
	//These times can be shown on 12- hour format, but I would prefer to store it in a 24 hour format;
}
