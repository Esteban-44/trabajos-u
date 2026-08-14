public class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
    
public static class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro hace guau");
    }
}
public static class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato hace miau");
    }
}
public static class Vaca extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("La vaca hace muu");
    }
}
public static void main(String[] args) {
        Animal[] animales = new Animal[3];

        animales[0] = new Perro();
        animales[1] = new Gato();
        animales[2] = new Vaca();

        for (int i = 0; i < animales.length; i++) {
            animales[i].hacerSonido();
        }
    }
}