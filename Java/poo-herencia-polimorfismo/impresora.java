class Impresora {
    public void imprimir(String texto) {
        System.out.println(texto);
    }

    public void imprimir(int numero) {
        System.out.println(numero);
    }

    public void imprimir(String texto, int copias) {
        for (int i = 0; i < copias; i++) {
            System.out.println(texto);
        }
    }


static class Documento {
    public String tipo() {
        return "Documento";
    }
}

static class PDF extends Documento {
    @Override
    public String tipo() {
        return "PDF";
    }
}

static class Word extends Documento {
    @Override
    public String tipo() {
        return "Word";
    }
}

    public static void main(String[] args) {
        Impresora imp = new Impresora();

        imp.imprimir("Hola");
        imp.imprimir(123);
        imp.imprimir("Copias", 3);

        Documento d1 = new PDF();
        Documento d2 = new Word();

        System.out.println(d1.tipo());
        System.out.println(d2.tipo());
    }
}