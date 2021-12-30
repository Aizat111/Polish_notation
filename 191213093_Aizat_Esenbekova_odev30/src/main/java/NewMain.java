
import java.util.Scanner;


public class NewMain {
    static void Calculate(String [] st)
    {
        Integer [] dizi= new Integer[10];
        int indis=0;//adim adim nerde kaldigimizi kontrol etmeye yarayan  degisken
        for(int i=st.length-1;i>=0;i--)//stack yapisindaoldugu isin sondan baslatiyoruz
        {
            switch(st[i])
            {
                case "+": {
                            dizi[indis-2]=dizi[indis-1]+dizi[indis-2];
                            indis--;
                            break;
                          }
                
                case "*": {
                            dizi[indis-2]=dizi[indis-1]*dizi[indis-2];
                            indis--;
                            break;
                          }
                case "-": {
                            dizi[indis-2]=dizi[indis-1]-dizi[indis-2];
                            indis--;
                            break;
                          }
                case "/": {
                            dizi[indis-2]=dizi[indis-1]/dizi[indis-2];
                            indis--;
                            break;
                          }
                default:  {
                    //sayi gelse direkt diziye sayiyi atar
                            dizi[indis]=Integer.parseInt(st[i]);
                            indis++;
                           }
            }
        }
        System.out.println("Sonuc: "+dizi[indis-1]);
    }
  
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Lütfen ifadenizi bosluklara ayirarak giriniz:\n");
        String hamIfade=sc.nextLine();
        String BosluksuzSemboller[];
        BosluksuzSemboller=hamIfade.split(" ");// gelen ifadeni bosluklara gore karakterlere ayiriyoruz
        Calculate(BosluksuzSemboller);//sonucun hesaplanmasi icin fonksiyona gonderiyoruz
        
    }
    
}
