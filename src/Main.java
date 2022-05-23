public class Main {

    public static void main(String[] args){

        // IF

        int numeroif = -1;

        if (numeroif > 0){

            System.out.println("El numeroif es POSITIVO");

        } else if (numeroif == 0) {

            System.out.println("El numeroif es 0");

        } else if (numeroif < 0) {

            System.out.println("El numeroif es NEGATIVO ");



        }
        System.out.println("Fin de el IF, continua abajo.");

        // While

        int contador = -3;

        while (contador < 0) {


            contador = contador + 1;
            System.out.println(contador);

        }
        System.out.println("Fin de el While, continua abajo.");

        // Bucle Do While

        int contador1 = -1;

        do {
            contador1 = contador1 + 1;
            System.out.println(contador1);

        } while (contador1 < 0);

        System.out.println("Fin de DO While, continua abajo.");

        // Bucle FOR


        for (int numerofor = 0;numerofor <= 3;  numerofor = numerofor + 1 ){

            System.out.println(numerofor);

        }

        System.out.println("Fin de el For, continua abajo.");

        // Switch

        var estacion = "Primavera";

        switch (estacion){

            case "Primavera":
            case "Verano":
            case "Otoño":
            case "Invierno":

                System.out.println("Estamos en la estacion " + estacion );

                break;
            default:
                System.out.println("Esta estacion del año no es posible ser reconocida, intentelo de nuevo.");
        }

        System.out.println("Fin de el Switch, continua abajo.");

    }




}
