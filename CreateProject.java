package Hyperion;

public class CreateProject {
	
	//Declare and initialize the attributes for a project with a variety of relevant variables
	String name;
	String number;
	String buildType;
	String buildAddress;
	String erf;
	String totalFee;
	String totalPaid;
	String deadline;
	String complete;
	String contractor;
	String architect;
	String client;
	
	//Create method that takes in the variables from above and uses them to store the information pertaining to specific engineering projects
	//Use this. in built method for every attribute to create the project when the CreateProject method is called in main class
	public CreateProject(String name,String number,String buildType,String buildAddress,String erf,String totalFee,String totalPaid,String deadline,String complete,String contractor,String architect,String client) {
			
		this.name = name;
		this.number = number;
		this.buildType = buildType;
		this.buildAddress = buildAddress;
		this.erf = erf;
		this.totalFee = totalFee;
		this.totalPaid = totalPaid;
		this.deadline = deadline;
		this.complete = complete;
		this.contractor = contractor;
		this.architect = architect;
		this.client = client;
			
		}
			
	//Use toString method learned from the School.java task to display the project information to the user once all the details have been saved for a project by the above method
	//Create string variable 'output' and add every line of required information for display as with the Student, Teacher and Secretary class from School.java task
	public String toString() {
				
			System.out.println("Project " + name + "\n");
			String output = "Project Number: " + number;
			output += "\nBuilding Type: " + buildType;
			output += "\nProject Address: " + buildAddress;
			output += "\nERF Number: " + erf;
			output += "\nTotal Fee Charged: R" + totalFee;
			output += "\nAmount Paid to Date: R" + totalPaid;
			output += "\nProject Deadline: " + deadline;
			output += "\nProject Contractor: " + contractor;
			output += "\nLead Architect: " + architect;
			output += "\nClient: " + client;
			output += "\nComplete: " + complete;
			
				
			return output;  
				
			}

}
