import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ImagemAnimada extends JLabel implements ActionListener {
	private static final long serialVersionUID = -1395928953560332753L;
	
	private JButton up,right,left,down,random;
	private Janela janela;
	private int linha,coluna;//define a posição da imagem inicia no zero
	
	public void actionPerformed(ActionEvent event) {
		if (event.getSource()==right) {
			if (coluna<5) {
				coluna++;
				janela.recreate_cenario(linha,coluna);
			}
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
		setSize(20,20);
		this.linha=0;
		this.coluna=0;
	}

	public void vinculateButtons(JButton up,JButton right,JButton left,JButton down,JButton random) {
		this.up=up;
		this.right=right;
		this.left=left;
		this.down=down;
		this.random=random;
	}
	
	public void vinculateJanela(Janela janela) {
		this.janela=janela;
	}
}
