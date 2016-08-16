package moveTheGhost;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Fantasma extends JPanel implements KeyListener {

	private int x;
	private int y;

	private int alturaMax, larguraMax;

	private int larguraImagem = 64;
	private int alturaImagem = 64;

	Image imagem;

	public Fantasma() {
		x = 0;
		y = 0;
		imagem = Toolkit.getDefaultToolkit().getImage("/home/silva/Imagens/ghost.png");
		setFocusable(true);
		requestFocusInWindow();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(imagem, x, y, this);
	}

	public void keyPressed(KeyEvent ke) {
		switch (ke.getKeyCode()) {
		case KeyEvent.VK_UP:
			if (this.y > 0) {
				this.y--;
				repaint();
			}
			break;
		case KeyEvent.VK_DOWN:
			if (this.y < this.alturaMax) {
				this.y++;
				repaint();
			}
			break;
		case KeyEvent.VK_LEFT:
			if (this.x > 0) {
				this.x--;
				repaint();
			}
			break;
		case KeyEvent.VK_RIGHT:
			if (this.x < this.larguraMax) {
				this.x++;
				repaint();
			}
			break;
		}
	}

	public void keyReleased(KeyEvent ke) {
	}

	public void keyTyped(KeyEvent ke) {
	}

	public void init() {
		addKeyListener(this);

		JFrame parent = (JFrame) SwingUtilities.getWindowAncestor(this);
		Dimension dimParentFrame = parent.getContentPane().getSize();

		alturaMax = (int) dimParentFrame.getHeight() - alturaImagem;
		larguraMax = (int) dimParentFrame.getWidth() - larguraImagem;
	}
}