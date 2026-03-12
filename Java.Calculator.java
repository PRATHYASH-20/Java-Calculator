import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	
	boolean ifOperaterClick=false;
	double newValue,oldValue;
	JFrame jf;
	int calculation=0;
	JLabel displaylabel;
	JButton Sevenbutton,Eightbutton,Ninebutton,clrbutton,
	Fourbutton,Fivebutton,Sixbutton,Oenbutton,twobutton,
	Threebutton,dotbutton,Zerobutton,equalbutton,divistionbutton,
	multibutton,subbutton,plusbutton;
	
Calculator(){
	jf=new JFrame("Calculator");
	jf.setLayout(null);
	jf.setSize(900,900);
	jf.setLocation(400,90);
	jf.setVisible(true);
	displaylabel=new JLabel();
	displaylabel.setFont(new Font("Arial",Font.TYPE1_FONT,50));
	displaylabel.setBounds(40, 10, 800, 200);
	displaylabel.setBackground(Color.LIGHT_GRAY);
	displaylabel.setOpaque(true);
	displaylabel.setForeground(Color.black);
	displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
	jf.add(displaylabel);
	
	Sevenbutton=new JButton("7");
	Sevenbutton.setBounds(40,250,100,100);
	Sevenbutton.setFont(new Font("Arial",Font.BOLD,30));
	Sevenbutton.addActionListener(this);
	jf.add(Sevenbutton);
	
	Eightbutton=new JButton("8");
	Eightbutton.setBounds(200,250,100,100);
	Eightbutton.setFont(new Font("Arial",Font.BOLD,30));
	Eightbutton.addActionListener(this);
	jf.add(Eightbutton);
	
	Ninebutton=new JButton("9");
	Ninebutton.setBounds(360,250,100,100);
	Ninebutton.setFont(new Font("Arial",Font.BOLD,30));
	Ninebutton.addActionListener(this);		
	jf.add(Ninebutton);
	
	Fourbutton=new JButton("4");
	Fourbutton.setBounds(40,400,100,100);
	Fourbutton.setFont(new Font("Arial",Font.BOLD,30));
	Fourbutton.addActionListener(this);
	jf.add(Fourbutton);
	
	Fivebutton=new JButton("5");
	Fivebutton.setBounds(200,400,100,100);
	Fivebutton.setFont(new Font("Arial",Font.BOLD,30));
	Fivebutton.addActionListener(this);
	jf.add(Fivebutton);
	
	Sixbutton=new JButton("6");
	Sixbutton.setBounds(360,400,100,100);
	Sixbutton.setFont(new Font("Arial",Font.BOLD,30));
	Sixbutton.addActionListener(this);
	jf.add(Sixbutton);
	
	Oenbutton=new JButton("1");
	Oenbutton.setBounds(40,550,100,100);
	Oenbutton.setFont(new Font("Arial",Font.BOLD,30));
	Oenbutton.addActionListener(this);
	jf.add(Oenbutton);
	
    twobutton=new JButton("2");
	twobutton.setBounds(200,550,100,100);
	twobutton.setFont(new Font("Arial",Font.BOLD,30));
	twobutton.addActionListener(this);
	jf.add(twobutton);
	
	Threebutton=new JButton("3");
	Threebutton.setBounds(360,550,100,100);
	Threebutton.setFont(new Font("Arial",Font.BOLD,30));
	Threebutton.addActionListener(this);
	jf.add(Threebutton);
	
	dotbutton=new JButton(".");
	dotbutton.setBounds(40,700,100,100);
	dotbutton.setFont(new Font("Arial",Font.BOLD,30));
	dotbutton.addActionListener(this);
	jf.add(dotbutton);
	
	Zerobutton=new JButton("0");
	Zerobutton.setBounds(200,700,100,100);
	Zerobutton.setFont(new Font("Arial",Font.BOLD,30));
    Zerobutton.addActionListener(this);
	jf.add(Zerobutton);
	
	equalbutton=new JButton("=");
	equalbutton.setBounds(360,700,100,100);
	equalbutton.setFont(new Font("Arial",Font.BOLD,30));
	equalbutton.addActionListener(this);
	jf.add(equalbutton);
	
	divistionbutton=new JButton("/");
	divistionbutton.setBounds(520,250,100,100);
	divistionbutton.setFont(new Font("Arial",Font.BOLD,30));
	divistionbutton.setForeground(Color.red);
    divistionbutton.addActionListener(this);
	jf.add(divistionbutton);
	

	multibutton=new JButton("*");
	multibutton.setBounds(520,400,100,100);
	multibutton.setFont(new Font("Arial",Font.BOLD,30));
	multibutton.setForeground(Color.red);
	multibutton.addActionListener(this);
	jf.add(multibutton);
	
	subbutton=new JButton("-");
	subbutton.setBounds(520,550,100,100);
	subbutton.setFont(new Font("Arial",Font.BOLD,30));
	subbutton.setForeground(Color.red);
	subbutton.addActionListener(this);
	jf.add(subbutton);
	
	
	plusbutton=new JButton("+");
	plusbutton.setBounds(520,700,100,100);
	plusbutton.setFont(new Font("Arial",Font.BOLD,30));
	plusbutton.setForeground(Color.red);
	plusbutton.addActionListener(this);
	jf.add(plusbutton);
	
	clrbutton=new JButton("CLEAR");
	clrbutton.setBounds(650,400,200,250);
	clrbutton.setFont(new Font("Arial",Font.BOLD,30));
	clrbutton.setForeground(Color.CYAN);
	clrbutton.addActionListener(this);
	jf.add(clrbutton);
	
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main (String ar[]) {
	new Calculator();
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==Sevenbutton) {
		if(ifOperaterClick) {
			displaylabel.setText("7");
			ifOperaterClick=false;
		}else {
			displaylabel.setText(displaylabel.getText()+"7");
		}
		
		
	}else if(e.getSource()==Eightbutton) {
		if(ifOperaterClick) {
			displaylabel.setText("8");
			ifOperaterClick=false;
		}else {
			displaylabel.setText(displaylabel.getText()+"8");
		}
		
	}else if(e.getSource()==Ninebutton) {
		if(ifOperaterClick) {
			displaylabel.setText("9");
			ifOperaterClick=false;
		}else {
			displaylabel.setText(displaylabel.getText()+"9");
		}
		
	}else if(e.getSource()==Fourbutton) {
		if(ifOperaterClick) {
			displaylabel.setText("4");
			ifOperaterClick=false;
		}else {
			displaylabel.setText(displaylabel.getText()+"4");
		}
		
	}else if(e.getSource()==Fivebutton) {
		if(ifOperaterClick) {
			displaylabel.setText("5");
			ifOperaterClick=false;
		}else {
			displaylabel.setText(displaylabel.getText()+"5");
		}
		
	}else if(e.getSource()==Sixbutton) {
		if(ifOperaterClick) {
			displaylabel.setText("6");
			ifOperaterClick=false;
		}else {
			displaylabel.setText(displaylabel.getText()+"6");
		}
	}else if(e.getSource()==Oenbutton) { 
		if(ifOperaterClick) {
			displaylabel.setText("1");
			ifOperaterClick=false;
		}else {
			displaylabel.setText(displaylabel.getText()+"1");
		}
	}else if(e.getSource()==twobutton) {
		if(ifOperaterClick) {
			displaylabel.setText("2");
			ifOperaterClick=false;
		}else {
			displaylabel.setText(displaylabel.getText()+"2");
		}
	}else if(e.getSource()==Threebutton) {
		if(ifOperaterClick) {
			displaylabel.setText("3");
			ifOperaterClick=false;
		}else {
			displaylabel.setText(displaylabel.getText()+"3");
		}
	}else if(e.getSource()==dotbutton) {
		displaylabel.setText(displaylabel.getText()+".");	
	}else if(e.getSource()==Zerobutton) {
		if(ifOperaterClick) {
			displaylabel.setText("0");
			ifOperaterClick=false;
		}else {
			displaylabel.setText(displaylabel.getText()+"0");
		}
	}else if(e.getSource()==plusbutton) {
		ifOperaterClick=true;
		oldValue=Double.parseDouble(displaylabel.getText());
		calculation= 1;
	}else if(e.getSource()==subbutton) {
		ifOperaterClick=true;
		oldValue=Double.parseDouble(displaylabel.getText());
		calculation=2;
	}else if(e.getSource()==multibutton) {
		ifOperaterClick=true;
		oldValue=Double.parseDouble(displaylabel.getText());
		calculation=3;
	}else if(e.getSource()==divistionbutton) {
		ifOperaterClick=true;
		oldValue=Double.parseDouble(displaylabel.getText());
		calculation=4;
		
	}else if(e.getSource()==clrbutton) {
		displaylabel.setText("");
	}else if(e.getSource()==equalbutton) {
//		newValue=DisplayLabel.getText();
//		float newValueF=Float.parseFloat(newValue);
//		float oldValueF=Float.parseFloat(oldValue);
//		
//		float Result=newValueF-oldValueF;
//		
//		DisplayLabel.setText(Result+"");
		switch (calculation) {
		case 1: {
			newValue = oldValue + Double.parseDouble(displaylabel.getText());
			if (Double.toString(newValue).endsWith(".0")) {
				displaylabel.setText(Double.toString(newValue).replace(".0", ""));
			}else {
				displaylabel.setText(Double.toString(newValue));
			}
			break;
			
		}
		case 2: {
			newValue = oldValue - Double.parseDouble(displaylabel.getText());
			if (Double.toString(newValue).endsWith(".0")) {
				displaylabel.setText(Double.toString(newValue).replace(".0", ""));
			}else {
				displaylabel.setText(Double.toString(newValue));
			}
			break;
		}
		case 3: {
			newValue = oldValue * Double.parseDouble(displaylabel.getText());
			if (Double.toString(newValue).endsWith(".0")) {
				displaylabel.setText(Double.toString(newValue).replace(".0", ""));
			}else {
				displaylabel.setText(Double.toString(newValue));
			}
			break;
		}
		case 4: {
			newValue = oldValue / Double.parseDouble(displaylabel.getText());
			if (Double.toString(newValue).endsWith(".0")) {
				displaylabel.setText(Double.toString(newValue).replace(".0", ""));
			}else {
				displaylabel.setText(Double.toString(newValue));
			}
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + calculation);
		}
	}
}
}