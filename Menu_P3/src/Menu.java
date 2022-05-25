import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menu extends JFrame {
	MyDialog dialog = new MyDialog(this, "Test Dialog");
	
	public Menu() {
		setTitle("18114847 �����");
		createMenu(); // �޴� ����, �����ӿ� ����
		setSize(250, 200);
		setVisible(true);
	}

	private void createMenu() {
		JMenuBar mb = new JMenuBar();

		JMenu screenMenu1 = new JMenu("1��");
		screenMenu1.add(new JMenuItem("����"));

		JMenu screenMenu2 = new JMenu("2-1��");
		screenMenu2.add(new JMenuItem("New"));
		screenMenu2.add(new JMenuItem("Open"));
		screenMenu2.add(new JMenuItem("------"));
		screenMenu2.add(new JMenuItem("Save"));
		screenMenu2.add(new JMenuItem("SaveAs"));

		JMenu screenMenu3 = new JMenu("2-2��");
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

		JMenu screenMenu4 = new JMenu("3,4,5��");
		screenMenu4.add(new JMenuItem("3.���ӽ���"));
		screenMenu4.add(new JMenuItem("4.����"));
		// screenMenu4.add(new JMenuItem("5.�ڹٶ�?"));

		JMenuItem MenuItem = new JMenuItem("5.�ڹٶ�?");
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
			if (cmd.equals("5.�ڹٶ�?")) {
				dialog.setVisible(true);
			}
		}
	}
	
	class MyDialog extends JDialog {
		private JTextField tf1 = new JTextField("�ڹٿ� ���� ����");
		private JTextField tf2 = new JTextField("�ڹٿ� ���� Ư��");
		private JTextField tf3 = new JTextField("�ڹٿ� ���� ����");
		private JTextField tf4 = new JTextField("�ڹٿ� ���� ����");
		

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
