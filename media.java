/* Variáveis em java
 *  int = numeros inteiros
 *  boolean = true or false
 *  String = texto
 *  char = guarda uma unica letra
 *  float = armazena numeros decimais
 *  double = armazena numeros decimais tem maior precisão, armazena numeros grandes, astronimicos.
 * 
 */




 //importação necessária para utilizar Scanner
import java.util.Scanner; //para que eu possa trabalhar entrada de dados pelo teclado

public class media {

    public static void main(String[] args) {
        //sc é o nome do meu Scanner, o restante é padrão
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Digite a primeira nota:");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2 = sc.nextDouble();

        media = (nota1+nota2)/2;

        System.out.println("a média do aluno é: " +media);

     sc.close();   
    }    
}
