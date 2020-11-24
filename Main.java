
import java.util.Scanner;

/*
safeguard measures in COVİD-19 
*/
public class Main {
    public static void korunma_yontemleri(int sayı){
        
        System.out.println("HER ŞEYDEN ÖNCE MASKE-MESAFE-TEMİZLİK kurallarına uyunuz...");
        if(sayı == 1){
            System.out.println("DR.OZ ABD de bu öneriyi vererek ismini dünyanın en ünlü isimlerinin olduğu şöhretler kaldırımına yazdırmıştır... ");
            System.out.println("Ellerinizi Türkler gibi uzun süre sabunladıktan sonra yıkayınız(minimum 20 saniye)");
        }else if(sayı == 2){
            System.out.println("Fransa'da biir genç covid sürecinde dışarda yemek yememizin bedeli nedir? Sorusunu sorduğunda verilen cevap açıktır: ");
            System.out.println("Büyük Annenizin hayatı....");
            System.out.println("Yaşlı ve Kronik hastalığı bulunan yakınlarınızdan ve iş arkadaşlarınızdan uzak durun...!!!");
        }else if(sayı == 3){
            System.out.println("Ben kesin olmam deme bu hastalığın dini dili ırkı mezhebi yok...");
            System.out.println("HERKES DÜNYANIN ŞUAN İÇİNDE BULUNDUĞU DURUMUN SORUMLUSU ");
            System.out.println("Sen doğayı plastikle nefessiz bıraktın,bırakmasan bile bırakana sessiz kaldın ŞİMDİ... ");
            System.out.println("BEDEL ÖDEME ZAMANI");
        }
        
         System.out.println("Daha öncede söylediğimiz gibi kendine cici bak (gg wp)");
       
    }
    public static void kovid_cıkıs(){
        System.out.println("covid-19 adlı hastalık temel olarak bir virüstür ve mers ile sars hastalıkları ile akrabalığı bulunmaktadır.");
        System.out.println("Çıkış noktası tam olarak bilinmesede bir tahmin söz konusu wuhandaki hayvan pazarı");
        
    }
    
    
    public static void main(String[] args) {
        System.out.println("Bu proje Vahşi insana doğasındaki deformasyonu hatırlatmak ve hastalıkla ilgili dikkat uyandırmak için yapılmıştır");
        System.out.println("her kelimesi eleştiri ve insanı yaşatmak için sert kalıplarla kurulmuştur...");
             System.out.println("********************************************************************************");
        Scanner scn = new Scanner(System.in);
        String kovid = "1)kovid bilgilendirme\n"
                + "2)kovid bilgilendirme versiyon2\n"
                + "3)kovid bilgilendirme versiyon3"
                + "4)çıkış noktası"
                + "q) veya Q) çıkış(bilgisayarınız yüksek bir işlemciye sahip değilse kasabilir ama bırakın bir kerede kaybettiğimz canlar için çalışsın..)"; 
        while(true){
                        System.out.println("********************************************************************************");

            System.out.println(kovid);
            
            System.out.println("********************************************************************************");
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
        String islem = scn.nextLine();
        if(islem.equals("1")){
            korunma_yontemleri(1);
        }else if(islem.equals("2")){
            korunma_yontemleri(2);
        }else if(islem.equals("3")){
            korunma_yontemleri(3);
        }else if(islem.equals("4")){
            kovid_cıkıs();
        }else if(islem.equals("q") || islem.equals("Q")){
            System.out.println("kovid bilgilendirme merkezinden çıkkış gerçekleştirilecektir lütfen bekleyiniz ");
            for( int i = 1000000;i>=0;i++){
                System.out.println("Kendine iyi bak ");
                System.out.println("*****************");
                System.out.println("Bak kendine iyi");
                System.out.println("SAKIN DEZENFEKTAN VE MASKENİ YANINDAN AYIRMA");
                System.out.println("UNUTMA BU SENİNDE PARÇASI BULUNDUĞUN DÜNYANIN BİR SORUNU ");
                System.out.println("Bugün başkasının başına geldi yarın senin başına gelir");
                System.out.println("onlar sadece birer sayı değil her birinin bir hikayesi var ");
                System.out.println("onlarda zengindi onlarda fakirdi \nkimi ekmek parası kazanmak için çıktı dışarı \nkimi ihale alıp refah seviyesini kourmak için ");
                
            }
            System.out.println("kendine çok cici bak küçükken sorumluluk sahibiyim diyen bir çocuktun şimdi o aşşalık dizini kır ve evinde oturki annen baban ve diğer aile büyüklerin hayatta kalabilsin ");
            System.out.println("şakaydı ama umarım mesajı almışsınızdır.\nimza =https://github.com/hllbr (namı_diğer =@prince) ");
            break;
        }
        }
    }
    
}
