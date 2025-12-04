package oop.tp6;

/**
 *
 * @author Luis Matos
 */
public class Lapiseira implements MaterialEscrita
{
    private String cor;
    private double espessuraGrafite; // em mm
    
    public Lapiseira(String cor, double espessuraGrafite)
    {
        this.cor = cor;
        this.espessuraGrafite = espessuraGrafite;
    }
    
    @Override
    public void escrita()
    {
        System.out.println("Lapiseira escrevendo com grafite "
                + espessuraGrafite + "mm na cor " + cor);
    }
    
    @Override
    public String getCor()
    {
        return this.cor;
    }
    
    public double getEspessuraGrafite()
    {
        return espessuraGrafite;
    }
    
    public void setEspessuraGrafite(double espessuraGrafite)
    {
        this.espessuraGrafite = espessuraGrafite;
    }
}
