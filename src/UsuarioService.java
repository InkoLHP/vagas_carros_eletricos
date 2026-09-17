import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class UsuarioService {
	
	private List<Usuario> usuario = new ArrayList<>();

	public Usuario cadastrarUsuario(String nome, String nomeSocial, String email, String cpf, LocalDate dataNacimento){
	    Usuario usuario = new Usuario();

	    usuario.setNome(nome); 
	    usuario.setNomeSocial(nomeSocial); 
	    usuario.setEmail(email);
	    usuario.setCpf(cpf); 
	    usuario.setDataDeNascimento(dataNacimento); 

	    return usuario;
	  }

	  public Usuario alterarNomeSocial(Usuario usuario, String novoNomeSocial){
	    usuario.setNomeSocial(novoNomeSocial);

	    return usuario; 
	  }

	  public Usuario alterarEmail(Usuario usuario, String novoEmail){
	    usuario.setEmail(novoEmail);

	    return usuario; 
	  }

	  public Usuario buscarUsuario(){
	    return null; 
	  }

	  public Usuario excluirUsuario(){
	    return null ;
	  }


}