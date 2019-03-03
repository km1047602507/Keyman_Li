package my;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class MyFrame extends JFrame
{
	JProgressBar pb;
	
	
	public MyFrame(String title)
	{
		super(title);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JTextField textField = new JTextField(16);
		JButton btn = new JButton("≤‚ ‘");
		
		contentPane.add(textField);
		contentPane.add(btn);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt)
			{
//				test1();
//				test2();
//				test3();
//				test4();
//				test5();
				
			}
			
		});
		
		//Ω¯∂»Ãı
		pb = new JProgressBar();
		pb.setMinimum(0);
		pb.setMaximum(100);
		pb.setForeground(Color.GREEN);
		pb.setValue(80);
		pb.setPreferredSize(new Dimension(180, 30));
		contentPane.add(pb);
	}
	
	//Dialog
	private void test1()
	{
		JOptionPane.showMessageDialog(this, "ShowMessageDialog");
	}
	
	private void test2()
	{
		JOptionPane.showMessageDialog(this, "ShowMessageDialog","InaneMessage",JOptionPane.WARNING_MESSAGE);
	}
	
	private void test3()
	{
		JOptionPane.showMessageDialog(this, "ShowMessageDialog","ErrorMessage",JOptionPane.ERROR_MESSAGE);
	}
	
	private void test4()
	{
		JOptionPane.showMessageDialog(this, "ShowMessageDialog","PlainMessage",JOptionPane.PLAIN_MESSAGE);
	}
	
	private void test5()
	{
		JOptionPane.showMessageDialog(this, "ShowMessageDialog","InformationMessage",JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	
	
	
}
