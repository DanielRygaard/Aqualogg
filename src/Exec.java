
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
	
	
	
	
	
	
	@Override
	public void start(Stage Stage) throws Exception {
		
		
		addNodes();
		
		
		
		
		root.getChildren().addAll(adds);
		Stage.setScene(scene);
		Stage.show();
		
		
		
		
		
		
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
		
		
		
	
	}
	public void addNodes (){
		
		adds.add(nt);
		adds.add(pt);
		adds.add(nf);
		adds.add(pf);
		adds.add(title);
		adds.add(login);
		adds.add(register);
	}
	
	public void buttFunctions(){
		
		
		
	}
	
	
	public static void main(String[] args) {
		launch();
	}
	
	
	
	
}
