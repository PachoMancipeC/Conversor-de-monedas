import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(String unidadEntrada, String unidadSalida, ConsultaConversion consulta, Scanner lectura) {
        double valorEntrada;
        double valorSalida;

        TasaDeCambio tasaDeCambio = consulta.buscaConversion(unidadEntrada, unidadSalida);
        System.out.println("Ingrese el valor que desea convertir:");
        valorEntrada = Double.parseDouble(lectura.nextLine());
        valorSalida = valorEntrada * tasaDeCambio.conversion_rate();
        System.out.println("El valor " + valorEntrada + "["+ unidadEntrada + "] "
                + "corresponde al valor final de =>>" + valorSalida + "["+ unidadSalida + "]");

    }
}

