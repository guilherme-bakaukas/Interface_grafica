import javax.swing.JButton;

public class App {
	
	public static String DIRETORIO= App.class.getResource(".").getPath();
	
	public static void main(String[] args) {
		Janela janela=new Janela();
		
		janela.setImage(DIRETORIO+"lula.png", DIRETORIO+"dino.png");
		
    	JButton right=new JButton("right");
    	janela.setButton(right);
    	
    	JButton left=new JButton("left");
    	janela.setButton(left);
    	
    	JButton up=new JButton("up");
    	janela.setButton(up);
    	
    	JButton down=new JButton("down");
    	janela.setButton(down);
    	
    	JButton random=new JButton("random");
    	janela.setButton(random);
		
    	
    	
	}

}
