import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Color;
import java.awt.EventQueue;


public class App extends JFrame {

	private JPanel basePanel;
	private int posX = 1500;
	private int posY = 800;
	private int width = 400;
	private int height = 530;

	private Header header;
	private TextAreaPanel outPut;
	private NumbersButtonPainel numPanel;
	private OparationsButtonPainel opPanel;

	private CalcManager calc;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
					frame.setUndecorated(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public App() {
		header =  new Header( this );
		outPut = new TextAreaPanel();
		calc = new CalcManager(outPut);
		numPanel =  new NumbersButtonPainel(calc.getNumberListener());
		opPanel =  new OparationsButtonPainel(calc.getOperationListener());
		
		
		basePanel =  new JPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(posX, posY, width, height);


		basePanel.setBackground(Color.DARK_GRAY);
		basePanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		basePanel.setLayout(null);
		
		
		
		add(basePanel);
		basePanel.add(header);
		basePanel.add(outPut);
		basePanel.add(numPanel);
		basePanel.add(opPanel);
		
	}

}