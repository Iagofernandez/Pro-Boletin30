/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro.boletin30;

/**
 *
 * @author ifernandezblanco
 */
public class Seleccionador extends SeleccionFutbol{

    public Seleccionador() {
    }

    public Seleccionador(int id, String nome, String apelidos, int edade) {
        super(id, nome, apelidos, edade);
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
    public void seleccionarJugador(){
        
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
        return super.toString() + "Seleccionador{" + '}';
    }
    
    
}
