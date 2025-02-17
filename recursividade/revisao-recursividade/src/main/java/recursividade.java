import java.util.Scanner;

public class recursividade {

  //a
  public static int somarPares(int[] num, int index) {
    if (index < 0) return 0;

    int soma = (num[index] % 2 == 0) ? num[index] : 0;

    return soma + somarPares(num, index - 1);
  }

  public static double somarDouble(double[] num, int index) {
    if (index < 0) return 0;

    double soma = num[index];

    return soma + somarDouble(num, index - 1);
  }

  public static int contarNums(int[] num, int index, int numReps) {
    if (index < 0) return 0;
    return (num[index] == numReps ? 1 : 0) + contarNums(num, index - 1, numReps);
  }

  public static int contarReps(int[] num, int index, int numReps) {
    int total = contarNums(num, index, numReps);
    return total > 1 ? total - 1 : 0;
  }


  public static void main(String[] args) {
    int value;
    System.out.println("Escolha uma opção: 1 - Somar números pares");
    System.out.println("Escolha uma opção: 2 - Somar números double");
    System.out.println("Escolha uma opção: 3 - Contar números repetidos");
    Scanner scOption = new Scanner(System.in);
    value = scOption.nextInt();


    switch (value) {
      case 1:
        System.out.println("Opção escolhida somar números pares");

        Scanner tamScan = new Scanner(System.in);
        int tamInt;

        System.out.println("Escolha a quantidade de números");
        tamInt = tamScan.nextInt();
        int[] num = new int[tamInt];

        System.out.println("Agora escolha os números");
        Scanner numScan = new Scanner(System.in);
        for (int i = 0; i < tamInt; i++) {
          num[i] = numScan.nextInt();
        }
        int resultadoPares = somarPares(num, num.length - 1);
        System.out.println("O resultado é: " + resultadoPares);
        break;

      case 2:
        System.out.println("Opção escolhida somar números double");

        Scanner tamScan2 = new Scanner(System.in);
        int tamDouble;

        System.out.println("Escolha a quantidade de números");
        tamDouble = tamScan2.nextInt();
        double[] numDouble = new double[tamDouble];

        System.out.println("Escolha os números");
        Scanner numDoubleScan = new Scanner(System.in);
        for (int i = 0; i < tamDouble; i++) {
          numDouble[i] = numDoubleScan.nextDouble();
        }

        double resultadoDouble = somarDouble(numDouble, numDouble.length - 1);
        System.out.println("O resultado é: " + resultadoDouble);
        break;

      case 3:
        System.out.println("Opção escolhida contar números repetidos");

        int tam;
        Scanner tamScanRep = new Scanner(System.in);
        System.out.println("Escolha a quantidade de números");
        tam = tamScanRep.nextInt();

        int[] numArr = new int[tam];
        Scanner numArrScan = new Scanner(System.in);
        System.out.println("Agora escolha os números");
        for (int i = 0; i < tam; i++) {
          numArr[i] = numArrScan.nextInt();
        }

        int numReps;
        Scanner numRepsScan = new Scanner(System.in);
        System.out.println("Agora escolha o número que quer ver se tem repetido");
        numReps = numRepsScan.nextInt();

        int resultado = contarReps(numArr, numArr.length - 1, numReps);
        System.out.println("O resultado é: " + resultado);
        break;

      default:
        System.out.println("Programa encerrado");
    }
  }

}
