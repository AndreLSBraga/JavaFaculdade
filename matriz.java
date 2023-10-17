import java.util.Scanner;

public class matriz{ //Declaração da classe
  
  public static void main(String[] args) { //Método main
    Scanner entrada = new Scanner(System.in);
    int valor;
    String quadra = "";
    while(true){
      System.out.println("Digite o tamanho da quadra a ser desenhada?");
      valor = entrada.nextInt();  
  
      for(int i = 0; i < valor; i++){
        quadra = "";
        for(int x = 0; x < valor; x++){
          quadra += "*";
        }
        System.out.println(quadra);
      }
    }  
  }
}