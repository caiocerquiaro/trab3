package biblioteca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Rafael
 */
public class Livro {
    private String id_livro;
    private String nome;
    private String status;
    private String tipo_livro;
    
    public Livro(String csv) throws ParseException{
        String[] values = csv.split(",");

        id_livro = (values[0]);
        nome = values[1];
        status = values[2];
        tipo_livro = (values[3]);
    
    }
    
    public String getNome() {
		return nome;
	}
    
}
