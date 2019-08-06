/*Given an array A[]  of n elements. Your task is to complete the Function num which returns an integer denoting the total number of times digit k appears in the whole array.

For Example:

A[]={11,12,13,14,15}, k=1

Output=6 //Count of the digit 1 in the array*/


{
          public static int num(int a[], int n, int k)
            {
                int count=0;
                 for(int i=0;i<n;i++){
                     int temp=a[i];
                     while(temp>0){
                         int unit_digit=temp%10;
                         temp=temp/10;
                         if(unit_digit==k){
                             count++;
                         }
                         
                         
                     }
                 }
                 return count;
            }
}
