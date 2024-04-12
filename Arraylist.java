import java.util.ArrayList;
//import java.util.*;
public class Arraylist {
    // Arraylist is the type of the array which size is variable
    public static void main(String[] args){
       ArrayList<Integer>kam= new ArrayList<>();
       kam.add(12);
       kam.add(18);
       kam.add(25);
       kam.add(26);
       kam.add(28);
       kam.add(35);
       kam.add(3);
       kam.add(6);
       kam.add(8);
       kam.add(10); 
      int min = binarySearchMin(kam);
        System.out.println(min+" "+kam.indexOf(min));
    }

    //    int k=-1;
    //     if(t==kam.get(kam.size()-1)){
    //      k=kam.size()-1;
    //    } 
    //    System.out.println(kam);
    //    for(int i=0;i<kam.size()-1;i++){
    //     // if(kam.get(i)%2==1){
    //     //     kam.set(i,-1);
    //     // /}
    //     if(kam.get(i)>kam.get(i+1)){
    //         p=i+1;
    //     }
    //     if(t==kam.get(i))
    //      k=i;
    //    } 

      
    //   // Collections.sort(kam);
    //    System.out.println(p+" "+k);
      
    public static int binarySearchMin(ArrayList<Integer> kam) {
        int l= 0;
        int h = kam.size() - 1;

        while (l < h) {
            int m = l+ (h- l) / 2;

            if (kam.get(m) > kam.get(h)) {
                l= m + 1;
            } else {
                h = m;
            }
        }

        return kam.get(l);
    }
      }
