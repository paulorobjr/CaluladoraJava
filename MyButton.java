import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyButton extends JButton{

    private String text = "X";
    private int xpos;
    private int ypos;
    private static int width = 50;
    private static int height = 50;
    private static  ActionListener actionListener;

    public MyButton(int xpos, int ypos, String text) {
        this.xpos = xpos;
        this.ypos = ypos;
        this.text = text;
        setText(this.text);
        setBounds(this.xpos, this.ypos, MyButton.getWidthh(), MyButton.getHeightt());
        setForeground(Color.WHITE);
        setBackground(Color.WHITE);
        addActionListener(actionListener);

        // setBorderPainted(false);
        setFont(new Font("Tahoma", Font.BOLD, 20));
        setFocusPainted(false);
        setContentAreaFilled(false);
    }

    public String getText() {
        return text;
    }

    public static int getWidthh() {
        return width;
    }

    public static int getHeightt() {
        return height;
    }

    public static void setWidthh(int w) {
        width = w;
    }

    public static void setHeightt(int h) {
        height = h;
    }
    public void setText(String text) {
        this.text = text;
    }
    
    public static void setEActionListener(ActionListener aL) {
        actionListener = aL;
    }
}