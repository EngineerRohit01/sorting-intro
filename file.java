public class Main{
	public static void  main(String[] args){
int[] arr ={2,3,4,5,6,5,3};

int key = 5;

search(arr,key);

}

public static void search(int[] arr ,int key){
int i =0;
while(i<arr.length){
if(arr[i] == key){
System.out.print("aray found at " + i);
}
i++;
}
}
}
