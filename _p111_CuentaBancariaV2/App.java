package _p111_CuentaBancariaV2;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        Banco miBanco = new Banco("Banco Azteca", "Fracc. Las Quintas");
        miBanco.reporte();
        miBanco.agregarClientes(new Cliente("Eledgar chichon"));
        miBanco.agregarClientes(new Cliente("Paco el cachondo"));
        miBanco.agregarClientes(new Cliente("Ricitos de oro"));
        miBanco.agregarClientes(new Cliente("El depresivo"));
        miBanco.reporte();
        miBanco.getClientes().get(0).agregarCuentas(new CuentaDeAhorro(1000, 0.10));
        miBanco.getClientes().get(0).agregarCuentas(new CuentaDeAhorro(1000, 0.20));
        miBanco.getClientes().get(0).agregarCuentas(new CuentaDeAhorro(1000, 500));
        miBanco.getClientes().get(1).agregarCuentas(new CuentaDeAhorro(2500, 500));
        miBanco.getClientes().get(2).agregarCuentas(new CuentaDeAhorro(2000, 600));
        miBanco.getClientes().get(2).agregarCuentas(new CuentaDeAhorro(2500, 0.40));
        miBanco.reporte();
        miBanco.getClientes().get(0).getCuentas().get(0).retira(500);
        miBanco.getClientes().get(0).getCuentas().get(1).retira(100);
        miBanco.getClientes().get(1).getCuentas().get(0).deposita(100);
        miBanco.getClientes().get(2).getCuentas().get(0).deposita(300);
        miBanco.getClientes().get(2).getCuentas().get(1).retira(1000);
        miBanco.reporte();
        miBanco.CalcularInteres();
        miBanco.reporte();

    }
}
