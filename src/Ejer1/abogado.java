package Ejer1;

public class abogado extends empleado {


    public void Mostrarmensaje()
    {
    System.out.println("Estoy en el tribunal");
    }

    @Override
    public int getVacaciones() {
        return super.getVacaciones() / 2;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + 10000;
    }

    @Override
    public int getHoras() {
        return super.getHoras() + 5;
    }

    @Override
    public String getMesVacaciones() {
        return "Julio";
    }
}
