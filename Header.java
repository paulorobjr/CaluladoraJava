import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.plaf.ColorUIResource;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;


public class Header extends JPanel{

    private JLabel lbl_close;
    private JLabel label;
	private int posX = 15;
	private int posY = 15;
    int xx,xy;

    public Header(App app) {

        setLayout(null);
        setBackground(new ColorUIResource(25, 25, 25));
        setBounds(posX, posY, 370, 40);

        label = new JLabel("");
		label.setBounds(0, 0, 320, 40);
		
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				 xx = e.getX();
                 xy = e.getY();
			}
        });
        
		label.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				
				int x = arg0.getXOnScreen();
	            int y = arg0.getYOnScreen();
	            app.setLocation(x - xx, y - xy);  
			}
        });
        add(label);
        
        lbl_close = new JLabel("X");
		lbl_close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				System.exit(0);
			}
		});
		// lbl_close.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_close.setForeground(new Color(255, 255, 255));
		lbl_close.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_close.setBounds(345, 5, 40, 30);
		add(lbl_close);
    }

}

// JLabel label = new JLabel("");
		
// 		label.addMouseListener(new MouseAdapter() {
// 			@Override
// 			public void mousePressed(MouseEvent e) {
				
// 				 xx = e.getX();
// 			     xy = e.getY();
// 			}
// 		});
// 		label.addMouseMotionListener(new MouseMotionAdapter() {
// 			@Override
// 			public void mouseDragged(MouseEvent arg0) {
				
// 				int x = arg0.getXOnScreen();
// 	            int y = arg0.getYOnScreen();
// 	            Home.this.setLocation(x - xx, y - xy);  
// 			}
// 		});