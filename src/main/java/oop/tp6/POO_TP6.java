package oop.tp6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Matos
 */


public class POO_TP6 {
    
    public static void main(String[] args) {
        System.out.println("=== TESTE DOS MATERIAIS DE ESCRITA ===\n");
        
        // Teste 1: Criando objetos de cada tipo
        System.out.println("1. CRIANDO OBJETOS:");
        Esferografica esferoAzul = new Esferografica("Azul", true);
        Esferografica esferoVermelha = new Esferografica("Vermelha", false);
        
        Lapiseira lapiseiraPreta = new Lapiseira("Cinza", 0.7);
        Lapiseira lapiseiraPrata = new Lapiseira("Cinza", 0.5);
        
        Marcador marcadorPermanente = new Marcador("Preto", true);
        Marcador marcadorQuadro = new Marcador("Vermelho", false);
        
        System.out.println("✓ Objetos criados com sucesso!\n");
        
        // Teste 2: Usando polimorfismo
        System.out.println("2. POLIMORFISMO COM INTERFACE:");
        List<MaterialEscrita> materiais = new ArrayList<>();
        materiais.add(esferoAzul);
        materiais.add(esferoVermelha);
        materiais.add(lapiseiraPreta);
        materiais.add(lapiseiraPrata);
        materiais.add(marcadorPermanente);
        materiais.add(marcadorQuadro);
        
        for (MaterialEscrita material : materiais) {
            material.escrita();
            System.out.println("   Cor: " + material.getCor());
            System.out.println("---");
        }
        System.out.println();
        
        // Teste 3: Testes específicos para cada tipo
        System.out.println("3. TESTES ESPECÍFICOS:");
        
        // Testando métodos específicos de Esferográfica
        System.out.println("Esferográfica Azul tem tampa? " + esferoAzul.isTemTampa());
        esferoAzul.setTemTampa(false);
        System.out.println("Após alteração, tem tampa? " + esferoAzul.isTemTampa());
        System.out.println();
        
        // Testando métodos específicos de Lapiseira
        System.out.println("Lapiseira Preta - Espessura: " + lapiseiraPreta.getEspessuraGrafite() + "mm");
        lapiseiraPreta.setEspessuraGrafite(0.9);
        System.out.println("Nova espessura: " + lapiseiraPreta.getEspessuraGrafite() + "mm");
        System.out.println();
        
        // Testando métodos específicos de Marcador
        System.out.println("Marcador Preto é permanente? " + marcadorPermanente.ePermanente());
        marcadorQuadro.setPermanente(true);
        System.out.println("Marcador Quadro agora é permanente? " + marcadorQuadro.ePermanente());
        System.out.println();
        
        // Teste 4: Testando funcionalidades avançadas
        System.out.println("4. FUNCIONALIDADES AVANÇADAS:");
        System.out.println("Contando materiais por tipo:");
        
        int contEsfero = 0, contLapis = 0, contMarca = 0;
        for (MaterialEscrita material : materiais) {
            if (material instanceof Esferografica) contEsfero++;
            else if (material instanceof Lapiseira) contLapis++;
            else if (material instanceof Marcador) contMarca++;
        }
        
        System.out.println("- Esferográficas: " + contEsfero);
        System.out.println("- Lapiseiras: " + contLapis);
        System.out.println("- Marcadores: " + contMarca);
        
        // Teste 5: Buscando materiais por cor
        System.out.println("\n5. PESQUISANDO MATERIAIS POR COR 'Vermelha':");
        for (MaterialEscrita material : materiais) {
            if (material.getCor().toLowerCase().contains("vermelh")) {
                material.escrita();
                System.out.println("   Tipo: " + material.getClass().getSimpleName());
            }
        }
        
        System.out.println("\n=== TESTES CONCLUÍDOS ===");
    }
}