package Ejer1;

public class abogado extends empleado {


    @Override
    public int getVacaciones() {
        return super.getVacaciones() / 2;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + 10000;
    }

}
