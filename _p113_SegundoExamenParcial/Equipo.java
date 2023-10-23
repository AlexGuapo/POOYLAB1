import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private String Liga;
    private ArrayList<Jugador> Jugadores;
    
    // Creamos constructores
    public Equipo() {
        Jugadores = new ArrayList<>();
    }
    public Equipo(String nombreEquipo, String liga) {
        this();
        this.nombreEquipo = nombreEquipo;
        Liga = liga;
    }

    // Getters and Setters
    public String getNombreEquipo() {
        return nombreEquipo;
    }
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    public String getLiga() {
        return Liga;
    }
    public void setLiga(String liga) {
        Liga = liga;
    }
    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }
    public void setJugadores(ArrayList<Jugador> jugadores) {
        Jugadores = jugadores;
    }
    public void agregarJugador(Jugador jugador){
        Jugadores.add(jugador);
    }

    // Calculamos el total del bono de los jugadores
    public double getTotalBono() {
        double totalBono = 0.0;
        for (Jugador jugadores : Jugadores) {
            totalBono += jugadores.getBono();
        }
        return totalBono;
    }

    // Calculamos el total de totales
    public double getTotal() {
        double totalSalarios = 0.0;
        for (Jugador jugadores : Jugadores) {
            totalSalarios += jugadores.getTotal();
        }
        return totalSalarios;
    }

    // Calculamos el total de hombres
    public int getTotalH() {
        int totalHombres = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador.getSexo() == 'H') {
                totalHombres++;
            }
        }
        return totalHombres;
    }

    // Calculamos el total de mujeres
    public int getTotalM() {
        int totalMujeres = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador.getSexo() == 'M') {
                totalMujeres++;
            }
        }
        return totalMujeres;
    }
    
    // Creamos el reporte
    public void reporte() {
        System.out.println("Reporte del Equipo: " + nombreEquipo);
        System.out.println("Liga: " + Liga);
        System.out.println("Total de jugadores: " + Jugadores.size());
        System.out.println("Total de bono del equipo: " + getTotalBono());
        System.out.println("Total de salarios del equipo: " + getTotal());
        System.out.println("Total de jugadores Hombres: " + getTotalH());
        System.out.println("Total de jugadores Mujeres: " + getTotalM());
        System.out.println("Listado de Jugadores:");
        for (Jugador jugadores : Jugadores) {
            System.out.print(jugadores.getClass().getSimpleName() + " ");
            if (jugadores instanceof JugadorEntrenador) {
                System.out.println("[" + jugadores.toString() + "]");
            } else {
                System.out.println(jugadores.toString());
            }
        }
    }
    
    //Creamos el toString
    @Override
    public String toString() {
        return "Equipo [nombreEquipo=" + nombreEquipo + ", Liga=" + Liga + ", Jugadores=" + Jugadores + "]";
    }
        
}