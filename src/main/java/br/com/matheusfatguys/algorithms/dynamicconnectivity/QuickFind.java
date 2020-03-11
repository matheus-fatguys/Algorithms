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
public class QuickFind extends DynamicConnectivity{    
    
    public QuickFind(int N) {
        super(N);
    }
    
    @Override
    public int root(int i){
        return ids[i];
    }

    @Override
    public void union(int p, int q) {        
        
        int pRoot=ids[p];
        int qRoot=ids[q];
        for (int i = 0; i < ids.length; i++) {
            if(ids[i]==pRoot){
               ids[i]=qRoot;
            }            
        }
        
    }

    
    
}
