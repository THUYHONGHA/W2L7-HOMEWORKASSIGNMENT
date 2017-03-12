package problem1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Convert extends JFrame implements ActionListener{
	JTextField txtMiles, txtKilometers, txtPounds, txtKilograms, txtGalons, txtLiters, txtFahrenheit, txtCentigrade;
	JButton btnCon;

	public static void main(String[] args) {
		JFrame frame = new Convert();
		frame.setVisible(true);
	}

	Convert() {
		setTitle("Metric Conversion Assistant");
		this.setLayout(null);
		this.setBounds(0, 0, 800, 350);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JLabel lbMile = new JLabel("Mile");
		JLabel lbKmeter = new JLabel("Kilometer");
		JLabel lbPound = new JLabel("Pound");
		JLabel lbKgram = new JLabel("Kilogram");
		JLabel lbGalon = new JLabel("Galon");
		JLabel lbLiter = new JLabel("Liter");
		JLabel lbFah = new JLabel("Fahrenheit");
		JLabel lbCen = new JLabel("Centigrade");
		btnCon=new JButton("Convert");
		txtMiles=new JTextField();
		txtKilometers=new JTextField();
		txtPounds=new JTextField();
		txtKilograms=new JTextField();
		txtGalons=new JTextField();
		txtLiters=new JTextField();
		txtFahrenheit=new JTextField();
		txtCentigrade=new JTextField();

		lbMile.setBounds(50, 20, 100, 50);
		lbKmeter.setBounds(400, 20, 100, 50);
		lbPound.setBounds(50, 70, 100, 50);
		lbKgram.setBounds(400, 70, 100, 50);
		lbGalon.setBounds(50, 120, 100, 50);
		lbLiter.setBounds(400, 120, 100, 50);
		lbFah.setBounds(50, 170, 100, 50);
		lbCen.setBounds(400, 170, 100, 50);
		btnCon.setBounds(300, 230, 100, 30);
		txtMiles.setBounds(150, 30, 200, 30);
		txtKilometers.setBounds(500, 30, 200, 30);
		txtPounds.setBounds(150, 80, 200, 30);
		txtKilograms.setBounds(500, 80, 200, 30);
		txtGalons.setBounds(150, 130, 200, 30);
		txtLiters.setBounds(500, 130, 200, 30);
		txtFahrenheit.setBounds(150, 180, 200, 30);
		txtCentigrade.setBounds(500, 180, 200, 30);

		add(lbMile);
		add(lbKmeter);
		add(lbPound);
		add(lbKgram);
		add(lbGalon);
		add(lbLiter);
		add(lbFah);
		add(lbCen);
		add(btnCon);
		add(txtMiles);
		add(txtKilometers);
		add(txtPounds);
		add(txtKilograms);
		add(txtGalons);
		add(txtLiters);
		add(txtFahrenheit);
		add(txtCentigrade);
		
		btnCon.addActionListener(this);
	}
	
	public void actionPerformed (ActionEvent e){
		try{			
			double temp1=Double.parseDouble(txtMiles.getText())*1.61;
			txtKilometers.setText(temp1+"");
			double temp2=Double.parseDouble(txtPounds.getText())*0.45;
			txtKilograms.setText(temp2+"");
			double temp3=Double.parseDouble(txtGalons.getText())*3.79;
			txtLiters.setText(temp3+"");
			double temp4=(Double.parseDouble(txtFahrenheit.getText())-32)/1.8;
			txtCentigrade.setText(temp4+"");
		}
		catch (Exception ex){
			JOptionPane.showMessageDialog(this, "One of fields is blank or you did not type a number.", "Information", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}

}
