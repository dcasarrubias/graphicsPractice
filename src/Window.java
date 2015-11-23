import javax.swing.JFrame;

public class Window extends JFrame {
	public Window(int width, int height){
		
		add(new Picture());
		
		setSize(width, height);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
}
}