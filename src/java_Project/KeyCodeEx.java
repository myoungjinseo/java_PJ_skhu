package java_Project;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class KeyCodeEx extends JFrame{
	private JLabel la = new JLabel();

	public KeyCodeEx() {

		setTitle("KeyCodeEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.addKeyListener(new MyKeyListenner());
		c.add(la);
		setSize(300,150);
		setVisible(true);

		c.setFocusable(true);
		c.requestFocus();
	}
	class MyKeyListenner extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			la.setText(KeyEvent.getKeyText(e.getKeyCode()) + "키가 입력됨");

			Container c = (Container)e.getSource();
			if(e.getKeyChar()=='%')
				c.setBackground(Color.YELLOW);
			else if(e.getKeyCode() == KeyEvent.VK_F1)
				c.setBackground(Color.GREEN);

		}

	};

	public static void main(String [] args) {
		new KeyCodeEx();
	}
}
