public class Cliente extends Conta {


	protected String Nome;
	protected String CPF;
	protected int Idade;
	protected String Enderešo;
	
	

public Cliente (String Agencia, String Numero, String Tipo, String Nome, String CPF, String Enderešo, String Saldo, double ValorEmCont, double ValorSaqu ) {
	super (Agencia, Numero, Tipo, Saldo, ValorEmCont, ValorEmCont, ValorEmCont);



	this.Nome = Nome;
	this.Idade = Idade;	
	this.CPF = CPF;	
	this.Enderešo = Enderešo;	

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
 * @return the enderešo
 */
public String getEnderešo() {
	return Enderešo;
}


/**
 * @param enderešo the enderešo to set
 */
public void setEnderešo(String enderešo) {
	Enderešo = enderešo;
}


}