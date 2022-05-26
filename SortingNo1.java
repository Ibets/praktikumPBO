/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.util.*;
public class SortingNo1 {
    public static void main(String[]args){
        Integer[] TinggiTimA={168 , 170 , 165 , 168 , 172 , 170 , 169 , 165 , 171 , 166};
        Integer[] TinggiTimB={170 , 167 , 165 , 166 , 168 , 175 , 172 , 171 , 168 , 169};
        Integer[] BeratTimA={50 , 60 , 56 , 55 , 60 , 70 , 66 , 56 , 72 , 56};
        Integer[] BeratTimB={66 , 60 , 59 , 58 , 58 , 71 , 68 , 68 , 65 , 60};
        
        List<Integer> dataTinggiTimA = Arrays.asList(TinggiTimA);
        List<Integer> dataTinggiTimB = Arrays.asList(TinggiTimB);
        List<Integer> dataBeratTimA = Arrays.asList(BeratTimA);
        List<Integer> dataBeratTimB = Arrays.asList(BeratTimB);
        
        Collections.sort(dataTinggiTimA);
        Collections.sort(dataTinggiTimB);
        Collections.sort(dataBeratTimA);
        Collections.sort(dataBeratTimB);
        
        System.out.println("data Tinggi Tim A (Sorted Ascending) ; " + dataTinggiTimA);
        System.out.println("data Tinggi Tim B (Sorted Ascending) ; " + dataTinggiTimB);
        System.out.println("data Berat Tim A (Sorted Ascending) ; " + dataBeratTimA);
        System.out.println("data Berat Tim B (Sorted Ascending) ; " + dataBeratTimB);
        System.out.println();
        Collections.reverse(dataTinggiTimA);
        Collections.reverse(dataTinggiTimB);
        Collections.reverse(dataBeratTimA);
        Collections.reverse(dataBeratTimB);
        
        System.out.println("data Tinggi Tim A (Sorted Descending) ; " + dataTinggiTimA);
        System.out.println("data Tinggi Tim B (Sorted Descending) ; " + dataTinggiTimB);
        System.out.println("data Berat Tim A (Sorted Descending) ; " + dataBeratTimA);
        System.out.println("data Berat Tim B (Sorted Descending) ; " + dataBeratTimB);
        
        System.out.println();
        
        System.out.println("Tinggi max Tim A : "+Collections.max(dataTinggiTimA));
        System.out.println("Tinggi min Tim A : "+Collections.min(dataTinggiTimA));
        System.out.println("Berat max Tim A : "+Collections.max(dataBeratTimA));
        System.out.println("Berat min Tim A : "+Collections.max(dataBeratTimA));
        System.out.println("Tinggi max Tim B : "+Collections.max(dataTinggiTimB));
        System.out.println("Tinggi min Tim B : "+Collections.min(dataTinggiTimB));
        System.out.println("Berat max Tim B : "+Collections.max(dataBeratTimB));
        System.out.println("Berat min Tim B : "+Collections.max(dataBeratTimB));
        
        System.out.println();
        Integer[] TinggiTimC = new Integer[10];
        List<Integer> dataTinggiTimC = Arrays.asList(TinggiTimC);
        Collections.copy(dataTinggiTimC,dataTinggiTimB);
        System.out.println("Data Tinggi Tim C : "+ dataTinggiTimC);
        
        Integer[] BeratTimC = new Integer[10];
        List<Integer> dataBeratTimC = Arrays.asList(BeratTimC);
        Collections.copy(dataTinggiTimC,dataBeratTimB);
        System.out.println("Data Berat Tim C : "+ dataTinggiTimC);
    }
        
    
}
