package java_Project;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class InnerClaasListener extends JFrame{
	public InnerClaasListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionLister());
		c.add(btn);

		setSize(350,150);
		setVisible(true);

	}

	private class MyActionLister implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
			InnerClaasListener.this.setTitle(b.getText());
		}
	}

	public static void main(String [] args) {
		new InnerClaasListener();
	}
}
