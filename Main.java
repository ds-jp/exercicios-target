/*
1- O valor será 91, está somando o índice de 1 até 13.
2- No código, método fib().
3- a) 9.
b) 128.
c) 49.
d) 100.
e) 13.
f) 200.
5- No código, método inverter().
*/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
        fib();
        inverter();
	}

    // 2- Implementação:
    static void fib() {
        Scanner in = new Scanner(System.in);
        List<Integer> fib = new ArrayList<Integer>();
		int num,
		    a = 0,
		    b = 1,
		    aux,
		    flag = 0;
		
		fib.add(a);
		fib.add(b);
		System.out.println("Exercício 02 - Fibonacci - Digite um número:");
		num = in.nextInt();
		
		while(b < num) {
            aux=a+b;  
            a=b;    
            b=aux;
            fib.add(b);
            if(b == num) flag = 1;
		}
		
		if(flag == 1) {
		    System.out.println("Número pertence a sequência.");
		} else {
		    System.out.println("Número não pertence a sequência."); 
		}
		
		System.out.println(fib);
    }
    
    // 5- Implementação
    static void inverter() {
        Scanner in = new Scanner(System.in);
        System.out.println("Exercício 04 - Inverter String - Digite uma frase:");
        String str = in.nextLine(),
               aux = "";
        int i = 0;

        for (i = (str.length() - 1); i >= 0; i--) {
            aux += str.charAt(i);
        }
        System.out.println(aux);
    }
}