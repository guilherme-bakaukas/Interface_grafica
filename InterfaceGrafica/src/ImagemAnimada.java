import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.util.Random;

public class ImagemAnimada extends JLabel implements ActionListener {
	private static final long serialVersionUID = -1395928953560332753L;
	
	private JButton up,right,left,down,random;
	private Janela janela;
	public int linha,coluna;//define a posição da imagem inicial no zero
	
	public void actionPerformed(ActionEvent event) {
		if (event.getSource()==right) {
			if (coluna<6) {
				coluna++;
				janela.recreate_cenario(linha, coluna);
			}
		}
		if (event.getSource()==left) {
			if (coluna>1) {
				coluna--;
				janela.recreate_cenario(linha, coluna);
			}
		}
		if (event.getSource()==up) {
			if (linha>1) {
				linha--;
				janela.recreate_cenario(linha, coluna);
			}
			
		}
		if (event.getSource()==down) {
			if (linha<6) {
				linha++;
				janela.recreate_cenario(linha, coluna);
			}
			
		}
		if (event.getSource()==random) {
			Random gerador = new Random();
			int numero = gerador.nextInt(4);
			System.out.println(numero);
			switch (numero){
				case 0:
					if (coluna<6) {
						coluna++;
						janela.recreate_cenario(linha, coluna);
					}
					break;
				case 1:
					if (coluna>1) {
						coluna--;
						janela.recreate_cenario(linha, coluna);
					}
					break;
				case 2:
					if (linha>1) {
						linha--;
						janela.recreate_cenario(linha, coluna);
					}
					break;
				case 3:
					if (linha<6) {
						linha++;
						janela.recreate_cenario(linha, coluna);
					}
					break;
			}
			
		}
	}
	
	public ImagemAnimada(String image) {
		super(new ImageIcon(image));
		setSize(20,20);
		this.linha=1;
		this.coluna=1;
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
