/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.matheusfatguys.algorithms.dynamicconnectivity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mathe
 */
public class PathCompressedWeigthedQuickUnionTest {
    
    public PathCompressedWeigthedQuickUnionTest() {
    }
    
    @Test
    public void testarDemo(){
        DynamicConnectivity algorithm = new PathCompressedWeigthedQuickUnion(10);
        int expected[] = new int[]{6,2,6,4,6,6,6,6,4,4};
        algorithm.union(4,3);
        algorithm.union(3,8);
        algorithm.union(6,5);
        algorithm.union(9,4);
        algorithm.union(2,1);
        algorithm.union(5,0);        
        algorithm.union(7,2);
        algorithm.union(6,1);
        algorithm.union(7,3);
        
        int actual[] = algorithm.getSolution();
        assertArrayEquals(expected, actual);
        
        for (int i = 0; i < actual.length; i++) {
            int root = algorithm.root(i);
            
            assertEquals(6, root);
            
        }
    }
    
}
