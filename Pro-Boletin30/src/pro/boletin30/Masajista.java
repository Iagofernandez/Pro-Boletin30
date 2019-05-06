
package pro.boletin30;

/**
 *
 * @author ifernandezblanco
 */
public class Masajista extends SeleccionFutbol{
    public String titulacion;
    public int aniosExperiencia;

    public Masajista() {
    }

  public Masajista(String titulacion, int aniosExperiencia, int id, String nome, String apelidos, int edade) {
        super(id, nome, apelidos, edade);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getApelidos() {
        return apelidos;
    }

    @Override
    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    @Override
    public int getEdade() {
        return edade;
    }

    @Override
    public void setEdade(int edade) {
        this.edade = edade;
    }
    public void darMasaje(){
        
    }

    @Override
    public void concentrarse() {
        
    }

    @Override
    public void viajar() {
        
    }

    @Override
    public void entrenar() {
        
    }

    @Override
    public void jugarPartido() {
        
    }

    @Override
    public String toString() {
        return super.toString() + "Masajista{" + "titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + '}';
    }
    
}
