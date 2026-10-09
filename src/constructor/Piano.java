package constructor;

public class Piano extends Instrumento {
    String modelo = "Yamaha";

    @Override
    void tocar() {
        System.out.println(modelo);
    }
}
