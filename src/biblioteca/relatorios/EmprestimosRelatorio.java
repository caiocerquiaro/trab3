package biblioteca.relatorios;

import biblioteca.Emprestimo;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class EmprestimosRelatorio {

    public List<Emprestimo> emprestimo;

    public EmprestimosRelatorio(String saleFile) throws IOException, ParseException {
        emprestimo = new ArrayList<Emprestimo>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(saleFile));
            String csv;
            in.readLine(); // Pula a primeira linha (cabeçalho)
            while ((csv = in.readLine()) != null) {
                emprestimo.add(new Emprestimo(csv));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File " + saleFile + " was not found!");
        } catch (IOException e) {
            System.out.println("Error reading the file!");
        }

    }
}
