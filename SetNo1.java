/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumHashdanSet;

/**
 *
 * @author HP
 */   import java.io.*;
import java.util.*;
import java.util.stream.*;
public class SetNo1 {

    //method gabung set
    public static <T> Set<T> Gabung(Set<T> TinggiA, Set<T> TinggiB)
    {
        return new HashSet<T>() {
            {
                addAll(TinggiA);
                addAll(TinggiB);
            }
        };
    }
    
    //Method 2 mecari duplikat
    public static List<Integer> printDuplikat( Integer[] arr ){
        Set<Integer> duplicate = new HashSet<Integer>();
        List<Integer> data = new ArrayList<Integer>();
        for(int x :arr){
            if(!duplicate.add(x)){
                data.add(x);
            }
        }
        return data;
    }       
    
    public static Integer RangeNilai(Set<Integer> Data){
        Integer Range = 0;
        Integer Max=0, Min=0;
        for (int x :Data){
            if(Max == 0){
                Max = x;
            }else if(Max<x){
                Max = x;
            }
        }
        for (int x :Data){
            if( Min == 0){
                Min = x;
            }else if(Min>x){
                Min = x;
            }
        }
        Range = Max - Min;
        return Range;
    }
    
    public static Set<Integer> Compare(Set<Integer> data1, Set<Integer>data2){
        Set<Integer> Data = new HashSet<Integer>(); 
        for(Integer x : data2){
            if(!data1.contains(x)){
               Data.add(x); 
            }
        }
        return Data;
    }
    public static void main(String[] args)
    {
        Integer[] DataTinggiA = {168, 170, 165, 168, 172 , 170 , 169 , 165 , 171 , 166};
        Set<Integer> TinggiA = new HashSet<Integer>();
        TinggiA.addAll(Arrays.asList(DataTinggiA));
        
        Integer[] DataTinggiB = {170, 167, 165, 166, 168 , 175 , 172 , 171 , 168 , 169};
        Set<Integer> TinggiB = new HashSet<Integer>();
        TinggiB.addAll(Arrays.asList(DataTinggiB));
        
        Integer[] DataBeratA ={50 , 60 , 56 ,55 , 60 , 70 ,  66 , 56 , 72 , 56};
        Set<Integer> BeratA = new HashSet<Integer>();
        BeratA.addAll(Arrays.asList(DataBeratA));
        Integer[] DataBeratB ={66 , 60 , 59 , 58 , 58 , 71 , 68 , 68 , 65 , 60};
        Set<Integer> BeratB = new HashSet<Integer>();
        BeratB.addAll(Arrays.asList(DataBeratB));
        
        
        
        System.out.println("Tinggi badan di Tim A yang sama : " + printDuplikat(DataTinggiA));
        System.out.println("Tinggi badan di Tim B yang sama : " + printDuplikat(DataTinggiB));
        System.out.println("Berat badan di Tim A yang sama : " + printDuplikat(DataBeratA));
        System.out.println("Berat badan di Tim B yang sama : " + printDuplikat(DataBeratB));
        
        System.out.println("Range Tinggi di A : "+RangeNilai(TinggiA));
        System.out.println("Range Tinggi di B : "+RangeNilai(TinggiB));
        System.out.println("Range Tinggi di kedua Tim : "+RangeNilai(Gabung(TinggiA,TinggiB)));
        System.out.println("Range Berat di A : "+RangeNilai(BeratA));
        System.out.println("Range Berat di B : "+RangeNilai(BeratB));
        System.out.println("Range Berat di kedua Tim : "+RangeNilai(Gabung(BeratA,BeratB)));
        
        System.out.println("Tinggi Badan A yang tidak ada di B : "+Compare(TinggiB,TinggiA));
        System.out.println("Berat Badan B yang tidak ada di A : "+Compare(BeratA,BeratB));
        
    } 
}
