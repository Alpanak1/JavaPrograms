package ex_28052024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab237 {
    public static void main(String[] args) {
        List url_pages=new ArrayList<>();
        url_pages.add("LoginPage");
        url_pages.add("Dashboard");
        url_pages.add("HomePage");
        System.out.println(url_pages);
        System.out.println(url_pages.get(2));
        for (int i=0;i<url_pages.size();i++){
            System.out.println(url_pages.get(i));
        }

        for (Object obj:url_pages){
            System.out.println(obj);
        }

        Iterator itr=url_pages.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
