

	
	import java.util.ArrayList;
	import java.util.Scanner;

	public class InternetBanking {
		
		private Cliente Cliente;
		
		static ArrayList<Cliente> ListadeClientes = new ArrayList<Cliente>(); 
		Cliente cliente = new Cliente (null, null, null, null, null, null, null, 0, 0);
			
		
		/**
		 * @return the cliente
		 */
		public Cliente getCliente() {
			return Cliente;
		}

		/**
		 * @param cliente the cliente to set
		 */
		public void setCliente(Cliente cliente) {
			Cliente = cliente;
		}

		public static void menu(){
	    	System.out.println("\\======================================//");
	        System.out.println("GESTÃO DE RECURSOS BANCO KING");
	        System.out.println("\\======================================//");
	        System.out.println("1.| Gerenciar CLIENTES|");
	        System.out.println("2.| Gerenciar CONTAS|");        
	        System.out.println("3.| SAIR|");
	        System.out.println("\\======================================//");
	        System.out.println("ESCOLHA A OPÇÃO DESEJADA:");
	        System.out.println("\\======================================//");
	    }

	    public static void GERENCIAR_CLIENTES(){
	    	
	    	System.out.println("\\======================================//");
	    	System.out.println("1.| Cadastrar CLIENTE |");
	        System.out.println("2.| Consultar CLIENTE |");
	        System.out.println("3.| Remover CLIENTE   |");
	        System.out.println("4.| Atualizar CLIENTE |");
	        System.out.println("5.| Voltar ao MENU INICIAL|");
	        System.out.println("\\======================================//");
	    }
	    
	    public static void GERENCIAR_CONTAS(){
	    	
	    	System.out.println("\\======================================//");
	    	System.out.println("1.| Criar CONTA PARA CLIENTE |");
	        System.out.println("2.| Sacar DINHEIRO CONTA CLIENTE |");
	        System.out.println("3.| Depositar DINHEIRO CONTA CLIENTE |");
	        System.out.println("4.| Verificar SALDO CONTA CLIENTE |");
	        System.out.println("5.| Transferir DINHEIRO CONTA CLIENTE |");
	        System.out.println("6.| Voltar ao MENU INICIAL|");
	        System.out.println("\\======================================//");
	    }
	    
	    public static void main(String[] args) {
	        int opcao;
	        int opcao1;      
	                
	        Scanner entrada = new Scanner(System.in);
	        Scanner entrada1 = new Scanner(System.in);
	        do{
	            menu();
	            opcao = entrada.nextInt();
	            
	            if (opcao == 1){
	                        	
	            	do{
	            		GERENCIAR_CLIENTES();
	                    opcao1 = entrada.nextInt();
	                    
	                    if (opcao1 == 1){
	                    	Cadastrar_CLIENTE();  
	                    	
	                    }
	                        
	                    if (opcao1 == 2){
	                    	Consultar_CLIENTE();
	                    	break;
	                    }
	                        
	                    if (opcao1 == 3){
	                    	Remover_CLIENTE();
	                    }
	                    
	                    if (opcao1 == 4){
	                    	Atualizar_CLIENTE();
	                    }                  
	                                  
	                   
	                } while(opcao1 != 5);
	            }
	              
	                  
	              if (opcao == 2){                       	
	            	do{
	            		GERENCIAR_CONTAS();
	                    opcao1 = entrada.nextInt();
	                    
	                    if (opcao1 == 1){
	                    	Criar_CONTACLIENTE();            	
	                    	
	                    }
	                        
	                     if (opcao1 == 2){
	                    	Sacardinheiro_CONTACLIENTE();
	                     }
	                        
	                     if (opcao1 == 3){
	                    	Depositardinheiro_CONTACLIENTE();
	                        
	                     }
	                        
	                     if (opcao1 == 4){
	                    	Verificarsaldo_CONTACLIENTE();
	                       
	                     }
	                     
	                     if (opcao1 == 5){
	                     	Transferirdinheiro_CONTACLIENTE();
	                        
	                     }                        
	                                        
	                } while(opcao1 != 6);
	              }                                          
	            	           	
	                
	        } while(opcao != 3);
	        System.out.println("O PROGRAMA FOI FINALIZADO COM SUCESSO!");             
	             
	    } 
	    
	    public static void Cadastrar_CLIENTE() {	
		
	    	String comp;	
	    	int contaclien;		
	    	Scanner t;          
	        t = new Scanner(System.in); 
	        
	    	System.out.println("OLÁ! VOCÊ DESEJA CADASTRAR QUANTOS ALUNOS? ");
	    	contaclien = t.nextInt();  	
	    		
	    	    Scanner s;          
	            s = new Scanner(System.in);   
	            for(int i=0; i < contaclien; i++) {       	
	            
	            	Cliente cliente = new Cliente (null, null, null, null, null, null, null, 0, 0);
	        		
	            System.out.println("\nDIGITE O NOME COMPLETO DO ALUNO:");   
	            cliente.Nome = s.next();   
	            
	            
	            boolean achou = false;
	            
	            for(int j=0; j < ListadeClientes.size(); j++){
	            	
	              
	    	        Cliente a = ListadeClientes.get(j);
	    	        
	    	
	    	        if(a.getNome().equals(cliente.Nome))
	    	        	
	             {                
	             achou = true;
	             } 
	    	               
	    	        		       		        
	      
	           
	      if(achou) {
	    	 

	     	 System.out.println("O CLIENTE " + cliente.Nome + " JÁ SE ENCONTRA REGISTRADO NO BANCO DE DADOS" );
	          
	      }
	      
	      else
	      {
	     	 System.out.println("O CLIENTE " + cliente.Nome + " NÃO FOI ENCONTRADO NO BANCO DE DADOS DA FACULDADE E SERÁ CADASTRADO!" );
	      
	      }
	            
	            }
	            System.out.println("\nDIGITE A IDADE DO CLIENTE:");
	            cliente.Idade = s.nextInt();
	            System.out.println("\nDIGITE O CPF DO CLIENTE:");
	            cliente.CPF = s.next();
	            System.out.println("\nDIGITE O ENDEREÇO COMPLETO DO CLIENTE:");
	            cliente.Endereço = s.nextLine();
	            
	         
	            ListadeClientes.add(cliente);                 
	             
	            }                
	            }
	    public static void Consultar_CLIENTE () {
	    	
	    	int opcao3;
	    	
	    	Scanner r;          
	        r = new Scanner(System.in); 
	    	
	    	 do{
	    		 System.out.println("SE VOCÊ DESEJA CONSULTAR UM CLIENTE ESPECÍFICO APERTE 1. SE VOCÊ DESEJA VISUALIZAR A LISTA COMPLETA APERTE 0 OU SE DESEJAR SAIR APERTE -1");
	             opcao3 = r.nextInt();
	             
	             if (opcao3 == 1)  {         
	            	  String achaclien;
	    	           Scanner s;          
	                   s = new Scanner(System.in); 
	                   System.out.println("DIGITE O NOME DO CLIENTE QUE DESEJA COLSULTAR: ");
	                   achaclien = s.next(); 
	    	           
	    		
	    	           boolean achou = false;
	    	           
	    	           for(int i=0; i < ListadeClientes.size(); i++) {
	              
	    		        Cliente c = ListadeClientes.get(i);
	    		        
	    		
	    		        if(c.getNome().equals(achaclien))
	    		        	
	    	            {                
	                    achou = true;
	                    } 
	    		               
	    		        		       		        
	             }
	                  
	             if(achou) {
	            	 System.out.println("O CLIENTE " + achaclien + " FOI ENCONTRADO NO BANCO DE DADOS DO BANCO!" );
	                 
	             }
	             
	             else
	             {
	            	 System.out.println("O CLIENTE " + achaclien + " NÃO FOI ENCONTRADO NO BANCO DE DADOS DO BANCO!" );
	             
	             }
	             }
	             
	             
	             if (opcao3 == 0){ 
	            	 
	            	 for(int i=0; i < ListadeClientes.size(); i++) {
	            	    	Cliente cliente = new Cliente (null, null, null, null, null, null, null, 0, 0);
	            	        
	            	    	Cliente w = ListadeClientes.get(i);
	            		 	
	            	    	System.out.println(" O CLIENTE DE NOME " + ListadeClientes.get(i).getNome() + " PORTADOR DE CPF " + ListadeClientes.get(i).getCPF() + " POSSUI CONTA NO BANCO KINGS ");
	            	    	
	            	 }
	             }
	             }while (opcao3 != -1);
	    	 }
	    
	    		


	    public static void Remover_CLIENTE() {
	    	
	    	
	    	
	    	for(int i=0; i < ListadeClientes.size(); i++) {
	    	Cliente cliente = new Cliente (null, null, null, null, null, null, null, 0, 0); 
	    	System.out.println(" DIGITE O NOME DO CLIENTE A SER REMOVIDO: ");
	        
	    	 
	        Scanner s;          
	        s = new Scanner(System.in);    
	        cliente.setNome(s.next());        
	        
	        
	        if(cliente.Nome == ListadeClientes.get(i).getNome())       
	        
	         {                    	
	        	System.out.println("O CLIENTE DE NOME " + ListadeClientes.remove(i).getNome() + " FOI REMOVIDO DO CADASTRO ");
	        	
	         }
	        
	        else
	        	System.out.println("NÃO ENCONTROU O REGISTRO");
	        	    	
	    	}
	    }
	    
	    public static void Atualizar_CLIENTE() {
	    	String achaclient;
	    	Scanner s;          
	        s = new Scanner(System.in); 
	        System.out.println("DIGITE O NOME DO CLIENTE QUE DESEJA ATUALIZAR: ");
	    		
	    	achaclient = s.next();     
	    	
	        boolean achou = false;
	        
	        
	        for(int i=0; i < ListadeClientes.size(); i++) {
	        	
	         Cliente a = ListadeClientes.get(i);
	         
	         
	         if(a.getNome().equals(achaclient))
	         	
	         {      	                        
	                     	   	   	 	   
	    	 System.out.println("O CLIENTE " + achaclient + " FOI ENCONTRADO NO BANCO DE DADOS DA FACULDADE E SERÁ ATUALIZADO CONFORME OPÇÕES!" );
	    	 int opcao4;
	    	 Scanner r;          
	         r = new Scanner(System.in); 
	    		 do{
	    		 System.out.println("SE VOCÊ DESEJA ATUALIZAR A INFORMAÇÃO DE CPF APERTE 1. SE VOCÊ DESEJA ATUALIZAR A INFORMAÇÃO DE IDADE DO CLIENTE APERTE 2. SE VOCÊ DESEJA ATUALIZAR A INFORMAÇÃO DE ENDEREÇO DO CLIENTE APERTE 3. PARA VOLTAR AO MENU APERTE -1");
	             opcao4 = r.nextInt();
	             
	             if (opcao4 == 1)  {         
	            	  
	            	   Scanner y;          
	                   y = new Scanner(System.in); 
	                   System.out.println("DIGITE O NOVO VALOR DE CPF DO CLIENTE: ");
	    	           a.CPF = y.next(); 
	    	           
	    		       ListadeClientes.add(a);
	    		       System.out.println("O NOVO VALOR DE CPF DO CLIENTE É " + achaclient + " É: " + a.CPF);
	             }
	    	           
	             
	             
	             if (opcao4 == 2){ 
	            	 
	            	 
	    	           Scanner x;          
	                 x = new Scanner(System.in); 
	                 System.out.println("DIGITE O NOVO VALOR DE IDADE DO CLIENTE: ");
	    	           a.Idade = x.nextInt(); 
	    	           
	    	           ListadeClientes.add(a);
	    		       System.out.println("O NOVO VALOR DE IDADE DO CLIENTE " + achaclient + " É: " + a.Idade);
	             }
	             
	             
	             if (opcao4 == 3){ 
	            	 
	            	 
	    	           Scanner w;          
	                 w = new Scanner(System.in); 
	                 System.out.println("DIGITE O NOVO ENDEREÇO DO CLIENTE: ");
	    	           a.Endereço = w.next(); 
	    	           
	    	           ListadeClientes.add(a);
	    		       System.out.println("O NOVO ENDEREÇO DO CLIENTE " + achaclient + " É: " + a.Endereço);
	             }	
	             
	             if(opcao4 == -1) {
	            	 break;
	             }
	                           	 
	           }while(opcao4 != -1); 
	         } 
	    		 else
	             {
	             	 System.out.println("O ALUNO " + achaclient + " NÃO FOI ENCONTRADO NO BANCO DE DADOS DA FACULDADE!" );
	             
	             }
	        }
	        }
	    	  	           
	   

	    public static void Criar_CONTACLIENTE() {
	    	
	    	String comp;	
	    	
	    	
	        
	    	System.out.println("OLÁ! DIGITE O NOME DO CLIENTE A SER CADASTRADO: ");
	    	
	    	    Scanner s;          
	            s = new Scanner(System.in);   
	            for(int i=0; i < ListadeClientes.size(); i++) {       	
	            
	            	Cliente cliente = new Cliente (null, null, null, null, null, null, null, 0, 0);
	        		
	            System.out.println("\nDIGITE O NOME COMPLETO DO ALUNO:");   
	            cliente.Nome = s.next();   
	            
	            
	            boolean achou = false;
	            
	            for(int j=0; j < ListadeClientes.size(); j++){
	            	
	              
	    	        Cliente a = ListadeClientes.get(j);
	    	        
	    	
	    	        if(a.getNome().equals(cliente.Nome))
	    	        	
	             {                
	             achou = true;
	             } 
	    	               
	    	        		       		        
	      
	           
	      if(achou) {
	    	 

	     	 System.out.println("O CLIENTE " + cliente.Nome + " JÁ SE ENCONTRA REGISTRADO NO BANCO DE DADOS" );
	          
	      }
	      
	      else
	      {
	     	 System.out.println("O CLIENTE " + cliente.Nome + " NÃO FOI ENCONTRADO NO BANCO DE DADOS DA FACULDADE E SERÁ CADASTRADO!" );
	      
	      }
	            
	            }
	            System.out.println("\nDIGITE A AGENCIA DO CLIENTE:");
	            cliente.Agencia = s.next();
	            System.out.println("\nDIGITE O CPF DO CLIENTE:");
	            cliente.CPF = s.next();
	            System.out.println("\nDIGITE O NUMERO DA CONTA GERADO PARA O CLIENTE:");
	            cliente.Numero = s.next();
	            System.out.println("\nDIGITE O VALOR QUE FOI DEPOSITADO NA CONTA DO CLIENTE:");
	            cliente.ValorEmCont = s.nextDouble();
	            
	         
	            ListadeClientes.add(cliente);                 
	             
	            }                
	            }   
	               
	    public static void Sacardinheiro_CONTACLIENTE() {
	    	
	    	for(int j=0; j < ListadeClientes.size(); j++){
	        	
	            
		        Cliente a = ListadeClientes.get(j);
	    		if (a.ValorEmCont > a.Saldo) {
	    			System.out.println("ATENÇÃO! SEU SALDO É INSUFICIENTE");
	    		}
	    		else {
	    			a.Saldo = a.Saldo - a.ValorSaqu;
	    			System.out.println("SEU NOVO SALDO É: " + a.Saldo);
	    		
	    		}
	    	}
	    }
	    public static void Depositardinheiro_CONTACLIENTE() {

	        double Valordeposito;
	    	for(int j=0; j < ListadeClientes.size(); j++){
	        	
	    		Scanner a;          
	            a = new Scanner(System.in);  
	    		 System.out.println("DIGITE O VALOR A SER DEPOSITADO NA CONTA DO CLIENTE: ");
		           Valordeposito = a.nextDouble(); 
	            
		        Cliente c = ListadeClientes.get(j);
		        
		        Scanner s;          
	            s = new Scanner(System.in);  
	    	
	    	if (Valordeposito <= 0) {
	    		System.out.println("ATENÇÃO! NÃO É POSSÍVEL REALIZAR DEPÓSITO NEGATIVO OU NULO ");
	    	}
	    	else {
	    		c.Saldo = c.Saldo + Valordeposito;
	    		System.out.println("SEU NOVO SALDO É: " + c.Saldo);
	    	}
	    	}
	    }

	    public static void Verificarsaldo_CONTACLIENTE()  {
	    	
	    String achaclien;
	    Scanner s;          
	    s = new Scanner(System.in); 
	    System.out.println("DIGITE O NOME DO CLIENTE QUE DESEJA COLSULTAR O SALDO: ");
	    achaclien = s.next(); 
	    

	    boolean achou = false;
	    
	    for(int i=0; i < ListadeClientes.size(); i++) {

	     Cliente c = ListadeClientes.get(i);
	     

	     if(c.getNome().equals(achaclien))
	     	
	     {                
	     achou = true;
	     } 
	            
	     		       		        
	}
	   
	if(achou) {
		
		for(int i=0; i < ListadeClientes.size(); i++)
		
		System.out.println("O CLIENTE " + achaclien + " PORTADOR DO CPF " + ListadeClientes.get(i).getCPF() + "FOI ENCONTRADO NO BANCO DE DADOS DO BANCO E POSSUI SALDO NO VALOR DE: " + ListadeClientes.get(i).getSaldo());	 
	  
	}

	     

	else
	{
		 System.out.println("O CLIENTE " + achaclien + " NÃO FOI ENCONTRADO NO BANCO DE DADOS DO BANCO!" );
	     
	}
	    }


	    public static void Transferirdinheiro_CONTACLIENTE() {
	    	
	    	double ValorTransferencia;
	    	for(int j=0; j < ListadeClientes.size(); j++){
	        	
	    		Scanner a;          
	            a = new Scanner(System.in);  
	    		 System.out.println("DIGITE O VALOR A SER DEPOSITADO NA CONTA DO CLIENTE: ");
		           ValorTransferencia = a.nextDouble(); 
	            
		        Cliente c = ListadeClientes.get(j);
		        
		        Scanner s;          
	            s = new Scanner(System.in);  
	    	
	    	if (ValorTransferencia <= 0) {
	    		System.out.println("ATENÇÃO! NÃO É POSSÍVEL REALIZAR DEPÓSITO NEGATIVO OU NULO ");
	    	}
	    	else {
	    		c.Saldo = c.Saldo + ValorTransferencia;
	    		System.out.println("SEU NOVO SALDO É: " + c.Saldo);
	    	}
	    	             	
	    	    	
	    	if (ValorTransferencia > c.Saldo) {
	    		System.out.println("ATENÇÃO! SEU SALDO É INSUFICIENTE");
	    	}
	    	else {
	    		
	    		c.Saldo = c.Saldo + ValorTransferencia;
	    		System.out.println("O VALOR DE R$: " + ValorTransferencia + " FOI TRANSFERIDO POR " + c.getNome());
	    		
	    	}
	    	
	    }
	    }
	}

}
