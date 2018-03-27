import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<books> list=new ArrayList<books>();
        int a = 1 ;
        while (a != 0){
            System.out.println("功能表");
            System.out.println("=============================");
            System.out.println("1. 新增書目");
            System.out.println("2. 修改書目");
            System.out.println("3. 查詢書名");
            System.out.println("4. 查看書庫");
            System.out.println("0. 結束使用");
            System.out.println("=============================");
            System.out.println("請輸入選項:");
            int listsize = list.size();
            int x = scn.nextInt();
            switch (x){
                case 0:
                    a=0;
                    break;
                case 1:
                    System.out.println("書名\t"+"作者\t"+"出版社\t"+"ISBN\t"+"價格");
                    list.add(new books(scn.next(),scn.next(),scn.next(),scn.next(),scn.nextInt()));
                    break;
                case 2:
                    int i = 0 ;
                    while (i < listsize){
                        books bookN = (books)list.get(i);
                        if (bookN.getTitle().equals(scn.next())){
                            bookN.setTitle(scn.next());
                            i = listsize;
                        }else {
                            i++;
                        }
                    }
                    break;
                case 3:
                    int j = 0;
                    String strTitle = scn.next();
                    while (j < listsize){
                        books bookN = (books)list.get(j);
                        if (bookN.getTitle().equals(strTitle)){
                            bookN.showInfo();
                            j = listsize;
                        }
                    }
                    break;
                case 4:
                    System.out.println(listsize+"本");
                    break;
            }

        }
        System.out.println("謝謝使用本系統");
    }
}
