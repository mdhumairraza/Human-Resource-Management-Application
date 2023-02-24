package com.humair.ui;

import java.util.Scanner;

import com.humair.CustomColour.ConsoleColors;
import com.humair.dao.DaoImplement;
import com.humair.dao.DaoInterfaces;
import com.humair.dto.Employee;
import com.humair.dto.EmployeeLeave;

public class EmployeeUi {

	public static void employeeSide(Scanner sc) {
		System.out.println("   ");
		System.out.println(ConsoleColors.BLUE_BACKGROUND_BRIGHT +"* Welcome To Employee Portal *  "+ConsoleColors.RESET);
		System.out.println("   ");
		System.out.println(ConsoleColors.WHITE_UNDERLINED +"Please Enter Your Name :- "+ConsoleColors.RESET);
		String employee_name = sc.next();
		System.out.println(ConsoleColors.WHITE_UNDERLINED +"Please Enter Your Password :-"+ConsoleColors.RESET);
		String pass = sc.next();

	   
		DaoInterfaces di = new DaoImplement();
		int admin_access = di.validateEmployee(employee_name);
		
	    
		if(admin_access == 123) {
			System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT +"Employee Name Not Found"+ConsoleColors.RESET);
			Main.call();
		}else if(admin_access == 345) {
			System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT +"Password Do Not Matched"+ConsoleColors.RESET);
			Main.call();
		}else {
	    System.out.println(ConsoleColors.WHITE_BACKGROUND +"-------------------------------------------|");
		System.out.println(ConsoleColors.GREEN_BOLD+"|| Please Choose Your Action :-            |");
		System.out.println(ConsoleColors.GREEN_BOLD+"-------------------------------------------|");
		System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 1 ] for View Employee Profile            |" );
		System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 2 ] for Update Your Password             |");
		System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 3 ] for Update Your Name                 |" );
		System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 4 ] for Apply Leave                      |" );
		System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 5 ] for Your Leave Status                |");
		System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 6 ] for Logout                           |");
		System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT +"-------------------------------------------|"+ConsoleColors.RESET);
		System.out.println(" ");
		int userInput = sc.nextInt();
		String loop = "y";
	
		int count = 0;
	

		while(loop == "y") {
			
			if(count > 0) {
			    System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT +"-------------------------------------------|");
				System.out.println(ConsoleColors.GREEN_BOLD+"|| Please Choose Your Action :-            |");
				System.out.println(ConsoleColors.GREEN_BOLD+"-------------------------------------------|");
				System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 1 ] for View Employee Profile            |");
				System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 2 ] for Update Your Password             |");
				System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 3 ] for Update Your Name                 |");
				System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 4 ] for Apply Leave                      |");
				System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 5 ] for Your Leave Status                |");
				System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 6 ] for Logout                           |");
				System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT +"-------------------------------------------|"+ConsoleColors.RESET);
				System.out.println(" ");
				userInput = sc.nextInt();
			}
		switch(userInput) {

		case 1:
		  {
				Employee emp  = di.viewEmployee(employee_name, pass);
				if(emp == null) {
					loop = "n";
					System.out.println(" ");
					System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT +"You Are Not A Registered Employee");
					System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"---------Logging Out-----------");
					System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"<-----Application Closed------>");
					System.out.println("  ");
				
					return;
				}
				System.out.println(ConsoleColors.WHITE_BACKGROUND +"----------------------------------------");
				System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT +ConsoleColors.BLACK_BOLD + emp);
	
				  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");
				  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 0 ] to return Main Menu     |");
				  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 1 ] to Exit                   |");
				  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");	
				int loopValue = sc.nextInt();
				if(loopValue == 0) {
					loop = "y";
				}else {
					loop = "n";
					System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"---------Logging Out-----------");
					System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"<-----Application Closed------>"+ConsoleColors.RESET);
					System.out.println("  ");
				}
				
		   }
		   break;
		 case 2:
		     {
		    	    System.out.println(ConsoleColors.WHITE_UNDERLINED +"Enter new Password");
			 		String newPass = sc.next();
			 		String res  = di.updateEmpPass(employee_name, pass,newPass);
	                pass = newPass;
			 	
			 		System.out.println(res);
		 		
			 		System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");
					  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 0 ] to return Main Menu     |");
					  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 1 ] to Exit                 |");
					  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");		
		 		
		 		int loopValue = sc.nextInt();
				if(loopValue == 0) {
					loop = "y";
				}else {
					loop = "n";
					System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"---------Logging Out-----------");
					System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"<-----Application Closed------>");
					System.out.println("  ");
				}
	     	 }
	 	   break;
		 case 3:
		     {
		    		System.out.println(ConsoleColors.WHITE_UNDERLINED +"Enter New  Name");
			 		String newName = sc.next();
		 		
		 	
		 		String res  = di.updateEmpName(employee_name, pass,newName);
		 		employee_name = newName;
		 		System.out.println(res);
		 		
		 		System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");
				  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 0 ] to return Main Menu     |");
				  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 1 ] to Exit                 |");
				  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");		
				
		 		int loopValue = sc.nextInt();
				if(loopValue == 0) {
					loop = "y";
				}else {
					loop = "n";
					System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"---------Logging Out-----------");
					System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"<-----Application Closed------>");
					System.out.println("  ");
				}
		     }
			 break;
		 case 4:
		      {
		      


				  String msg =  di.leaveApply(pass);
				  System.out.println(msg);
				  
				  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");
				  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 0 ] to return Main Menu     |");
				  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 1 ] to Exit                 |");
				  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");	;	
					
				  int loopValue = sc.nextInt();
					if(loopValue == 0) {
						loop = "y";
					}else {
						loop = "n";
						System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"---------Logging Out-----------");
						System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"<-----Application Closed------>");
						System.out.println("  ");
					}
		      }
			 break;
		 case 5:
		     { 

				  
				  EmployeeLeave empLeave = di.getLeaveStatusById(pass);
				  
				  
				  if(empLeave == null) {
						loop = "y";
						System.out.println(" ");
						System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT +ConsoleColors.BLACK_BOLD +"You Have Not Applied For Leave");
//						System.out.println("<-----Application Closed------>");
						System.out.println("  ");
						System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");
						  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 0 ] to return Main Menu     |");
						  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 1 ] to Exit                 |");
						  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");	
						  
					
						  int loopValue = sc.nextInt();
							if(loopValue == 0) {
								loop = "y";
							}else {
								loop = "n";
								System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"---------Logging Out-----------");
								System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"<-----Application Closed------>");
								System.out.println("  ");
							}
					}else {
				  System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT +ConsoleColors.BLACK_BOLD + empLeave);
				  
				  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");
				  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 0 ] to return Main Menu     |");
				  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 1 ] to Exit                 |");
				  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");		
					
				  int loopValue = sc.nextInt();
					if(loopValue == 0) {
						loop = "y";
					}else {
						loop = "n";
						System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"---------Logging Out-----------");
						System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"<-----Application Closed------>");
						System.out.println("  ");
					}
					}
		     }
			 break;
		 case 6:
			 {
				 
				 System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"---------Logging Out-----------"+ConsoleColors.RESET);
				 System.out.println("  ");
				 Main.call();
			 }
			default :
				   System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.RED_BOLD+"|---------------------|");
				   System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.RED_BOLD+"|    Incorrect Option.|");
				   System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.RED_BOLD+"|    Enter Again......|");
				   System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.RED_BOLD+"|---------------------|");
			   break;
		}
		count++;
		}
		}
		sc.close();

	}

}

