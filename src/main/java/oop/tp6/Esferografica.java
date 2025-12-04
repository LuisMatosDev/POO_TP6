package oop.tp6;

/**
 *
 * @author Luis Matos
 */
public class Esferografica implements MaterialEscrita
{
    private String cor;
    private boolean temTampa;
    
    public Esferografica(String cor, boolean temTampa)
    {
        this.cor = cor;
        this.temTampa = temTampa;
    }
    
    @Override
    public void escrita()
    {
        System.out.println("Esferográfica escrevendo na cor " + cor);
        if (temTampa)
        {
            System.out.println("Lembre-se de recolocar a tampa após o uso!");
        }
    }
    
    @Override
    public String getCor()
    {
        return this.cor;
    }
    
    public boolean isTemTampa()
    {
        return temTampa;
    }
    
    public void setTemTampa(boolean temTampa)
    {
        this.temTampa = temTampa;
    }
}
