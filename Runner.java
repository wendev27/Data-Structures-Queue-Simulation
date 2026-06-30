package Queue;
import java.util.Scanner;
//stringQueueClass

public class Runner {
	 public static void main(String[] args) {
		   Scanner myScanner = new Scanner(System.in);
	       int myCapacity = 0; // lets the user adjust the max queue;
	       int myChoice = 1; // for termination of the main loop
	       int myChoice2 = 0; // variable for 
	       int studentsInLine;
	       String[] storeArray = {"Ate Nene", "Aling Merna", "Claire's Specialties"};
	       String[] foodTypeArray = {"Chips","Drinks","Rice Meal"};
	       String[][][] storeChoiceArray = { 
	    		   {
	    			   //Chips
	    			   {"Chicharon","10", "Fish cracker","20", "V-cut", "20"},  
	    			   //Drinks
	    			   {"Coke","25", "Juice","25", "Coffee", "20"},
	    			   //Rice Meals
	    			   {"Adobo","80", "Sinigang","90", "Porkchop", "110"} 
	    		   },
	    		   {
	    			   //Chips
	    			   {"Tortilla Chips","30", "Piatos","40", "Kropek", "35"},  
	    			   //Drinks
	    			   {"Sprite","25", "Cobra","35", "Iced Coffee", "30"},
	    			   //Rice Meals
	    			   {"Afritada","70", "Sisig","80", "Kare-kare", "75"},
	    		   },
	    		   {
	    			   //Chips
	    			   {"Mr. Chips","30", "Cheezy","30", "Corn Chips", "25"},
	    			   //Drinks
	    			   {"Minute maid","25", "Mountain dew","25", "Water", "20"},
	    			   //Rice Meals
	    			   {"Chicken Adobo","90", "Chopsuey","80", "Pork steak", "80"} 
	    		   }
	       };      
	       boolean chips = false;
	       boolean riceMeals = false;
	       boolean drinks = false;	       
	       String chipsOrder = "-Chips : ";
	       String riceMealsOrder = "-Rice Meal : ";
	       String drinksOrder = "-Drinks : "; 
	        while(myChoice != 0) {//while loop for program termination
	    	myChoice2 = 0;
	    	System.out.println("===============================================");
	        System.out.print("\tEnter Line capacity ? : "); 
	        myCapacity = myScanner.nextInt();//user input for queue initialization
	        System.out.println("===============================================");
	        stringQueue queue = new stringQueue(myCapacity);
	        while(myChoice2 != 0 || myChoice2 >= 0 && myChoice2 <=3) {
	        	if(myChoice2 > 0 && myChoice2 > 3 ) {
	        		//System.out.println("===============================================");
	        		System.out.println("Choose from 1-3 only...");
	        		//System.out.println("===============================================");
	        	}
	        	studentsInLine = queue.getSize();
	        	System.out.println("===============================================");
	        	System.out.print("|Line Capacity : "+ myCapacity + "|Students in Line : " + studentsInLine + "|\n\n\t[1] Enqueue student\n\t[2] dequeue student\n\t[3] check all queued students\n\t[0] reset and adjust the line capacity\n\n");
	        	System.out.print("\t\tinput : ");
	        	myChoice2 = myScanner.nextInt();
	        	System.out.println("===============================================");
	        	if(myChoice2 == 1) {	
	        		if(studentsInLine < myCapacity) {
		        		//variables
		        		String[] orders;
		        		String name = "", section = "", idNumber = "", storeName = "", 
		        				foodName = "", tpString = "",finalOrder = ""; 
		        		int price = 0, totalPrice = 0, storeChoice = 0, foodTypeChoice = 0, 
		        				foodBrandChoice = 0, foodPriceChoice = 0;//pString = "";
		        		System.out.println("\t\t\tORDER INFO\n");
		        		System.out.print("Name : ");
		        		name = myScanner.next();
		        		System.out.print("Section : ");
		        		section = myScanner.next();
		        		System.out.print("ID Number : ");
		        		idNumber= myScanner.next();	
		        		int orderLoop = 0;
		        		while(orderLoop < 1 || orderLoop > 5) {
		        			System.out.print("How many Orders (5max): ");
	        				orderLoop = myScanner.nextInt();
		        			if(orderLoop <= 5 && orderLoop > 0) {
		        			}else {
		        				System.out.println("minimum of 1 and maximum of 5 only");
		        			}
		        		}
		        		orders = new String[orderLoop];
		        		for(int x = 1; x <= orderLoop;x++) {
		        			storeChoice = 0;
		        			while(storeChoice <= 0 || storeChoice > 3) {
		        				System.out.print("\t\t\nOrder # " + x);
				        		System.out.print("\nStore :\n\t[1] Ate Nene\n\t[2] Aling Merna\n\t[3] Claire's Specialties\n");
				        		System.out.print("\n\tChoose a store : ");
				        		storeChoice = myScanner.nextInt();
				        		
				        		if(storeChoice == 1 || storeChoice == 2 || storeChoice == 3) {
				        		}else {
				        			System.out.println("Choose frome 1 - 3 only...");
				        		}
			        		}
		        			foodTypeChoice = 0;
		        			while(foodTypeChoice <= 0 || foodTypeChoice > 3) {
		        				System.out.print("\n");
		        				System.out.print("Available :\n\t[1] Chips\n\t[2] Drinks\n\t[3] RiceMeals\n");
		        				System.out.print("\n\tSelect your food: ");
				        		foodTypeChoice = myScanner.nextInt();
				        		if(foodTypeChoice == 1 || foodTypeChoice == 2 || foodTypeChoice == 3) {
				        			System.out.println("");
				        		}else {
				        			System.out.println("Choose from 1 - 3 only...");
				        		}
		        			}
		        			foodBrandChoice = 0;
		        			foodPriceChoice = 0;
		        			int c = 0, d = 0, rm = 0; int f = 0;
		        			while(foodBrandChoice <= 0 || foodBrandChoice > 3) {
			        				if(storeChoice == 1) {
				        				if(foodTypeChoice == 1) {
					        				System.out.print("Chips : ");
					        				for(int w = 1; w <= 3; w++) {
					        					System.out.print("\n\t[" + w + "]" + storeChoiceArray[storeChoice-1][foodTypeChoice-1][c] + "");
					        					System.out.print("  Price : " + storeChoiceArray[storeChoice-1][foodTypeChoice-1][c+1] + "| ");
					        					c+=2;
					        				}
					        				System.out.println();
				        				}
				        				else if(foodTypeChoice == 2) {
					        				System.out.print("Rice Meal : ");
					        				for(int w = 1; w <= 3; w++) {
					        					System.out.print("\n\t[" + w + "]" + storeChoiceArray[storeChoice-1][foodTypeChoice-1][d] + "");
					        					System.out.print("  Price : " + storeChoiceArray[storeChoice-1][foodTypeChoice-1][d+1] + "| ");
					        					d+=2;
					        				}
					        				System.out.println();
				        				}else if(foodTypeChoice == 3) {	
					        				System.out.print("Drinks : ");
					        				for(int w = 1; w <= 3; w++) {
					        					System.out.print("\n\t[" + w + "]" + storeChoiceArray[storeChoice-1][foodTypeChoice-1][rm] + "");
					        					System.out.print("  Price : " + storeChoiceArray[storeChoice-1][foodTypeChoice-1][rm+1] + "| ");
					        					rm+=2;
					        				}
					        				System.out.println();
				        				}
			        				}else if(storeChoice == 2) {
			        					if(foodTypeChoice == 1) {
					        				System.out.print("Chips : ");
					        				for(int w = 1; w <= 3; w++) {
					        					System.out.print("\n\t[" + w + "]" + storeChoiceArray[storeChoice-1][foodTypeChoice-1][c] + "");
					        					System.out.print("  Price : " + storeChoiceArray[storeChoice-1][foodTypeChoice-1][c+1] + "| ");
					        					c+=2;
					        				}
					        				System.out.println();
				        				}
				        				else if(foodTypeChoice == 2) {
					        				System.out.print("Rice Meal : ");
					        				for(int w = 1; w <= 3; w++) {
					        					System.out.print("\n\t[" + w + "]" + storeChoiceArray[storeChoice-1][foodTypeChoice-1][d] + "");
					        					System.out.print("  Price : " + storeChoiceArray[storeChoice-1][foodTypeChoice-1][d+1] + "| ");
					        					d+=2;
					        				}
					        				System.out.println();
				        				}else if(foodTypeChoice == 3) {	
					        				System.out.print("Drinks : ");
					        				for(int w = 1; w <= 3; w++) {
					        					System.out.print("\n\t[" + w + "]" + storeChoiceArray[storeChoice-1][foodTypeChoice-1][rm] + "");
					        					System.out.print("  Price : " + storeChoiceArray[storeChoice-1][foodTypeChoice-1][rm+1] + "| ");
					        					rm+=2;
					        				}
					        				System.out.println();
				        				}
			        				}else if(storeChoice == 3) {
			        					if(foodTypeChoice == 1) {
					        				System.out.print("Chips : ");
					        				for(int w = 1; w <= 3; w++) {
					        					System.out.print("\n\t[" + w + "]" + storeChoiceArray[storeChoice-1][foodTypeChoice-1][c] + "");
					        					System.out.print("  Price : " + storeChoiceArray[storeChoice-1][foodTypeChoice-1][c+1] + "| ");
					        					c+=2;
					        				}
					        				System.out.println();
				        				}
				        				else if(foodTypeChoice == 2) {
					        				System.out.print("Rice Meal : ");
					        				for(int w = 1; w <= 3; w++) {
					        					System.out.print("\n\t[" + w + "]" + storeChoiceArray[storeChoice-1][foodTypeChoice-1][d] + "");
					        					System.out.print("  Price : " + storeChoiceArray[storeChoice-1][foodTypeChoice-1][d+1] + "| ");
					        					d+=2;
					        				}
					        				System.out.println();
				        				}else if(foodTypeChoice == 3) {	
					        				System.out.print("Drinks : ");
					        				for(int w = 1; w <= 3; w++) {
					        					System.out.print("1\n\t[" + w + "]" + storeChoiceArray[storeChoice-1][foodTypeChoice-1][rm] + "");
					        					System.out.print("  Price : " + storeChoiceArray[storeChoice-1][foodTypeChoice-1][rm+1] + "| ");
					        					rm+=2;
					        				}
					        				System.out.println();
				        				}    				      				
			        				}
			        				boolean done = false;
			        				while(done == false) {
			        				System.out.print("\n\tChoose food : ");
			        				foodBrandChoice = myScanner.nextInt();
			        				
			        				if(foodBrandChoice <= 0 || foodBrandChoice > 3) {
			        					done = false;
			        				}
			        					done = true;
			        					System.out.println("");
			        				}
			        				if(foodBrandChoice == 1 || foodBrandChoice == 2 || foodBrandChoice == 3) {
			        					if(foodBrandChoice == 1) {
						        			f=foodBrandChoice-1;
						        			foodPriceChoice += Integer.parseInt(storeChoiceArray[storeChoice-1][foodTypeChoice-1][foodBrandChoice]);
						        		}else if(foodBrandChoice == 2) {
						        			foodPriceChoice += Integer.parseInt(storeChoiceArray[storeChoice-1][foodTypeChoice-1][foodBrandChoice+1]);
						        			f=foodBrandChoice;
						        		}else if(foodBrandChoice == 3) {
						        			foodPriceChoice += Integer.parseInt(storeChoiceArray[storeChoice-1][foodTypeChoice-1][foodBrandChoice+2]);
						        			f=foodBrandChoice+1;
						        		}else {
						        			System.out.println("Choose frome 1 - 3 only...");
						        		}
			        					finalOrder = "\n\tStore:" + storeArray[storeChoice-1] + "," + foodTypeArray[foodTypeChoice-1] + ":" + storeChoiceArray[storeChoice-1][foodTypeChoice-1][f] + " Price:" + storeChoiceArray[storeChoice-1][foodTypeChoice-1][f+1] +";";			        					
						        		totalPrice += foodPriceChoice;		        		
						        		orders[x-1] = finalOrder;			
					        		}else {
					        			System.out.println("Choose from 1 - 3 only...");
					        		}
		        			}		        		
		        		}
		        		String finalArrayOrder = "";
		        		for(int y = 0;y < orderLoop;y++) {
		        			finalArrayOrder += orders[y];
		        		}
		        		tpString = String.valueOf(totalPrice);
		        		System.out.print("\nReceipt : ");
		        		for(int r = 0; r < orders.length;r++) {
		        			System.out.print("\t" + orders[r]);
		        		}
		        		System.out.println("\n\t\tTotal : " + totalPrice);
		        		String enqueueString = "|Name:" + name + "|Section:" + section + "|ID#"  + idNumber + "|\n\tOrder(s)"  + finalArrayOrder + "|\n\t\t\tTotal Price:" +"|"  + tpString + "|";		        		
		        		queue.enqueue(enqueueString);
		        		name = ""; section = ""; idNumber = ""; storeName = ""; foodName = ""; 
		        				tpString = "";finalOrder = ""; price = 0; totalPrice = 0; foodPriceChoice = 0;
	        		}else {
	        			System.out.println("Line is Full!");
	        		}
	        	}else if(myChoice2 == 2) {
	        		if(studentsInLine == 0) {
	        			System.out.println("No students in line to dequeue");
	        		}else {
	        		queue.dequeue();
	        		}
	        	}else if(myChoice2 == 3) {
	        		if(studentsInLine <= 0) {
	        			System.out.println("No students in Line");
	        		}else {
	        			queue.printQueue();
	        		}
	        	}
	        }
	       }
	    }
}
