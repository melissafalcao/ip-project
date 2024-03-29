package pacoteClassesUsuario;

import pacoteExcecoes.EIException;
import pacoteExcecoes.SMPCException;
import pacoteExcecoes.UJCException;
import pacoteExcecoes.UNCException;

public class NegocioUsuario {

	RepositorioUsuarios usuarios;

	public NegocioUsuario(int a)throws EIException {
		if (a == 1) {
			usuarios = new RepositorioUsuariosArray();
		} else if (a == 2) {
			usuarios = new RepositorioUsuariosLista();
		}else {
			throw new EIException();
		}
	}

	public void inserir(Usuario usuario) throws UJCException, SMPCException {
		this.usuarios.inserir(usuario);
	}

	public void remover(String nomeUsuario) throws UNCException {
		this.usuarios.remover(nomeUsuario);
	}

	public void atualizar(Usuario novoUsuario) throws UNCException {
		this.usuarios.atualizar(novoUsuario);
	}
	public boolean existe(String usuario2) {
		return this.usuarios.existe(usuario2);
	}
	public Usuario procurarUsuario(String nomeUsuario) throws UNCException {
		return this.usuarios.procurarUsuario(nomeUsuario);
	}
}
