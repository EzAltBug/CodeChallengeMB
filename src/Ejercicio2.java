public class Ejercicio2 {
    public static void main(String[] args) {
        class Posicion {
            int x = 0;
            int y = 0;
        }
        String espacioVacio = "0";
        Posicion PosicionAct = new Posicion();

        int[] array = {1, 2, -1, 1, 0, 1, 2, -1, -1, -2};

        for (int i = 0; i< array.length; i += 2) {
            int moverX = array[i];
            int moverY = array[i + 1];
            boolean sePasoLimiteX = moverX > 4 || moverX < 0;
            boolean sePasoLimiteY = moverY > 4 || moverY < 0;

            PosicionAct.x += sePasoLimiteX ? 0 : moverX;
            PosicionAct.y += sePasoLimiteY ? 0 : moverY;
        }

        for (int in = 0; in < 4; in++) {
            String graf = espacioVacio.repeat(4);
            if (in + 1 == PosicionAct.y) {
                graf = espacioVacio.repeat(Math.max(in - 1, 0)) + 'X' + espacioVacio.repeat(4 - in);
            }

            System.out.println(graf);
        }
    }
}
