/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import biblioteca.relatorios.EmprestimosRelatorio;
import biblioteca.relatorios.LivrosRelatorio;
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

/**
 * FXML Controller class
 *
 * @author Rafael
 */
public class TelaPrincipalController implements Initializable {

    @FXML
    private Button btncadusuario;

    @FXML
    private Button btnregistraemprestimo;

    @FXML
    private void AcaoBtnCadastrarUsuario(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/UI/Cadastro/CadastroUsuario.fxml"));
        TelaPrincipal.SCENE.setRoot(root);

    }

    @FXML
    private void RegistraEmprestimo(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/UI/Emprestimo/Emprestimo.fxml"));
        TelaPrincipal.SCENE.setRoot(root);

    }

    @FXML
    private void AcaoBtnRegistraLivro(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/UI/Livro/Livro.fxml"));
        TelaPrincipal.SCENE.setRoot(root);

    }

    @FXML
    private void listadados(ActionEvent event) throws IOException, ParseException {
        //Mostra todos os alunos que estao no arquivo de Aluno.csv
        System.out.println("---------- Livros cadastrados ----------");
        LivrosRelatorio lr = new LivrosRelatorio("Livros.csv");
        lr.livros.stream().forEach(i -> System.out.println((i.getNome())));
        System.out.println("---------- Emprestimos realizados ----------");
        EmprestimosRelatorio er = new EmprestimosRelatorio("Emprestimo.csv");
        er.emprestimo.stream().forEach(i -> System.out.println("O livro de id " + i.getidLivro() + " esta emprestado para o usuario que possui este rg " + i.getrg()));

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
