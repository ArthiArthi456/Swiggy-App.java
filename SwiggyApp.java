import java .util.Scanner;
class SwiggyApp
{
	static Scanner sc =new Scanner(System.in);
	static boolean app =true;
	//Creating one method which will help me to get Otp
	public static int genOtp()
	{
		int otp=(int)(Math.random()*9999+9999);
        return otp;
	}
	 public static void swiggyMyApp() throws Exception{
		 
		 System.out.println("\n\t\t\t\t*******Select the Hotel....*******");
		 System.out.println("1.Buhari\n2.Eats-of-Arab\n3.Thalapakattu\n4.Amma Canteen\n5.A2B\n");
		 int select_hotel=sc.nextInt();//1 or 2 or 3 or 4 or 5 or Abn
		 switch(select_hotel){
			 case 1:{System.out.println("\t\t\t********* Thank you for selecting the hotel  Buhari*************");
				     System.out.println("Select your Favourite Food");
				     System.out.println("1.Mutton Briyani\n2.Chicken Briyani \n3.Chicken fry\n4.Mutton Thooku\n5.Palkova");
				     int selecting_Food=sc.nextInt();
              switch (selecting_Food)
				{
				case 1:{//Mutton Briyani
					 System.out.println(" \t\t\t\t Enter Amount for one plate");
					 double per_plate=sc.nextDouble();
                     System.out.println(" \t\t\t\t Please select the Quantity");
					 int qty=sc.nextInt();
					 System.out.println("Processing...........................................");
				     Thread.sleep(2000);
					 double total_bill=qty*per_plate;
					 System.out.println(" \t\t\t Mutton Briyani"+qty);
					 System.out.println("\t\t\tper_plate "+per_plate);
				     System.out.println("\t\t\t\t\t................................................................");
					 System.out.println("\t\t\t\ttoatal_bill is"+total_bill);
					 System.out.println("Processinggg..............................");
					 Thread.sleep(2000);
					 System.out.println("Select the payment Mode");
                     System.out.println("1.Google pay\n2.Phone pay");
					 int select_payment_mode=sc.nextInt();
				switch (select_payment_mode)
					{
					case 1:{//Google Pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							int sys_otp=genOtp();
							System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								   System.out.println("\t\t\tInvalid Otp");
								 	System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							 System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					case 2:{//Phone pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							 int sys_otp=genOtp();
							 System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								    System.out.println("\t\t\tInvalid Otp");
									System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							      System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					default :{
						System.out.println("\t\t\tInvalid Input");break;}
					}
					break;}
				
			 case 2:{//chicken Briyani
				 System.out.println(" \t\t\t\t Enter Amount for one plate");
					 double per_plate=sc.nextDouble();
                     System.out.println(" \t\t\t\t Please select the Quantity");
					 int qty=sc.nextInt();
					 System.out.println("Processing...........................................");
				     Thread.sleep(2000);
					 double total_bill=qty*per_plate;
					 System.out.println(" \t\t\t Chicken Briyani"+qty);
					 System.out.println("\t\t\tper_plate "+per_plate);
				     System.out.println("\t\t\t\t\t................................................................");
					 System.out.println("\t\t\t\ttoatal_bill is"+total_bill);
					 System.out.println("Processinggg..............................");
					 Thread.sleep(2000);
					 System.out.println("Select the payment Mode");
                     System.out.println("1.Google pay\n2.Phone pay");
					 int select_payment_mode=sc.nextInt();
				switch (select_payment_mode)
					{
					case 1:{//Google Pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							int sys_otp=genOtp();
							System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								   System.out.println("\t\t\tInvalid Otp");
								 	System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							 System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					case 2:{//Phone pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							 int sys_otp=genOtp();
							 System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\\t\t\t Food will be next Year");
							}
							else
							 {
								    System.out.println("\t\t\tInvalid Otp");
									System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							      System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
					

				           break;}
				 default :{
						System.out.println("\t\t\tInvalid Input");break;}
					}
					break;}
				
		  	 case 3:{//Chicken Fry
				 System.out.println(" \t\t\t\t Enter Amount for one plate");
					 double per_plate=sc.nextDouble();
                     System.out.println(" \t\t\t\t Please select the Quantity");
					 int qty=sc.nextInt();
					 System.out.println("Processing...........................................");
				     Thread.sleep(2000);
					 double total_bill=qty*per_plate;
					 System.out.println(" \t\t\t Chicken Fry"+qty);
					 System.out.println("\t\t\tper_plate "+per_plate);
				     System.out.println("\t\t\t\t\t................................................................");
					 System.out.println("\t\t\t\ttoatal_bill is"+total_bill);
					 System.out.println("Processinggg..............................");
					 Thread.sleep(2000);
					 System.out.println("Select the payment Mode");
                     System.out.println("1.Google pay\n2.Phone pay");
					 int select_payment_mode=sc.nextInt();
				switch (select_payment_mode)
					{
					case 1:{//Google Pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							int sys_otp=genOtp();
							System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								   System.out.println("\t\t\tInvalid Otp");
								 	System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							 System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					case 2:{//Phone pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							 int sys_otp=genOtp();
							 System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								    System.out.println("\t\t\tInvalid Otp");
									System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							      System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					default :{
						System.out.println("\t\t\tInvalid Input");break;}
					}
				 break;}
			 case 4:{//Mutton Thokku
				 System.out.println(" \t\t\t\t Enter Amount for one plate");
					 double per_plate=sc.nextDouble();
                     System.out.println(" \t\t\t\t Please select the Quantity");
					 int qty=sc.nextInt();
					 System.out.println("Processing...........................................");
				     Thread.sleep(2000);
					 double total_bill=qty*per_plate;
					 System.out.println(" \t\t\t Mutton Thokku"+qty);
					 System.out.println("\t\t\tper_plate "+per_plate);
				     System.out.println("\t\t\t\t\t................................................................");
					 System.out.println("\t\t\t\ttoatal_bill is"+total_bill);
					 System.out.println("Processinggg..............................");
					 Thread.sleep(2000);
					 System.out.println("Select the payment Mode");
                     System.out.println("1.Google pay\n2.Phone pay");
					 int select_payment_mode=sc.nextInt();
				switch (select_payment_mode)
					{
					case 1:{//Google Pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							int sys_otp=genOtp();
							System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								   System.out.println("\t\t\tInvalid Otp");
								 	System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							 System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					case 2:{//Phone pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							 int sys_otp=genOtp();
							 System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								    System.out.println("\t\t\tInvalid Otp");
									System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							      System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					default :{
						System.out.println("\t\t\tInvalid Input");break;}
					}
				 break;}
			 case 5:{//Palkova
				 System.out.println(" \t\t\t\t Enter Amount for one plate");
					 double per_plate=sc.nextDouble();
                     System.out.println(" \t\t\t\t Please select the Quantity");
					 int qty=sc.nextInt();
					 System.out.println("Processing...........................................");
				     Thread.sleep(2000);
					 double total_bill=qty*per_plate;
					 System.out.println(" \t\t\t Palkova"+qty);
					 System.out.println("\t\t\tper_plate "+per_plate);
				     System.out.println("\t\t\t\t\t................................................................");
					 System.out.println("\t\t\t\ttoatal_bill is"+total_bill);
					 System.out.println("Processinggg..............................");
					 Thread.sleep(2000);
					 System.out.println("Select the payment Mode");
                     System.out.println("1.Google pay\n2.Phone pay");
					 int select_payment_mode=sc.nextInt();
				switch (select_payment_mode)
					{
					case 1:{//Google Pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							int sys_otp=genOtp();
							System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								   System.out.println("\t\t\tInvalid Otp");
								 	System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							 System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					case 2:{//Phone pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							 int sys_otp=genOtp();
							 System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								    System.out.println("\t\t\tInvalid Otp");
									System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							      System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					default :{
						System.out.println("\t\t\tInvalid Input");break;}
					}
				 break;}
			 default :{System.out.println("\t\t\tInvalid Input");break;}
		                                  	
		 }
		 break;}
			case 2:{//Eats_Of_Arab
				System.out.println("\t\t\t********* Thank you for selecting the hotel  Eats_of_Arab*************");
				     System.out.println("Select your Favourite Food");
				     System.out.println("1.Fish Briyani\n2.Grab Briyani \n3.Chicken fry\n4.Mutton Gravy\n5.Fish Fry");
				     int selecting_Food=sc.nextInt();
              switch (selecting_Food)
				{
				case 1:{//Fish Briyani
					 System.out.println(" \t\t\t\t Enter Amount for one plate");
					 double per_plate=sc.nextDouble();
                     System.out.println(" \t\t\t\t Please select the Quantity");
					 int qty=sc.nextInt();
					 System.out.println("Processing...........................................");
				     Thread.sleep(2000);
					 double total_bill=qty*per_plate;
					 System.out.println(" \t\t\t Fish Briyani"+qty);
					 System.out.println("\t\t\tper_plate "+per_plate);
				     System.out.println("\t\t\t\t\t................................................................");
					 System.out.println("\t\t\t\ttoatal_bill is"+total_bill);
					 System.out.println("Processinggg..............................");
					 Thread.sleep(2000);
					 System.out.println("Select the payment Mode");
                     System.out.println("1.Google pay\n2.Phone pay");
					 int select_payment_mode=sc.nextInt();
				switch (select_payment_mode)
					{
					case 1:{//Google Pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							int sys_otp=genOtp();
							System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								   System.out.println("\t\t\tInvalid Otp");
								 	System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							 System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					case 2:{//Phone pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							 int sys_otp=genOtp();
							 System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								    System.out.println("\t\t\tInvalid Otp");
									System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							      System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					default :{
						System.out.println("\t\t\tInvalid Input");break;}
					}
					break;}
				
			 case 2:{//Grab Briyani
				 System.out.println(" \t\t\t\t Enter Amount for one plate");
					 double per_plate=sc.nextDouble();
                     System.out.println(" \t\t\t\t Please select the Quantity");
					 int qty=sc.nextInt();
					 System.out.println("Processing...........................................");
				     Thread.sleep(2000);
					 double total_bill=qty*per_plate;
					 System.out.println(" \t\t\t Grab Briyani"+qty);
					 System.out.println("\t\t\tper_plate "+per_plate);
				     System.out.println("\t\t\t\t\t................................................................");
					 System.out.println("\t\t\t\ttoatal_bill is"+total_bill);
					 System.out.println("Processinggg..............................");
					 Thread.sleep(2000);
					 System.out.println("Select the payment Mode");
                     System.out.println("1.Google pay\n2.Phone pay");
					 int select_payment_mode=sc.nextInt();
				switch (select_payment_mode)
					{
					case 1:{//Google Pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							int sys_otp=genOtp();
							System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								   System.out.println("\t\t\tInvalid Otp");
								 	System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							 System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					case 2:{//Phone pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							 int sys_otp=genOtp();
							 System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\\t\t\t Food will be next Year");
							}
							else
							 {
								    System.out.println("\t\t\tInvalid Otp");
									System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							      System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
					

				           break;}
				 default :{
						System.out.println("\t\t\tInvalid Input");break;}
					}
					break;}
				
		  	 case 3:{//Chicken Fry
				 System.out.println(" \t\t\t\t Enter Amount for one plate");
					 double per_plate=sc.nextDouble();
                     System.out.println(" \t\t\t\t Please select the Quantity");
					 int qty=sc.nextInt();
					 System.out.println("Processing...........................................");
				     Thread.sleep(2000);
					 double total_bill=qty*per_plate;
					 System.out.println(" \t\t\t Chicken Fry"+qty);
					 System.out.println("\t\t\tper_plate "+per_plate);
				     System.out.println("\t\t\t\t\t................................................................");
					 System.out.println("\t\t\t\ttoatal_bill is"+total_bill);
					 System.out.println("Processinggg..............................");
					 Thread.sleep(2000);
					 System.out.println("Select the payment Mode");
                     System.out.println("1.Google pay\n2.Phone pay");
					 int select_payment_mode=sc.nextInt();
				switch (select_payment_mode)
					{
					case 1:{//Google Pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							int sys_otp=genOtp();
							System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								   System.out.println("\t\t\tInvalid Otp");
								 	System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							 System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					case 2:{//Phone pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							 int sys_otp=genOtp();
							 System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								    System.out.println("\t\t\tInvalid Otp");
									System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							      System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					default :{
						System.out.println("\t\t\tInvalid Input");break;}
					}
				 break;}
			 case 4:{//Mutton Gravy
				 System.out.println(" \t\t\t\t Enter Amount for one plate");
					 double per_plate=sc.nextDouble();
                     System.out.println(" \t\t\t\t Please select the Quantity");
					 int qty=sc.nextInt();
					 System.out.println("Processing...........................................");
				     Thread.sleep(2000);
					 double total_bill=qty*per_plate;
					 System.out.println(" \t\t\t Mutton Gravy"+qty);
					 System.out.println("\t\t\tper_plate "+per_plate);
				     System.out.println("\t\t\t\t\t................................................................");
					 System.out.println("\t\t\t\ttoatal_bill is"+total_bill);
					 System.out.println("Processinggg..............................");
					 Thread.sleep(2000);
					 System.out.println("Select the payment Mode");
                     System.out.println("1.Google pay\n2.Phone pay");
					 int select_payment_mode=sc.nextInt();
				switch (select_payment_mode)
					{
					case 1:{//Google Pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							int sys_otp=genOtp();
							System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								   System.out.println("\t\t\tInvalid Otp");
								 	System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							 System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					case 2:{//Phone pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							 int sys_otp=genOtp();
							 System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								    System.out.println("\t\t\tInvalid Otp");
									System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							      System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					default :{
						System.out.println("\t\t\tInvalid Input");break;}
					}
				 break;}
			 case 5:{//Fish Fry
				 System.out.println(" \t\t\t\t Enter Amount for one plate");
					 double per_plate=sc.nextDouble();
                     System.out.println(" \t\t\t\t Please select the Quantity");
					 int qty=sc.nextInt();
					 System.out.println("Processing...........................................");
				     Thread.sleep(2000);
					 double total_bill=qty*per_plate;
					 System.out.println(" \t\t\t Fish Fry"+qty);
					 System.out.println("\t\t\tper_plate "+per_plate);
				     System.out.println("\t\t\t\t\t................................................................");
					 System.out.println("\t\t\t\ttoatal_bill is"+total_bill);
					 System.out.println("Processinggg..............................");
					 Thread.sleep(2000);
					 System.out.println("Select the payment Mode");
                     System.out.println("1.Google pay\n2.Phone pay");
					 int select_payment_mode=sc.nextInt();
				switch (select_payment_mode)
					{
					case 1:{//Google Pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							int sys_otp=genOtp();
							System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								   System.out.println("\t\t\tInvalid Otp");
								 	System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							 System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					case 2:{//Phone pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							 int sys_otp=genOtp();
							 System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								    System.out.println("\t\t\tInvalid Otp");
									System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							      System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					default :{
						System.out.println("\t\t\tInvalid Input");break;}
					}
				 break;}
			 default :{System.out.println("\t\t\tInvalid Input");break;}
		                                  	
		      }

				break;}
			case 3:{//Thalapakattu
                     System.out.println("\t\t\t********* Thank you for selecting the hotel  Thalapakattu*************");
				     System.out.println("Select your Favourite Food");
				     System.out.println("1.Mutton Briyani\n2.Chicken Briyani \n3.Chicken fry\n4.Mutton Thooku\n5.Palkova");
				     int selecting_Food=sc.nextInt();
              switch (selecting_Food)
				{
				case 1:{//Mutton Briyani
					 System.out.println(" \t\t\t\t Enter Amount for one plate");
					 double per_plate=sc.nextDouble();
                     System.out.println(" \t\t\t\t Please select the Quantity");
					 int qty=sc.nextInt();
					 System.out.println("Processing...........................................");
				     Thread.sleep(2000);
					 double total_bill=qty*per_plate;
					 System.out.println(" \t\t\t Mutton Briyani"+qty);
					 System.out.println("\t\t\tper_plate "+per_plate);
				     System.out.println("\t\t\t\t\t................................................................");
					 System.out.println("\t\t\t\ttoatal_bill is"+total_bill);
					 System.out.println("Processinggg..............................");
					 Thread.sleep(2000);
					 System.out.println("Select the payment Mode");
                     System.out.println("1.Google pay\n2.Phone pay");
					 int select_payment_mode=sc.nextInt();
				switch (select_payment_mode)
					{
					case 1:{//Google Pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							int sys_otp=genOtp();
							System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								   System.out.println("\t\t\tInvalid Otp");
								 	System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							 System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					case 2:{//Phone pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							 int sys_otp=genOtp();
							 System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								    System.out.println("\t\t\tInvalid Otp");
									System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							      System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					default :{
						System.out.println("\t\t\tInvalid Input");break;}
					}
					break;}
				
			 case 2:{//chicken Briyani
				 System.out.println(" \t\t\t\t Enter Amount for one plate");
					 double per_plate=sc.nextDouble();
                     System.out.println(" \t\t\t\t Please select the Quantity");
					 int qty=sc.nextInt();
					 System.out.println("Processing...........................................");
				     Thread.sleep(2000);
					 double total_bill=qty*per_plate;
					 System.out.println(" \t\t\t Chicken Briyani"+qty);
					 System.out.println("\t\t\tper_plate "+per_plate);
				     System.out.println("\t\t\t\t\t................................................................");
					 System.out.println("\t\t\t\ttoatal_bill is"+total_bill);
					 System.out.println("Processinggg..............................");
					 Thread.sleep(2000);
					 System.out.println("Select the payment Mode");
                     System.out.println("1.Google pay\n2.Phone pay");
					 int select_payment_mode=sc.nextInt();
				switch (select_payment_mode)
					{
					case 1:{//Google Pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							int sys_otp=genOtp();
							System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								   System.out.println("\t\t\tInvalid Otp");
								 	System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							 System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					case 2:{//Phone pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							 int sys_otp=genOtp();
							 System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\\t\t\t Food will be next Year");
							}
							else
							 {
								    System.out.println("\t\t\tInvalid Otp");
									System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							      System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
					

				           break;}
				 default :{
						System.out.println("\t\t\tInvalid Input");break;}
					}
					break;}
				
		  	 case 3:{//Chicken Fry
				 System.out.println(" \t\t\t\t Enter Amount for one plate");
					 double per_plate=sc.nextDouble();
                     System.out.println(" \t\t\t\t Please select the Quantity");
					 int qty=sc.nextInt();
					 System.out.println("Processing...........................................");
				     Thread.sleep(2000);
					 double total_bill=qty*per_plate;
					 System.out.println(" \t\t\t Chicken Fry"+qty);
					 System.out.println("\t\t\tper_plate "+per_plate);
				     System.out.println("\t\t\t\t\t................................................................");
					 System.out.println("\t\t\t\ttoatal_bill is"+total_bill);
					 System.out.println("Processinggg..............................");
					 Thread.sleep(2000);
					 System.out.println("Select the payment Mode");
                     System.out.println("1.Google pay\n2.Phone pay");
					 int select_payment_mode=sc.nextInt();
				switch (select_payment_mode)
					{
					case 1:{//Google Pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							int sys_otp=genOtp();
							System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								   System.out.println("\t\t\tInvalid Otp");
								 	System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							 System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					case 2:{//Phone pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							 int sys_otp=genOtp();
							 System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								    System.out.println("\t\t\tInvalid Otp");
									System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							      System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					default :{
						System.out.println("\t\t\tInvalid Input");break;}
					}
				 break;}
			 case 4:{//Mutton Thokku
				 System.out.println(" \t\t\t\t Enter Amount for one plate");
					 double per_plate=sc.nextDouble();
                     System.out.println(" \t\t\t\t Please select the Quantity");
					 int qty=sc.nextInt();
					 System.out.println("Processing...........................................");
				     Thread.sleep(2000);
					 double total_bill=qty*per_plate;
					 System.out.println(" \t\t\t Mutton Thokku"+qty);
					 System.out.println("\t\t\tper_plate "+per_plate);
				     System.out.println("\t\t\t\t\t................................................................");
					 System.out.println("\t\t\t\total_bill is"+total_bill);
					 System.out.println("Processinggg..............................");
					 Thread.sleep(2000);
					 System.out.println("Select the payment Mode");
                     System.out.println("1.Google pay\n2.Phone pay");
					 int select_payment_mode=sc.nextInt();
				switch (select_payment_mode)
					{
					case 1:{//Google Pay
						System.out.println(" Enter The bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							int sys_otp=genOtp();
							System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								   System.out.println("\t\t\tInvalid Otp");
								 	System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							 System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					case 2:{//Phone pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							 int sys_otp=genOtp();
							 System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								    System.out.println("\t\t\tInvalid Otp");
									System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							      System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					default :{
						System.out.println("\t\t\tInvalid Input");break;}
					}
				 break;}
			 case 5:{//Palkova
				 System.out.println(" \t\t\t\t Enter Amount for one plate");
					 double per_plate=sc.nextDouble();
                     System.out.println(" \t\t\t\t Please select the Quantity");
					 int qty=sc.nextInt();
					 System.out.println("Processing...........................................");
				     Thread.sleep(2000);
					 double total_bill=qty*per_plate;
					 System.out.println(" \t\t\t Palkova"+qty);
					 System.out.println("\t\t\tper_plate "+per_plate);
				     System.out.println("\t\t\t\t\t................................................................");
					 System.out.println("\t\t\t\ttotal_bill is"+total_bill);
					 System.out.println("Processinggg..............................");
					 Thread.sleep(2000);
					 System.out.println("Select the payment Mode");
                     System.out.println("1.Google pay\n2.Phone pay");
					 int select_payment_mode=sc.nextInt();
				switch (select_payment_mode)
					{
					case 1:{//Google Pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							int sys_otp=genOtp();
							System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								   System.out.println("\t\t\tInvalid Otp");
								 	System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							 System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					case 2:{//Phone pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							 int sys_otp=genOtp();
							 System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								    System.out.println("\t\t\tInvalid Otp");
									System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							      System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					default :{
						System.out.println("\t\t\tInvalid Input");break;}
					}
					 break;}
			 default :{System.out.println("\t\t\tInvalid Input");break;}
		                                  	
		           }
				break;}
			case 4:{//Amma Canteen
				   System.out.println("\t\t\t********* Thank you for selecting the Amma Canteen*************");
				     System.out.println("Select your Favourite Food");
				     System.out.println("1.Veg Briyani\n2.Dosa \n3.Idly\n4.Puttu\n5.Lemon Rice");
				     int selecting_Food=sc.nextInt();
              switch (selecting_Food)
				{
				case 1:{//Veg Briyani
					 System.out.println(" \t\t\t\t Enter Amount for one plate");
					 double per_plate=sc.nextDouble();
                     System.out.println(" \t\t\t\t Please select the Quantity");
					 int qty=sc.nextInt();
					 System.out.println("Processing...........................................");
				     Thread.sleep(2000);
					 double total_bill=qty*per_plate;
					 System.out.println(" \t\t\t Veg Briyani"+qty);
					 System.out.println("\t\t\tper_plate "+per_plate);
				     System.out.println("\t\t\t\t\t................................................................");
					 System.out.println("\t\t\t\total_bill is"+total_bill);
					 System.out.println("Processinggg..............................");
					 Thread.sleep(2000);
					 System.out.println("Select the payment Mode");
                     System.out.println("1.Google pay\n2.Phone pay");
					 int select_payment_mode=sc.nextInt();
				switch (select_payment_mode)
					{
					case 1:{//Google Pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							int sys_otp=genOtp();
							System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								   System.out.println("\t\t\tInvalid Otp");
								   System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							 System.out.println("\t\t\t\tInvalid Amt Entered");
                             System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					case 2:{//Phone pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							int sys_otp=genOtp();
							System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								    System.out.println("\t\t\tInvalid Otp");
									System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							      System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					default :{
						System.out.println("\t\t\tInvalid Input");break;}
					}
					break;}
				
			 case 2:{//Dosa
				 System.out.println(" \t\t\t\t Enter Amount for one plate");
					 double per_plate=sc.nextDouble();
                     System.out.println(" \t\t\t\t Please select the Quantity");
					 int qty=sc.nextInt();
					 System.out.println("Processing...........................................");
				     Thread.sleep(2000);
					 double total_bill=qty*per_plate;
					 System.out.println(" \t\t\t Dosa"+qty);
					 System.out.println("\t\t\tper_plate "+per_plate);
				     System.out.println("\t\t\t\t\t................................................................");
					 System.out.println("\t\t\t\total_bill is"+total_bill);
					 System.out.println("Processinggg..............................");
					 Thread.sleep(2000);
					 System.out.println("Select the payment Mode");
                     System.out.println("1.Google pay\n2.Phone pay");
					 int select_payment_mode=sc.nextInt();
				switch (select_payment_mode)
					{
					case 1:{//Google Pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							int sys_otp=genOtp();
							System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								   System.out.println("\t\t\tInvalid Otp");
								 	System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							 System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					case 2:{//Phone pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							 int sys_otp=genOtp();
							 System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\\t\t\t Food will be next Year");
							}
							else
							 {
								    System.out.println("\t\t\tInvalid Otp");
									System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							      System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
					

				           break;}
				 default :{
						System.out.println("\t\t\tInvalid Input");break;}
					}
					break;}
				
		  	 case 3:{//Idly
				 System.out.println(" \t\t\t\t Enter Amount for one plate");
					 double per_plate=sc.nextDouble();
                     System.out.println(" \t\t\t\t Please select the Quantity");
					 int qty=sc.nextInt();
					 System.out.println("Processing...........................................");
				     Thread.sleep(2000);
					 double total_bill=qty*per_plate;
					 System.out.println(" \t\t\t Idly"+qty);
					 System.out.println("\t\t\tper_plate "+per_plate);
				     System.out.println("\t\t\t\t\t................................................................");
					 System.out.println("\t\t\t\t total_bill is"+total_bill);
					 System.out.println("Processinggg..............................");
					 Thread.sleep(2000);
					 System.out.println("Select the payment Mode");
                     System.out.println("1.Google pay\n2.Phone pay");
					 int select_payment_mode=sc.nextInt();
				switch (select_payment_mode)
					{
					case 1:{//Google Pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							int sys_otp=genOtp();
							System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								   System.out.println("\t\t\tInvalid Otp");
								 	System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							 System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					case 2:{//Phone pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							 int sys_otp=genOtp();
							 System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								    System.out.println("\t\t\tInvalid Otp");
									System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							      System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					default :{
						System.out.println("\t\t\tInvalid Input");break;}
					}
				 break;}
			 case 4:{//Puttu
				 System.out.println(" \t\t\t\t Enter Amount for one plate");
					 double per_plate=sc.nextDouble();
                     System.out.println(" \t\t\t\t Please select the Quantity");
					 int qty=sc.nextInt();
					 System.out.println("Processing...........................................");
				     Thread.sleep(2000);
					 double total_bill=qty*per_plate;
					 System.out.println(" \t\t\t Puttu"+qty);
					 System.out.println("\t\t\tper_plate "+per_plate);
				     System.out.println("\t\t\t\t\t................................................................");
					 System.out.println("\t\t\t\total_bill is"+total_bill);
					 System.out.println("Processinggg..............................");
					 Thread.sleep(2000);
					 System.out.println("Select the payment Mode");
                     System.out.println("1.Google pay\n2.Phone pay");
					 int select_payment_mode=sc.nextInt();
				switch (select_payment_mode)
					{
					case 1:{//Google Pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							int sys_otp=genOtp();
							System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								   System.out.println("\t\t\tInvalid Otp");
								 	System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							 System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					case 2:{//Phone pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							 int sys_otp=genOtp();
							System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								    System.out.println("\t\t\tInvalid Otp");
									System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							      System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					default :{
						System.out.println("\t\t\tInvalid Input");break;}
					}
				 break;}
			 case 5:{//Lemon Rice
				 System.out.println(" \t\t\t\t Enter Amount for one plate");
					 double per_plate=sc.nextDouble();
                     System.out.println(" \t\t\t\t Please select the Quantity");
					 int qty=sc.nextInt();
					 System.out.println("Processing...........................................");
				     Thread.sleep(2000);
					 double total_bill=qty*per_plate;
					 System.out.println(" \t\t\t Lemon Rice"+qty);
					 System.out.println("\t\t\tper_plate "+per_plate);
				     System.out.println("\t\t\t\t\t................................................................");
					 System.out.println("\t\t\t\t total_bill is"+total_bill);
					 System.out.println("Processinggg..............................");
					 Thread.sleep(2000);
					 System.out.println("Select the payment Mode");
                     System.out.println("1.Google pay\n2.Phone pay");
					 int select_payment_mode=sc.nextInt();
				switch (select_payment_mode)
					{
					case 1:{//Google Pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							int sys_otp=genOtp();
							System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								   System.out.println("\t\t\tInvalid Otp");
								 	System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							 System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					case 2:{//Phone pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							int sys_otp=genOtp();
							System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								    System.out.println("\t\t\tInvalid Otp");
									System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							      System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					default :{
						System.out.println("\t\t\tInvalid Input");break;}
					} 
				 
				 
				 break;}
			 default :{System.out.println("\t\t\tInvalid Input");break;}
		                                  	
		      }
				break;}
			case 5:{//A2B
				System.out.println("\t\t\t********* Thank you for selecting the A2B*************");
				     System.out.println("Select your Favourite Food");
				     System.out.println("1.Veg Briyani\n2.Dosa \n3.Idly\n4.Pav Bajii\n5.Ghee Rice");
				     int selecting_Food=sc.nextInt();
              switch (selecting_Food)
				{
				case 1:{//Veg Briyani
					 System.out.println(" \t\t\t\t Enter Amount for one plate");
					 double per_plate=sc.nextDouble();
                     System.out.println(" \t\t\t\t Please select the Quantity");
					 int qty=sc.nextInt();
					 System.out.println("Processing...........................................");
				     Thread.sleep(2000);
					 double total_bill=qty*per_plate;
					 System.out.println(" \t\t\t Veg Briyani"+qty);
					 System.out.println("\t\t\tper_plate "+per_plate);
				     System.out.println("\t\t\t\t\t................................................................");
					 System.out.println("\t\t\t\total_bill is"+total_bill);
					 System.out.println("Processinggg..............................");
					 Thread.sleep(2000);
					 System.out.println("Select the payment Mode");
                     System.out.println("1.Google pay\n2.Phone pay");
					 int select_payment_mode=sc.nextInt();
				switch (select_payment_mode)
					{
					case 1:{//Google Pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							int sys_otp=genOtp();
							System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								   System.out.println("\t\t\tInvalid Otp");
								 	System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							 System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					case 2:{//Phone pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							 int sys_otp=genOtp();
							 System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								    System.out.println("\t\t\tInvalid Otp");
									System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							      System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					default :{
						System.out.println("\t\t\tInvalid Input");break;}
					}
					break;}
				
			 case 2:{//Dosa
				 System.out.println(" \t\t\t\t Enter Amount for one plate");
					 double per_plate=sc.nextDouble();
                     System.out.println(" \t\t\t\t Please select the Quantity");
					 int qty=sc.nextInt();
					 System.out.println("Processing...........................................");
				     Thread.sleep(2000);
					 double total_bill=qty*per_plate;
					 System.out.println(" \t\t\t Dosa"+qty);
					 System.out.println("\t\t\tper_plate "+per_plate);
				     System.out.println("\t\t\t\t\t................................................................");
					 System.out.println("\t\t\t\t total_bill is"+total_bill);
					 System.out.println("Processinggg..............................");
					 Thread.sleep(2000);
					 System.out.println("Select the payment Mode");
                     System.out.println("1.Google pay\n2.Phone pay");
					 int select_payment_mode=sc.nextInt();
				switch (select_payment_mode)
					{
					case 1:{//Google Pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							int sys_otp=genOtp();
							System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								   System.out.println("\t\t\tInvalid Otp");
								 	System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							 System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					case 2:{//Phone pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							 int sys_otp=genOtp();
							 System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\\t\t\t Food will be next Year");
							}
							else
							 {
								    System.out.println("\t\t\tInvalid Otp");
									System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							      System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
					

				           break;}
				 default :{
						System.out.println("\t\t\tInvalid Input");break;}
					}
					break;}
				
		  	 case 3:{//Idly
				 System.out.println(" \t\t\t\t Enter Amount for one plate");
					 double per_plate=sc.nextDouble();
                     System.out.println(" \t\t\t\t Please select the Quantity");
					 int qty=sc.nextInt();
					 System.out.println("Processing...........................................");
				     Thread.sleep(2000);
					 double total_bill=qty*per_plate;
					 System.out.println(" \t\t\t Idly"+qty);
					 System.out.println("\t\t\tper_plate "+per_plate);
				     System.out.println("\t\t\t\t\t................................................................");
					 System.out.println("\t\t\t\total_bill is"+total_bill);
					 System.out.println("Processinggg..............................");
					 Thread.sleep(2000);
					 System.out.println("Select the payment Mode");
                     System.out.println("1.Google pay\n2.Phone pay");
					 int select_payment_mode=sc.nextInt();
				switch (select_payment_mode)
					{
					case 1:{//Google Pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							int sys_otp=genOtp();
							System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								   System.out.println("\t\t\tInvalid Otp");
								 	System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							 System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					case 2:{//Phone pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							 int sys_otp=genOtp();
							 System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								    System.out.println("\t\t\tInvalid Otp");
									System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							      System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					default :{
						System.out.println("\t\t\tInvalid Input");break;}
					}
				 break;}
			 case 4:{//Pav Bajii
				 System.out.println(" \t\t\t\t Enter Amount for one plate");
					 double per_plate=sc.nextDouble();
                     System.out.println(" \t\t\t\t Please select the Quantity");
					 int qty=sc.nextInt();
					 System.out.println("Processing...........................................");
				     Thread.sleep(2000);
					 double total_bill=qty*per_plate;
					 System.out.println(" \t\t\t Pav Bajii"+qty);
					 System.out.println("\t\t\tper_plate "+per_plate);
				     System.out.println("\t\t\t\t\t................................................................");
					 System.out.println("\t\t\t\total_bill is"+total_bill);
					 System.out.println("Processinggg..............................");
					 Thread.sleep(2000);
					 System.out.println("Select the payment Mode");
                     System.out.println("1.Google pay\n2.Phone pay");
					 int select_payment_mode=sc.nextInt();
				switch (select_payment_mode)
					{
					case 1:{//Google Pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							int sys_otp=genOtp();
							System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								   System.out.println("\t\t\tInvalid Otp");
								 	System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							 System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					case 2:{//Phone pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							 int sys_otp=genOtp();
							 System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								    System.out.println("\t\t\tInvalid Otp");
									System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							      System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					default :{
						System.out.println("\t\t\tInvalid Input");break;}
					}
				 break;}
			 case 5:{//Ghee Rice
				 System.out.println(" \t\t\t\t Enter Amount for one plate");
					 double per_plate=sc.nextDouble();
                     System.out.println(" \t\t\t\t Please select the Quantity");
					 int qty=sc.nextInt();
					 System.out.println("Processing...........................................");
				     Thread.sleep(2000);
					 double total_bill=qty*per_plate;
					 System.out.println(" \t\t\t Ghee Rice"+qty);
					 System.out.println("\t\t\tper_plate "+per_plate);
				     System.out.println("\t\t\t\t\t................................................................");
					 System.out.println("\t\t\t\ttoatal_bill is"+total_bill);
					 System.out.println("Processinggg..............................");
					 Thread.sleep(2000);
					 System.out.println("Select the payment Mode");
                     System.out.println("1.Google pay\n2.Phone pay");
					 int select_payment_mode=sc.nextInt();
				switch (select_payment_mode)
					{
					case 1:{//Google Pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							int sys_otp=genOtp();
							System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								   System.out.println("\t\t\tInvalid Otp");
								 	System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							 System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					case 2:{//Phone pay
						System.out.println(" Enter THe bill amount :"+total_bill);
						 double user_entered_bill_amount=sc.nextInt();
						 if (user_entered_bill_amount==total_bill)
						 {
							 int sys_otp=genOtp();
							 System.out.println("Enter the Otp");
							Thread.sleep(3000);
							System.out.println(sys_otp);
							int user_entered_otp=sc.nextInt();
							if (user_entered_otp==sys_otp)
							{
								System.out.println(" \t\t\t\t Order Placed sucessfully................");
							    System.out.println(" \t\t\t\t\t Food will be delivered next Year");
							}
							else
							 {
								    System.out.println("\t\t\tInvalid Otp");
									System.out.println("\t\t\t\tOrder Fail.................");
							 }
						 }
						 else
						{
							      System.out.println("\t\t\t\tInvalid Amt Entered");
                                  System.out.println(" \t\t\tOrder Fail...........");
						}
						break;}
					default :{
						System.out.println("\t\t\tInvalid Input");break;}
					} 
				 
				 
				 break;}
			 default :{System.out.println("\t\t\tInvalid Input");break;}
		                                  	
		      }
				break;}
			default :{
				System.out.println("\t\t\tInvalid Input");break;}
		     }
		 
		 
 }
	
  public static void main(String [] args)throws Exception{
			  System.out.println("\t\t*****************Welcome to Swiggy.....!!!!**********************");
			  swiggyMyApp();
 }
		 	
}