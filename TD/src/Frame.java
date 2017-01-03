import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame{
	public static String title= "Tower Defence";
	public static Dimension size = new Dimension(700, 550);
	
	public Frame(){
		setTitle(title);
		setSize(size);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		init();
	}
	
	//public void setSize(Dimension dim){

	//}
	
	public void init(){
		setLayout(new GridLayout(1,1,0,0));
		
		Map map = new Map(this);
		add(map);
		
		setVisible(true);
	}
	
	public static void main (String args[]){
		Frame frame = new Frame();
	}
}
