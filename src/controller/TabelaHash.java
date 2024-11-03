package controller;

import ControllerLista.Lista;
import model.Morador;

public class TabelaHash {

	Lista[] moradores;

	public TabelaHash() {
		moradores = new Lista[10];
		inicializaTabela();
	}

	private void inicializaTabela() {
		for (int i = 0; i < 10; i++) {
			moradores[i] = new Lista();
		}
	}

	public void insertMorador(Morador morador) {
		int posicao = morador.hashCode();
		moradores[posicao - 1].addFirst(morador);
	}

	public void removeMorador(Morador morador) throws Exception {
		int posicao = morador.hashCode();
		int tamanho = moradores[posicao - 1].size();

		for (int i = 0; i < tamanho; i++) {
			Morador m = (Morador) moradores[posicao - 1].get(i);
			if (morador.numApartamento == m.numApartamento) {
				moradores[posicao - 1].remove(i);
				break;
			}
		}
	}

	public void listarApartamentos() throws Exception {
		int tamanho = moradores.length;
		for (int i = 0; i < tamanho; i++) {
			int tamanhoLista = moradores[i].size();
			for (int j = 0; j < tamanhoLista; j++) {
				Morador morador = (Morador) moradores[i].get(j);
				System.out.println(morador.toString());
			}
		}
	}

	public Morador buscar(Morador morador) throws Exception {
		int posicao = morador.hashCode() - 1;
		int tamanhoLista = moradores[posicao].size();

		for (int j = 0; j < tamanhoLista; j++) {
			Morador m = (Morador) moradores[posicao].get(j);
			if (m.numApartamento == morador.numApartamento) {
				System.out.println(m.toString());
				return m;
			}
		}

		return null;
	}

}
