
public class exec_d {
	 
    public static int[] Sort(int[] list){
         
        for (int i = 0; i < list.length - 1; i++)
        {
            int cont = i;
            for (int j = i + 1; j < list.length; j++)
                if (list[j] < list[cont]) 
                    cont = j;
      
            int menor = list[cont];  
            list[cont] = list[i];
            list[i] = menor;
        }
        return list;
    }
     
    public static void main(String a[]){
         
        int[] list1 = {4,6,1,2,8,9,12,-7};
        int[] list2 = Sort(list1);
        System.out.printf("menor = ",list2[0]);
        System.out.printf("maior = ", list2[list2.length]);
    }
}