public class pen_distribution {
    public static void main(String[] args) {
        int pen = 14;
        int students = 3;
        int remaining_pen = pen % students;
        int distributed_pen = pen / students;
        System.out.println(" The Pen Per Student is " + distributed_pen+ " and the remaining pen not distributed is " + remaining_pen);
    }
    
}
