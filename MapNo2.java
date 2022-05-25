/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumHashdanSet;

/**
 *
 * @author HP
 */
import java.util.*;
public class MapNo2 {
    public static void main(String[]args){
    Map<Integer,Integer> DataTinggiA = new HashMap<Integer,Integer>();
    DataTinggiA.put(168,50);
    DataTinggiA.put(170,60);
    DataTinggiA.put(165,56);
    DataTinggiA.put(168,55);
    DataTinggiA.put(172,60);
    DataTinggiA.put(170,70);
    DataTinggiA.put(169,66);
    DataTinggiA.put(165,56);
    DataTinggiA.put(171,72);
    DataTinggiA.put(166,56);

    Map<Integer,Integer> DataTinggiB = new HashMap<Integer,Integer>();
    DataTinggiB.put(170,66);
    DataTinggiB.put(167,60);
    DataTinggiB.put(165,59);
    DataTinggiB.put(166,58);
    DataTinggiB.put(168,58);
    DataTinggiB.put(175,71);
    DataTinggiB.put(172,68);
    DataTinggiB.put(171,68);
    DataTinggiB.put(168,65);
    DataTinggiB.put(169,60);
    
    DataTinggiB.replace(168,66);
    
    System.out.println("Data A : ");
    for (Integer keys : DataTinggiA.keySet())
        {
        System.out.println(keys +" ."+ DataTinggiA.get(keys));
        }  
    System.out.println("Data B : ");
    for (Integer keys : DataTinggiB.keySet())
        {
        System.out.println(keys +" ."+ DataTinggiB.get(keys));
        } 
    
    Map<Integer,Integer> DataGabungan = new HashMap<Integer,Integer>();
    for (Integer keys : DataTinggiA.keySet())
        {
            for(Integer keys2 : DataTinggiB.keySet()){
                if(keys.equals(keys2)){
                    DataGabungan.put(keys,DataTinggiA.get(keys));
                }
            }
        } 
    System.out.println("Data A yang tinggi badannya sama dengan B");
    for (Integer keys : DataGabungan.keySet())
        {
        System.out.println(keys +" ."+ DataGabungan.get(keys));
        } 
    
    }
}
