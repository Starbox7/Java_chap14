import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menu extends JFrame {
	MyDialog dialog = new MyDialog(this, "Test Dialog");
	
	public Menu() {
		setTitle("18114847 김범준");
		createMenu(); // 메뉴 생성, 프레임에 삽입
		setSize(250, 200);
		setVisible(true);
	}

	private void createMenu() {
		JMenuBar mb = new JMenuBar();

		JMenu screenMenu1 = new JMenu("1번");
		screenMenu1.add(new JMenuItem("실행"));

		JMenu screenMenu2 = new JMenu("2-1번");
		screenMenu2.add(new JMenuItem("New"));
		screenMenu2.add(new JMenuItem("Open"));
		screenMenu2.add(new JMenuItem("------"));
		screenMenu2.add(new JMenuItem("Save"));
		screenMenu2.add(new JMenuItem("SaveAs"));

		JMenu screenMenu3 = new JMenu("2-2번");
		screenMenu3.add(new JMenuItem("Open"));
		screenMenu3.add(new JMenuItem("------"));
		screenMenu3.add(new JMenuItem("Color"));
		screenMenu3.add(new JMenuItem("------"));
		screenMenu3.add(new JMenuItem("Line"));
		screenMenu3.add(new JMenuItem("Rect"));
		screenMenu3.add(new JMenuItem("Oval"));
		screenMenu3.add(new JMenuItem("RndRect"));
		screenMenu3.add(new JMenuItem("Text"));
		screenMenu3.add(new JMenuItem("FreeLine"));

		JMenu screenMenu4 = new JMenu("3,4,5번");
		screenMenu4.add(new JMenuItem("3.게임시작"));
		screenMenu4.add(new JMenuItem("4.계산기"));
		// screenMenu4.add(new JMenuItem("5.자바란?"));

		JMenuItem MenuItem = new JMenuItem("5.자바란?");
		MenuItem.addActionListener(new MenuActionListener());
		screenMenu4.add(MenuItem);

		mb.add(screenMenu1);
		mb.add(screenMenu2);
		mb.add(screenMenu3);
		mb.add(screenMenu4);
		setJMenuBar(mb);
	}

	class MenuActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if (cmd.equals("5.자바란?")) {
				dialog.setVisible(true);
			}
		}
	}
	
	class MyDialog extends JDialog {
		private JTextField tf1 = new JTextField("자바에 대한 설명");
		private JTextField tf2 = new JTextField("자바에 대한 특성");
		private JTextField tf3 = new JTextField("자바에 대한 형식");
		private JTextField tf4 = new JTextField("자바에 대한 역사");
		

		public MyDialog(JFrame frame, String title) {
			super(frame,title);
			setLayout(new FlowLayout());
			add(tf1);
			add(tf2);
			add(tf3);
			add(tf4);
			
			setSize(400, 200);
		}
	}


	public static void main(String[] args) {
		new Menu();
	}
}
