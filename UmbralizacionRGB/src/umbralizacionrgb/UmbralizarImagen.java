/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umbralizacionrgb;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author Roberto Cruz Leija
 */
public class UmbralizarImagen {
    
    private ArrayList<Histograma> histogramas;
    private BufferedImage imagenOriginal, imagenNueva;
    
    public UmbralizarImagen(BufferedImage image) {
        this.imagenOriginal = image;
        this.imagenNueva = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);
        this.histogramas = new ArrayList<>();
        calculaHistogramas();
    }
       
    public void actualizarRojo (int min, int max, boolean inside){
    
    }
    public void actualizarVerde (int min, int max, boolean inside){
    
    }
    public void actualizarAzul (int min, int max, boolean inside){
    
    }

    private void calculaHistogramas() {
        Histograma.imagen = this.imagenOriginal;
        this.histogramas.add(new Histograma("Rojo", Histograma.Canal.ROJO));
        this.histogramas.add(new Histograma("Verde", Histograma.Canal.VERDE));
        this.histogramas.add(new Histograma("Azul", Histograma.Canal.AZUL));
    }

    /**
     * @return the imagenNueva
     */
    public BufferedImage getImagenNueva() {
        return imagenNueva;
    }
    
    
}
