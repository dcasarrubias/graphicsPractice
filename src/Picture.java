import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Picture extends JPanel {
	
	public void paintComponent(Graphics g){
	
	Random generator = new Random();
	super.paintComponent(g);
	
	int width;
	int height;	
	
	width = getWidth();
	height = getHeight();
		
	for(int picture = 0; picture <10; picture++){
		int shape;
		
		shape = generator.nextInt(2);	// Generate 2 shapes	
		if (shape == 1) {
			
		int num1;
		num1 = generator.nextInt(256);
		
		int num2;
		num2 = generator.nextInt(256);
		
		int num3;
		num3 = generator.nextInt(256);
		
		int x;
		x = generator.nextInt(width);
		
		int y;
		y = generator.nextInt(height);
		
		int w;
		w = generator.nextInt(width);
		
		int h;
		h = generator.nextInt(height);
		
		g.setColor(new Color(num1, num2, num3));
		
		g.fillRect(x, y, w, h);
		
		} else {
			int num1;
			num1 = generator.nextInt(256); // 1-256
			
			int num2;
			num2 = generator.nextInt(256); // 1-256
			
			int num3;
			num3 = generator.nextInt(256);
			
			int x;
			x = generator.nextInt(width);
			
			int y;
			y = generator.nextInt(height);
			
			int w;
			w = generator.nextInt(width);
			
			int h;	
			h = generator.nextInt(height);
			
			g.setColor(new Color(num1, num2, num3));
			
			g.fillOval(x, y, w, h);
		}
		}
	

}
	}

