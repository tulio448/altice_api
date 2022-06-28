package org.altice;

import java.util.*;

public class AlticciService {

    private static List<Integer> seq;

    public AlticciService(){
        seq = new ArrayList<Integer>();
        seq.add(0);
        seq.add(1);
        seq.add(1);
    }

    public static int a(int n){
        if(n < seq.size()){
            return seq.get(n);
        }else{
            for(int i = seq.size(); i <= n; i++){
                seq.add(seq.get(i-3) + seq.get(i-2));
            }
            return seq.get(n);
        }
    }

}
