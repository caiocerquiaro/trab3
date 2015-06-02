/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI.Cadastro;

import EscritaArquivo.EscritaArquivoUsuario;
import UI.TelaPrincipal;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;


/**
 * FXML Controller class
 *
 * @author Rafael
 */
public class CadastroUsuarioController implements Initializable {
    
   
    @FXML
    private Button btncad;

    @FXML
    private Button btnvoltar;

    @FXML
    private MenuButton menutipousuario;

    @FXML
    private TextField txtnome;

    @FXML
    private TextField txtrg;

    @FXML
    private TextField txttipo;
    
    @FXML
    private void AcaoBtnVoltar(ActionEvent event) throws IOException, ParseException {
        Parent root = FXMLLoader.load(getClass().getResource("/UI/TelaPrincipal.fxml"));
        TelaPrincipal.SCENE.setRoot(root);
      
    }
    
    @FXML
    private void AcaoCadastrar(ActionEvent event) throws IOException, ParseException {
        Parent root = FXMLLoader.load(getClass().getResource("/UI/TelaPrincipal.fxml"));
        System.out.println("Usuario cadastrado");
        TelaPrincipal.SCENE.setRoot(root);
        EscritaArquivoUsuario escreveusuario = new EscritaArquivoUsuario("Usuarios.csv", txtrg.getText(), txtnome.getText(),"0",txttipo.getText() );
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
