public class MergeSort {
    public static int[] mergeSort(int[] arr, int l, int r){
        if(l<r){
            int m = (l+r)/2;
            //System.out.print("m "+m);
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            //System.out.println("Before calling Merge "+l+" "+r+" "+m);
            //merge(arr,l,m,r);
            
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] inputArr = {2, 13, 4, 1, 3, 6, 28};
        int[] outputArr = mergeSort(inputArr, 0, 7);
        for(int i = 0;i<7;i++){
            System.out.print(outputArr[i]); //2,13,4,1,3,6,28
        }
        //System.out.println(mergeSort(inputArr, 0, 7));
    }
    public static 
    /*public static void merge(int[] arr, int l, int m, int r){
        int num1 = m-l+1;
        System.out.print("num1 "+num1);
        int num2 = r-m;
        System.out.print("num2 "+num2);
        int[] L = new int[num1];
        int[] R = new int[num2];
        for(int i=0;i<num1;++i){
            L[i] = arr[l+1];
        }
        for(int j=0;j<num2;++j){
            R[j] = arr[m+1+j];
        }

        int i=0;
        int j=0;
        int k=l;
        while(i<num1 && j<num2){
            if(L[i]<R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i<num1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<num2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }*/

}
