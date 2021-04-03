import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner imprimir = new Scanner(System.in);
    System.out.print("Informe n: ");
    int n = imprimir.nextInt();
    
    if (n > 0){
     int impar = 1;
     for(int i = 0; i < n; i++){
      System.out.print(impar + " ");
      impar = impar + 2;
      }

    }
}
}