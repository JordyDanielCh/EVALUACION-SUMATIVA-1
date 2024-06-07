public class Robot {
    public static void main(String[] args) {
        int[] pasos = {10, 5, -2};
        int x = 0;
        int y = 0;
         int direccion = 0;
        for (int paso : pasos) {
            switch (direccion) {
                case 0:
                    y += paso;
                    break;
                case 1:
                    x -= paso;
                    break;
                case 2:
                    y -= paso;
                    break;
                case 3:
                    x += paso;
                    break;
            }
            direccion = (direccion + 1) % 4;
        }

       System.out.println("Coordenadas finales: (x: " + x + ", y: " + y + ")");
    }
}
