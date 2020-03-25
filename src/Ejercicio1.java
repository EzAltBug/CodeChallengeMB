public class Ejercicio1 {
        public static void main(String[] args) {
            Integer[] myArray = {1, 2, 1, 3, 3, 1, 2, 1, 5, 1};
            histograma(myArray);
        }

        public static void histograma(Integer[] array) {
            Integer[] contador = {0, 0, 0, 0, 0};
            String Representacion = "*";

            for (int i = 0; i < array.length; i++) {
                Integer number = array[i];
                contador[number - 1]++;
            }

            for (int arrayIndex = 0; arrayIndex < contador.length; arrayIndex++) {
                String Valores = String.valueOf(arrayIndex + 1);
                Integer Repeticiones = contador[arrayIndex];

                System.out.println(Valores + ": " + Representacion.repeat(Repeticiones));
            }
        }
    }


