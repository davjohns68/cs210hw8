/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author davjohns
 */
public class RationalNumberMain {
    public static void main(String[] args) {
        RationalNumber f = new RationalNumber(3,5);
        RationalNumber g = new RationalNumber(-1,5);
        
        System.out.println(f.add(g));
        //System.out.println(f.getDenominator());
        //System.out.println(f);
    }
}
