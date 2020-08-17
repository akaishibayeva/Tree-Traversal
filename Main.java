import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");

        BinaryTree bt = new BinaryTree(); //Create an object of BT
        bt.insert(2);
        bt.insert(5);
        bt.insert(4);
        bt.insert(3);
        bt.insert(8);
        bt.insert(1);
        bt.insert(4);
        bt.insert(6);
        bt.insert(2);
        bt.insert(10);
        bt.insert(9);
        bt.insert(20);
        bt.insert(25);

        System.out.println("Preorder traversal: ");
        bt.preorder();
        System.out.print("\n");

        System.out.println("Postorder traversal: ");
        bt.postorder();
        System.out.print("\n");

        System.out.println("Inorder traversal: ");
        bt.inorder();
        System.out.print("\n");

        System.out.println("Number of nodes: ");
        bt.countNodes();

        System.out.println("------------------");
        bt.search(25);

        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-");

        //Multi-dimensional array
        int[][] arr = { { 1, 2 }, { 3, 4 } };

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
    }
}

