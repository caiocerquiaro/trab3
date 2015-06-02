/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI.Livro;

import EscritaArquivo.EscritaArquivoEmprestimo;
import EscritaArquivo.EscritaArquivoLivro;
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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Rafael
 */
public class LivroController implements Initializable {

     @FXML
    private TextField txtidlivro;

    @FXML
    private TextField txtnome;

    @FXML
    private TextField txttipo;
    
    @FXML
    private Button btnvoltar;

    @FXML
    private void AcaoBtnVoltar(ActionEvent event) throws IOException, ParseException {
        Parent root = FXMLLoader.load(getClass().getResource("/UI/TelaPrincipal.fxml"));
        TelaPrincipal.SCENE.setRoot(root);
      
    }

    @FXML
    private void CadastrarLivro(ActionEvent event) throws IOException, ParseException {
        Parent root = FXMLLoader.load(getClass().getResource("/UI/TelaPrincipal.fxml"));
        System.out.println("Livro cadastrado");
        TelaPrincipal.SCENE.setRoot(root);
        EscritaArquivoLivro escrevelivro = new EscritaArquivoLivro("Livros.csv", txtidlivro.getText(),txtnome.getText() , "true", txttipo.getText());
      
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
