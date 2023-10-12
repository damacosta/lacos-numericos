public class App {
    public static void main(String[] args) {
      for (int i = 1; i <= 10; i++) {

        // Um "for aninhado" é uma estrutura de repetição na qual um ou mais loops for estão contidos dentro de outro loop "for".
        for (int j =1; j <= 10; j++) {
            System.out.println(j + "x" + i + "=" + j * i);
        }
      }
    }
}


/* Outro exemplo de Tabuada no laço "for":
* para (for) uma variável que inicia em 1, e vai até 10, mundando 1 por 1, faça:
*
* for (int i = 1; 1 <=10; i++) {
* System.out.println(1 * 1);
* System.out.println(2 * 1);
* System.out.println(3 * 1);
* System.out.println(4 * 1);
* System.out.println(5 * 1);
* System.out.println(6 * 1);
* System.out.println(7 * 1);
* System.out.println(8 * 1);
* System.out.println(10 * 1);
* }
*
 */