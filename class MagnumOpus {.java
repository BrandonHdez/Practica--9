public abstract class MagnumOpus {
    private boolean verduras = false, carne = false, cocinar = false, servir = false;
    private int bateria;
    static final int MAXIMO = 100;
    static final String nombre1 = "derecha";
    static final String nombre2 = "izquierda";
    static final String Identificacionnombre1 = "d";
    static final String Identificacionnombre2 = "i";

    public abstract void manosCalientes(String mensaje);

    public boolean isverduras() {
        return verduras;
    }

    public boolean iscarne() {
        return carne;
    }

    public boolean isCocinar() {
        return cocinar;
    }

    public boolean isServir() {
        return servir;
    }

    public int getBateria() {
        return bateria;
    }

    public void setverduras(boolean verduras) {
        this.verduras = verduras;
    }


    public void setCarne(boolean carne) {
        this.carne = carne;
    }

    public void setCocinar(boolean cocinar) {
        this.cocinar = cocinar;
    }


    public void setServir(boolean servir) {
        this.servir = servir;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public void consultarBateria(int pila) {
        setBateria(MAXIMO - getBateria());

        System.out.println("Tiempo de la bateria: " + getBateria() + "%");

    public void verificarCarne() {
        if (!carne) {
            System.out.println("No tienes la carne lista");
        }
    }

    public void verificarVerduras() {
        if (!verduras) {
            System.out.println("No tienes las verduras listas");
        }
    }

    public void verificarServir() {
        if (!servir) {
            System.out.println("Hay que servir");
        }
    }

    public void verificarCocinar() {
        if (!cocinar) {
            System.out.println("tu commida no esta preparada");
        }
    }

    public void informacion(int aux) {
        String ultimo = "";
        switch (aux) {
            case 1:
                ultimo = "desayuno";
                break;
            case 2:
                ultimo = "comida";
                break;
            case 3:
                ultimo = "cena";
                break;
        }

        System.out.println("\nRobot MagnusOpus\n");
        System.out.println("Nombre del robot               Identificacion               Ultima accion");
        System.out.println("    " + namenombre1 + "     " + Identificacionnombre1 + "   " + ultimo);
        System.out.println(
                            "    " + nameAsistente2 + "   " + IdentificacionAsistente2 + "  " + ultimo);

    }

}

public class AsistenteChef extends MagnumOpus implements Servir {

    void Cuchillo() throws InterruptedException {
        System.out.println(" Preparando.....");
        System.out.println("1- Primero lavar la carne\n");
        Thread.sleep(500);
        System.out.println("2-cortar la carne\n");
        Thread.sleep(500);
        System.out.println("3-Agregar sal \n");
        Thread.sleep(500);
        System.out.println("La carne se esta lista\n");
    };
    void CuchilloVerduras() throws InterruptedException {

        System.out.println("Preparando verduras....");
        System.out.println("1- Desechar lo que no sirve\n");
        Thread.sleep(500);
        System.out.println("2- Lavar las verduras buenas\n");
        Thread.sleep(500);
        System.out.println("3- picar las verduras\n");
        Thread.sleep(500);
        System.out.println("Las verduras estan listas\n");
    };
    @Override
    public void manosCalientes(String mensaje) {
        System.out.println(mensaje);
    }
    @Override
    public void servir() {
        System.out.println("provecho\n");
    }

}