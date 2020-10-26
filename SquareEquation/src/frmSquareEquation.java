import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmSquareEquation extends JFrame {

	private JPanel contentPane;
	private JTextField txt_a;
	private JTextField txt_b;
	private JTextField txt_c;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmSquareEquation frame = new frmSquareEquation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmSquareEquation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 374, 254);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_a = new JLabel("x2 +");
		lbl_a.setBounds(107, 73, 29, 14);
		contentPane.add(lbl_a);
		
		txt_a = new JTextField();
		txt_a.setBounds(40, 70, 57, 20);
		contentPane.add(txt_a);
		txt_a.setColumns(10);
		
		txt_b = new JTextField();
		txt_b.setColumns(10);
		txt_b.setBounds(137, 70, 57, 20);
		contentPane.add(txt_b);
		
		txt_c = new JTextField();
		txt_c.setColumns(10);
		txt_c.setBounds(234, 70, 57, 20);
		contentPane.add(txt_c);
		
		JLabel lbl_b = new JLabel("x +");
		lbl_b.setBounds(204, 73, 29, 14);
		contentPane.add(lbl_b);
		
		JLabel lblRightPart = new JLabel("= 0");
		lblRightPart.setBounds(301, 73, 29, 14);
		contentPane.add(lblRightPart);
		
		JLabel labebl = new JLabel("\u0420\u0435\u0448\u0435\u043D\u0438\u0435");
		labebl.setBounds(163, 148, 102, 14);
		contentPane.add(labebl);
		
		JLabel lblSolution = new JLabel("");
		lblSolution.setBounds(26, 172, 298, 32);
		contentPane.add(lblSolution);
		
		JLabel label = new JLabel("\u041A\u0432\u0430\u0434\u0440\u0430\u0442\u043D\u043E\u0435 \u0443\u0440\u0430\u0432\u043D\u0435\u043D\u0438\u0435");
		label.setBounds(121, 27, 170, 14);
		contentPane.add(label);
		
		JButton btnSolve = new JButton("\u0420\u0435\u0448\u0438\u0442\u044C \u0443\u0440\u0430\u0432\u043D\u0435\u043D\u0438\u0435");
		btnSolve.setBounds(76, 114, 224, 23);
		contentPane.add(btnSolve);
		btnSolve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				double a,b,c;
				try 
				{
					a=Double.parseDouble(txt_a.getText());
				}
				catch(NumberFormatException nfe) 
				{
					a=0.0;
					txt_a.setText("0.0");
				}
				try
				{
					b=Double.parseDouble(txt_b.getText());
				}
				catch(NumberFormatException nfe)
				{
					b=0.0;
					txt_b.setText("0.0");
				}
				try 
				{
					c=Double.parseDouble(txt_c.getText());
				}
				catch(NumberFormatException nfe) 
				{
					c=0.0;
					txt_c.setText("0.0");
				}
				double D=b*b-4.*a*c;
				double x1,x2;
				String Sol="";
				if(D<0.0)
					Sol="No valid solutions";
				else if(D>0.&& a!=0.)
				{
					x1=(-b+Math.sqrt(D))/(2.*a);
					x2=(-b-Math.sqrt(D))/(2.*a);
					Sol="Radicals: x1 = "+x1+" ,x2 = "+x2;
				}
				else if(D==0.0 &&a!=0.0)
				{
					x1=-b/(2.*a);
					Sol="Radical X = "+x1;
				}
				else if(a==0 && b!=0.)
				{
					x1=-c/b;
					Sol="Radical X = "+ x1;
				}
				
				lblSolution.setText(Sol);
			}
		});
		
	}
}
