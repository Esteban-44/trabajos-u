import java.util.ArrayList;

class Empleado {
    public double calcularSalario() {
        return 0;
    }


static class EmpleadoFijo extends Empleado {
    double salarioMensual;

    public EmpleadoFijo(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalario() {
        return salarioMensual;
    }
}

static class EmpleadoPorHoras extends Empleado {
    double horas;
    double pagoHora;

    public EmpleadoPorHoras(double horas, double pagoHora) {
        this.horas = horas;
        this.pagoHora = pagoHora;
    }

    @Override
    public double calcularSalario() {
        return horas * pagoHora;
    }
}

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoFijo(2000));
        empleados.add(new EmpleadoPorHoras(40, 10));

        for (Empleado e : empleados) {
            System.out.println("Salario: " + e.calcularSalario());
        }
    }
}