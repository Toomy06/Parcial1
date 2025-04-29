import java.util.ArrayList;

public abstract class Publicacion {
    private String titulo;
    private Integer anio;
    private Genero genero;
    private List<Ejemplar> ejemplares;

    public Publicacion(String titulo, Integer anio, Genero genero){
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
        this.ejemplares = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }
}
