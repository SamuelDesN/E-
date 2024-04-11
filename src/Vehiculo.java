import java.util.ArrayList;
import java.util.Scanner;

class Vehiculo {
    private String matricula;
    private String color;
    private String marca;
    public ArrayList<String> piezas;

    public Vehiculo(String matricula, String color, String marca) {
        this.matricula = matricula;
        this.color = color;
        this.marca = marca;
        this.piezas = new ArrayList<String>();
    }

    public void describir() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Color: " + color);
        System.out.println("Marca: " + marca);
        System.out.println("Piezas:"+ piezas);
    }

    public void repararPieza(int numeroPieza) {
        if (numeroPieza >= 0 && numeroPieza < piezas.size()) {
            String piezaReparada = piezas.get(numeroPieza);
            System.out.println("Reparando " + piezaReparada + " del vehículo...");
        } else {
            System.out.println("Número de pieza inválido.");
        }
    }
}

// Subclases de Vehiculo
class Coche extends Vehiculo {
    public Coche(String matricula, String color, String marca) {
        super(matricula, color, marca);
        this.piezas=new ArrayList<>();
        piezas.add("motor");
        piezas.add("transmision");
        piezas.add("neumaticos");
        piezas.add("frenos");
        piezas.add("parachoques");
    }
}

class Moto extends Vehiculo {
    public Moto(String matricula, String color, String marca) {
        super(matricula, color, marca);
        this.piezas=new ArrayList<>();
        piezas.add("motor");
        piezas.add("ruedas");
        piezas.add("frenos");
        piezas.add("escape");
        piezas.add("manillar");
    }
}

class Camion extends Vehiculo {
    public Camion(String matricula, String color, String marca) {
        super(matricula, color, marca);
        this.piezas=new ArrayList<>();
        piezas.add("motor");
        piezas.add("transmision");
        piezas.add("ejes");
        piezas.add("sistema de suspension");
        piezas.add("cabina");
    }
}

class Tractor extends Vehiculo {
    public Tractor(String matricula, String color, String marca) {
        super(matricula, color, marca);
        this.piezas=new ArrayList<>();
        piezas.add("motor");
        piezas.add("transmision");
        piezas.add("neumaticos");
        piezas.add("enganche");
        piezas.add("sistema hidraulico");
    }
}

class Grua extends Vehiculo {
    public Grua(String matricula, String color, String marca) {
        super(matricula, color, marca);
        this.piezas=new ArrayList<>();
        piezas.add("cabrestante");
        piezas.add("brazo extensible");
        piezas.add("ganchos de sujecion");
        piezas.add("estabilizadores");
        piezas.add("plataforma elevadora");
    }
}

