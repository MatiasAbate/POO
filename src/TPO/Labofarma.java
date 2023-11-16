package TPO;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Labofarma {
	private Labofarma instancia;
    private List<Sede> sedes;
    private List<Laboratorio> laboratorios;
    private List<ProductoQuimico> productosQuimicos;
    private List<Empleado> empleados;
	private List<Lote> lotes;

    public ProductoQuimico crearProductoQuimico(int idNumerico, FormulaQuimica formula, String nombreComercial, Date fechaFabricacion, Date fechaVencimiento, String lote) {
        // Implementación del método
    	
    	ProductoQuimico producto = new ProductoQuimico( idNumerico, formula, nombreComercial,  fechaFabricacion,  fechaVencimiento,  lote);
        this.productosQuimicos.add(producto);
        return producto;
    }

    public String calcularVencimientoProducto() {
        // Implementación del método
        return null;
    }

    public void darAltaLote(int id, ProductoQuimico tipoProducto, Date fechaFabricacion, Date fechaVencimiento, boolean aprobadoPorLaboratorio, int cantidadProductos) {
       //Lote lotes = new Lote( id,  tipoProducto,  fechaFabricacion,  fechaVencimiento,  aprobadoPorLaboratorio,  cantidadProductos);
       
    }

    public void crearSede(String nombre, String provincia) {
        
    	Sede sedes = new Sede( nombre,  provincia);
    	this.sedes.add(sedes);
    	
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

    public boolean buscaSede(String provincia) {
       
    	for (Sede sede : sedes) {
            if (sede.getProvincia().equals(provincia)) {
                return true; // Se encontró la sede
            }
        }
        return false; // No se encontró la sede
    	
    }

    public Lote crearLote(int id, ProductoQuimico tipoProducto, Date fechaFabricacion, Date fechaVencimiento, boolean aprobadoPorLaboratorio, int cantidadProductos) {
        Lote lotes = new Lote( id,  tipoProducto,  fechaFabricacion,  fechaVencimiento,  aprobadoPorLaboratorio,  cantidadProductos);
        this.lotes.add(lotes);
        return lotes;
    }

    public FormulaQuimica crearFormulaQuimica() {
        // Implementación del método
        return null;
    }

	
    
    
}
