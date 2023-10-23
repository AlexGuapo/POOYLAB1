public abstract class Jugador {
    private String Nombre;
    private char Sexo;
    private String Descripción;
    private double Salario;
    private double Total;

    // Creamos el constructor
    public Jugador(String nombre, char sexo, String descripción, double salario, double total) {
        Nombre = nombre;
        Sexo = sexo;
        Descripción = descripción;
        Salario = salario;
        Total = total;
    }

    // Getters and Setters
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public char getSexo() {
        return Sexo;
    }
    public void setSexo(char sexo) {
        Sexo = sexo;
    }
    public String getDescripción() {
        return Descripción;
    }
    public void setDescripción(String descripción) {
        Descripción = descripción;
    }
    public double getSalario() {
        return Salario;
    }
    public void setSalario(double salario) {
        Salario = salario;
    }
    public void setTotal(double total) {
        Total = total;
    }

    // Metodo abstracto para getBono
    public abstract double getBono();
    public abstract double getTotal();

    // Creamos el toString
    @Override
    public String toString() {
        return "Jugador [Nombre=" + Nombre + ", Sexo=" + Sexo + ", Descripción=" + Descripción + ", Salario=" + Salario
                + ", Total=" + Total + "]";
    }


}
