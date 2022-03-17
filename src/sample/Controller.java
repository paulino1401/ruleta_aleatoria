package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.util.Random;

public class Controller {
    @FXML
    Button btnjugar,btnagregar;
    @FXML
    TextField txtnombre,txt1,txt2,txt3,txt4,txt5;
    @FXML
    TextArea txtlista;
    String [] nombres = new String[120];
    int [] lugares = new int[5];
    int i=0;
    int rnd;
    protected final static String newline = "\n";
    public void agregar(){
        if(!(txtnombre.equals(""))){
            nombres[i] = txtnombre.getText();
            i++;
            txtlista.appendText(i+".- "+txtnombre.getText()+newline);
            int zona = txtlista.getCaretPosition();
            txtlista.positionCaret(zona);

            }
        txtnombre.clear();
    }

    public void jugar(){
        i=0;

        for (int j = 0; j < 5; j++) {
            rnd = new Random().nextInt(nombres.length);
            lugares[i] = rnd;
            i++;
        }

        txt1.setText(nombres[lugares[0]]);
        txt2.setText(nombres[lugares[1]]);
        txt3.setText(nombres[lugares[2]]);
        txt4.setText(nombres[lugares[3]]);
        txt5.setText(nombres[lugares[4]]);

    }
    public void keyagregar(KeyEvent keyEvent){
        if(keyEvent.getCode() == KeyCode.ENTER){
            agregar();
        }
    }



}


