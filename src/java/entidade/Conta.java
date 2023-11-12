/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author Diogo Valongo
 */

enum TipoConta {
    CORRENTE,
    POUPANCA
}
public class Conta {
    private int id;
    private int numero;    
    private TipoConta tipo;
    private double saldo;
    private Cliente cliente;
}
