
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите время");
        Scanner a = new Scanner(System.in);
        System.out.println("Часов(от 9 до 17):");
        int h = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.println("Минут:");
        int m = b.nextInt();
        if(m<10){
            System.out.printf("Текущее время %d:0%d\n",h,m);
        }else {
            System.out.printf("Текущее время %d:%d\n", h, m);
        }
        if (h>=17){
            System.out.println("Рабочий день закончен!");
        }
        if (h<9){
            System.out.println("Рабочий день еще не начался");
        } else {
          int deadline_h=17;
          int deadline_m = 60;
          int ostatok_s = ((deadline_h-h-1)*3600)+((deadline_m-m)*60);
          if (h>=17){
              System.out.println("Идите домой!");
          }else {
              System.out.println("До конца рабочего дня осталось:");
              System.out.println("Секунд(суммарно):" + ostatok_s);

              int ostatok_h = deadline_h - h - 1;
              System.out.println("Часов:" + ostatok_h);

              int ostatok_m = deadline_m - m;
              System.out.println("Минут:" + ostatok_m);

              int ostatok_h_sum = ostatok_h + 1;
              System.out.println("Часов суммарно(до 17):" + ostatok_h_sum);
              int ostatok_m_sum = ((ostatok_h * 60) + ostatok_m);
              System.out.println("Минут суммарно:" + ostatok_m_sum);

          }
        }
    }
}