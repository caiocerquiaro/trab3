package biblioteca.relatorios;
import biblioteca.Livro;
import biblioteca.Usuario;
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
public class LivrosRelatorio {
    public List<Livro> livros;
    
    public LivrosRelatorio(String saleFile) throws IOException, ParseException {
        livros = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(saleFile));
            String csv;
            in.readLine(); // Pula a primeira linha (cabeçalho)
            while((csv = in.readLine()) != null) {
                livros.add(new Livro(csv));
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("File " + saleFile + " was not found!");
        }
        catch(IOException e) {
            System.out.println("Error reading the file!");
        }
    
}
}