import java.util.Scanner;

public class Fatorial 
{

    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        long R=1;
        long num;
        long num2;
        
        
        System.out.println("Digite um número inteiro: ");
        num = ler.nextInt();
        System.out.println("Digite um outro inteiro: ");
        num2 = ler.nextInt();
        for(num=num; num>0; num = num - 1)
        {
            R = R * num;
                     
        }
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("O Fatorial de "+num2+" é:"+R);  
    }
    
}
