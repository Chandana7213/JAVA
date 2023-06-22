import javax.swing.*;
import java.awt.*;
public class ChesBoard extends JPanel {
	public void paint(Graphics gp) {
		gp.fillRect(50,50,600,600);
		for(int x=50; x<=600;x+=150) {
			for(int y=50;y<=600;y+=150) {
				gp.clearRect(x, y, 75, 75);
			}
		}
		for(int x=125; x<=600;x+=150) {
			for(int y=125;y<=600;y+=150) {
				gp.clearRect(x, y, 75, 75);
			}
		}
		
	}
	

	public static void main(String[] args) {
		JFrame jf=new JFrame();
		jf.setSize(700,700);
		jf.setTitle(null);
		jf.getContentPane().add(new ChesBoard());
		jf.setLocationRelativeTo(null);
		jf.setBackground(Color.lightGray);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		

	}

}
