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
public class WeigthedQuickUnion extends QuickUnion {

    int[] s;

    public WeigthedQuickUnion(int N) {
        super(N);
        s = new int[N];
        for (int i = 0; i < s.length; i++) {
            s[i] = 1;
        }
    }

    @Override
    public void union(int p, int q) {
        int pRoot = root(p);
        int qRoot = root(q);
        if(pRoot==qRoot){
            return;
        }
        
        if(s[pRoot]<s[qRoot]){
            ids[pRoot]=qRoot;
            s[qRoot]+=s[pRoot];
        }
        else{
            ids[qRoot]=pRoot;
            s[pRoot]+=s[qRoot];
        }
        
        
    }

}
