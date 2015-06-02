package biblioteca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Rafael
 */
public class Usuario {

    private String rg;
    private String nome;
    private String quantidade_livros_disponiveis;
    private String tipo_usuario;

    public Usuario(String csv) throws ParseException {

        String[] values = csv.split(",");
        rg = values[0];
        nome = values[1];
        quantidade_livros_disponiveis = values[2];
        tipo_usuario = values[3];

    }
    
    public String getNome() {
		return nome;
	}
    public String getRg() {
		return rg;
	}
    public String getTipousuario() {
		return tipo_usuario;
	}

}
