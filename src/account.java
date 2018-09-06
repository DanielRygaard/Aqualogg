import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;



public class account {

	protected String name;
	protected String surname;
	protected int age;
	protected String mail;
	protected String pass;
	protected int number;
	static String alf = "abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVXYZÅÄÖ1234567890*^><!?=)(/&%¤#";


public static void AddAccoutsToFile(ArrayList<account> list) throws IOException {
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("accounts.txt")));
		int account = 0;
		for(account acc: list){
			
			if(account != 0){
				out.println();
			}
			
			out.print(Encrypt(acc.name) + " ");
			out.print(acc.age + " ");
			out.print(Encrypt(acc.mail) + " ");
			out.print(Encrypt(acc.pass) + " ");
			out.print(account);
			
			
			
			
			account++;
			
		}
		out.close();
	
	}


public static ArrayList<account> GetAccountsFromFile(File fil) throws Exception{
	
	Scanner in = new Scanner(fil);
	ArrayList<account> acc = new ArrayList<account>();
	
	account temp;
	
	while(in.hasNextLine()){
		temp = new account();
		temp.name =Decrypt(in.next());
		temp.age = in.nextInt();
		temp.mail = Decrypt(in.next());
		temp.pass = Decrypt(in.next());
		temp.number = in.nextInt();
		acc.add(temp);
		
		
	}
	
	
	
	
	return acc;
	
	
}

static void Register(account newa) throws Exception {
	// TODO Auto-generated method stub
	ArrayList<account> acc = new ArrayList<account>();
	
	acc = GetAccountsFromFile(new File("accounts.txt"));
	
	acc.add(newa);
	
	
	AddAccoutsToFile(acc);
	
	
	
}


public static String Encrypt(String temp){
	
	
	
	String res ="";
	
	for(int x = 0; x<=temp.length()-1; x++){
		for(int y = 0; y<=alf.length()-1; y++){
			
			if(temp.substring(x, x+1).equals(alf.substring(y, y+1))){
				if(y+3 > alf.length()){
					y=-alf.length();
					
				}
				
				res += alf.substring(y+2,y+3);
			}
			
		}
		
		
	}

	
	
	
	return res;
	
}
public static String Decrypt(String temp){
	
	
	
	String res ="";
	
	
	for(int x = 0; x<=temp.length()-1; x++){
		for(int y = 0; y<=alf.length()-1; y++){
			
			if(temp.substring(x, x+1).equals(alf.substring(y, y+1))){
				
				if(y-2 < 0){
					y=+alf.length();
					
				}
			
				
				res += alf.substring(y-2,y-1);
			}
			
		}
		
	}
	
	
	
	
	return res;
	
}

	
}




