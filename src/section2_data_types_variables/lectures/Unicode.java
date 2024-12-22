package section2_data_types_variables.lectures;

public class Unicode {
    public static void main(String[] args) {

        for(char c = 0x1780; c <= 0x17e9; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
