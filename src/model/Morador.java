package model;

import java.util.Objects;

public class Morador {
	public int numApartamento;
	public String nomeMorador;
	public String modelo;
	public String cor;
	public String placa;
	@Override
	public int hashCode() {
		String numApart = numApartamento + "";
		int num = Integer.parseInt(numApart.substring(0,1));
		return num;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Morador other = (Morador) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(modelo, other.modelo)
				&& Objects.equals(nomeMorador, other.nomeMorador) && numApartamento == other.numApartamento
				&& Objects.equals(placa, other.placa);
	}
	
	public String toString() {
		String result = "numApartamento = " + numApartamento + "\nnomeMorador = " + nomeMorador + "\nmodelo = " + modelo + "\ncor = " + cor + "\nplaca = " + placa + "\n\n";
		return result;
	}
	
}
