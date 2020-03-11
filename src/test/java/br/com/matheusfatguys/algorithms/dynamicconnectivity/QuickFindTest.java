package br.com.matheusfatguys.algorithms.dynamicconnectivity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author mathe
 */
public class QuickFindTest {
    
    public QuickFindTest() {
    }
    
    @Test
    public void testarDemo(){
        DynamicConnectivity algorithm = new QuickFind(10);
        int expected[] = new int[]{1,1,1,8,8,1,1,1,8,8};
        algorithm.union(0,5);
        algorithm.union(5,6);
        algorithm.union(6,1);
        algorithm.union(7,2);
        algorithm.union(2,1);
        
        algorithm.union(9,4);
        algorithm.union(4,3);
        algorithm.union(3,8);
        
        int actual[] = algorithm.getSolution();
        assertArrayEquals(expected, actual);
    }
    
}
