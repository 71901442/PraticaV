public class Cliente extends Conta {


	protected String Nome;
	protected String CPF;
	protected int Idade;
	protected String Endere�o;
	
	

public Cliente (String Agencia, String Numero, String Tipo, String Nome, String CPF, String Endere�o, String Saldo, double ValorEmCont, double ValorSaqu ) {
	super (Agencia, Numero, Tipo, Saldo, ValorEmCont, ValorEmCont, ValorEmCont);



	this.Nome = Nome;
	this.Idade = Idade;	
	this.CPF = CPF;	
	this.Endere�o = Endere�o;	

}





public String getNome() {
	return Nome;
}


public void setNome(String nome) {
	Nome = nome;
}


public String getCPF() {
	return CPF;
}


public void setCPF(String cPF) {
	CPF = cPF;
}


/**
 * @return the idade
 */
public int getIdade() {
	return Idade;
}


/**
 * @param idade the idade to set
 */
public void setIdade(int idade) {
	Idade = idade;
}


/**
 * @return the endere�o
 */
public String getEndere�o() {
	return Endere�o;
}


/**
 * @param endere�o the endere�o to set
 */
public void setEndere�o(String endere�o) {
	Endere�o = endere�o;
}


}