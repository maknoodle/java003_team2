package lib;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.FlowLayout;
import javax.swing.ScrollPaneConstants;
public class builer {

	private JFrame frame;
	private JTextField SearchField;
	private JTable table;
	private JTable table_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					builer window = new builer();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public builer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("InternalFrame.activeBorderColor"));
		frame.setBounds(100, 100, 555, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\uD68C\uC6D0 \uC815\uBCF4");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(12, 43, 95, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel Center_Panel = new JPanel();
		Center_Panel.setBorder(new LineBorder(UIManager.getColor("CheckBoxMenuItem.selectionBackground")));
		Center_Panel.setBackground(UIManager.getColor("InternalFrame.activeBorderColor"));
		Center_Panel.setForeground(Color.WHITE);
		Center_Panel.setBounds(12, 64, 515, 539);
		frame.getContentPane().add(Center_Panel);
		Center_Panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblNewLabel_2 = new JLabel("\uD68C\uC6D0 \uAC80\uC0C9");
		lblNewLabel_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		Center_Panel.add(lblNewLabel_2);
		
		SearchField = new JTextField();
		Center_Panel.add(SearchField);
		SearchField.setColumns(41);
		
		JLabel lblNewLabel_3 = new JLabel("\uD68C\uC6D0 \uAC80\uC0C9 \uACB0\uACFC");
		lblNewLabel_3.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		Center_Panel.add(lblNewLabel_3);
		
		table = new JTable();
		table.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"\uC804\uD654\uBC88\uD638", "\uC774\uB984", "\uC0DD\uB144\uC6D4\uC77C", "\uC131\uBCC4", "\uB4F1\uB85D\uC5EC\uBD80", "\uB300\uC5EC\uB3C4\uC11C"
			}
		));
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(500,90));
		Center_Panel.add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(UIManager.getColor("CheckBoxMenuItem.selectionBackground")));
		panel.setBackground(UIManager.getColor("InternalFrame.activeBorderColor"));
		panel.setPreferredSize(new Dimension(500,375));
		Center_Panel.add(panel);
		panel.setLayout(null);
		
		JLabel Image = new JLabel("");
		Image.setBounds(12, 10, 119, 140);
		Image.setOpaque(true);
		Image.setBackground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		panel.add(Image);
		
		JLabel lblNewLabel_4 = new JLabel("\uC804\uD654\uBC88\uD638 :");
		lblNewLabel_4.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(143, 10, 105, 22);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("01025773617");
		lblNewLabel_4_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		lblNewLabel_4_1.setBounds(260, 10, 105, 22);
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("\uC774\uB984 :");
		lblNewLabel_4_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		lblNewLabel_4_2.setBounds(143, 42, 105, 22);
		panel.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("\uC774\uC2B9\uC9C4");
		lblNewLabel_4_3.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		lblNewLabel_4_3.setBounds(260, 42, 105, 22);
		panel.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("\uC0DD\uB144\uC6D4\uC77C :");
		lblNewLabel_4_4.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		lblNewLabel_4_4.setBounds(143, 74, 105, 22);
		panel.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_4_5 = new JLabel("1997-06-18");
		lblNewLabel_4_5.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		lblNewLabel_4_5.setBounds(260, 74, 105, 22);
		panel.add(lblNewLabel_4_5);
		
		JLabel lblNewLabel_4_6 = new JLabel("\uC131\uBCC4 :");
		lblNewLabel_4_6.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		lblNewLabel_4_6.setBounds(143, 106, 105, 22);
		panel.add(lblNewLabel_4_6);
		
		JLabel lblNewLabel_4_7 = new JLabel("\uC774\uBA54\uC77C :");
		lblNewLabel_4_7.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		lblNewLabel_4_7.setBounds(143, 138, 105, 22);
		panel.add(lblNewLabel_4_7);
		
		JLabel lblNewLabel_4_8 = new JLabel("\uB0A8");
		lblNewLabel_4_8.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		lblNewLabel_4_8.setBounds(260, 106, 105, 22);
		panel.add(lblNewLabel_4_8);
		
		JLabel lblNewLabel_4_9 = new JLabel("options3224@naver.com");
		lblNewLabel_4_9.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		lblNewLabel_4_9.setBounds(260, 138, 195, 22);
		panel.add(lblNewLabel_4_9);
		
		JLabel lblNewLabel_4_10 = new JLabel("\uB4F1\uB85D\uC5EC\uBD80 :");
		lblNewLabel_4_10.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		lblNewLabel_4_10.setBounds(143, 170, 105, 22);
		panel.add(lblNewLabel_4_10);
		
		JLabel lblNewLabel_4_11 = new JLabel("\uB4F1\uB85D");
		lblNewLabel_4_11.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		lblNewLabel_4_11.setBounds(260, 170, 105, 22);
		panel.add(lblNewLabel_4_11);
		
		JPanel List_Panel = new JPanel();
		List_Panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		List_Panel.setBackground(UIManager.getColor("InternalFrame.activeBorderColor"));
		List_Panel.setBounds(12, 207, 476, 158);
		panel.add(List_Panel);
		
		JLabel lblNewLabel_5 = new JLabel("\uB300\uC5EC\uC911\uC778 \uB3C4\uC11C \uBAA9\uB85D");
		lblNewLabel_5.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		List_Panel.add(lblNewLabel_5);
		
		table_1 = new JTable();
		table_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"ISBN", "\uC81C\uBAA9", "\uC800\uC790", "\uCD9C\uD310\uC0AC", "\uB300\uC5EC\uC77C", "\uBC18\uB0A9\uC608\uC815\uC77C"
			}
		));
		JScrollPane jp = new JScrollPane(table_1);
		jp.setPreferredSize(new Dimension(460,120));
		List_Panel.add(jp);
		
		JPanel Top_Panel = new JPanel();
		Top_Panel.setBackground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		Top_Panel.setBounds(0, 0, 541, 33);
		frame.getContentPane().add(Top_Panel);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0 \uC870\uD68C");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		Top_Panel.add(lblNewLabel);
		
		JButton CancelButton = new JButton("\uCDE8\uC18C");
		CancelButton.setBorder(new LineBorder(UIManager.getColor("CheckBoxMenuItem.selectionBackground")));
		CancelButton.setBackground(UIManager.getColor("InternalFrame.activeBorderColor"));
		CancelButton.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		CancelButton.setBounds(432, 613, 95, 29);
		frame.getContentPane().add(CancelButton);
	}
}
