package org.cap.demo;

import java.util.Date;
import java.util.Scanner;

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		
		Customer[] cust=new Customer[5];
		Address[] address=new Address[5];
		Account[][] account= new Account[5][4];
		address[0]=new Address("agv","MIPL","Chennai","TN",603002);
		account[0][0]= new Account(12100220,"Saving",new Date(22,01,2012),1000,1000);
		
		account[0][1]=new Account(12101322,"RD",new Date(22,01,2014),1000,1000);
		account[0][2]=new Account();
		account[0][3]=new Account();
		cust[0] = new Customer(101,"Annapoorna",address[0],account[0],"856413257","aghjdn@gmail.com");
		
		
		address[1]=new Address("agv","MIPL","Chennai","TN",603002);
		account[1][0]= new Account(12100222,"Saving",new Date(22,01,2012),1000,1000);
		account[1][1]=new Account(12101325,"RD",new Date(22,01,2014),1000,1000);
		account[1][2]=new Account(12101432,"FD",new Date(22,01,2017),1000,1000);
		account[1][3]=new Account(12101522,"Current",new Date(22,01,2013),1000,1000);
		cust[1] = new Customer(108,"Niharika",address[1],account[1],"8214551254","aghshhdn@gmail.com");
		
		address[2]=new Address("agv","MIPL","Chennai","TN",603002);
		account[2][0]= new Account(12100229,"Saving",new Date(22,01,2015),1000,1000);
		account[2][1]=new Account();
		account[2][2]=new Account();
		account[2][3]=new Account();
		cust[2]= new Customer(103,"Madhu",address[2],account[2],"821522165","aghdn@gmail.com");
		
		address[3]=new Address("agv","MIPL","Chennai","TN",603002);
		account[3][0]= new Account(12100230,"Saving",new Date(22,01,2012),1000,1000);
		account[3][1]=new Account(12101438,"FD",new Date(22,01,2017),1000,1000);
		account[3][2]=new Account();
		account[3][3]=new Account();
		cust[3]= new Customer(106,"Moulya",address[3],account[3],"821522165","a@gmail.com");
		
		address[4]=new Address("agv","MIPL","Chennai","TN",603002);
		account[4][0]= new Account(12100230,"Saving",new Date(22,01,2012),1000,1000);
		account[4][1]=new Account();
		account[4][2]=new Account();
		account[4][3]=new Account();
		cust[4]= new Customer(110,"Madhu",address[4],account[4],"821522165","aghdn@gmail.com");
		
		
		
		
		int custid=0;
		int index=0;
		int a=0;
		System.out.println("Enter the customer ID");
		custid= scan.nextInt();
		
		for(index=0;index<5;index++)
		{
			//System.out.println("sjdh");
			if(cust[index].getCustID()==custid)
			{
				a=index;
			}
			
		}
		//System.out.println(a);
		System.out.println("CustID: "+cust[a].getCustID()+"\nCustomer Name: "+cust[a].getName()+"\nCustomer Address: "+address[a].getStreet() +", "+address[a].getAdd()+", "+address[a].getCity()+", "+address[a].getState()+", "+address[a].getPin()+"\nCustomer Accounts:");
			for(int i=0;i<4;i++)
			{
				if(account[a][i].getAccountNo()==0) break;
				
			System.out.println("Account No.: "+account[a][i].getAccountNo()+"\tAccount Type: "+account[a][i].getAccountType()+"\tAccount Opening Date: "+account[a][i].getOpeningDate()+"\tAccount Opening Balance: "+account[a][i].getOpeningBal());
			
			}
			System.out.println("Customer Mobile No.: "+cust[a].getMobile()+"\nCustomer Email: "+cust[a].getEmail());
			
			//Menu for account creation, do transaction or transaction summary
			System.out.println("1. Create account \t2. Funds Transfer \t3. Transaction Summary");
			int b=scan.nextInt();
				switch (b)
				{
				case 1:
					int j;
					for(j=0;j<4;j++)
					{
						if(account[a][j].getAccountNo()==0)
							break;
					}
					if(j==4)
					{
						System.out.println("You can't create anymore accounts");
					}
					else
					{
						System.out.println("Enter the type of account you want to be created:\n1. Savings\t2.RD\t3.FD\t4.Current");
						int c= scan.nextInt();
						int opbal;
						System.out.println("What is the opening Balance?");
						opbal=scan.nextInt();
						if(c==1)
						{
							account[a][j].setAccountNo(12100225);
							account[a][j].setAccountType("Saving"); account[a][j].setOpeningDate(new Date());
							account[a][j].setOpeningBal(opbal);
							account[a][j].setCurrentBal(opbal);
							
						}
						else if(c==2)
						{
							account[a][j].setAccountNo(12101327);
							account[a][j].setAccountType("RD"); account[a][j].setOpeningDate(new Date());
							account[a][j].setOpeningBal(opbal);
							account[a][j].setCurrentBal(opbal);
						}
						else if(c==3)
						{
							account[a][j].setAccountNo(12101425);
							account[a][j].setAccountType("FD"); account[a][j].setOpeningDate(new Date());
							account[a][j].setOpeningBal(opbal);
							account[a][j].setCurrentBal(opbal);
						}
						else
						{
							account[a][j].setAccountNo(12101525);
							account[a][j].setAccountType("Current"); account[a][j].setOpeningDate(new Date());
							account[a][j].setOpeningBal(opbal);
							account[a][j].setCurrentBal(opbal);
						}
						System.out.println("Your account created Successfully!");
						System.out.println("CustID: "+cust[a].getCustID()+"\nCustomer Name: "+cust[a].getName()+"\nCustomer Address: "+address[a].getStreet() +", "+address[a].getAdd()+", "+address[a].getCity()+", "+address[a].getState()+", "+address[a].getPin()+"\nCustomer Accounts:");
						for(int i=0;i<4;i++)
						{
							if(account[a][i].getAccountNo()==0) break;
							
						System.out.println("Account No.: "+account[a][i].getAccountNo()+"\tAccount Type: "+account[a][i].getAccountType()+"\tAccount Opening Date: "+account[a][i].getOpeningDate()+"\tAccount Opening Balance: "+account[a][i].getOpeningBal());
						
						}
						System.out.println("Customer Mobile No.: "+cust[a].getMobile()+"\nCustomer Email: "+cust[a].getEmail());
						
						
						
					}
					break;
				case 2:
					System.out.println("Enter the account from which you want to make transactions:");
					long accno=scan.nextLong();
					int k;
					for(k=0;k<4;k++)
					{
					if(accno==account[a][k].getAccountNo())
						break;
					}
						
					System.out.println("Do you want to debit or credit: 1. Debit\t 2.Credit");
					int tran= scan.nextInt();
					if(tran==1)
					{
						System.out.println("Enter the amount to be debited:");
						int deb=scan.nextInt();
						int currBal=(account[a][k].getCurrentBal());
						if(deb >= currBal)
						{
							System.out.println("Transaction Successful");
							account[a][k].setCurrentBal(currBal-deb);
							System.out.println("Current Balance is:"+account[a][k].getCurrentBal());
							
						}
						else
						{
							System.out.println("Amount requested is greater than the current balance");
						}
							
					}
					else
						
					{
						System.out.println("Enter the amount to be credited:");
						int cred=scan.nextInt();
						int currBal=(account[a][k].getCurrentBal());
						account[a][k].setCurrentBal(currBal+cred);
							System.out.println("Transaction Successful");
							
							System.out.println("Current Balance is:"+account[a][k].getCurrentBal());
							
					}
						
					
					
				}
				
		
		

	}

}
