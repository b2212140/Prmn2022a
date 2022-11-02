package lecture01;

public class kadai14 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for(int i=0;i<array.length;i++){
            array[i]=i+1;
        }
        int sum=0;

        for(int j=0;j<array.length;j=j+2){
            sum=sum+array[j];
        }
        System.out.println(sum);
    }
}
