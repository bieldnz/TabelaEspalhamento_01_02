package view;

import controller.TabelaHash;
import model.Morador;

public class Principal {
	public static void main(String[] args) throws Exception{
		
		TabelaHash tblHash = new TabelaHash();
		Morador morador = new Morador();
		Morador morador2 = new Morador();
		
		morador.numApartamento = 402;
		morador.nomeMorador = "Gabriel";
		morador.modelo = "FIAT";
		morador.cor = "Amarelo";
		morador.placa = "000-000";
		
		morador2.numApartamento = 101;
		morador2.nomeMorador = "Gabriel";
		morador2.modelo = "FIAT";
		morador2.cor = "Amarelo";
		morador2.placa = "000-000";
		
		tblHash.insertMorador(morador);
		tblHash.insertMorador(morador2);
		
		Morador morador3 = new Morador();
		morador3.numApartamento = 402;
		
		//tblHash.removeMorador(morador);
		tblHash.buscar(morador3);
		//tblHash.listarApartamentos();
	}
}
