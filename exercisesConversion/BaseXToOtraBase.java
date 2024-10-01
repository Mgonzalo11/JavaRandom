import java.util.Scanner;
public class BaseXToOtraBase {
    // Metodo para convertir un número en base B a decimal
    public static int baseToDecimal(String number, int base) {
        int decimal = 0; // Variable para almacenar el resultado decimal
        // Iterar sobre cada dígito del número
        for (int i = 0; i < number.length(); i++) {
            // Sumar el valor del dígito en la posición correspondiente
            decimal += Character.getNumericValue(number.charAt(number.length() - 1 - i)) * (int) Math.pow(base, i);
        }
        return decimal; // Retornar el resultado decimal
    }
    // Metodo para convertir decimal a otra base
    public static String decimalToBase(int decimal, int base) {
        StringBuilder result = new StringBuilder(); // StringBuilder para construir el resultado
        // Mientras el número decimal sea mayor que 0
        while (decimal > 0) {
            result.insert(0, decimal % base); // Insertar el resto al inicio
            decimal /= base; // Dividir el decimal por la base
        }
        return result.toString(); // Retornar el resultado en base B’
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para la entrada del usuario
        // Solicitar al usuario que ingrese el número en base B
        System.out.print("Introduce el número en base B: ");
        String number = scanner.nextLine().toUpperCase(); // Convertir a mayúsculas para bases hexadecimales
        // Solicitar al usuario que ingrese la base
        System.out.print("Introduce la base (por ejemplo, 2, 8, 10, 16): ");
        int base = scanner.nextInt();
        // Verificar si la base es popular
        if (base == 2 || base == 8 || base == 10 || base == 16) {
            // Convertir a decimal
            int decimal = baseToDecimal(number, base);
            // Imprimir el resultado
            System.out.println(number + " en decimal es: " + decimal);
            // Ejemplos de conversiones
            System.out.println("Ejemplos de conversiones:");
            if (base == 2) {
                // Conversión de binario a otras bases
                System.out.println("Binario a decimal: " + decimal);
                System.out.println("Binario a octal: " + decimalToBase(decimal, 8));
                System.out.println("Binario a hexadecimal: " + decimalToBase(decimal, 16));
            } else if (base == 8) {
                // Conversión de octal a otras bases
                System.out.println("Octal a decimal: " + decimal);
                System.out.println("Octal a binario: " + decimalToBase(decimal, 2));
                System.out.println("Octal a hexadecimal: " + decimalToBase(decimal, 16));
            } else if (base == 10) {
                // Conversión de decimal a otras bases
                System.out.println("Decimal a binario: " + decimalToBase(decimal, 2));
                System.out.println("Decimal a octal: " + decimalToBase(decimal, 8));
                System.out.println("Decimal a hexadecimal: " + decimalToBase(decimal, 16));
            } else if (base == 16) {
                // Conversión de hexadecimal a otras bases
                System.out.println("Hexadecimal a decimal: " + decimal);
                System.out.println("Hexadecimal a binario: " + decimalToBase(decimal, 2));
                System.out.println("Hexadecimal a octal: " + decimalToBase(decimal, 8));
            }
        } else {
            // Base no popular, solo realizar la conversión
            int decimal = baseToDecimal(number, base);
            System.out.println(number + " en decimal es: " + decimal);
            System.out.println("El número " + number + " en base " + base + " es " + decimal);
        }
        scanner.close(); // Cerrar el escáner
    }
}
