package hw;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Project extends JFrame {
	Container c = getContentPane();
	JPanel center3 = new JPanel();
	JButton btn1 = new JButton("영화");
	JButton btn2 = new JButton("드라마");
	JButton btn3 = new JButton("노래");
	JLabel title = new JLabel("");
	private int count = 3;

	JPanel center = new JPanel();
	JPanel center2 = new JPanel();

	JPanel west = new JPanel();
	JPanel east = new JPanel();


	public Project() {
		setTitle("초성게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		c.setLayout(null);
		title.setText("ㅊㅅㄱㅇ");
		title.setHorizontalAlignment(JLabel.CENTER);
		center.setLayout(new FlowLayout());
		center2.setLayout(new FlowLayout());
		east.setLayout(new FlowLayout());
		center3.setLayout(new FlowLayout());
		west.setLayout(new FlowLayout());
		center.add(btn1);
		center.add(btn2);
		center.add(btn3);
		center.setSize(300,300);
		center.setLocation(200, 115);
		west.setSize(200,300);
		west.setLocation(0, 115);
		center2.setSize(100,100);
		center2.add(title);
		center3.setSize(230,100);
		center3.setLocation(250, 200);


		c.add(center);
		c.add(center2);
		c.add(center3);


		center2.setLocation(300, 0);
		title.setFont(new Font("나눔손글씨 붓", Font.PLAIN, 20));
		title.setForeground(Color.BLUE);

		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				if (b.getText().equals("영화")) {
					Apage();
					btn1.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							JButton b = (JButton) e.getSource();
							if (b.getText().equals("쉬움")) {
								Apage2("ㅂㅈㄷㅅ", "범죄도시","니 내 누군지 아니?              ","          마동석","images/image1.jpg");
							}
						}
					});
					btn2.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							JButton b = (JButton) e.getSource();
							if (b.getText().equals("보통")) {
								Apage2("ㅌㄹㅁㅅ","트루먼쇼", "How's it going te end?         ","        짐캐리","images/image2.jpg");
							}
						}
					});
					btn3.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							JButton b = (JButton) e.getSource();
							if (b.getText().equals("어려움")) {
								Apage2("ㄹㅇㅍ ㅇㅂ ㅍㅇ", "라이프 오브 파이","What kills you is not water, but fear.","이르판 칸","images/image3.jpg");
							}
						}
					});

				}

			}
		});
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				if (b.getText().equals("드라마")) {
					Apage();
					btn1.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							JButton b = (JButton) e.getSource();
							if (b.getText().equals("쉬움")) {
								Apage2("ㅅㄹㄴ", "수리남","찍찍찍찍찍 쥐새끼가 뻔뻔하게 시끄럽네","조우진","images/image4.jpg");
							}
						}
					});
					btn2.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							JButton b = (JButton) e.getSource();
							if (b.getText().equals("보통")) {
								Apage2("ㅂㄷㄹ ㅅㄹㅎㄹ", "법대로 사랑하라","괴롭고 아프고 평화롭고 안전한 날들","이세영","images/image5.jpg");
							}
						}
					});
					btn3.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							JButton b = (JButton) e.getSource();
							if (b.getText().equals("어려움")) {
								Apage2("ㅅㄹㄹㅁ ㅊㅎㅈ", "샐러리맨 초한지","이범수      ","        2012년 드라마","images/image6.jpg");
								c.add(center3);
							}
						}
					});

				}

			}
		});
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				if (b.getText().equals("노래")) {
					Apage();
					btn1.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							JButton b = (JButton) e.getSource();
							if (b.getText().equals("쉬움")) {
								Apage2("ㄴㅇ xㅇㄱ", "나의 x에게","우리 다시 만날래   ","    경서","images/image7.jpg");
								c.add(center3);
							}
						}
					});
					btn2.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							JButton b = (JButton) e.getSource();
							if (b.getText().equals("보통")) {
								Apage2("ㅁㄷ", "문득","배가 고파서 밥을 차렸는데    ","   비오","images/image8.jpg");
								c.add(center3);
							}
						}
					});
					btn3.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							JButton b = (JButton) e.getSource();
							if (b.getText().equals("어려움")) {
								Apage2("ㅂㅌㅂㅌ", "비틀비틀","어둠이 없는 밤을 걸어                      ","해쉬스완","images/image9.jpg");
								c.add(center3);
							}
						}
					});

				}

			}
		});

		setSize(820, 400);
		setVisible(true);

	}

	public void Apage() {
		btn1.setText("쉬움");
		btn2.setText("보통");
		btn3.setText("어려움");

	}

	public void Apage2(String a2, String a3,String a4,String a5,String a6) {
		btn1.setText(a2);
		btn2.setText("hint : "+count);
		btn3.setVisible(false);
		answer(a3);
		hint(a4,a5,a6);

	}

	private void answer(String string) {
		JLabel Label = new JLabel("정답 :");
		JTextField answer2 = new JTextField(10);
		JLabel Alabel = new JLabel("");

		JButton longBtn = new JButton("제출");
		center3.add(Label);
		center3.add(answer2);
		center3.add(longBtn);

		center3.add(Alabel);





		longBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = string;

				if (id.equals(answer2.getText())) {
					Alabel.setText("정답입니다.");

				} else {
					Alabel.setText("오답입니다.");

				}
			}
		});

	}
	private void hint(String a1, String a2, String a3) {
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(count ==3) {
					count -=1;
					btn2.setText("hint : "+count);
					JLabel hint1 = new JLabel(a1);
					hint1.setSize(300,300);
					west.add(hint1);

					c.add(west);
				} else if(count ==2) {
					count -=1;
					btn2.setText("hint : "+count);
					JLabel hint2 = new JLabel(a2);
					hint2.setSize(150,120);
					west.add(hint2);

					c.add(west);
				} else if(count ==1) {
					count -=1;
					btn2.setText("hint : "+count);
					ImageIcon image = new ImageIcon(a3);
					JLabel hint3 = new JLabel(image);
					east.add(hint3);
					east.setSize(350,700);
					east.setLocation(480, 0);
					c.add(east);
				}
			}
		});
	}

	public static void main(String[] args) {
		new Project();
	}
}
