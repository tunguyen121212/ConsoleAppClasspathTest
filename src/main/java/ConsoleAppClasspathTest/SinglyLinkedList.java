package ConsoleAppClasspathTest;

import ConsoleAppClasspathTest.Node;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SinglyLinkedList {
    Node head = null;
    public static SinglyLinkedList sList = new SinglyLinkedList();
    public static void main(String[] args) {
        boolean showMenu = true;
        while (showMenu) {
            showMenu = viewMainMenu();
        }
    }

    static boolean viewMainMenu() {
        try {
            System.out.println("\n ========= MAIN MENU ========= \n\n" +
                    " 1: Insert data to Node \n" +
                    " 2: Delete data from Node \n" +
                    " 3: Insert many data to Node \n" +
                    " 4: Delete many data from Node \n" +
                    " 5: View data of Node \n" +
                    " 0: Exit \n");
            System.out.print(" Your choice: ");
            Scanner scan = new Scanner(System.in);
            int idMenu = scan.nextInt();

            switch (idMenu) {
                case 1:
                    viewInsertMenu();
                    break;
                case 2:
                    viewDeleteMenu();
                    break;
                case 3:
                    viewInsertSMenu();
                    break;
                case 4:
                    viewDeleteSMenu();
                    break;
                case 5:
                    sList.print();
                    break;
                case 0:
                    return false;
                default:
                    System.out.println(" Please enter value valid!!! ");
            }
        } catch (InputMismatchException e) {
            System.out.println(" Please enter value valid!!! ");
        }
        return  true;
    }

    static void viewInsertMenu() {
        try {
            System.out.println("\n ========= INSERT MENU ========= \n\n" +
                    " 1: Insert a node with data at the beginning of the list \n" +
                    " 2: Insert a node with data at the end of the list \n" +
                    " 3: Insert a node with data at position pos \n" +
                    " 4: Insert a node with data after the first node with key specified \n" +
                    " 5: Insert a node with data after the node with key specified has appeared n times \n" +
                    " 0: Back \n");
            System.out.print(" Your choice: ");
            Scanner scan = new Scanner(System.in);
            int idInsMenu = scan.nextInt();
            switch (idInsMenu) {
                case 1:
                    System.out.print(" Insert your data: ");
                    int ida1 = scan.nextInt();
                    sList.putFirst(ida1);
                    sList.print();
                    break;
                case 2:
                    System.out.print(" Insert your data: ");
                    int ida2 = scan.nextInt();
                    sList.putLast(ida2);
                    sList.print();
                    break;
                case 3:
                    System.out.print(" Insert your pos: ");
                    int pos1 = scan.nextInt();
                    System.out.print(" Insert your data: ");
                    int ida3 = scan.nextInt();
                    sList.putAtPos(ida3, pos1);
                    sList.print();
                    break;
                case 4:
                    System.out.print(" Insert your key: ");
                    int key1 = scan.nextInt();
                    System.out.print(" Insert your data: ");
                    int ida4 = scan.nextInt();
                    sList.putAfter(ida4, key1);
                    sList.print();
                    break;
                case 5:
                    System.out.print(" Insert your key: ");
                    int key2 = scan.nextInt();
                    System.out.print(" Insert your data: ");
                    int ida5 = scan.nextInt();
                    System.out.print(" Insert your times: ");
                    int times1 = scan.nextInt();
                    sList.putAfter(ida5, key2, times1);
                    sList.print();
                    break;
                case 0:
                    back();
                    break;
                default:
                    System.out.println(" Please enter value valid!!! ");
                    viewInsertMenu();
            }
        } catch (InputMismatchException e) {
            System.out.println(" Please enter value valid!!! ");
            viewInsertMenu();
        }
    }

    static void viewDeleteMenu() {
        try {
            System.out.println("\n ========= DELETE MENU ========= \n\n" +
                    " 1: Delete the first node in the list \n" +
                    " 2: Delete the last node in the list \n" +
                    " 3: Delete the node at position pos \n" +
                    " 4: Delete the node directly after the first node found with specified key \n" +
                    " 5: Delete the node directly after the n-th node found with specified key \n" +
                    " 6: Delete the node with specified key \n" +
                    " 7: Delete the node directly the n-th node found with specified key \n" +
                    " 8: Print the node with specified key \n" +
                    " 0: Back \n");
            System.out.print(" Your choice: ");
            Scanner scan = new Scanner(System.in);
            int idDelMenu = scan.nextInt();
            switch (idDelMenu) {
                case 1:
                    sList.delFirst();
                    sList.print();
                    break;
                case 2:
                    sList.delLast();
                    sList.print();
                    break;
                case 3:
                    System.out.print(" Insert your pos: ");
                    int pos2 = scan.nextInt();
                    sList.delAtPos(pos2);
                    sList.print();
                    break;
                case 4:
                    System.out.print(" Insert your key: ");
                    int key2 = scan.nextInt();
                    sList.delAfter(key2);
                    sList.print();
                    break;
                case 5:
                    System.out.print(" Insert your key: ");
                    int key3 = scan.nextInt();
                    System.out.print(" Insert your times: ");
                    int times2 = scan.nextInt();
                    sList.delAfter(key3, times2);
                    sList.print();
                    break;
                case 6:
                    System.out.print(" Insert your key: ");
                    int key4 = scan.nextInt();
                    sList.delByKey(key4);
                    sList.print();
                    break;
                case 7:
                    System.out.print(" Insert your key: ");
                    int key5 = scan.nextInt();
                    System.out.print(" Insert your times: ");
                    int times3 = scan.nextInt();
                    sList.delByKey(key5, times3);
                    sList.print();
                    break;
                case 8:
                    System.out.print(" Insert your pos: ");
                    int key6 = scan.nextInt();
                    sList.keyAt(key6);
                    sList.print();
                    break;
                case 0:
                    back();
                    break;
                default:
                    System.out.println(" Please enter value valid!!! ");
                    viewDeleteMenu();
            }
        } catch (InputMismatchException e) {
            System.out.println(" Please enter value valid!!! ");
            viewDeleteMenu();
        }
    }

    static void viewInsertSMenu() {
        try {
            System.out.println("\n ========= INSERT MENU ========= \n\n" +
                    " 1: Insert many node with data at the beginning of the list \n" +
                    " 2: Insert many node with data at the end of the list \n" +
                    " 3: Insert many node with data at position pos \n" +
                    " 0: Back \n");
            System.out.print(" Your choice: ");
            Scanner scan = new Scanner(System.in);
            int idInsMenu = scan.nextInt();
            switch (idInsMenu) {
                case 1:
                    try {
                        scan.nextLine();
                        System.out.print(" Insert your array data: ");
                        String values1 = scan.nextLine();
                        StringBuilder sb = new StringBuilder(values1);
                        sb.reverse();
                        values1 = sb.toString();
                        String[] valuesString1 = values1.split(" ");

                        int size1 = valuesString1.length;
                        int[] valuesArr1 = new int[size1];

                        for(int i = 0 ; i < size1 ; i++) {
                            valuesArr1[i] = Integer.parseInt(valuesString1[i]);
                        }
                        sList.putManyFirst(valuesArr1);
                        sList.print();
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println(" Please enter value valid!!! ");
                        viewInsertSMenu();
                    }
                case 2:
                    try {
                        scan.nextLine();
                        System.out.print(" Insert your array data: ");
                        String values2 = scan.nextLine();
                        String[] valuesString2 = values2.split(" ");

                        int size = valuesString2.length;
                        int[] valuesArr2 = new int[size];

                        for(int i = 0 ; i < size ; i++) {
                            valuesArr2[i] = Integer.parseInt(valuesString2[i]);
                        }
                        sList.putManyLast(valuesArr2);
                        sList.print();
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println(" Please enter value valid!!! ");
                        viewInsertSMenu();
                    }
                case 3:
                    try {
                        System.out.print(" Insert your pos: ");
                        int pos5 = scan.nextInt();
                        scan.nextLine();
                        System.out.print(" Insert your array data: ");
                        String values3 = scan.nextLine();
                        String[] valuesString3 = values3.split(" ");
                        int size3 = valuesString3.length;
                        int[] valuesArr3 = new int[size3];
                        for(int i = 0 ; i < size3 ; i++) {
                            valuesArr3[i] = Integer.parseInt(valuesString3[i]);
                        }
                        sList.putManyAt(valuesArr3, pos5);
                        sList.print();
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println(" Please enter value valid!!! ");
                        viewInsertSMenu();
                    }
                case 0:
                    back();
                    break;
                default:
                    System.out.println(" Please enter value valid!!! ");
                    viewInsertSMenu();
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println(" Please enter value valid!!! ");
            viewInsertSMenu();
        }
    }

    static void viewDeleteSMenu() {
        try {
            System.out.println("\n ========= DELETE MENU ========= \n\n" +
                    " 1: Delete all nodes with 'key' data return number of nodes deleted \n" +
                    " 0: Back \n");
            System.out.print(" Your choice: ");
            Scanner scan = new Scanner(System.in);
            int idDelMenu = scan.nextInt();
            switch (idDelMenu) {
                case 1:
                    System.out.print(" Insert your key: ");
                    int key6 = scan.nextInt();
                    sList.delAllKey(key6);
                    sList.print();
                    break;
                case 0:
                    back();
                    break;
                default:
                    System.out.println(" Please enter value valid!!! ");
                    viewDeleteSMenu();
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println(" Please enter value valid!!! ");
            viewDeleteSMenu();
        }
    }
    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println(" List is empty!!! ");
            return;
        }
        System.out.println(" Nodes of singly linked list: \n");
        while (temp != null) {
            System.out.print(" " + temp.data + " ");
            temp = temp.next;
        }
    }
    public void putFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = null;
        } else {
            newNode.next = head;
        }
        head = newNode;
    }

    void putLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = null;
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = null;
        }
    }

    void putAtPos(int data, int pos) {
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("\n List is empty!!! \n");
        } else {
            Node temp = head;
            for (int i=1 ; i<pos ; i++ ) {
                temp = temp.next;
                if (temp == null) {
                    System.out.println("\n Position not found!!! \n");
                    return;
                }
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    void putAfter(int data, int key) {
        Node newNode = new Node(data);
        Node temp = head;
        int check = 0;
        if (head == null ) {
            System.out.println("\n List is empty!!! \n");
        } else {
            while (temp != null) {
                if (temp.data == key) {
                    check++;
                    newNode.next = temp.next;
                    temp.next = newNode;
                }
                temp = temp.next;
            }
            if (check == 0) {
                System.out.println("\n Key not found!!! \n");
            }
        }
    }

    void putAfter(int data, int key, int times) {
        Node newNode = new Node(data);
        Node temp = head;
        int check = 0;
        int count = 0;
        if (head == null ) {
            System.out.println("\n List is empty!!! \n");
        } else {
            while (temp != null) {
                if (temp.data == key) {
                    check++;
                    count++;
                    if (count == times) {
                        newNode.next = temp.next;
                        temp.next = newNode;
                    }
                }
                temp = temp.next;
            }
            if (check == 0) {
                System.out.println("\n Key not found \n");
            }
        }
    }

    void delFirst() {
        Node temp = head;
        if (head == null) {
            System.out.println(" Delete nothing!!! ");
        } else {
            head = temp.next;
            System.out.println(" Deleted!!! ");
        }
    }

    void delLast() {
        Node temp = head;
        Node temp1 = null;
        if (head == null) {
            System.out.println(" Delete nothing!!! ");
        } else if (head.next == null) {
            head = null;
        } else {
            while (temp.next != null) {
                temp1 = temp;
                temp = temp.next;
            }
            temp1.next = null;
        }
        System.out.println(" Deleted!!! ");
    }

    void delAtPos(int pos) {
        Node temp = head;
        Node temp1 = null;
        if (head == null) {
            System.out.println(" Delete nothing!!! ");
        } else {
            // pos > 2
            for (int i=1 ; i<pos ; i++) {
                temp1 = temp;
                temp = temp.next;
                if (temp == null) {
                    System.out.println(" Position " + pos + " doesn't exist!!! ");
                    return;
                }
            }
            if (temp1 == null) {
                sList.delFirst();
            } else {
                temp1.next = temp.next;
            }
        }
    }

    void delAfter(int key) {
        Node temp = head;
        Node temp1 = null;
        int check1 = 0;
        if (head == null) {
            System.out.println(" Delete nothing!!! ");
        } else {
            while (temp != null) {
                if (temp.data == key) {
                    check1++;
                    if (temp1 == null) {
                        sList.delFirst();
                    } else {
                        temp1 = temp;
                        temp = temp.next;
                        temp1.next = temp.next;
                        break;
                    }
                }
                temp1 = temp;
                temp = temp.next;
            }
            if (check1 == 0) {
                System.out.println("\n Key doesn't exist \n");
            }
        }
    }

    void delAfter(int key, int times) {
        Node temp = head;
        Node temp1 = null;
        int check1 = 0;
        int count = 0;
        if (head == null) {
            System.out.println(" Delete nothing!!! ");
        } else {
            while (temp != null) {
                if (temp.data == key) {
                    check1++;
                    count++;
                    if (temp1 == null) {
                        sList.delFirst();
                    } else {
                        if (count == times) {
                            temp1 = temp;
                            temp = temp.next;
                            temp1.next = temp.next;
                        }
                    }
                }
                temp1 = temp;
                temp = temp.next;
            }
            if (check1 == 0) {
                System.out.println("\n Key doesn't exist \n");
            }
        }
    }

    void delByKey(int key) {
        Node temp = head;
        Node temp1 = null;
        int check1 = 0;
        if (head == null) {
            System.out.println(" Delete nothing!!! ");
        } else {
            while (temp != null) {
                if (temp.data == key) {
                    check1++;
                    if (temp1 == null) {
                        sList.delFirst();
                    } else {
                        temp1.next = temp.next;
                    }
                }
                temp1 = temp;
                temp = temp.next;
            }
            if (check1 == 0) {
                System.out.println("\n Key doesn't exist \n");
            }
        }
    }

    void delByKey(int key, int times) {
        Node temp = head;
        Node temp1 = null;
        int check1 = 0;
        int count = 0;
        if (head == null) {
            System.out.println(" Delete nothing!!! ");
        } else {
            while (temp != null) {
                if (temp.data == key) {
                    check1++;
                    count++;

                    if (temp1 == null) {
                        sList.delFirst();
                    } else {

                        if (count == times) {
                            temp1.next = temp.next;
                        }
                    }
                }
                temp1 = temp;
                temp = temp.next;
            }
            if (check1 == 0) {
                System.out.println("\n Key doesn't exist \n");
            }
        }
    }

    void keyAt(int pos) {
        if (head == null) {
            System.out.println("\n List is empty!!! \n");
        } else {
            Node temp = head;
            for (int i=1 ; i<pos ; i++ ) {
                temp = temp.next;
                if (temp == null) {
                    System.out.println("\n Position not found!!! \n");
                    return;
                }

            }
            System.out.println("\n Key at "+ pos + " is: " + temp.data + "\n");
        }
    }

    void putManyFirst(int[] values) {
        for(int i = 0 ; i < values.length ; i++) {
            sList.putFirst(values[i]);
        }
    }

    void putManyLast(int[] values) {
        for(int i = 0 ; i < values.length ; i++) {
            sList.putLast(values[i]);
        }

    }

    void putManyAt(int[] values, int pos) {
        int j = pos;
        for(int i = 0 ; i < values.length ; i++) {
            sList.putAtPos(values[i], j);
            j++;
        }
    }

    void delAllKey(int key) {
        countKey(key);
        delAll(key);
    }

    int countKey(int key) {
        Node temp = head;
        Node temp1 = null;
        int check1 = 0;
        int count = 0;
        if (head == null) {
            System.out.print("");
        } else {
            while (temp != null) {
                count++;
                if (temp.data == key) {
                    check1++;
                    if (temp1 == null) {
                        System.out.println(" tem1 null ");
                    } else {
                        System.out.println(" Number of nodes deleted: " + count);
                    }
                }
                temp1 = temp;
                temp = temp.next;
            }
            if (check1 == 0) {
                System.out.println("\n Key doesn't exist \n");
            }
        }
        return 0;
    }

    int delAll(int key) {
        Node temp = head;
        Node temp1 = null;
        int check1 = 0;
        int count = 0;
        if (head == null) {
            System.out.println(" Delete nothing!!! ");
        } else {
            while (temp != null) {
                count++;
                if (temp.data == key) {
                    check1++;
                    if (temp1 == null) {
                        System.out.println(" temp1 null ");
                    } else {
                        temp1.next = temp.next;
                    }
                }
                temp1 = temp;
                temp = temp.next;
            }
            if (check1 == 0) {
                System.out.println("\n Key doesn't exist \n");
            }
        }
        return 0;
    }

    static void back() {
    }
}
