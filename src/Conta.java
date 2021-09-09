public class Conta {

	public String Numero;
	public String Agencia;
	public String Tipo;
	public double Saldo;
	public double ValorEmCont;
	public double ValorSaqu;
	
	
	
	public Conta (String Numero, String Agencia, String CPF, String Tipo, double Saldo, double ValorEmCont, double ValorSaqu) {
		this.Numero = Numero;
		this.Agencia = Agencia;	
		this.Tipo = Tipo;
		this.Saldo = Saldo;
		this.ValorEmCont = ValorEmCont; 
		this.ValorSaqu = ValorSaqu;
	}
	
	
		// TODO Auto-generated constructor stub
	

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return Numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		Numero = numero;
	}
	/**
	 * @return the agência
	 */
	public String getAgência() {
		return Agencia;
	}
	/**
	 * @param agência the agência to set
	 */
	public void setAgência(String agencia) {
		Agencia = agencia;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return Tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	/**
	 * @return the agencia
	 */
	public String getAgencia() {
		return Agencia;
	}

	/**
	 * @param agencia the agencia to set
	 */
	public void setAgencia(String agencia) {
		Agencia = agencia;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return Saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	/**
	 * @return the valorEmCont
	 */
	public double getValorEmCont() {
		return ValorEmCont;
	}

	/**
	 * @param valorEmCont the valorEmCont to set
	 */
	public void setValorEmCont(double valorEmCont) {
		ValorEmCont = valorEmCont;
	}

	/**
	 * @return the valorSaqu
	 */
	public double getValorSaqu() {
		return ValorSaqu;
	}

	/**
	 * @param valorSaqu the valorSaqu to set
	 */
	public void setValorSaqu(double valorSaqu) {
		ValorSaqu = valorSaqu;
	}
}