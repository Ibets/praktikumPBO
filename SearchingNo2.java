/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import java.util.*;
public class SearchingNo2 {
    public static void main(String[]args){
        Integer[] TinggiTimA={168 , 170 , 165 , 168 , 172 , 170 , 169 , 165 , 171 , 166};
        Integer[] TinggiTimB={170 , 167 , 165 , 166 , 168 , 175 , 172 , 171 , 168 , 169};
        Integer[] BeratTimA={50 , 60 , 56 , 55 , 60 , 70 , 66 , 56 , 72 , 56};
        Integer[] BeratTimB={66 , 60 , 59 , 58 , 58 , 71 , 68 , 68 , 65 , 60};
        
        List<Integer> dataTinggiTimA = Arrays.asList(TinggiTimA);
        List<Integer> dataTinggiTimB = Arrays.asList(TinggiTimB);
        List<Integer> dataBeratTimA = Arrays.asList(BeratTimA);
        List<Integer> dataBeratTimB = Arrays.asList(BeratTimB);
        
        int jmlhtinggiygdicari = Collections.frequency(dataTinggiTimB, 168) + Collections.frequency(dataTinggiTimB, 160);
        int jmlhberatygdicari = Collections.frequency(dataBeratTimA,56) + Collections.frequency(dataBeratTimA, 53);
        
        System.out.println("Jumlah Tinggi di Tim B 168 & 160 adalah : " + jmlhtinggiygdicari);
        System.out.println("Jumlah Berat di Tim A 56 & 53 adalah : " + jmlhberatygdicari);
        
        boolean disjointtinggi = Collections.disjoint(dataTinggiTimA, dataTinggiTimB);
        boolean disjointberat = Collections.disjoint(dataBeratTimA, dataBeratTimB);
        
        if(disjointtinggi){
            System.out.println(" Data ada yang sama ");
        } else {
            System.out.println(" Data tidak ada yang sama ");
        }
        if (disjointberat){
            System.out.println(" Data ada yang sama ");
        }else {
            System.out.println(" Data tidak ada yang sama ");
        }
    }
}
