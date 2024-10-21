import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0;

        String menu = """
                *** Escriba el numero de la opcion deseada ***
                1- Convertir dinero
                2- Salir
                **********************************************
                """;

        Scanner lectura = new Scanner(System.in);
        Scanner lectura1 = new Scanner(System.in);
        while (opcion != 2) {
            System.out.println(menu);
            opcion = lectura1.nextInt();

            switch (opcion) {
                case 1:
                    try {
                        ConsultaTipoDeCambio consulta = new ConsultaTipoDeCambio();
                        System.out.println("Ingrese la moneda de origen para convertirla a otra moneda: ");

                        var monedaBase = new String(lectura.nextLine().toUpperCase());
                        Moneda moneda = consulta.buscaMoneda(monedaBase);
                        if (moneda != null) {
                            System.out.println(moneda.conversion_rates);

                            System.out.println("Ingrese la cantidad en " + monedaBase + " para convertir: ");
                            int cantidadOrigen = Integer.valueOf(lectura.nextLine().toUpperCase());

                            System.out.println("Ingrese la moneda a la cual desea convertir sus " + cantidadOrigen + " " + monedaBase);
                            var monedaDestino = new String(lectura.nextLine().toUpperCase());
                            float cantidadConvertida = moneda.conversion_rates.get(monedaDestino) * cantidadOrigen;
                            System.out.println("Usted convirtio " + cantidadOrigen + " " + monedaBase + " a " + cantidadConvertida + " " + monedaDestino);
                        } else {
                            System.out.println("Moneda no encontrada, vuelva a intentarlo.");
                            break;
                        }
                    } catch (Exception e){
                        System.out.println("Opcion invalida, intentelo de nuevo");
                        break;
                    }


                    break;
                case 2:
                    System.out.println("Gracias por utilizar nuestros servicios!");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            /**/
        }
    }
}
