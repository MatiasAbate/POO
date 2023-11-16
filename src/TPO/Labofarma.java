package TPO;

import java.util.Date;
import java.util.List;

public class Labofarma {
	private Labofarma instancia;
    private List<Sede> sedes;
    private List<Laboratorio> laboratorios;
    private List<ProductoQuimico> productosQuimicos;
    private List<Empleado> empleados;

    public void crearProductoQuimico(int id, String formula, Date fechaFabricacion, String lote, Date vencimiento) {
        // Implementación del método
    }

    public String calcularVencimientoProducto() {
        // Implementación del método
        return null;
    }

    public void darAltaLote(List<ProductoQuimico> productosQuimicos, Date fechaFabricacion, Date vencimiento) {
        // Implementación del método
    }

    public void crearSede() {
        // Implementación del método
    }

    public void reservarLaboratorio() {
        // Implementación del método
    }

    public boolean probarProductoQuimico() {
        // Implementación del método
        return false;
    }

    public boolean productoPuedeComercializarse() {
        // Implementación del método
        return false;
    }

    public int calcularCostoDePrueba() {
        // Implementación del método
        return 0;
    }

    public void darAltaPerfil() {
        // Implementación del método
    }

    public boolean buscaSede() {
        // Implementación del método
        return false;
    }

    public Lote crearLote(List<ProductoQuimico> productos) {
        // Implementación del método
        return null;
    }

    public FormulaQuimica crearFormulaQuimica() {
        // Implementación del método
        return null;
    }
}