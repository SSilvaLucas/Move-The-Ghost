package moveTheGhost;

import javax.swing.JFrame;

public class FrameFantasma extends JFrame {
	
	private int largura = 400;
	private int altura = 400;
	Fantasma ghost;

	public FrameFantasma(){
	   setSize(largura, altura);
	   ghost = new Fantasma();
	   add(ghost);

	   setDefaultCloseOperation(EXIT_ON_CLOSE);
	   setLocationRelativeTo(null);
	   setVisible(true);
	   setTitle("Move the Ghost");
	 }

	public void init() {
		ghost.init();
	}

	public static void main(String[] args) {
		FrameFantasma f = new FrameFantasma();
		f.init();
	}

}
