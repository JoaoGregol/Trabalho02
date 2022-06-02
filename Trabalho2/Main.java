import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String original = "(1ª andar) = Subir";



    original += System.lineSeparator() + "(2ª andar) = Descer";


    System.out.println(original);


    int direcao = scan.nextInt();

    System.out.println("Capacidade máxima no elevador: ");


    int limite = scan.nextInt();

    System.out.println("Andar mais alto: ");

    
    int andares_max = scan.nextInt();

    System.out.println("Andar mais baixo: ");
    int andares_min = scan.nextInt();

    Predio Predio = new Predio(direcao, limite);

    int andares = 0;

    if (direcao == 1) {
      System.out.print("O elevador está no térreo.");
      System.out.print(System.lineSeparator());
      if (andares == andares_max) {
        System.out.print("O elevador chegou ao seu destino.");
      }
      while (andares < andares_max) {
        System.out.print("O elevador está no " + info.mudar() + "º andar | capacidade máxima está em: " + limite);
        System.out.print(System.lineSeparator());
        andares = andares + 1;
      }
    }
    if (direcao == 2) {
      while (andares > andares_min) {
        System.out.print("O elevador está no " + info.mudar() + "º andar | capacidade máxima está em : " + limite);
        System.out.print(System.lineSeparator());
        andares = andares - 1;
      }
    }
    System.out.print("O elevador chegou ao seu destino.");
  }
}