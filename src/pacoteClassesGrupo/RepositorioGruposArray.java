package pacoteClassesGrupo;

import pacoteClassesProduto.Produto;
import pacoteExcecoes.GJCException;
import pacoteExcecoes.GNEException;
import pacoteExcecoes.PJCException;
import pacoteExcecoes.SMPCException;

/**
 * "classe colecao de dados lista" classe que contem um lista de grupos e
 * metodos da interface implementada
 * 
 * @author Gabriel
 *
 */
public class RepositorioGruposArray implements RepositorioGrupos {
	private Grupo[] grupos;
	private int indice = 0;

	public RepositorioGruposArray() {
		grupos = new Grupo[100];
	}

	@Override
	public void inserir(Grupo grupo) throws GJCException {
		if (!this.existe(grupo.getNomeGrupo())) {
			this.grupos[this.indice] = grupo;
			this.indice++;
		} else {
			throw new GJCException();
		}
	}

	@Override
	public void atualizar(Grupo grupo, String categoriaGrupo) throws GNEException {
		int proc = this.procurar(grupo.getNomeGrupo());
		this.grupos[proc].setCategoria(categoriaGrupo);

	}

	@Override
	public void remover(Grupo grupo) throws GNEException{
		if (this.existe(grupo.getNomeGrupo())) {
			int proc = this.procurar(grupo.getNomeGrupo());
			for (int i = proc; i <= indice - 1; i++) {
				this.grupos[i] = this.grupos[i + 1];
			}
			this.indice--;
		} else {
			throw new GNEException();
		}

	}

	public int procurar(String nomeg) throws GNEException {
		for (int i = 0; i < 100; i++) {
			if (this.grupos[i] != null && this.grupos[i].getNomeGrupo().equals(nomeg)) {
				return i;
			}

		}
		throw new GNEException();
	}

	// Isso e tipo um getGrupo
	public Grupo procurarInt(int grupo) {
		return this.grupos[grupo];
	}

	@Override
	public boolean existe(String grupo) {
		for (int i = 0; i < 100; i++) {
			if (this.grupos[i] != null && this.grupos[i].getNomeGrupo().equals(grupo)) {
				return true;
			}
		}
		return false;
	}
}
