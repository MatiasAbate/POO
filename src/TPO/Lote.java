package TPO;

import java.util.Date;

public class Lote {
	private int id;
    private ProductoQuimico tipoProducto;
    private Date fechaFabricacion;
    private Date fechaVencimiento;
    private boolean aprobadoPorLaboratorio;
    private int cantidadProductos;

    public Lote(int id, ProductoQuimico tipoProducto, Date fechaFabricacion, Date fechaVencimiento, boolean aprobadoPorLaboratorio, int cantidadProductos) {
        this.id = id;
        this.tipoProducto = tipoProducto;
        this.fechaFabricacion = fechaFabricacion;
        this.fechaVencimiento = fechaVencimiento;
        this.aprobadoPorLaboratorio = aprobadoPorLaboratorio;
        this.cantidadProductos = cantidadProductos;
    }

}
