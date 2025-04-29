public class Revista extends Publicacion{
    private Integer volumen;
    private Integer numero;

    public Revista(String titulo,Integer anio,Genero genero,Integer numero,Integer volumen){
        super (titulo,anio,genero);
        this.volumen = volumen;
        this.numero = numero;
    }

    public Integer getVolumen() {
        return volumen;
    }

    public void setVolumen(Integer volumen) {
        this.volumen = volumen;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
