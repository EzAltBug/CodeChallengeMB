public class Ejercicio3 {
    public static void main(String[] args) {
        //El codigo del producto seria DCR-88578-9
        String codigoAlfabetico = new String("DCR");
        int numeroSerie = 88578;
        int confirmacion = 9;
        int sumaDigitos = 0;
        int sumaFinal = 0;
        String confirmacionAlfabetico = new String("PW");
        boolean esPrioritario = false;
        for (int index = 0; index < confirmacionAlfabetico.length(); index++) {
            if (codigoAlfabetico.charAt(0) == confirmacionAlfabetico.charAt(index)) {
                esPrioritario = true;
            }
        }
        if (!esPrioritario) {
            System.out.println("El código alfabetico es erróneo");
        } else {
            System.out.println("El código alfabetico es valido");
        }
        boolean verificar = false;
        while (numeroSerie != 0) {
            sumaDigitos = sumaDigitos + (numeroSerie % 10);
            numeroSerie = numeroSerie / 10;
        }
        while (sumaDigitos != 0){
            sumaFinal = sumaFinal + (sumaDigitos % 10);
            sumaDigitos = sumaDigitos / 10;
        }
        if(sumaFinal==confirmacion){
            verificar=true;
        }
        if (!verificar){
            System.out.println("El código numerico no es valido");
        } else {
            System.out.println("El código numerico es valido");
        }






    }
}
