import java.util.*;

public class Stock {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("Наименование №1");
        arrayList.add("Наименование №2");
        arrayList.add("Наименование №3");
        arrayList.add("Наименование №4");

        System.out.print("Товар в наличии на складе №1: ");
        Iterator<String> iterator = arrayList.iterator();
        for (String product : arrayList) {

            System.out.print(product + ", ");
        }
        System.out.println();

        List<String> linkedList = new LinkedList<>();

        linkedList.add("Наименование №5");
        linkedList.add("Наименование №6");
        linkedList.add("Наименование №7");

        System.out.print("Товар в наличии на складе №2: ");
        ListIterator<String> iteratorN = linkedList.listIterator();
        for (String productN : linkedList) {

            System.out.print(productN + ", ");
        }
        System.out.println();
    }


}
