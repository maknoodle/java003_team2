package javaRent;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

// [도서 반납] 프레임 클래스 
public class FrameReturn extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	// Create the frame.
	public FrameReturn() {
		setTitle("도서 반납");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setVisible(true);
	}

}
