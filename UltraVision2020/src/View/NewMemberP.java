package View;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NewMemberP extends JFrame implements ActionListener {
	
	public NewMemberP() {
		this.setVisible(true);
		this.setSize(400,400);
		
		GridLayout MyFirstGrid = new GridLayout(10,1);
		this.setLayout(MyFirstGrid);
		
		JPanel uno = new JPanel();
		this.add(uno);
		
		JLabel MyFirstLabel = new JLabel("NEW MEMBER");
		uno.add(MyFirstLabel);
		MyFirstLabel.setFont(new Font("Calibri", Font.PLAIN, 15));
		
		// -----------------------------
		
		JPanel dos = new JPanel();
		this.add(dos);
		
		JLabel MySecondLabel = new JLabel("CUSTOMER ID");
		dos.add(MySecondLabel);
		
		JTextField MyText1 = new JTextField(10);
		dos.add(MyText1);
		
		//-------------------------------
		
		JPanel tres = new JPanel();
		this.add(tres);
		
		JLabel MyThirdLabel = new JLabel("MEMBERSHIP PLAN");
		tres.add(MyThirdLabel);
		
		String[] items = {"Premium (PR)", "VideoLovers (VL)", "MusicLovers (ML)", "TVLovers (TV)"};
		
		JComboBox combbox = new JComboBox<>(items);
		tres.add(combbox);
		
		//--------------------------------
		
		JPanel cuatro = new JPanel();
		this.add(cuatro);
		
		JLabel MyFourthLabel = new JLabel("LOYALTY POINTS");
		cuatro.add(MyFourthLabel);
		
		JTextField MyText2 = new JTextField(10);
		cuatro.add(MyText2);
		
		//---------------------------------
		
		JPanel cinco = new JPanel();
		this.add(cinco);
		
		JLabel MyFifthLabel = new JLabel("PHONE NUMBER");
		cuatro.add(MyFifthLabel);
		
		JTextField MyText3 = new JTextField(10);
		cinco.add(MyText3);
		
		//---------------------------------
		
		JPanel seis = new JPanel();
		this.add(seis);
		
		JLabel MySixthLabel = new JLabel("MEMBERS' FIRST NAME");
		seis.add(MySixthLabel);
		
		JTextField MyText4 = new JTextField(10);
		seis.add(MyText4);
		
		//----------------------------------
		
		JPanel siete = new JPanel();
		this.add(siete);
		
		JLabel MySeventhLabel = new JLabel("MEMBERS' SURNAME");
		siete.add(MySeventhLabel);
		
		JTextField MyText5 = new JTextField(10);
		siete.add(MyText5);
		
		//-----------------------------------
		
		JPanel ocho = new JPanel();
		this.add(ocho);
		
		JLabel MyEighth = new JLabel("CHECK PROFILE");
		ocho.add(MyEighth);
		
		JTextField MyText6 = new JTextField(10);
		ocho.add(MyText6);
		
		//-------------------------------------
		
		JPanel buttns = new JPanel();
		this.add(buttns);
		
		//-------------------------------------
		
		JButton one = new JButton("SIGN UP");
		buttns.add(one);
		one.setActionCommand("SIGN UP");
		one.addActionListener(this);
		
		JButton two = new JButton("MAIN PAGE");
		buttns.add(two);
		two.setActionCommand("MAIN PAGE");
		two.addActionListener(this);
		
		
		this.validate();
		this.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("SIGN UP")) {
			
			String one = MyText1.getText();
			String two = (String) combbox.getSelectecItem();
			String three = MyText2.getText();
			String four = MyText3.getText();
			String five = MyText4.getText();
			String six = MyText5.getText();
			String seven = MyText6.getText();
			
			Member newone = new Member(one, two, three, four, five, six, seven);
			
			action.newMember(newone);
			
		}
		// TODO Auto-generated method stub
		
	}

}
