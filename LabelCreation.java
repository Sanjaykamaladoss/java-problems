package toolkitcreation;

import java.awt.*;
import java.awt.event.*;
//Class for creating a GUI form with labels, text fields, checkboxes, and buttons
public class LabelCreation {
	// Constructor to set up the GUI components
	LabelCreation(){
		 
		  // Creating a frame with a title
	 Frame f = new Frame("Label Creation");
	 // Creating buttons for "SIGN IN" and "SUBMIT"
	 Button b2=new Button("SIGN IN");
	
	 Button b1=new Button("SUBMIT");
	  // Creating labels for form fields
		Label L1 = new Label("STUDENT NAME:");
		Label L2 = new Label("MOBILE NO:");
		Label L3 = new Label("GENDER:");
		Label L4 = new Label("DOB:");
		Label L5 = new Label("E-MAIL:");
		 // Creating text fields for input
		TextField T=new TextField();//Student Name
		TextField T1=new TextField("+91");//Mobile No country code
		TextField T2=new TextField();//Mobile No 
		TextField T3=new TextField("");//E-mail
		 // Creating a drop down list (List component) for course selection
		Label L6 = new Label("COURSE:");
	
		List r=new List(10);// Allows displaying 10 items at a time
		r.add("JAVA");
		r.add("PYTHON");
		r.add("CSS");
		r.add("C++");
		r.add("HTML");
		r.add("JAVASCRIPT");
		r.add("SQL");
		r.add("C#");
		r.add("KOTLIN");
		r.add("MATLAB");
		
		  // Setting fonts for labels and fields
		
		Font F=new Font("Arial",Font.BOLD,14);// Font for labels
		Font F2=new Font("Arial",Font.BOLD,12);// Font for text fields
		 // Applying fonts to components
		L1.setFont(F);
		L2.setFont(F);
		L3.setFont(F);
		L4.setFont(F);
		L5.setFont(F);
		L6.setFont(F);
		T3.setFont(F);
		T2.setFont(F2);
		T1.setFont(F2);
		T.setFont(F2);
		r.setFont(F2);
		
		
		//TextArea a=new TextArea("");
		
		// Creating a checkbox for terms and conditions
		Checkbox t=new Checkbox("ACCEPT TERMS AND CONDITIONS");
		Font F1=new Font("Arial",Font.BOLD,16);// Font for buttons and checkboxes
		t.setFont(F1);
		b1.setFont(F1);
		b2.setFont(F1);
		Choice C=new Choice();
		 // Creating dropdown choices for date of birth (Day, Month, Year)
		C.add("1");
		C.add("2");
		C.add("3");
		C.add("4");
		C.add("5");
		C.add("6");
		C.add("7");
		C.add("8");
		C.add("9");
		C.add("10");
		C.add("11");
		C.add("12");
		C.add("13");
		C.add("14");
		C.add("15");
		C.add("16");
		C.add("17");
		C.add("18");
		C.add("19");
		C.add("20");
		C.add("21");
		C.add("22");
		C.add("23");
		C.add("24");
		C.add("25");
		C.add("26");
		C.add("27");
		C.add("28");
		C.add("29");
		C.add("30");
		C.add("31");
		Choice C1=new Choice();
		C1.add("JAN");
		C1.add("FEB");
		C1.add("MAR");
		C1.add("APR");
		C1.add("MAY");
		C1.add("JUNE");
		C1.add("JULY");
		C1.add("AUG");
		C1.add("SEPT");
		C1.add("OCT");
		C1.add("NOV");
		C1.add("DEC");
		Choice C2=new Choice();
		C2.add("2024");
		C2.add("2023");
		C2.add("2022");
		C2.add("2021");
		C2.add("2020");
		C2.add("2019");
		C2.add("2018");
		C2.add("2017");
		C2.add("2016");
		C2.add("2015");
		C2.add("2014");
		C2.add("2013");
		C2.add("2012");
		C2.add("2011");
		C2.add("2010");
		C2.add("2009");
		C2.add("2008");
		C2.add("2007");
		C2.add("2006");
		C2.add("2005");
		C2.add("2004");
		C2.add("2003");
		C2.add("2002");
		C2.add("2001");
		C2.add("2000");
		C.setFont(F);
		C1.setFont(F);
		C2.setFont(F);
		
		 // Creating a checkbox group for gender selection
		CheckboxGroup g = new CheckboxGroup();
		Checkbox checkbox = new Checkbox("MALE", g, false);
		Checkbox checkbox1 = new Checkbox("FEMALE", g, false);
		Checkbox checkbox2 = new Checkbox("OTHERS", g, false);
		//Checkbox checkbox3 = new Checkbox("siva", g, false);
		checkbox.setFont(F);
		checkbox1.setFont(F);
		checkbox2.setFont(F);
	
		 // Setting bounds (position and size) for each component
		L1.setBounds(50,100,130,30);
		T.setBounds(200,100,250,20);
		L2.setBounds(50,140,90,30);
		T1.setBounds(200,140,30,20);
		T2.setBounds(230,140,200,20);
		L3.setBounds(50,200,70,50);
		checkbox.setBounds(200,200,60,50);
		checkbox1.setBounds(270,200,90,50);
		checkbox2.setBounds(370,200,120,50);
		L5.setBounds(50,270,80,30);
		L4.setBounds(50,330,60,30);
		C.setBounds(200,330,50,50);
		C1.setBounds(280,330,60,50);
		C2.setBounds(370,330,70,50);
		T3.setBounds(200,270,500,30);
        L6.setBounds(50,390,80,30);
        r.setBounds(200,390,150,80);
        
		t.setBounds(150,750,350,30);
	   // r.setBounds(50,200,100,50);
		
		//a.setBounds(50,280,100,100);
		
		
		//checkbox3.setBounds(50,490,100,30);
		b2.setBounds(400,850,70,30);
		b1.setBounds(500,850,70,30);
		
		
		 // Setting frame properties
		b2.setBackground(Color.blue);
		b1.setBackground(Color.CYAN);
		f.setBackground(Color.lightGray);
		f.add(L1);
		f.add(L2);
		f.add(L3);
		f.add(L4);
		f.add(L5);
		f.add(T3);
		f.add(T);
		f.add(T1);
		f.add(T2);
		f.add(L6);
		
     	//f.add(a);
		f.add(t);
		f.add(r);
		f.add(checkbox);
		f.add(checkbox1);
		f.add(checkbox2);
		
		
		//f.add(checkbox3);
		f.add(C);
		f.add(C1);
		f.add(C2);
		f.add(b2);
		f.add(b1);
		
		f.setSize(1200,1200);
		f.setLayout(null);
		f.setVisible(true);
		final Label m=new Label();
		m.setBounds(500,890,150,50);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.setText("your form is Submitted");
				f.add(m);
		
			}
		});
				
	}
	// Main method to create an instance of the LabelCreation class
	public static void main(String[] args) {
		LabelCreation la=new  LabelCreation();

	}

}
