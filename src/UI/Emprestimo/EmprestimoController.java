/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI.Emprestimo;

import EscritaArquivo.EscritaArquivoEmprestimo;
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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Rafael
 */
public class EmprestimoController implements Initializable {

    @FXML
    private TextField txtidlivro;

    @FXML
    private TextField txtrg;
    
    @FXML
    private TextField txtdata;


    @FXML
    private void EmprestarLivro(ActionEvent event) throws IOException, ParseException {
        Parent root = FXMLLoader.load(getClass().getResource("/UI/TelaPrincipal.fxml"));
        System.out.println("Usuario cadastrado");
        TelaPrincipal.SCENE.setRoot(root);
        EscritaArquivoEmprestimo escreveemprestimo = new EscritaArquivoEmprestimo("Emprestimo.csv", txtidlivro.getText(), txtrg.getText(), txtdata.getText());
      
    }
    

    
    @FXML
    private void AcaoBtnVoltar(ActionEvent event) throws IOException, ParseException {
        Parent root = FXMLLoader.load(getClass().getResource("/UI/TelaPrincipal.fxml"));
        TelaPrincipal.SCENE.setRoot(root);
              
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
