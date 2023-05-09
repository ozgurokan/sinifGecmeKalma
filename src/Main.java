import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mat, fiz, turk, kim, muzik,total = 0,avarage;
        int counter = 0;



        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notu: ");
        mat = input.nextDouble();
        if (mat>0 && mat<100){
            counter += 1;
            total += mat;
        }

        System.out.print("Fizik Notu: ");
        fiz = input.nextDouble();

        if (fiz>0 && fiz<100){
            counter += 1;
            total += fiz;
        }

        System.out.print("Türkce Notu: ");
        turk = input.nextDouble();

        if (turk>0 && turk<100){
            counter += 1;
            total += turk;
        }

        System.out.print("Kimya Notu: ");
        kim = input.nextDouble();

        if (kim>0 && kim<100){
            counter += 1;
            total += kim;
        }

        System.out.print("Müzik Notu: ");
        muzik = input.nextDouble();
        if (muzik>0 && muzik<100){
            counter += 1;
            total += muzik;
        }

        avarage = total/counter;
        if (avarage>= 50){
            System.out.println("Tebrikler Sınıfı Geçtiniz :)");
        } else if (avarage <50) {
            System.out.println("Maalesef Sınıfta Kaldınız :(");
        } else{
            System.out.println("Hiçbir Notunuz Ortalamaya Dahil değil. Geçerli not giriniz");
        }
        System.out.println("Not Ortalamanız: "+ avarage);
        // hiçbir not 0-100 arasında değilken NaN döndürüyor... Bunu avarage değişkeni ile nasıl karşılaştıracağımı bulamadım o yüzden else if kullandım.
    }
}