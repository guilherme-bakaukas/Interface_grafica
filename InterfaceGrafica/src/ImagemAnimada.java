import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ImagemAnimada extends JLabel implements ActionListener {
	private static final long serialVersionUID = -1395928953560332753L;
	
	private JButton up,right,left,down,random;
	
	public void actionPerformed(ActionEvent event) {
		if (event.getSource()==right) {
			
		}
		if (event.getSource()==left) {
			
		}
		if (event.getSource()==up) {
			
		}
		if (event.getSource()==down) {
			
		}
		if (event.getSource()==random) {
			
		}
	}
	
	public ImagemAnimada(String image) {
		super(new ImageIcon(image));
		setSize(200,200);
	}

	public void vinculateButtons(JButton up,JButton right,JButton left,JButton down,JButton random) {
		this.up=up;
		this.right=right;
		this.left=left;
		this.down=down;
		this.random=random;
	}
}
