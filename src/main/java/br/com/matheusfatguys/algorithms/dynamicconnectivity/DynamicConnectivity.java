/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.matheusfatguys.algorithms.dynamicconnectivity;

import br.com.matheusfatguys.algorithms.Algorithm;

/**
 *
 * @author mathe
 */
public abstract class DynamicConnectivity  implements Algorithm{
    
    final int ids[];
    
    public DynamicConnectivity(int N){
        ids = new int[N];
        for (int i = 0; i < ids.length; i++) {
            ids[i]=i;            
        }
    }

    public boolean connected(int p, int q) {
        return root(p)==root(q);
    }
    
    public abstract int root(int i);
    public abstract void union(int p, int q);
    
    
    public int[] getSolution() {
        return ids;
    }
}
