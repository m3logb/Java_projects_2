package curso_java_repeticao;

import java.util.Scanner;

public class exec_while_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int perdaPato = N;
		
		while (N != 0) {
			
			System.out.printf("%d Patinhos foram passear",N); 			
			N -= 1;
			System.out.printf("%nAlém das montanhas %nPara brincar %nA mamãe gritou: Quá, quá, quá, quá Mas só %d patinhos voltaram de lá.%n",N);
		}
		
		System.out.printf("A mamãe patinha foi procurar\r\n"
				+ "Além das montanhas\r\n"
				+ "Na beira do mar\r\n"
				+ "A mamãe gritou: Quá, quá, quá, quá\r\n"
				+ "E os " + perdaPato + " patinhos voltaram de lá.");
		
		sc.close();

	}

}
