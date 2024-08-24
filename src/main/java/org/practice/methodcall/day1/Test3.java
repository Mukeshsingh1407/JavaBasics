package org.practice.methodcall.day1;

public class Test3 {

    class Test
    {
        public static void main (String [] args)
        {
            int [] x = null;
            x=new int[3];

            for(int i=0;i<3;i++)
            {
                x[i]=(i*2);
                System.out.print(x[i]+"  ");
            }
        }
    }


}
