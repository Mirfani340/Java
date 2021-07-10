/*
Muhammad Irfani 20104037 SE04B
 */
/**
 * disini saya mengunakann rekursif
 */
public class main {
    public static void main(String[] args) {
        treeNode data = createData();
        System.out.println("1. preOrder");
        preOrder(data);
        System.out.println();
        System.out.println("2. inOrder");
        inOrder(data);
        System.out.println();
        System.out.println("3. postOrder");
        postOrder(data);
    }

   static void preOrder(treeNode n){
        if (n == null)
            return;
        System.out.print(n.value);
        preOrder(n.left);
        preOrder(n.right);
    }
   static void inOrder(treeNode n){
        if (n == null)
            return;
        inOrder(n.left);
        inOrder(n.right);
       System.out.print(n.value);
    }
   static void postOrder(treeNode n){
        if (n == null)
            return;
        postOrder(n.right);
       System.out.print(n.value);
       postOrder(n.left);
    }
    public static treeNode createData() {
        treeNode a = new treeNode("a");
        treeNode b = new treeNode("b");
        treeNode c = new treeNode("c");
        treeNode d = new treeNode("d");
        treeNode e = new treeNode("e");
        treeNode f = new treeNode("f");
        treeNode g = new treeNode("g");

        a.left = b;
        a.right = g;
        b.left = c;
        b.right = d;
        c.left = e;
        e.right = f;

        return a;
    }
}
