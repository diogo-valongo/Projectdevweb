/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Diogo Valongo
 */
public class Operacao {
    private int id;
    private String nome;
    private int tipo;
    private double valorEntrada;
    private double valorSaida;
    private Conta contaEntrada;
    private Conta contaSaida;
    private Date data;
    // Calendar se usa Calendar c = Calendar.getInstance(); para pegar uma intancia de calendario 
    // Será util para usar um Date data = c.getTime(); para pegar a data de hoje
    // DateFormat será util para formatar essa data adiquirida
    
}
