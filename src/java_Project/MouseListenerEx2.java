package java_Project;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class MouseListenerEx2 extends JFrame{
	private JLabel la = new JLabel("Hello");

	public MouseListenerEx2() {

		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseAdapter());

		c.setLayout(null);
		la.setSize(50,20);
		la.setLocation(30,30);
		c.add(la);

		setSize(250,250);
		setVisible(true);
	}
	class MyMouseAdapter extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}

	}

	public static void main(String [] args) {
		new MouseListenerEx2();
	}
}
