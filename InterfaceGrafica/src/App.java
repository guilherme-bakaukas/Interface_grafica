
public class App {
	
	public static String DIRETORIO= App.class.getResource(".").getPath();
	
	public static void main(String[] args) {
		new Janela(DIRETORIO+"lula.png", DIRETORIO+"dino.png");
	}

}
