package elecbill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Consumer {
    public String plantType;
   public String customerName;
   public String customerAddress;
   public long customerID;
   public double currentBill;
   public String statement;

   public Consumer(String plantType, String customerName, String customerAddress, long customerID, double currentBill) {
	super();
	this.plantType = plantType;
	this.customerName = customerName;
	this.customerAddress = customerAddress;
	this.customerID = customerID;
	this.currentBill = currentBill;
	
}
   //updates the current bill amount which hold the amount that has to be payed by the user.
public void addCurrentBill(int billingAmount) {
	
	statement="previous bill amount: "+currentBill+"\nCurrent Amount: "+billingAmount+"\nTotal Bill Amount: "+(currentBill+=billingAmount)+"\n\n";
    System.out.println(statement);
}
//prints the customers details.
public void add(int value){
currentBill+=value;
        }
public void getDetails() {
	System.out.println("-------------------------------------------");
	System.out.printf("|%-20S %20S|\n","Plan Type: ",plantType);
	System.out.printf("|%-20S %20S|\n","Customer Name: ",customerName);
    System.out.printf("|%-20S %20S|\n","Customer Address: ",customerAddress);
    System.out.println("-------------------------------------------");
}
//used to clear customer dues if any.
public void payBill() {
	if(currentBill==0) {System.out.println("there are no pending dues.");return ;}
	//getting details of the customer.
	getDetails();
	System.out.println(statement);
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the AMount you are Paying:");
	String payMentAmount;
	try {
		payMentAmount = bf.readLine();
		Double payed = Double.parseDouble(payMentAmount);
		//decrementing the customers pending dues.
		currentBill-=payed;
		statement = new String("Bill Payed: "+payed+"\nBalance: "+currentBill)+"\n\n";
		System.out.println(statement);
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	}
//will return the plant type to help initialize the plan object as per the plant of this consumer.
public String getPlanType() {
	return plantType;
}

}
