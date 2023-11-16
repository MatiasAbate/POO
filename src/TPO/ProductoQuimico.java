package TPO;

import java.util.Date;

public class ProductoQuimico {
	private int idNumerico;
    private FormulaQuimica formula;
    private String nombreComercial;
    private Date fechaFabricacion;
    private Date fechaVencimiento;
    private String lote;

    public ProductoQuimico(int idNumerico, FormulaQuimica formula, String nombreComercial, Date fechaFabricacion, Date fechaVencimiento, String lote) {
        this.idNumerico = idNumerico;
        this.formula = formula;
        this.nombreComercial = nombreComercial;
        this.fechaFabricacion = fechaFabricacion;
        this.fechaVencimiento = fechaVencimiento;
        this.lote = lote;
    }

    public Date calcularFechaVencimiento() {
        // Implementar lógica para calcular la fecha de vencimiento
        return null;
    }
}


