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
public class Celular extends Produto{

    public Celular() {
        this.nome = "Celular";
        this.promocao = new PromocaoQueimaEstoque();
    }
    
    
}