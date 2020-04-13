import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcManager {

    private ActionListener numberListener;
    private ActionListener operationListener;
    private String sNum = "";
    private String memoria = "";
    private String historico = "";
    private String operacao = "";
    private String temp = "";

    public CalcManager(TextAreaPanel Tpanel) {
        numberListener =  new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() instanceof MyButton ) {
                    sNum += ((MyButton) e.getSource()).getText();
                    // System.out.println(sNum);
                    Tpanel.setL2(operacao.concat(sNum));
                } else {
                    System.out.println("Esse evento não veio de um botão.");
                }
                
            };
        };
        operationListener =  new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() instanceof MyButton ) {
                    temp = ((MyButton) e.getSource()).getText();
                    if (operacao ==  ""){
                        operacao = temp;
                        if( sNum != "" ){
                            if( memoria == ""){
                                memoria = sNum;
                                Tpanel.setL1(operacao.concat(sNum));
                                sNum = "";
                                Tpanel.setL2(sNum);
                            }
                        } else {
                            if (memoria != "") {
                                sNum = memoria;
                                Tpanel.setL1(operacao.concat(sNum));
                            }    
                        }
                    } else {
                        if ( temp == "=") {
                            if( memoria != ""){
                                if( sNum != "" ){
                                    historico = memoria + operacao.concat(sNum);
                                    memoria = resolve();
                                    historico = memoria.concat(" = ").concat(historico); 
                                    sNum = "";
                                    operacao = "";
                                    memoria = "";
                                    Tpanel.setL2("0");
                                    Tpanel.setL1(historico);
                                }
                            }
                        } else {
                            if( temp != operacao) {
                                System.out.println(operacao);
                                operacao = temp;
                            }
                        }
                        
                    }                    
                } else {
                    System.out.println("Esse evento não veio de um botão.");
                }
                
            };
        };
    
    }
    public ActionListener getNumberListener() {
        return numberListener;
    }
    public ActionListener getOperationListener() {
        return operationListener;
    }

    private String resolve() {
        System.out.println(operacao);
        switch (operacao) {
            case "+":
                return Float.toString(Float.parseFloat(memoria) + Float.parseFloat(sNum));
            case "-":
                return Float.toString(Float.parseFloat(memoria) - Float.parseFloat(sNum));
            case "x":
                return Float.toString(Float.parseFloat(memoria) * Float.parseFloat(sNum));
            case "/":
                return Float.toString(Float.parseFloat(memoria) / Float.parseFloat(sNum));
            }
        return "";
    }
}