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
public class PathCompressedWeigthedQuickUnion extends WeigthedQuickUnion{
    
    public PathCompressedWeigthedQuickUnion(int N) {
        super(N);
    }
    
    @Override
    public int root(int i) {
        while(ids[i]!=i){
            ids[i]=ids[ids[i]];
            i=ids[i];
        }
        return i;
    }
    
}
