
import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exec extends Application {

	
	
	/*Scene*/
	Pane root = new Pane();
	Scene scene = new Scene(root, 900, 400);
	
	ArrayList<Node> adds = new ArrayList<Node>();
	
	/*Ethetics*/
	Rectangle left = new Rectangle();
	Rectangle middle = new Rectangle();
	Rectangle right = new Rectangle();
	Text title  = new Text();
	
	/*Funtion*/
	TextField nf = new TextField();
	PasswordField pf = new PasswordField();
	Text nt = new Text();
	Text pt = new Text();
	
	
	
	
	
	
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
		
		
		
		/*Text*/
		nt.setText("Name: ");
		pt.setText("Password");
		nt.setTranslateX(100);
		nt.setTranslateY(150);
		
		pt.setTranslateX(nt.getTranslateX());
		pt.setTranslateY(nt.getTranslateY()+50);
		
		nf.setTranslateX(nt.getTranslateX()+100);
		nf.setTranslateY(nt.getTranslateY()-20);
		pf.setTranslateX(pt.getTranslateX()+100);
		pf.setTranslateY(pt.getTranslateY()-20);
		
		
		
	
	}
	public void addNodes (){
		
		adds.add(nt);
		adds.add(pt);
		adds.add(nf);
		adds.add(pf);
		adds.add(title);
	}
	
	
	
	public static void main(String[] args) {
		launch();
	}
	
	
	
	
}
