/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.matheusfatguys.algorithms.dynamicconnectivity;

/**
 *
 * @author mathe
 */
public class QuickUnion extends DynamicConnectivity{

    public QuickUnion(int N) {
        super(N);
    }

    @Override
    public int root(int i) {
        while(ids[i]!=i){
            i=ids[i];
        }
        return i;
    }

    @Override
    public void union(int p, int q) {
        int pRoot = root(p);
        int qRoot = root(q);
               
        ids[pRoot]=qRoot;
    }
    
}
