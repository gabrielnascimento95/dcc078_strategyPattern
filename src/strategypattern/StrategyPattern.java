/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

/**
 *
 * @author ice
 */
public class StrategyPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto p1 = new TV();
        Produto p2 = new Camera();
        Produto p3 = new Celular();
        
        System.out.println(p1.getNome() + " na promoção " + p1.getPromocao().obterPromocao() + " com desconto de: " +
        p1.getPromocao().obterDesconto() + "%\n");
        
        System.out.println(p2.getNome() + " na promoção " + p2.getPromocao().obterPromocao() + " com desconto de: " +
        p2.getPromocao().obterDesconto()+ "%\n");
        
        System.out.println(p3.getNome() + " na promoção " + p3.getPromocao().obterPromocao() + " com desconto de: " +
        p3.getPromocao().obterDesconto() + "%\n");
    }
    
}
