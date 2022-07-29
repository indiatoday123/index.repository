public class Main{
    public static void main(String[]args){
        System.out.println("Hello world");
        int arr[]={18,32,53,234,83,23,28,89,29,324,436};
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondLargest && arr[i] != largest){
                secondLargest= arr[i];
            }
           if(secondLargest == Integer.MIN_VALUE){
            System.out.print("no is secondLargest");
           }else{
            System.out.print("secondLargest no is : "+secondLargest);
           }
        }
  
    }
}
