package TPO;

import java.util.List;

public class Sede {
	private String nombre;
    private String provincia;
    private List<Laboratorio> laboratorios;
    private Gerente gerente;

    public Sede(String nombre, String provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public List<Laboratorio> getLaboratorios() {
		return laboratorios;
	}

	public void setLaboratorios(List<Laboratorio> laboratorios) {
		this.laboratorios = laboratorios;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

    // Getters y setters
    
    

    // Otros métodos si son necesarios

}
