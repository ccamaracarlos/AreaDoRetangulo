package aulas;
import java.util.Scanner;

public class Aula_11 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double base, altura, areaRetangulo;
        System.out.println("Informe o valor da Base: ");
        base = input.nextDouble();
        System.out.println("Agora informe o valor da Altura: ");
        altura = input.nextDouble();
        areaRetangulo = base * altura;
        System.out.println("Com o valor informado pelo usuário consigo Calcular");
        System.out.println("A área de um retangulo de base =" + base);
        System.out.println("e altura = " + altura);
        System.out.println(" é: "+ areaRetangulo);

    }
}
