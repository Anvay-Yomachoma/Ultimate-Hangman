import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuickSort {
private static List<Users> inputArray = new ArrayList<>();
static int cat, diff;
    public QuickSort(List<Users> inputArray, int c, int d){
        QuickSort.inputArray = inputArray;
        cat = c;
        diff = d;
    }
 
    public void startQuickStart(int start,int end){
        int q;
        if(start<end){
            q = partition(start, end);
            startQuickStart(start, q);
            startQuickStart(q+1, end);
        }
    }
 
    public List<Users> getSortedArray(){
        return QuickSort.inputArray;
    }
 
    int partition(int start,int end){
        int init = start;
        int length = end;
        int pivotIndex = 0;
        Users pivot = inputArray.get(pivotIndex);
        while(true)
        {
            while(inputArray.get(length).getPB(cat, diff)>pivot.getPB(cat, diff) && length>start){
                length--;
            }
            
            while(inputArray.get(init).getPB(cat, diff)<pivot.getPB(cat, diff) && init<end){
                init++;
            }
            
            if(init<length){
            	Collections.swap(inputArray, init, length);
                length--;
                init++;
            }else{
                return length;
            }
        }
        
    }
}