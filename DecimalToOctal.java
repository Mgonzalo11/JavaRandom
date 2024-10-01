public class DecimalToOctal {
    // Metodo para convertir decimal a octal
    public static String decimalToOctal(int decimal) {
        StringBuilder result = new StringBuilder(); // StringBuilder para construir el resultado
        // Mientras el número decimal sea mayor que 0
        while (decimal > 0) {
            int remainder = decimal % 8; // Obtener el resto en base 8
            result.insert(0, remainder); // Insertar el resto al inicio
            decimal /= 8; // Dividir el decimal por 8
        }
        return result.toString(); // Retornar el resultado en octal
    }
    public static void main(String[] args) {
        int decimal = 100; // Número decimal a convertir
        String octal = decimalToOctal(decimal); // Llamar al método de conversión
        System.out.println(decimal + " en octal es: " + octal); // Imprimir el resultado
    }
}
