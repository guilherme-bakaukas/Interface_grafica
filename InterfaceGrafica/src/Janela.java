import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Janela extends JFrame{
	private static final long serialVersionUID=7686762169698416749L;
	private JPanel imagePane, controlPane;
	private ImagemAnimada animada;
	private JLabel ambiente;
	
	public Janela(){
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);//garante que a janela só fecha quando o usuário clica no exit
        setSize(300,300);
        
        Container principalPane= getContentPane();//painel principal
        principalPane.setLayout(new BorderLayout());
        
        imagePane= new JPanel();// painel das imagens
        imagePane.setLayout(new GridLayout(6,6));
        principalPane.add(imagePane,BorderLayout.CENTER);
        
        controlPane=new JPanel();//painel de controle
        controlPane.setLayout(new FlowLayout());
        principalPane.add(controlPane,BorderLayout.SOUTH);
        
        setVisible(true);

    }

    public void setButton(JButton botao) {// inserir botao no painel de controle
    	controlPane.add(botao);
    	SwingUtilities.updateComponentTreeUI(this);
	}

	public void setImage(ImagemAnimada image) {//insere as imagens e às vincula
		animada=image;//vincula a imagem animada a essa classe
        imagePane.add(image); 
        SwingUtilities.updateComponentTreeUI(this);
    }
	
	public void setAmbiente(String arquivo) {
		for (int i=0;i<35;i++) {
		    ImageIcon imagem = new ImageIcon(arquivo);
		    JLabel campoImagem = new JLabel(imagem);
			imagePane.add(campoImagem);
			}
	    ImageIcon imagem = new ImageIcon(arquivo);
	    JLabel campoImagem = new JLabel(imagem);
		ambiente=campoImagem;//vincula a imagem do ambiente a essa classe
	}
	
	public void recreate_cenario(int linha, int coluna) {
		//ideia é recriar o cenário porém com o objeto animado deslocado
	}
}
