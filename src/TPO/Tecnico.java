package TPO;

public class Tecnico extends Empleado{
	private int id;
    private String nombre;
    private int cupoReservas;
    private TipoTecnico tipo;

    // Constructor
    public Tecnico(int id, String nombre, int cupoReservas, TipoTecnico tipo) {
        this.id = id;
        this.nombre = nombre;
        this.cupoReservas = cupoReservas;
        this.tipo = tipo;
    }

    // Métodos específicos de Tecnico

    // Implementación de los métodos abstractos de Empleado
    @Override
    public void altaGerente() {
        // Implementación específica para alta de Gerente
    }

    @Override
    public void altaTecnico() {
        // Implementación específica para alta de Técnico
    }

    @Override
    public void altaSoporteTecnico() {
        // Implementación específica para alta de Soporte Técnico
    }

    @Override
    public void altaAdministrativo() {
        // Implementación específica para alta de Administrativo
    }

    // Getters y setters

    // Otros métodos si son necesarios

}
