import java.io.*;
class Sample3{
public static void main(String[]args)throws IOException{
  int star=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("How many do you show the star?");
String str=br.readLine();
int num=Integer.parseInt(str);
for(int i=1;i<=num;i++){

System.out.println(i+"stars want to be shown?Yes=1,No=0");
String a=br.readLine();
int b=Integer.parseInt(a);
if (b==1) {
     star+=1;
    
}
}
System.out.println("the most"+str+"in the"+star+"has been shown");
for(int p=1;p<=num;p++){
    System.out.print("*"); 
}



}
}
































































