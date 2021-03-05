package Hyperion;

//Import Scanner to get user input
import java.util.Scanner;

//Resource: https://github.com/DanielleBussy/Capstone-Project-4
//Create main class to test if I can call the methods created in other classes
public class Menu {
	public static void main (String args[]) {
		
		//Test CreateProject method
		//Call CreateProject method and name it houseTyson
		//Input all required variables to create the project object
		CreateProject houseTyson = new CreateProject("House Tyson", "15", "House", "365 Long Ave", "db12", "1200000.99", "600000", "01 December 2021", "No", "bob the builder", "ted mosby", "mike tyson");
		
		//Final test to see if it worked. Print and display project created above
		System.out.println("\n\tProjects:\n");
		System.out.println(houseTyson);
		
		//Test AddPerson method
		//Call AddPerson method and name object tedmosby
		//Input all required variables to create the person object
		AddPerson tedmosby = new AddPerson("House Tyson", "Architect", "Ted Mosby", "555-1234", "ted@gmail.com", "75 Elgin Rd");
		
		//Print and display person created above
		System.out.println("\n\tPersonnel:\n");
		System.out.println(tedmosby);
		
		//Make program for user as specified in task instructions
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
		
		//Declare and initialize the attributes for a person with a variety of relevant variables
		String project;
		String type;
		String fullName;
		String cellNumber;
		String email;
		String address;
		
		
		//Create Scanner object and use print statements to get user to input values for all the variables listed above which creates the project object
		//Store user input with Scanner object and inbuilt nextLine() method
		Scanner input = new Scanner (System.in);
		System.out.println("\nCreate new project: ");
		System.out.println("Project name: ");
		name = input.nextLine();
		
		System.out.println("Project Number: ");
		number = input.nextLine();
		
		System.out.println("Building Type: ");
		buildType = input.nextLine();
		
		System.out.println("Project Address: ");
		buildAddress = input.nextLine();
		
		System.out.println("ERF: ");
		erf = input.nextLine();
		
		System.out.println("Total Fee: ");
		totalFee = input.nextLine();
		
		System.out.println("Total Paid: ");
		totalPaid = input.nextLine();
		
		System.out.println("Deadline: ");
		deadline = input.nextLine();
		
		System.out.println("Complete: ");
		complete = input.nextLine();
		
		System.out.println("Contractor: ");
		contractor = input.nextLine();
		
		System.out.println("Architect: ");
		architect = input.nextLine();
		
		System.out.println("Client: ");
		client = input.nextLine();
		
		//Display message to user to let them know they're done with creating their project
		//Use CreateProject method from CreateProject class to create the project object with user input
		//Call toString (CreateProject class) method to display new project to user
		System.out.println("New Project Created");
		CreateProject userProject = new CreateProject(name, number, buildType, buildAddress, erf, totalFee, totalPaid, deadline, complete, contractor, architect, client);
		System.out.println(userProject.toString());
		
		//Added a while loop to the top of the 'menu' code so that the menu would keep running and allow all functions to be tested without restarting constantly
		//Will also be useful in final form in case the user wants to do multiple things with the menu before program closes
		while (true) {
		
			//Print statement prompting user to edit or finalise a project or to edit a contractor 
			//Declare menuChoice variable, the choice of which made by the user will determine the outcome of the upcoming if else statements
			System.out.println("\nPlease choose a number option from the menu below: \n" + "\na) Edit Project" + "\nb) Finalise Project"+ "\nc) Edit Contractor");
						
			String menuChoice = input.nextLine();
					
			//Option a) allows user to edit various details about the project
			//Use the || within the if statement brackets as an 'or' statement in case user enters input with caps on
			//Display the editing options to user and create another string variable that reflects user choice within the main menu choice
			if (menuChoice.equals("a") || menuChoice.equals("A")){	
					
					System.out.println("\na) Change due date" + "\nb) Update total amount paid by client");			
					
					String editChoice = input.nextLine();
					
				    //If user choice == a or A, then prompt user to enter their new due date and user scanner object to reassign the value of the variable 'due date'
				    //Call CreateProject method to update the entire project and call the toString method (CreateProject class) to display the updated project to user
					if (editChoice.equals("a") || editChoice.equals("A")){	
					
					System.out.println("\nPlease enter a new due date for the project: ");
					
					deadline = input.nextLine();  
								
					CreateProject updatedUserProject = new CreateProject(name, number, buildType, buildAddress, erf, totalFee, totalPaid, deadline, complete, contractor, architect, client);
					System.out.println("\nDue Date Updated\n");
					System.out.println(updatedUserProject.toString()); 
								
				}
				//If user inputs b or B, prompt user to update the total amount paid so far by the client
				//Use scanner object to reassign value of totalPaid variable
				//Call CreateProject and toString methods (CreateProject class) to update and display project to user
				else if (editChoice.equals("b") || editChoice.equals("B")){ 
								
					System.out.println("\nPlease enter a new total amount of the fee paid to date: ");
					
					totalPaid = input.nextLine();
						
					CreateProject updatedUserProject = new CreateProject(name, number, buildType, buildAddress, erf, totalFee, totalPaid, deadline, complete, contractor, architect, client);
					System.out.println("\nClient Info Updated\n");
					System.out.println(updatedUserProject.toString());   
				}
			}
			//Back to main menu input
			//If the user selects option b, confirm that the project has been finalised one more time
			//If user confirms, simply change complete variable to 'Yes' automatically in the CreateProject method
			//Call toString method (CreateProject class) to display new complete project to user
			else if (menuChoice.equals("b") || menuChoice.equals("B")) {
				
				System.out.println("Please confirm that your project is complete (Y / N): ");
				
				if (input.nextLine().equals("y") || input.nextLine().equals("Y")) {
					
					CreateProject finishedUserProject = new CreateProject(name, number, buildType, buildAddress, erf, totalFee, totalPaid, deadline, "Yes", contractor, architect, client);
					System.out.println("\nProject Finalised\n");
					System.out.println(finishedUserProject.toString());
					
				}
			}
			//If user selects c at main menu use println and scanner object to prompt user to enter new details about the contractor person
			else if (menuChoice.equals("c") || menuChoice.equals("C")){
	
					System.out.println("\nContractor Name: ");  
					
					fullName = input.nextLine();
							
					System.out.println("\nContact Number: ");  
				
					cellNumber = input.nextLine();
							
					System.out.println("\nEmail: "); 
				
					email = input.nextLine();
							
					System.out.println("\nPersonal Address: "); 
				
					address = input.nextLine();
							
					//Call AddPerson method and use values stored into variables by user above to update the contractors information
					//Print message to user informing them that the contractor update is complete
					//Use toString method (AddPerson class) to display contractor info
					AddPerson contractorEdit = new AddPerson("House Tyson", "Contractor", fullName, cellNumber, email, address);
					System.out.println("Your contractor details have been update successfully. \n");
					System.out.println(contractorEdit.toString());	
						
			}
		
		}
	}
}
	
	
	

