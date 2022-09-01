import java.io.*;
class Prime {
    public static void main(String[] args) 
    {
        try
    {
    InputStreamReader i = new  InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(i);
    System.out.println("Enter the number : ");
    String s1 = br.readLine();
    int n = Integer.parseInt(s1);
    for(int c=1;c<=n;c++){
        int count=0;
        for(int j=2;j<c;j++){
            if(c%j==0){
                count=1;
            }
        }
        if(count==0){
            System.out.println("Prime number : "+c);
        }
    }
    }
    catch (Exception e)
    {
        System.out.println("Exception"+e);
    }
}
}
