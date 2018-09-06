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
	
	


public void AddAccoutsToFile(ArrayList<account> list) throws IOException {
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Temp.txt")));
		int account = 0;
		for(account acc: list){
			
			if(account != 0){
				out.println();
			}
			
			out.print(acc.name + " ");
			out.print(acc.surname+ " ");
			out.print(acc.age + " ");
			out.print(acc.mail + " ");
			out.print(acc.pass + "");
			out.print(account);
			
			
			
			account++;
			
		}
	
	
	}


public static ArrayList<account> GetAccountsFromFile(File fil) throws Exception{
	
	Scanner in = new Scanner(fil);
	ArrayList<account> acc = new ArrayList<account>();
	
	account temp;
	while(in.hasNextLine()){
		temp = new account();
		temp.name =in.next();
		temp.surname = in.next();
		temp.age = in.nextInt();
		temp.mail = in.next();
		temp.pass = in.next();
		temp.number = in.nextInt();
		acc.add(temp);
	}
	
	return acc;
	
	
}



	
}




