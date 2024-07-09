package model;

public class IdFactory {
	
	public static final int FIRST_ID = 10001;
	public static final int LAST_ID = 99999;
	private static int nextId = FIRST_ID;
	
	//static methods
	public static int getNextId(){
		return (nextId <= LAST_ID) ? nextId++ : 0;
	}
	
	public static int getNoOfAvailableIds() {
		  return LAST_ID-nextId+1;	
	}
		
	public static int getNoOfAssignedIds() {
		  return nextId-FIRST_ID;	
	}
}