import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class RailwayTicket extends JFrame implements ActionListener
{
	JLabel title,detail,name,age,gend,birthChoice,railImage,railIcon,warning;
	JTextField nameText,ageText;
	JComboBox genderComboBox;
	JRadioButton upper,middle,lower;
	JButton nextBut;
	
	RailwayTicket()
	{
		setSize(900,900);
		Font f=new Font("Arial" , Font.BOLD ,18);
		
		title=new JLabel("****WELCOME TO RAILWAY RESERVATION BOOKING****");
		title.setFont(f);
		title.setBounds(200,50,700,100);
		add(title);
		
		ImageIcon rail=new ImageIcon("train.jpg");
		railImage=new JLabel(rail);
		railImage.setBounds(500,200,270,200);
		add(railImage);
		
		ImageIcon icon=new ImageIcon("icon.png");
		railIcon=new JLabel(icon);
		railIcon.setBounds(10,10,150,150);
		add(railIcon);
		
		detail=new JLabel("ENTER PASSENGER DETAILS:-");
		detail.setFont(f);
		detail.setBounds(50,130,300,100);
		add(detail);
		
		name=new JLabel("Name:-");
		name.setFont(f);
		name.setBounds(50,220,100,30);
		add(name);
		
		age=new JLabel("Age:-");
		age.setFont(f);
		age.setBounds(50,290,100,50);
		add(age);
		
		gend=new JLabel("Gender:-");
		gend.setBounds(50,380,100,50);
		gend.setFont(f);
		add(gend);
		
		birthChoice=new JLabel("Select Birth Preference:");
		birthChoice.setBounds(170,450,300,50);
		birthChoice.setFont(f);
		add(birthChoice);
		
		String gender[] ={"-","Male","Female","Other"};
		genderComboBox=new JComboBox(gender);
		genderComboBox.setBounds(130,390,100,30);
		genderComboBox.setFont(f);
		add(genderComboBox);
		
		nameText=new JTextField(" ");
		nameText.setBounds(130,220,300,30);
		nameText.setFont(f);
		add(nameText);
		
		ageText=new JTextField(" ");
		ageText.setBounds(130,300,100,30);
		ageText.setFont(f);
		add(ageText);
		
		lower=new JRadioButton("Lower");
		lower.setBounds(50,485,100,50);
		lower.setFont(f);
		lower.setBackground(new Color(176,224,230));
		add(lower);
		
		middle=new JRadioButton("Middle");
		middle.setBounds(220,485,100,50);
		middle.setFont(f);
		middle.setBackground(new Color(176,224,230));
		add(middle);
		
		upper=new JRadioButton("Upper");
		upper.setBounds(400,485,100,50);
		upper.setFont(f);
		upper.setBackground(new Color(176,224,230));
		add(upper);
		
		ButtonGroup group = new ButtonGroup();
		group.add(lower);
		group.add(middle);
		group.add(upper);
		
		nextBut=new JButton("Next");
		nextBut.setBounds(220,600,150,30);
		nextBut.setFont(f);
		nextBut.addActionListener(this);
		add(nextBut);
	
		Font w=new Font("Arial" , Font.BOLD ,40);
		
		warning=new JLabel("ALWAYS WEAR YOUR MASK!!!!");
		warning.setBounds(120,670,620,50);
		warning.setFont(w);
		add(warning);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		this.setVisible(false);
		
		Information info =new Information(this);
		info.setLayout(null);
		info.setTitle("Train Details");
		info.setSize(900,900);
		info.setVisible(true);
		info.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		info.getContentPane().setBackground(new Color(176,224,230));
	}
	public static void main(String args[])
	{
		RailwayTicket r=new RailwayTicket();
		r.setLayout(null);
		r.setTitle("INDIAN RAILWAY");
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.getContentPane().setBackground(new Color(176,224,230));
	}
	
}

class Information extends JFrame implements ActionListener
{
	JLabel title,trainNo,trainName,source,dest,date,classType,train2lab,railIcon;
	JTextField trainNoText,trainNameText,sourceText,destText,dateText;
	JComboBox classBox;
	JButton nextBut,prevBut;
	RailwayTicket firstpage;
	
	Information(RailwayTicket page1)
	{
		firstpage=page1;
		Font f=new Font("Arial" , Font.BOLD ,18);
		
		title=new JLabel("**** Train Information ****");
		title.setFont(f);
		title.setBounds(300,50,250,100);
		add(title);
		
		ImageIcon icon=new ImageIcon("icon.png");
		railIcon=new JLabel(icon);
		railIcon.setBounds(700,20,150,150);
		add(railIcon);
		
		trainNo=new JLabel("Train No.:-");
		trainNo.setFont(f);
		trainNo.setBounds(50,140,100,30);
		add(trainNo);
		
		trainNoText=new JTextField(" ");
		trainNoText.setFont(f);
		trainNoText.setBounds(170,140,100,30);
		add(trainNoText);
		
		trainName=new JLabel("Train Name:-");
		trainName.setFont(f);
		trainName.setBounds(50,200,200,30);
		add(trainName);
		
		trainNameText=new JTextField(" ");
		trainNameText.setFont(f);
		trainNameText.setBounds(170,200,250,30);
		add(trainNameText);
		
		
		source=new JLabel("Source:- ");
		source.setFont(f);
		source.setBounds(50,260,100,30);
		add(source);
		
		sourceText=new JTextField(" ");
		sourceText.setFont(f);
		sourceText.setBounds(130,260,150,30);
		add(sourceText);
		
		dest=new JLabel("Destination:- ");
		dest.setFont(f);
		dest.setBounds(350,260,150,30);
		add(dest);
		
		destText=new JTextField(" ");
		destText.setFont(f);
		destText.setBounds(470,260,150,30);
		add(destText);
		
		
		date=new JLabel("Date Of Journey:- ");
		date.setFont(f);
		date.setBounds(50,320,200,30);
		add(date);
		
		dateText=new JTextField(" ");
		dateText.setFont(f);
		dateText.setBounds(220,320,120,30);
		add(dateText);
		
		classType=new JLabel("Class:-");
		classType.setFont(f);
		classType.setBounds(50,380,150,30);
		add(classType);
		
		
		String class1[]={"-" ,"Sleeper"," III AC " , " II AC "};
		classBox=new JComboBox(class1);
		classBox.setFont(f);
		classBox.setBounds(130,380,100,30);
		add(classBox);
		
		ImageIcon train2=new ImageIcon("train2.jpg");
		train2lab=new JLabel(train2);
		train2lab.setBounds(170,550,500,220);
		add(train2lab);
		
		prevBut=new JButton("Previous");
		prevBut.setFont(f);
		prevBut.setBounds(180,480,150,30);
		prevBut.addActionListener(this);
		add(prevBut);
		
		nextBut=new JButton("Book Ticket");
		nextBut.setFont(f);
		nextBut.setBounds(450,480,150,30);
		nextBut.addActionListener(this);
		add(nextBut);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		this.setVisible(false);
		if(e.getSource()==prevBut)
		{
			firstpage.setVisible(true);
		}
		else if(e.getSource()==nextBut)
		{
			this.setVisible(false);
			Ticket t=new Ticket(firstpage,this);
			t.setTitle("Ticket");
			t.setSize(900,500);
			t.setLayout(null);
			t.setVisible(true);
			t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			t.getContentPane().setBackground(new Color(176,224,230));
		}
	}
}	

class Ticket extends JFrame
{
	JPanel panel;
	JLabel header,yourTicket,confirm,pnrNo,printLab,thanks,screenShot,railIcon;
	Ticket(RailwayTicket firstpage,Information secondpage)
	{
		RailwayTicket page01=firstpage;
		Information page02=secondpage;
		Font f=new Font("Arial" , Font.BOLD ,18);
		
		header=new JLabel("Happy Journey!!!!");
		header.setFont(f);
		header.setBounds(650,20,650,30);
		add(header);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBounds(80,80,740,310);
		panel.setBackground(Color.white);
		add(panel);
		
		ImageIcon icon=new ImageIcon("icon.png");
		railIcon=new JLabel(icon);
		railIcon.setBounds(590,0,150,150);
		panel.add(railIcon);
		
		
		yourTicket=new JLabel("Booking Confirmation!");
		yourTicket.setFont(f);
		yourTicket.setBounds(300,20,250,30);
		panel.add(yourTicket);
		
		
		confirm=new JLabel();
		confirm.setFont(f);
		confirm.setText("Hello "+firstpage.nameText.getText()+", your ticket has been booked.");
		confirm.setBounds(50,70,500,30);
		panel.add(confirm);
		
		pnrNo=new JLabel();
		pnrNo.setFont(f);
		pnrNo.setText("Your PNR No. is 1984529654");
		pnrNo.setBounds(50,110,500,30);
		panel.add(pnrNo);
		
		printLab=new JLabel();
		printLab.setFont(f);
		printLab.setText("You can download your ticket using this PNR No. from our website.");
		printLab.setBounds(50,150,700,30);
		panel.add(printLab);
		
		thanks=new JLabel();
		thanks.setFont(f);
		thanks.setText("Thank you for using our service. Have a nice day!!");
		thanks.setBounds(50,200,700,30);
		panel.add(thanks);
		
		screenShot=new JLabel();
		screenShot.setFont(f);
		screenShot.setText("You may take a screenshot for your reference.");
		screenShot.setBounds(400,400,500,30);
		add(screenShot);
	}
}