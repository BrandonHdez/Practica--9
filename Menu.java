import java.util.Scanner;

public class menu {
    Asistentechefsito asu = new Asistentechefsito();;
    private Scanner opcion = new Scanner(System.in);
    int aux, aux2, bateria = 0;

    public void menu() throws InterruptedException {
        int flag = 0;
        do {
            do {
                System.out.println("---------- MAGNUM OPUS ----------");
                System.out.println("\ ¿ A Donde te llevamos?");
                System.out.println("1) Desayuno");
                System.out.println("2) Comida");
                System.out.println("3) Cena");
                System.out.println("4) Salir\n");
                aux2 = opcion.nextInt();
                switch (aux2) {
                    case 1:
                        menuDesayuno();
                        bateria += 15;
                        break;
                    case 2:
                        menuComida();
                        bateria += 15;
                        break;
                    case 3:
                        menuCena();
                        bateria += 15;
                        break;
                    case 4:
                        System.out.println("hasta luego!!.");
                        flag = 2;
                }
            } while (flag == 0);
            asu.setBateria(bateria);
        } while (flag != 2);
    }

    public void menuDesayuno() throws InterruptedException {
        int aux;
        System.out.println("Menu");
        System.out.println("1)Huevo revuelto");
        System.out.println("2) Sándwich");
    }

    public void menuComida() throws InterruptedException {

        int aux;
        System.out.println("Menu");
        System.out.println("1) Ensalada");
        System.out.println("2) Pollo ");
    }

    public void menuCena() throws InterruptedException {
        System.out.println("Menu");
        System.out.println("    1) Aguacate relleno");
        System.out.println("    2) Rollos de lechuga romana");
    }

    public void acciones() throws InterruptedException {
        int flag = 0;

        do {
            do {

                System.out.println("Elige una opcion:\n");
                System.out.println("1) Preparar carne");
                System.out.println("2) Preparar verduras");
                System.out.println("3) Prender la estufa");
                System.out.println("4) Servir");
                System.out.println("5) Salir\n");

                System.out.print("  Opcion: ");
                aux = opcion.nextInt();

                switch (aux) {
                    case 1:
                        asu.Cuchillo();
                        asu.setCortarCarne(true);
                        break;
                    case 2:
                        asu.Cuchillo();
                        asu.setCortarVerduras(true);
                        break;
                    case 3:
                        if (asu.isCortarCarne() && asu.isCortarVerduras()) {
                            switch (auxiliar2) {
                                case 1:
                                    asu.manosCalientes("El desayuno esta cocinado");
                                    asu.setCocinar(true);
                                    break;
                                case 2:
                                    asu.manosCalientes("Ya mero esta el almuerzo");
                                    asu.setCocinar(true);
                                    break;
                                case 3:
                                    asu.manosCalientes("Ya sale su cena");
                                    asu.setCocinar(true);
                                    break;
                            }

                        } else {
                            System.out.println("\n");
                            asu.verificarCarne();
                            asu.verificarVerduras();
                            System.out.println("-----------------------------------------------------");
                        }
                        break;
                    case 4:
                        if (asu.isCortarCarne() && asu.isCortarVerduras() && asu.isCocinar()) {
                            System.out.println("\n");
                            asu.servir();
                            asu.setServir(true);
                        } else {
                            System.out.println("\n");
                            asu.verificarCarne();
                            asu.verificarVerduras();
                            asu.verificarCocinar();
                            System.out.println("-----------------------------------------------------");
                        }
                        break;
                    case 5:
                        flag = 1;
                        break;
                }
            } while (flag == 0);
            asu.setCortarCarne(false);
            asu.setCortarVerduras(false);
            asu.setCocinar(false);
            asu.setServir(false);
        } while (flag != 1);
    }

    public void limpiarPantalla() {
        int saltos = 100;
        for (int i = 0; i < saltos; i++) {
            System.out.println();
        }
    }

}

public interface Servir {

    void servir();
}

public class Principal {

    public static void main(String[] args) throws Exception {
        Repositorio display = new Repositorio();
        display.menu();
    }

}

