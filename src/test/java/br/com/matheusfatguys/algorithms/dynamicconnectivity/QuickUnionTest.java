/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.matheusfatguys.algorithms.dynamicconnectivity;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author mathe
 */
public class QuickUnionTest {
    @Test
    public void testarDemo(){
        DynamicConnectivity algorithm = new QuickUnion(10);
        int expected[] = new int[]{1,8,1,8,3,0,5,1,8,8};
        algorithm.union(6,5);
        algorithm.union(5,0);
        algorithm.union(0,1);
        algorithm.union(2,1);
        algorithm.union(7,1);
        algorithm.union(1,8);
        
        algorithm.union(4,3);
        algorithm.union(3,8);
        algorithm.union(9,8);
        
        int actual[] = algorithm.getSolution();
        assertArrayEquals(expected, actual);
    }
}
