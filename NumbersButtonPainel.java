import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;

import java.awt.event.ActionListener;

public class NumbersButtonPainel extends JPanel{

    private int btnWidth = 75;
    private int btnHeight = 85;
    private int border = 15;
	private int posX = 15;
	private int posY = 135;


    public NumbersButtonPainel(ActionListener aE) {
        setLayout(null);
        setBackground(new ColorUIResource(25, 25, 25));
        setBounds(posX, posY, 255, 380);

        MyButton.setWidthh(btnWidth);
        MyButton.setHeightt(btnHeight);
        MyButton.setEActionListener(aE);

		add(new MyButton(border + 0*btnWidth,  border + 0*btnHeight, "1"));
		add(new MyButton(border + 1*btnWidth,  border + 0*btnHeight, "2"));
        add(new MyButton(border + 2*btnWidth,  border + 0*btnHeight, "3"));
        
		add(new MyButton(border + 0*btnWidth,  border + 1*btnHeight, "4"));
		add(new MyButton(border + 1*btnWidth,  border + 1*btnHeight, "5"));
		add(new MyButton(border + 2*btnWidth,  border + 1*btnHeight, "6"));

        add(new MyButton(border + 0*btnWidth,  border + 2*btnHeight, "7"));
		add(new MyButton(border + 1*btnWidth,  border + 2*btnHeight, "8"));
		add(new MyButton(border + 2*btnWidth,  border + 2*btnHeight, "9"));
        
        add(new MyButton(border + 1*btnWidth,  border + 3*btnHeight, "0"));
    }

}