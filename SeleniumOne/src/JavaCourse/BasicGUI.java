package JavaCourse;

import javax.swing.JOptionPane;

public class BasicGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name= JOptionPane.showInputDialog("Was ist dein name?");
		JOptionPane.showMessageDialog(null, "Guten Tag "+name);
		
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Wie alt bist du?")); //Integer.parseInt will convert the typed string into integer and store it in integer age variable
		JOptionPane.showMessageDialog(null, "Sie sind "+age+" Jahre alt");
		
		
		int height = Integer.parseInt(JOptionPane.showInputDialog("Wie hoch bist du?"));
		JOptionPane.showMessageDialog(null, "Sie sind "+height+" cm hoch");
		
		

	}

}
