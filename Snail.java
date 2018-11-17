public class Snail {

    public static int[] snail(int[][] array) 
    {
      int[] answer_arr = new int[array.length*array.length];
      int answer_i=0, j_min=0, i_min=0;
      int i_max=array.length, j_max=array.length;
      for(int k=0; k<array.length;k++)
      {
        if(i_min>=i_max || j_min>=j_max || answer_i>= answer_arr.length)
          break;
        for(int i=i_min;i<i_max;i++)
        {
           answer_arr[answer_i] = array[i][j_max-1];
           answer_i++;
        }
        j_max--;
        if(i_min>=i_max || j_min>=j_max || answer_i>= answer_arr.length)
          break;
        for(int j=j_max; j>j_min; j--)
        {
          answer_arr[answer_i] = array[i_max-1][j];
          answer_i++;
        }
        i_max--;
        if(i_min>=i_max || j_min>=j_max || answer_i>= answer_arr.length)
          break;
        for(int i=i_max;i>i_min;i--)
        {
          answer_arr[answer_i] = array[i][j_min];
          answer_i++;
        }
        j_min++;
        if(i_min>=i_max || j_min>=j_max || answer_i>= answer_arr.length)
          break;
        for(int j=j_min;j>j_max;j++)
        {
          answer_arr[answer_i] = array[i_min][j];
          answer_i++;
        }
        i_min++;
       }
       for(int i=0;i<answer_arr.length;i++)
       {
         System.out.println(answer_arr[i]);
       }
     return answer_arr;
    }
}
