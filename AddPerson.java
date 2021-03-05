package Hyperion;

public class AddPerson {
	
	//Declare and initialize the attributes for a person with a variety of relevant variables
	String project;
	String type;
	String fullName;
	String cellNumber;
	String email;
	String address;
	
		
	//Create method that takes in the variables from above and uses them to store the information pertaining to specific project personnel
	// Use this. in built method for every attribute to create the project when the AddPerson method is called in main class
	public AddPerson(String project, String type, String fullName, String cellNumber, String email, String address) {
		
		this.project = project;
		this.type = type;
		this.fullName = fullName;
		this.cellNumber = cellNumber;
		this.email = email;
		this.address = address;
			
	}
		
	//As with the CreateProject class, create toString method to be called in main class for display
	public String toString() {
			
		System.out.println(project + ": " + type);
		String output = "\nName: " + fullName;
		output += "\nCell No.: " + cellNumber;
		output += "\nEmail: " + email;
		output += "\nPhysical Address: " + address;
			
		return output;  
	}
}
