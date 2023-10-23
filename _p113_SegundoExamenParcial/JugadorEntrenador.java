public class JugadorEntrenador extends Jugador{
    private int Subordinados;
    private int Proyectos;
    
    // Creamos los constructores
    public JugadorEntrenador(String nombre, char sexo, String descripción, double salario, double total,
            int subordinados, int proyectos) {
        super(nombre, sexo, descripción, salario, total);
        Subordinados = subordinados;
        Proyectos = proyectos;
    }
    
    // Getters and Setters
    public int getSubordinados() {
        return Subordinados;
    }
    public void setSubordinados(int subordinados) {
        Subordinados = subordinados;
    }
    public int getProyectos() {
        return Proyectos;
    }
    public void setProyectos(int proyectos) {
        Proyectos = proyectos;
    }

    // Sobrecarga de getBono
    @Override
    public double getBono() {
        double bono = (super.getSalario() * 0.15) + (Proyectos * 100) + (Subordinados * 10);
        return bono;
    }

    // Metodo para calcular Total
    public double getTotal() {
        double Total = super.getSalario() + getBono();
        return Total;
    }

    // Creamos el toString
    @Override
    public String toString() {
        return "JugadorEntrenador=" + super.getNombre() + ", Sexo="+ super.getSexo() + ", [Subordinados=" + Subordinados + ", Proyectos=" + Proyectos + ", Bono=" + getBono() + "Total=" + getTotal()+ "]";
    }

}
