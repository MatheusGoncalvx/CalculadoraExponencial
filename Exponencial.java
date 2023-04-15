/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exponencial;

/**
 *
 * @author ADM
 */
import javax.swing.JOptionPane;

public class Exponencial {

  public static void main(String[] args) {

    // Obter o valor da base da exponencial
    String inputBase = JOptionPane.showInputDialog("Digite o valor da base da exponencial:");
    double base = Double.parseDouble(inputBase);

    // Obter o valor do expoente da exponencial
    String inputExpoente = JOptionPane.showInputDialog("Digite o valor do expoente da exponencial:");
    double expoente = Double.parseDouble(inputExpoente);

    // Calcular o resultado da exponencial
    double resultado = Math.pow(base, expoente);

    // Exibir o resultado em uma caixa de diálogo
    JOptionPane.showMessageDialog(null, "O resultado da exponencial é: " + resultado);
  }
}