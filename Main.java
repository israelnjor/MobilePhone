//import java.sql.SQLOutput;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        book1.setAuthor("Israel");
        book1.setIsbn("25172655282");
        book1.setPageCount(250);
        book1.setPrice(370.50);


        MobilePhone phone2 = new MobilePhone();
        phone2.setBrand("Samsung");
        MobilePhone phone1 = new MobilePhone(
                "iPhone",
                "iPhone 12 Pro max",
                256,
                5000,
                4500.50
        );
        System.out.println(phone2.getFullDetails());
        System.out.println("Brand: " + phone2.getBrand());
        System.out.println(phone1.getFullDetails());
    }

}
