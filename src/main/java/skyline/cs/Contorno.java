/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package skyline.cs;

/**
 *
 * @author RutJG
 */
public class Contorno {
      
    private int coordenada;
    private int altura;
    
    public Contorno (){
       this.altura= 0;
       this.coordenada = 0;
    }
    
    public Contorno (int coord, int alt){
       this.altura= alt;
       this.coordenada = coord;
    }
    public int getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(int coordenada) {
        this.coordenada = coordenada;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
