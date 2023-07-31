package Day2;

public class Data_type_Change {

    public static void main(String[] args) {
        byte val1 = 1;
        short val2 = 1004;
        short val2_add = 10044;
        int val3 = 12345;
        int val3_add = 300;
        long val4 = 10;

        float val5 = 3.14f;
        double val61 = 3.141592d;

        char val7 = 'A';
        char val7_add = 'B';

        boolean val8 = true;

        ///////////////////////////////
        //자동형변환                   //
        ///////////////////////////////

        System.out.println(val3+val2); //자동형변환 short->int

        ///////////////////////////////
        //명시적변환                   //
        ///////////////////////////////

        // short add_error = val2 + val2_add;
        short add_nonerror = (short)(val2 + val2_add);

    }

}
