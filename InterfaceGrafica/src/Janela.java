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
	private String ambiente;
	Container principalPane;
	private ImagemAnimada animada;
	
	public Janela(){
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);//garante que a janela só fecha quando o usuário clica no exit
        setSize(300,300);



        principalPane= getContentPane();//painel principal
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
		this.animada=image;
        imagePane.add(image);
        SwingUtilities.updateComponentTreeUI(this);
    }
	
	public void setAmbiente(String arquivo) {
		for (int i=0;i<35;i++) {
		    ImageIcon imagem = new ImageIcon(arquivo);
		    JLabel campoImagem = new JLabel(imagem);
			imagePane.add(campoImagem);
			}
		animada.coluna = 1;
		animada.linha = 1;
		ambiente=arquivo;//vincula a referência da imagem a esta classe
		SwingUtilities.updateComponentTreeUI(this);
	}
	
	public void recreate_cenario(int linha, int coluna) {
		//ideia é recriar o cenário porém com o objeto animado deslocado
		imagePane.removeAll();
		for (int i=1;i<=36;i++) {
			if (linha*6-(6-coluna) == i){
				imagePane.add(animada);
			}
			else {
				ImageIcon imagem = new ImageIcon(ambiente);
				JLabel campoImagem = new JLabel(imagem);
				imagePane.add(campoImagem);
			}
		}
		SwingUtilities.updateComponentTreeUI(this);
	}
}

