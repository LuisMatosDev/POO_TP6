package oop.tp6;

/**
 *
 * @author Luis Matos
 */
public class Marcador implements MaterialEscrita
{
    private String cor;
    private boolean permanente;
    
    public Marcador(String cor, boolean permanente)
    {
        this.cor = cor;
        this.permanente = permanente;
    }
    
    @Override
    public void escrita()
    {
        System.out.println("Marcador " + (permanente ? "permanente" : "não-permanente")
                + " escrevendo na cor " + cor);
        if(!permanente)
        {
            System.out.println("Este marcador pode ser apagado!");
        }   
    }
    
    @Override
    public String getCor()
    {
        return this.cor;
    }
    
    public boolean ePermanente()
    {
        return permanente;
    }
    
    public void setPermanente(boolean permanente)
    {
        this.permanente = permanente;
    }
}
