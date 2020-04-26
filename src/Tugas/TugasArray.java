package Tugas;

public class TugasArray {
    public static void main(String[] args) {
        String[][] bb = {{"Dea Welan Salsabyla","55Kg"}, {"Siti Bulan","58Kg"}, {"Bunga Paraswati","60Kg"}};
        for (int i=0; i<bb.length; i++){
            System.out.println("Nama        : " + bb[i][0]);
            System.out.println("Berat Badan : " + bb[i][1]);
            System.out.println("-----------------------------------");
        }
    }
}
