import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] arg) {

        System.out.println(getRow( 0));

    }

  
    public static List<Integer> getRow(int rowIndex)  {
        ArrayList<ArrayList<Integer>> rows= new ArrayList<ArrayList<Integer>>(rowIndex);

         ArrayList<Integer> l1= new ArrayList<Integer>(1);
         ArrayList<Integer> l2= new ArrayList<Integer>(2);
         l1.add(1);
         l2.add(1);
         l2.add(1);
         if(rowIndex ==0){
            return l1;
         }
         if(rowIndex ==1){
            return l2;
         }
         rows.add(l1);
        rows.add(l2);
       return genreterow(rows, rowIndex,2);

    // return l1;
    }

    public static ArrayList<Integer> genreterow(
        ArrayList<ArrayList<Integer>> rows,
        final int rowsIndex,
        final int currentRowIndex
        ){
        ArrayList<Integer> currentrow= new ArrayList<Integer>(currentRowIndex+1);
        ArrayList<Integer> previousRow= rows.get(currentRowIndex-1);
        System.out.println(previousRow);
            currentrow.add(0,1);
            // currentrow.add(1,currentRowIndex);
            
            for(int i=1;i<previousRow.size();i++){
                currentrow.add(previousRow.get(i)+previousRow.get(i-1));
            }
            currentrow.add(currentRowIndex,1);
            // currentrow.add(currentRowIndex-1,currentRowIndex);
            if(currentRowIndex==(rowsIndex)){
                return currentrow;
            }
            rows.add(currentrow);
        return genreterow(rows, rowsIndex, currentRowIndex+1);
    }
}