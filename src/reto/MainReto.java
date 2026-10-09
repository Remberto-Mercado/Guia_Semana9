package reto;

public class MainReto {
    public static void main(String[] args) {
        Instrumento v = new Violin();
        System.out.println(v.tipo);
        System.out.println(v.catalogo());
        v.tocar();
    }
}
