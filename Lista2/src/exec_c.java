public class exec_c {
 
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
         
        int[] list1 = {10,34,2,56,7,67,88,42};
        int[] list2 = Sort(list1);
        for(int i:list2){
            System.out.print(i);
            System.out.print("\t");
        }
    }
}