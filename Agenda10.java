/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.agenda10;

import java.util.Scanner;







/**
 *
 * @author Alexia
 */
public class Agenda10 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // realize a soma de todos os elementos de uma matriz 10x10, contendo números inteiros.
       Scanner ler = new Scanner(System.in);
       int matriz[][] = new int[10][10];
       int soma = 0;
  
    
    
System.out.println("Inserindo dados na matriz. ");
   
   {  for( int linha = 0; linha<10; linha++){
      for( int coluna = 0; coluna<10; coluna++) {
System.out.println("Digite um número para a coluna ["+ coluna +"] e para a linha ["+ linha +"] da matriz:");
        matriz[linha][coluna] = ler.nextInt();
       soma += matriz[linha][coluna];
       }
   System.out.println("O resultado da soma dos números é: " +soma); 
   
    } 
      }    
        }   
         }
   
       
        
         
         
      
   
   
            
    
           
     
     
    
            
                  

           
    

