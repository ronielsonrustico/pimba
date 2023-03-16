import java.util.Scanner;

public class jogodavelha {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        char[][] simbolos = {{' '}, {' '}, {' '}, {' '}, {' '}, {' '}, {' '}, {' '}, {' '}};

        System.out.println(simbolos);
        System.out.println(simbolos[0][0]);
        tab();
        exibindosimbolos(simbolos);
    }

    public static void tab(){

        System.out.println(" 1 | 2 | 3 ");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("");
        }

        public static void exibindosimbolos(char[][] simbolos) {
            System.out.println(" 0  1  2");

            for (int linha = 0; linha < 3; linha++) {
                System.out.printf(linha + "");

                for (int coluna = 0; coluna < 3; coluna++) {
                    System.out.printf(simbolos[linha][coluna] + " ");

                    if (coluna != 2) {
                        System.out.printf(" | ");
                    }
                }
                System.out.println("");
                System.out.println("");

            }
        }





//       public static boolean vitoria ( char[][] simbolos){
//       int linha;
//       int coluna;


//            return false;
  //      }
//        for (int x = 0; x < 3; x++) {
  //          for (int bola = 0; bola < 3; bola++) {
    //            char simbolos [x][bola];
      //      }

//        }
//    }
}
