public class QuickSort {
    public static void quickSort(int a[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pivotIndex = partition(a, si, ei);
        quickSort(a, si, pivotIndex-1);
        quickSort(a, pivotIndex+1, ei);
    }

    public static int partition(int input[],int sI,int eI)
    {
        int pivot=input[sI];
        int count=0;
        for(int i=sI+1;i<=eI;i++)
        {
            if(input[i]<=pivot)
                count++;
        }
        int pivotPos=sI+count;
        int temp=input[sI];
        input[sI]=input[pivotPos];
        input[pivotPos]=temp;
        int i=sI;
        int j=eI;
        while(i<pivotPos && j>pivotPos)
        {
            if(input[i]<=input[pivotPos])
                i++;
            else if(input[j]>input[pivotPos])
                j--;
            else
            {
                int temp_=input[i];
                input[i]=input[j];
                input[j]=temp_;
                i++;j--;
                
            }
        }
        return pivotPos;
    }
    public static void main(String[] args) {
        int a[] = {10,4,5,9,8,6,12,11,7};
        quickSort(a,0,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
