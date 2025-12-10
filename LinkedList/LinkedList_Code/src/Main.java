import java.util.Collections;
import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(4);
        list1.addAll(list2);
        Collections.sort(list1);
        for (Integer  i : list1 ) {
            System.out.println(i);
        }

        list1.clear();
        list2.clear();
        list1.addAll(list2);
        Collections.sort(list1);
        for (Integer i : list1) {
            System.out.println(i);
        }

        System.out.println();

        list1.clear();
        list2.add(0);
        list1.addAll(list2);
        Collections.sort(list1);
        for (Integer i : list1) {
            System.out.println(i);
        }

        //4. В методі main відтворити Example 1, 2 та 3 (створити списки за допомогою вашого класу ListNode, викликати метод класу Solution для об'єднання списків)
        Solution solution = new Solution();

        ListNode list1_1 = new ListNode(1);
        list1_1.next = new ListNode(2);
        list1_1.next.next = new ListNode(4);
        ListNode list1_2 = new ListNode(1);
        list1_2.next = new ListNode(3);
        list1_2.next.next = new ListNode(4);

        ListNode example_1 = solution.mergeTwoLists(list1_1, list1_2);
        System.out.println("output:");
        ListNode.printList(example_1);

        ListNode list2_1 = new ListNode();
        ListNode list2_2 = new ListNode();
        ListNode example_2 = solution.mergeTwoLists(list2_1, list2_2);
        System.out.println();
        ListNode.printList(example_2);

        ListNode list3_1 = new ListNode();
        ListNode list3_2 = new ListNode(0);
        ListNode example_3 = solution.mergeTwoLists(list3_1, list3_2);
        System.out.println();
        ListNode.printList(example_3);
    }

}