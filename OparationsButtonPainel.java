import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;

import java.awt.event.ActionListener;

public class OparationsButtonPainel extends JPanel{

    private int btnWidth = 75;
    private int btnHeight = 85;
    private int border = 15;
	private int posX = 280;
	private int posY = 135;



    public OparationsButtonPainel(ActionListener aE) {
        setLayout(null);
        setBackground(new ColorUIResource(25, 25, 25));
        setBounds(posX, posY, 105, 380);

        MyButton.setWidthh(btnWidth);
        MyButton.setHeightt(btnHeight);
        MyButton.setEActionListener(aE);

		add(new MyButton(border,  border + 0*btnHeight, "+"));
		add(new MyButton(border,  border + 1*btnHeight, "-"));
        add(new MyButton(border,  border + 2*btnHeight, "x"));        
		add(new MyButton(border,  border + 3*btnHeight, "="));
    }

}