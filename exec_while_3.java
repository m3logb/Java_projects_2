package curso_java_repeticao;

import java.util.Scanner;

public class exec_while_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Escolha qual produto você prefere: %n1.Alcool %n2.Gasolina %n3.Diesel %n4.Fim%n");
		
		int clienteNum = sc.nextInt();
		
		int alcoolCliente = 0;
		int gasolinaCliente = 0;
		int dieselCliente = 0;
		
		while (clienteNum != 4) {
			if (clienteNum == 1) {
				alcoolCliente +=1;
				System.out.println("Você Escolheu Alcool");
				
			}
			else if (clienteNum == 2) {
				System.out.println("Você Escolheu Gasolina");
				gasolinaCliente +=1;
			}
			else if (clienteNum == 3) {
				System.out.println("Você Escolheu Diesel");
				dieselCliente +=1;
				
			  }
				clienteNum = sc.nextInt();
			}
				
				
			System.out.println("Muito Obrigado!");
				System.out.printf("Alcool:%d %nGasolina:%d %nDiesel:%d",alcoolCliente,gasolinaCliente,dieselCliente);
			clienteNum = sc.nextInt();
				sc.close();
		
	
		
		
		

	}

}

//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//exemplo
