import java.util.Scanner;

public class CalculandoNota {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);          //Escaneia o que for digitado no teclado.
            System.out.print("Digite o nome do aluno: ");  //Declarando a variavel nome.
            String nome = teclado.nextLine();
        Scanner teclado2 = new Scanner(System.in);                  //Escaneia o que for digitado no teclado.
            System.out.print("Digite a primeira nota do aluno: "); //Declarando a variavel nota1.
            float nota1 = teclado2.nextFloat();
        Scanner teclado3 = new Scanner(System.in);                  //Escaneia o que for digitado no teclado.
            System.out.print("Digite a segunda nota do aluno: ");   //Declarando a variavel nota2.
            float nota2 = teclado3.nextFloat();
            float resultado = (nota1 + nota2) / 2;       //Vai receber o resultado das 2 variaveis e dividir por 2.
            if (resultado >=6){
                System.out.printf("O aluno %s está APROVADO!\n",nome );
            }
            else {
                System.out.printf("O aluno %s está REPROVADO!\n", nome );
            }
    }
}
