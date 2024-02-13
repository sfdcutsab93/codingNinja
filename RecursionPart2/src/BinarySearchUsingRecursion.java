public class BinarySearchUsingRecursion {
    public static int binarySearch(int a[], int si, int ei, int x){
        //element x not found
        if(si > ei){
            return -1;
        }
        //check for mid index return is int.
        int midIndex = (si + ei)/2;
        if(a[midIndex]==x){
            return midIndex;
        }else if(a[midIndex] < x){ // check if x is smaller than midIndex value
            return binarySearch(a, midIndex + 1, ei, x);
        }else{ // check if x is larger than midIndex value
            return binarySearch(a, si, midIndex - 1, x);
        }
    }
    public static void main(String[] args) {
        int[] a = {1,3,4,5,6,8};
        int len = a.length-1;
        System.out.println(binarySearch(a, 0, len, 100));
    }
}
