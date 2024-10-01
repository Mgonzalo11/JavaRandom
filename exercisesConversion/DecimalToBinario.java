public class DecimalToBinario {
    // Metodo para convertir decimal a binario
    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder(); // StringBuilder para construir el resultado
        // Mientras el número decimal sea mayor que 0
        while (decimal > 0) {
            binary.insert(0, decimal % 2); // Insertar el resto (0 o 1) al inicio
            decimal /= 2; // Dividir el decimal por 2
        }
        return binary.toString(); // Retornar el resultado en binario
    }
    public static void main(String[] args) {
        int decimal = 100; // Número decimal a convertir
        String binary = decimalToBinary(decimal); // Llamar al metodo de conversión
        System.out.println(decimal + " en binario es: " + binary); // Imprimir el resultado
    }
}