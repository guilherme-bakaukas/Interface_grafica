import javax.swing.JButton;

public class App {
	
	public static String DIRETORIO= App.class.getResource(".").getPath();
	
	public static void main(String[] args) {
		Janela janela=new Janela();


    	JButton left=new JButton("left");
    	janela.setButton(left);

		JButton right=new JButton("right");
		janela.setButton(right);
    	
    	JButton up=new JButton("up");
    	janela.setButton(up);
    	
    	JButton down=new JButton("down");
    	janela.setButton(down);
    	
    	JButton random=new JButton("random");
    	janela.setButton(random);
    	
		ImagemAnimada lula= new ImagemAnimada(DIRETORIO+"Char.png");//adiciona a imagem animada no início
		janela.setImage(lula);
		
		lula.vinculateJanela(janela);
		lula.vinculateButtons(up, right, left, down, random);
		
		right.addActionListener(lula);
		left.addActionListener(lula);
		up.addActionListener(lula);
		down.addActionListener(lula);
		random.addActionListener(lula);
		
		janela.setAmbiente(DIRETORIO+"Frame1.png");//cria o ambiente inicial
    	
	}

}
