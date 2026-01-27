public class C_D_A_Tower_of_Hanoi {

    static class Node {
        int disk;
        Node next;

        Node(int disk) {
            this.disk = disk;
            this.next = null;
        }
    }

    static class Rod {
        String name;
        Node top;

        Rod(String name) {
            this.name = name;
        }

        public void push(int disk) {
            Node newNode = new Node(disk);
            newNode.next = top;
            top = newNode;
        }

        public int pop() {
            if (top == null) return -1;
            int disk = top.disk;
            top = top.next;
            return disk;
        }
    }

    public static void solve(int n, Rod src, Rod aux, Rod dest) {
        if (n == 1) {
            int disk = src.pop();
            dest.push(disk);
            System.out.println("Move disk " + disk + " from " + src.name + " to " + dest.name);
            return;
        }

        solve(n - 1, src, dest, aux);

        int disk = src.pop();
        dest.push(disk);
        System.out.println("Move disk " + disk + " from " + src.name + " to " + dest.name);

        solve(n - 1, aux, src, dest);
    }

    public static void main(String[] args) {
        int numberOfDisks = 3;

        Rod source = new Rod("Source (A)");
        Rod auxiliary = new Rod("Auxiliary (B)");
        Rod destination = new Rod("Destination (C)");

        for (int i = numberOfDisks; i >= 1; i--) {
            source.push(i);
        }

        System.out.println("Starting Tower of Hanoi with " + numberOfDisks + " disks:\n");
        solve(numberOfDisks, source, auxiliary, destination);
        
        System.out.println("\nSuccessfully moved all disks to " + destination.name);
    }
}