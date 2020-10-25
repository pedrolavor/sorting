// the greater element is set on last position

public class BubbleSorting {

    public int[] sort(int[] array) {
        int _len = array.length;
        int _continue = 0;

        do {
            _continue = 0;

            for(int i = 0; i < _len - 1; i++) {
                if(array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    _continue = tmp;
                }
            }

            _len--;

        } while (_continue != 0);

        return array;
    }

    public void show(int[] array) {
        System.out.print("[");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        BubbleSorting bubble = new BubbleSorting();
        
        int[] a1 = {2, 1};
        int[] a2 = {9, 3, 6, 1, 8 ,4, 5, 2, 7, 0};
        int[] a3 = {3, 5, 4890, 2, 568, 3, 6,  56, 4, 3, 1, 34789, 23, 12, 13, 4, 23, 123,
        3, 72, 4, 274, 12, 34, 7861, 463, 65, 3435, 13, 453, 75, 34567};

        int[] aa1 = bubble.sort(a1);
        int[] aa2 = bubble.sort(a2);
        int[] aa3 = bubble.sort(a3);

        bubble.show(aa1);
        bubble.show(aa2);
        bubble.show(aa3);

    }
    
}