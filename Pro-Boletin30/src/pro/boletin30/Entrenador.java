
package pro.boletin30;

/**
 *
 * @author ifernandezblanco
 */
public class Entrenador extends SeleccionFutbol{
    public int idFederacion;

    public Entrenador() {
    }

   

    public Entrenador(int idFederacion, int id, String nome, String apelidos, int edade) {
        super(id, nome, apelidos, edade);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
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
 public void planificarEntrenamiento(){
     
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
        return super.toString() + "Entrenador{" + "idFederacion=" + idFederacion + '}';
    }
    
    
}
