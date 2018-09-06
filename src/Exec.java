
import java.io.File;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exec extends Application {

	
	
	/*Scene*/
	Pane root = new Pane();
	Scene scene = new Scene(root, 900, 400);
	
	ArrayList<Node> adds = new ArrayList<Node>();
	
	/*Esthetics*/
	Rectangle left = new Rectangle();
	Rectangle middle = new Rectangle();
	Rectangle right = new Rectangle();
	Text title  = new Text();
	
	/*Function*/
	TextField nf = new TextField();
	PasswordField pf = new PasswordField();
	Text nt = new Text();
	Text pt = new Text();
	
	Button login = new Button();
	Button register = new Button();
	
	/*Register*/
	
	Text rnt = new Text();
	Text rat = new Text();
	Text rmt = new Text();
 	Text rpt = new Text();
 	
 	TextField rnf = new TextField();
 	TextField raf = new TextField();
 	TextField rmf = new TextField();
	TextField rpf = new TextField();
	
	Button doner = new Button();
	
	
	ArrayList<account> acc;
	
	Stage Login = new Stage();
	
	@Override
	public void start(Stage Stage) throws Exception {
		
		
		addMain();
		
		
		
		
		acc = account.GetAccountsFromFile(new File("accounts.txt"));
		
		buttFunctions();
		
		
		Login.setScene(scene);
		Login.show();
		
		
		
		
		
		
	}
	
	public void init(){
		/*Background*/
		
		 
		left.setWidth(scene.getWidth()/3);
		middle.setWidth(scene.getWidth()/3);
		right.setWidth(scene.getWidth()/3);
		
		/*Title */
		title.setText("AquaLog");
		title.setTranslateX(60);
		title.setTranslateY(60);
		title.setFont(Font.font(50));
		
		
		/*Text*/
		nt.setText("Name: ");
		nt.setTranslateX(title.getTranslateX()+60);
		nt.setTranslateY(title.getTranslateY()+110);
		
		pt.setText("Password");
		pt.setTranslateX(nt.getTranslateX());
		pt.setTranslateY(nt.getTranslateY()+50);
		
		nf.setTranslateX(nt.getTranslateX()+100);
		nf.setTranslateY(nt.getTranslateY()-20);
		pf.setTranslateX(pt.getTranslateX()+100);
		pf.setTranslateY(pt.getTranslateY()-20);
		
		
		/*Buttons*/
		login.setTranslateX(400);
		login.setTranslateY(300);
		login.setText("Login");
		
		register.setTranslateX(300);
		register.setTranslateY(300);
		register.setText("Register");
		
		/*Register*/
		
		
		int mellan = 100;
		
		rnt.setTranslateX(300);
		rnt.setTranslateY(50);
		rmt.setTranslateX(rnt.getTranslateX());
		rmt.setTranslateY(rnt.getTranslateY()+mellan);
		rpt.setTranslateX(rnt.getTranslateX());
		rpt.setTranslateY(rnt.getTranslateY()+mellan*2);
		rat.setTranslateX(rnt.getTranslateX());
		rat.setTranslateY(rnt.getTranslateY()+mellan*3);
		
		rnt.setText("Username:");
		rpt.setText("Password:");
		rat.setText("Age:");
		rmt.setText("Mail:");
		
		rnf.setTranslateX(rnt.getTranslateX()+100);
		rnf.setTranslateY(rnt.getTranslateY()-20);
		rmf.setTranslateX(rnf.getTranslateX());
		rmf.setTranslateY(rnf.getTranslateY()+mellan);
		rpf.setTranslateX(rnf.getTranslateX());
		rpf.setTranslateY(rnf.getTranslateY()+mellan*2);
		raf.setTranslateX(rnf.getTranslateX());
		raf.setTranslateY(rnf.getTranslateY()+mellan*3);
		
		doner.setTranslateX(700);
		doner.setTranslateY(300);
		doner.setText("Done");
	
	}
	
	private void Register() {
		// TODO Auto-generated method stub
		
		clearpane();
		
		adds.add(rnt);
		adds.add(rmt);
		adds.add(rat);
		adds.add(rpt);
		
		adds.add(rnf);
		adds.add(rmf);
		adds.add(raf);
		adds.add(rpf);
		
		adds.add(doner);
		
		root.getChildren().addAll(adds);
		
	}
	
	private void clearpane() {
		// TODO Auto-generated method stub

		root.getChildren().clear();
		adds.clear();
	}
	
	public void addMain (){
		clearpane();
		adds.add(nt);
		adds.add(pt);
		adds.add(nf);
		adds.add(pf);
		adds.add(title);
		adds.add(login);
		adds.add(register);
		root.getChildren().addAll(adds);
	}
	
	public void buttFunctions(){
		
		login.setOnMouseClicked(e->{
			
			for(account hej:acc){
				checkiflogin(hej.name, hej.pass);
			}
			
		});
		
		register.setOnMouseClicked(e->{
			
			Register();
			
			
		});
		
		doner.setOnMouseClicked(e->{
			
			account temp = new account();
			temp.name = rnf.getText();
			temp.pass = rpf.getText();
			temp.age = Integer.parseInt(raf.getText());
			temp.mail = rmf.getText();
			
		
			
		try {
			account.Register(temp);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		addMain();
		
		acc = null;
		try {
			acc = account.GetAccountsFromFile(new File("accounts.txt"));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		});
		
		
		
	}
	
	private void checkiflogin(String name, String pass) {
		// TODO Auto-generated method stub
		if(nf.getText().equals(name) && pf.getText().equals(pass)){
			System.out.println("logged");
		}
		

	}

	public static void main(String[] args) {
		launch();
	}

	
}
