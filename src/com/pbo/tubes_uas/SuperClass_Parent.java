/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbo.tubes_uas;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author faikar & hasbi
 */
public class SuperClass_Parent {
    
    public double PisangGoreng;
    public double ChickenBurger;
    public double ChickenLegend;
    public double IndomieGoreng;
    public double KentGoreng;
    
    
    public double SuNgat;
    public double KopSus;
    public double STMJ;
    public double WeJa;
    public double TehManis;
    
    
    public double Cemilan;
    public double Minuman;
    public double TotalofCM;
    
    public double AllTotalofMD;
    
    
    public double GetAmount(){
        
        
        Cemilan = PisangGoreng + ChickenBurger + ChickenLegend + IndomieGoreng + KentGoreng;
        
        Minuman = SuNgat + KopSus + STMJ + WeJa + TehManis;
        
        TotalofCM = Cemilan + Minuman;
        
        //AllTotalofMD = TotalofMD;
        
        //return AllTotalofMD;
        return TotalofCM;

    }
    
    
    private JFrame frame;
    
    /*public void iExitSystem(JFrame frmae){
        
        frame = new JFrame("Exit");
        
       // if(JOptionPane.showMessageDialog(frame, "Confirm if you want to exit.", "Online Food Ordering System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
        
         if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Online Food Ordering System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
       
            
            System.exit(0);
        } */
    
    
    //========================================++Price++=================================================
    
    public double pPisangGoreng = 10900;
    public double pChickenBurger = 44751;
    public double pChickenLegend = 60376;
    public double pIndomieGoreng = 12499;
    public double pKentGoreng = 17900;
    
    
    public double pSuNgat = 7900;
    public double pKopSus = 14900;
    public double pSTMJ = 12900;
    public double pWeJa = 10900;
    public double pTehManis = 4900;
    
    //===================================================================================================
    
    public double mcTax = 0.90;
    
    public Double cFindTax(double cAmount){
        
        double FindTax = cAmount - (cAmount * mcTax);
        
        return FindTax;
 
    }
    
    //===================================================================================================
    
}

