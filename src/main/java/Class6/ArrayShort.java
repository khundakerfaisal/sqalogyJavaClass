package Class6;

public class ArrayShort {
    public static void main(String[] args) {
        int [] value={40,10,50,20};
        for (int i=0;i<value.length;i++){
            for(int j=i+1;j<value.length;j++){
                if(value[i]>value[j]){
                    int temp=value[i];
                    value[i]=value[j];
                    value[j]=temp;
//                    System.out.println(value[i]);
                }
            }
            System.out.println(value[i]);
        }

    }
}
