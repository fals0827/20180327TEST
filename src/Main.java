import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<books> list=new ArrayList<books>();
        int a = 1 , b = 0;
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
            int x = scn.nextInt();
            int listsize = list.size();
            switch (x){
                case 0:
                    a=0;
                    break;
                case 1:
                    System.out.println("書名:");
                    String tit =scn.next();
                    System.out.println("作者:");
                    String aut =scn.next();
                    System.out.println("出版社:");
                    String pub =scn.next();
                    System.out.println("ISBN:");
                    String isb =scn.next();
                    System.out.println("價格:");
                    int pri = scn.nextInt();
                    list.add(new books(tit,aut,pub,isb,pri));
                    break;
                case 2:
                    int i = 0 ;
                    System.out.println("請輸入錯誤之書名:");
                    String wrongTitle =scn.next();
                    while (i < listsize){
                        books bookN = (books)list.get(i);
                        if (bookN.getTitle().equals(wrongTitle)){
                            System.out.println("請輸入正確之書名");
                            bookN.setTitle(scn.next());
                            i = listsize;
                        }else {
                            i++;
                        }
                    }
                    break;
                case 3:
                    int j = 0;
                    System.out.println("請輸入書名:");
                    String strTitle = scn.next();
                    while (j < listsize){
                        books bookN = (books)list.get(j);
                        if (bookN.getTitle().equals(strTitle)){
                            bookN.showInfo();
                            j = listsize;
                        }
                        else {
                            j ++;
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
