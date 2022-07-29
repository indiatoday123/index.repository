

public class swap {
  public static void done(int arr[]){
    int start=0;
    int end=arr.length-1;
    while(start<=end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
    for(int  i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
   }
    public static void main(String[]args){
        int []arr={18,43,98,2321,343,535,2421};
    
       
    done(arr) ;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        
    }
    System.out.println();
    System.out.print("after bubble sort algorithms : ");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
      
    }
}
