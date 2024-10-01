public class DecimalToHexadecimal {
    // Metodo para convertir decimal a hexadecimal
    public static String decimalToHexadecimal(int decimal) {
        StringBuilder result = new StringBuilder(); // StringBuilder para construir el resultado
        // Mientras el número decimal sea mayor que 0
        while (decimal > 0) {
            int remainder = decimal % 16; // Obtener el resto en base 16
            // Convertir el resto a un carácter si es mayor que 9
            if (remainder > 9) {
                result.insert(0, (char) ('A' + (remainder - 10))); // A, B, C, D, E, F
            } else {
                result.insert(0, remainder); // Insertar el resto al inicio
            }
            decimal /= 16; // Dividir el decimal por 16
        }
        return result.toString(); // Retornar el resultado en hexadecimal
    }
    public static void main(String[] args) {
        int decimal = 255; // Número decimal a convertir
        String hexadecimal = decimalToHexadecimal(decimal); // Llamar al método de conversión
        System.out.println(decimal + " en hexadecimal es: " + hexadecimal); // Imprimir el resultado
    }
}
