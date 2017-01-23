import java.io.*;
import javax.swing.*;

public class AcceptPass
{
	public static void main(String args[])
	{
		String login, pass;
		int log, pa;
		login=JOptionPane.showInputDialog("Please enter your login name: ");
		pass=JOptionPane.showInputDialog("Please enter your password: ");
//		log=Integer.parseInt(login);
//		pa=Integer.parseInt(pass);
		
		if(login.equals(pass))
		{
			JOptionPane.showMessageDialog(null, "Pass accepted");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Pass not accepted");
		}
	}
}