

package biblioteca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Rafael
 */
public class Emprestimo {
    private String id_livro;
    private String rg;
    private Date data_devolucao;
    
    public Emprestimo(String csv) throws ParseException{
     String[] values = csv.split(",");
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

        id_livro = values[0];
        rg = values[1];
        data_devolucao = (Date)formatador.parse(values[2]);
 
    }
    
    public String getidLivro(){
        return id_livro;
    }
    
    public String getrg(){
        return rg;
    }
    
}
