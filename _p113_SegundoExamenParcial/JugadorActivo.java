public class JugadorActivo extends Jugador{
    private int Partidos;
    private int Goles;
    
    // Creamos el constructor
    public JugadorActivo(String nombre, char sexo, String descripción, double salario, double total, int partudos,
            int goles) {
        super(nombre, sexo, descripción, salario, total);
        Partidos = partudos;
        Goles = goles;
    }

    // Getters and Setters
    public int getPartudos() {
        return Partidos;
    }
    public void setPartudos(int partidos) {
        Partidos = partidos;
    }
    public int getGoles() {
        return Goles;
    }
    public void setGoles(int goles) {
        Goles = goles;
    }

    // Sobrecarga de getBono
    @Override
    public double getBono() {
        double bono = (super.getSalario() * 0.15) + (Partidos * 50) + (Goles * 5);
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
        return "JugadorActivo=" + super.getNombre() + ", Sexo=" + super.getSexo() + "[Partidos=" + Partidos + ", Goles=" + Goles + ", Bono="+ getBono() + 
        "Total=" + getTotal() + "]";
    }
    
}
