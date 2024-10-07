package lection1;

public class task9 {
    public static void main(String[] args) {
      int[] arr = new int[6];// создали массив целых чисел
      System.out.println(arr.length);//Вывели его длинну
      arr = new int[] {1, 2, 3, 5, 6, 7};// положили в массив числа
      System.out.println(arr.length);
      
      int[] arr2 = new int[10] ;
      arr[3] = 13;// присвоили элементу с индксом 3 значение 13.
      System.out.println(arr[3]);
    }
}
