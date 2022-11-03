import java.io.*;

class shift_Cipher
{
public static void main(String[]args)throws IOException
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int key=0,i,pt_len=0,ch=0;
    System.out.println("Choice\n");
    System.out.println("1 : Encryption");
    System.out.println("2 : Decryption");
    System.out.println("Enter Your choice\n");
    ch=Integer.parseInt(br.readLine());
    String pt,ct="";
    System.out.println("Enter the PlainText :\n");
    pt=br.readLine();
    System.out.println("Enter the key : ");
    key=Integer.parseInt(br.readLine());
    pt=pt.toLowerCase();
pt_len=pt.length();
switch (ch) {
    case 1:

    System.out.println("Encryption");
    i=0;
    while(i<pt_len){
        if(pt.charAt(i)!=' ')
        ct = ct+(char)(((int)pt.charAt(i)+key-97)%26+97);
               
                  else
                  ct=ct+' ';  
                  i++;
    }
    
    
    
    System.out.println("Cipher Text : "+ct);
        break;

case 2:
System.out.println("Decryption");
for(i=0;i<pt_len;i++)
    if(pt.charAt(i)!=' ')
     ct = ct+(char)(((int)pt.charAt(i)-key-97)%26+97);
            
               else
               ct=ct+' '; 
    
    
    System.out.println("Cipher Text : "+ct);
    break;

    default: System.out.println("Invalid Choice\n");
        break;
}
    
}

}