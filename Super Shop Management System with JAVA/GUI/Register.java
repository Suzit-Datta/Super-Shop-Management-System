package GUI;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import File.*;

public class Register extends JFrame implements ActionListener{
	JPanel panel;
	JLabel backgroundImgLabel,registerHeader,username,password ;
	JTextField usernameField;
    JPasswordField userPasswordField;
    JButton backBtn, registerBtn;
	
	Login loginPage;

	// fonts
	Font font = new Font("poppins", Font.PLAIN, 19);
	Font boldFont = new Font("roboto", Font.BOLD, 35);

	// colors
	Color greenColor = new Color(0,204,0);
	Color blueColor = new Color(25, 113, 255);
	Color redColor = new Color(250, 20, 20);
	
	public Register(Login loginPage){
		super("Super Shop Management System 2023 - Register");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1000, 700);
		this.setLocation(300, 70);
		this.setLayout(null);
		this.setIconImage(new ImageIcon("./Assets/Images/shopIcon.png").getImage());
		this.loginPage = loginPage;
		
		// write code
		
		ImageIcon backgroundImg = new ImageIcon("./Assets/Images/registerBackground.jpg");
		backgroundImgLabel = new JLabel();
		backgroundImgLabel.setBounds(550, 0, 1000, 700);
		backgroundImgLabel.setIcon(backgroundImg);
		this.add(backgroundImgLabel);

		// register header
		registerHeader = new JLabel("REGISTER HERE");
		registerHeader.setBounds(130, 80, 300, 40);
		registerHeader.setFont(boldFont);
		this.add(registerHeader);

		//usename label
	    username = new JLabel("ENTER USER NAME");
	    username.setBounds(100,150,250,40);
	    username.setFont(font);
	    this.add(username);
        //Username Field
	    usernameField = new JTextField();
	    usernameField.setBounds(100,195,340,40);
	    usernameField.setFont(font);
	    this.add(usernameField);
		
	    // User Password label
	    password = new JLabel("ENTER PASSWORD");
	    password.setBounds(100,250,250,40);
	    password.setFont(font);
	    this.add(password);
	     // User PasswordField
	    userPasswordField = new JPasswordField();
	    userPasswordField.setBounds(100,295,340,40);
	    userPasswordField.setFont(font);
	    this.add(userPasswordField);
		
	    //Register  Btn
	    registerBtn = new JButton("Register");
	    registerBtn.setBounds(100,370, 340, 40);
	    registerBtn.setFont(font);
	    registerBtn.setForeground(Color.WHITE);
	    registerBtn.setBackground(greenColor);
	    registerBtn.setBorder(new EmptyBorder(0, 0, 0, 0));
	    registerBtn.addActionListener(this);
	    this.add(registerBtn);
		
	    //Back  Btn
	    backBtn = new JButton("Back");
	    backBtn.setBounds(30,600,100,35);
	    backBtn.setFont(font);
	    backBtn.setForeground(Color.WHITE);
	    backBtn.setBackground(redColor);
	    backBtn.setBorder(new EmptyBorder(0, 0, 0, 0));
		backBtn.addActionListener(this);
	    this.add(backBtn);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setSize(1920, 1080);
		panel.setBackground(new Color(240, 245, 245));
		this.add(panel);
		
		// page visibility
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if(registerBtn == e.getSource()){
		String name = usernameField.getText();
		String pass = String.valueOf(userPasswordField.getPassword());
		boolean s = FileIO.registerUser(name,pass,"./File/users.txt");
		if(s == true){
			JOptionPane.showMessageDialog(this, "Register Successfull"); 
				usernameField.setText("");
				userPasswordField.setText("");
		}
		else if ( s == false){
			JOptionPane.showMessageDialog(this, "Already Registered", 
											  "Error",JOptionPane.WARNING_MESSAGE);
		}

		}
		if(backBtn == e.getSource()){
			this.dispose();
			loginPage.setVisible(true);
		}
	}
}