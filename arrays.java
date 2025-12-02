public class Arrays {
    public static void main(String[] args){
         int age = 30;
        int physics = 97;
        int chem = 98;
        int eng = 95;

        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;

        System.out.println(marks[2]);
        System.out.println(marks.length);

        //Arrays sort
        // Arrays.sort[marks];
        
        // another initialising the array
        int[] mark = {10,25,21};

        //2d array
        int[][] finalMarks = {{97,98,95},{95,95,98}};
        System.out.println(finalMarks[0][0]);
    }
}
