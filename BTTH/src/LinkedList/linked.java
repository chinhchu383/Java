package LinkedList;

import java.util.LinkedList;

public class linked{
    public static void main(String[] args) {
        
        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.add("HTML");
        linkedlist.add("JAVA");
        linkedlist.add("C++");
        showList(linkedlist);
        System.out.println("-----------------------------------");
        System.out.println("vi du addAll");
        System.out.println("linkA: ");
        LinkedList<String>listA = new LinkedList<>();
        listA.addAll(linkedlist);
        showList(listA);
        System.out.println("xoa phan tu k thuoc B khoi A");
        LinkedList<String>listB = new LinkedList<>();
        listB.add("JAVA");
        listA.retainAll(listB);
        showList(listB);

    }

public static void showList(LinkedList<String> linkedList)
{
    for(String obj : linkedList)
        System.out.println("\t"+obj+",");
    System.out.println();
}
}