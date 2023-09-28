import java. util. *;

class Calculadora_MaximilianoNiscola {
  public static void main(String[] args) {
     /* Se plantea la entrada de variables */
        Scanner sc=new Scanner(System.in);
        int operation, number_1, number_2;
        double result=0;
        do {
            System.out.println("Bienvenido a la calculadora");
            System.out.println("A continuación se presentan las distintas operaciones:");
            System.out.println("1- Suma");
            System.out.println("2- Resta");
            System.out.println("3- Multiplicación");
            System.out.println("4- División");
            System.out.println("Para seleccionar una operación, ingrese su número correspondiente o bien cero para salir: ");
            operation=sc.nextInt();
            if (operation == 0){
                break;
            }
            System.out.println("Ingrese el primer número entero");
            number_1=sc.nextInt();
            System.out.println("Ingrese el segundo número entero");
            number_2=sc.nextInt();

            if (operation > 0 && operation < 5) {
                if (operation==1){
                    result=number_1+number_2;
                }else if (operation==2) {
                    result=number_1-number_2;
                } else if (operation==3) {
                    result=number_1*number_2;
                }else if (operation == 4){
                    if (number_2 != 0){
                        result=number_1/number_2;
                    }else{
                        System.out.println("El denominador de la división no puede ser cero");
                    }
                }
            }
            System.out.println("El resultado de la operación es "+result);
        } while (operation != 0);

        System.out.println("Sesión terminada");
  }
}
