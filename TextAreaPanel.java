import java.awt.Font;
import java.awt.Insets;
import java.awt.ComponentOrientation;
import java.awt.Color;

import javax.swing.JTextArea;

public class TextAreaPanel extends JTextArea{

	private int marginLeft = 15;
	private int marginTop = 70;
	private int width = 400;
	
	private String ln1 = "0";
	private String ln2 = "0";

    public TextAreaPanel () {
		setBounds(marginLeft, marginTop, width-2*marginLeft, 50);
		setColumns(35);
		setRows(2);
		setFont(new Font("Tahoma", Font.PLAIN, 18));
		setMargin(new Insets(5, 5, 5, 5));
		setCaretColor(Color.WHITE);
		setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		insert();
	}
	
	private void insert() {
		setText(ln1+"\n"+ln2);
	}
	
	void setL1(String l) {
		if(l == ""){
			ln1 = "0";
		} else {
			ln1 = l;
		}
		insert();
	}
	
	void setL2(String l) {
		if(l == ""){
			ln2 = "0";
		} else {
			ln2 = l;
		}
		insert();
	}
}