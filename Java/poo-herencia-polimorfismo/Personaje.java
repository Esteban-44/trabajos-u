import java.util.ArrayList;

abstract class Personaje {
    public abstract void atacar();


static class Guerrero extends Personaje {
    @Override
    public void atacar() {
        System.out.println("El guerrero ataca con espada");
    }
}

static class Mago extends Personaje {
    @Override
    public void atacar() {
        System.out.println("El mago lanza un hechizo");
    }
}

static class Arquero extends Personaje {
    @Override
    public void atacar() {
        System.out.println("El arquero dispara una flecha");
    }
}

    public static void main(String[] args) {
        ArrayList<Personaje> personajes = new ArrayList<>();

        personajes.add(new Guerrero());
        personajes.add(new Mago());
        personajes.add(new Arquero());

        for (Personaje p : personajes) {
            p.atacar();
        }
    }
}