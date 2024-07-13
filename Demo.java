public class Demo{

public static void main(String[] args){

int []arr ={15,8,9,2,11,4};

 
int temp;

for(int i=0;i<arr.length;i++){
   for(int j=i+1;j<arr.length;j++){

int x=arr[i];
int y= arr[j];

if(x<y){
temp =arr[i];

arr[i] =arr[j];

arr[j] = temp;
}
}
 
}
for(int n :arr){

System.out.println(n);

}
}
}

