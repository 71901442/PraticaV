public class Cliente extends Conta {


	protected String Nome;
	protected String CPF;
	protected int Idade;
	protected String Endereço;
	
	

public Cliente (String Agencia, String Numero, String Tipo, String Nome, String CPF, String Endereço, String Saldo, double ValorEmCont, double ValorSaqu ) {
	super (Agencia, Numero, Tipo, Saldo, ValorEmCont, ValorEmCont, ValorEmCont);



	this.Nome = Nome;
	this.Idade = Idade;	
	this.CPF = CPF;	
	this.Endereço = Endereço;	

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
 * @return the endereço
 */
public String getEndereço() {
	return Endereço;
}


/**
 * @param endereço the endereço to set
 */
public void setEndereço(String endereço) {
	Endereço = endereço;
}


}