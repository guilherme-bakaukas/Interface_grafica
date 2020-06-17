import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Janela extends JFrame{
	private static final long serialVersionUID=7686762169698416749L;
	private JPanel imagePane, controlPane;
	
	public Janela(String arquivo,String arquivo1){
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
        
        setImage(arquivo,arquivo1);
        setButtom();
        setVisible(true);

    }

    public void setButtom() {// inserir botao no painel de controle
    	JButton right=new JButton("right");
    	controlPane.add(right);
    	
    	JButton left=new JButton("left");
    	controlPane.add(left);
    	
    	JButton up=new JButton("up");
    	controlPane.add(up);
    	
    	JButton down=new JButton("down");
    	controlPane.add(down);
    	
    	JButton random=new JButton("random");
    	controlPane.add(random);
	}

	public void setImage(String arquivo, String arquivo1) {//insere as imagens

        ImageIcon image= new ImageIcon(arquivo);
        JLabel space_image= new JLabel(image);
        imagePane.add(space_image); 
       
        
        for (int i=0;i<35;i++) {
            ImageIcon image1= new ImageIcon(arquivo1);
            JLabel space_image1= new JLabel(image1);
        	imagePane.add(space_image1);
        }
        

    }
}
