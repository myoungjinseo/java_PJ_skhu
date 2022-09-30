package java_Project;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class KeyListenerEx extends JFrame{
	private JLabel [] keyMessage;

	public KeyListenerEx() {

		setTitle("KeyListenerEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.addKeyListener(new MyKeyListenner());
		c.setLayout(new FlowLayout());

		keyMessage = new JLabel[3];
		keyMessage[0] = new JLabel("getKeyCode()");
		keyMessage[1] = new JLabel("getKeyChar()");
		keyMessage[2] = new JLabel("getKeyText()");

		for(int i=0; i<keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true);
			keyMessage[i].setBackground(Color.yellow);
		}

		setSize(250,250);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	class MyKeyListenner extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			char keychar = e.getKeyChar();
			keyMessage[0].setText(Integer.toString(keyCode));;
			keyMessage[1].setText(Character.toString(keychar));;
			keyMessage[2].setText(KeyEvent.getKeyText(keyCode));;
		}

	}

	public static void main(String [] args) {
		new KeyListenerEx();
	}
}
