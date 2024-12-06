import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;
public class AdventSolver {
    public static void main(String[] args) {
        List<String> file1 = new ArrayList<>(1000);
        List<String> file2 = new ArrayList<>(1000);
        ArrayList<String> fileData = getFileData("src/InputFile");
        // you now have a list of Strings from the file "InputFile"
        int finalDif = 0;
        for (int i = 0; i < fileData.size(); i++) {
            String starter = fileData.get(i);
            int toList1 = Integer.parseInt((starter.substring(0, 5)));
            int toList2 = Integer.parseInt((starter.substring(8, 13)));


            file1.add(String.valueOf(toList1));
            file2.add(String.valueOf(toList2));


        }

        Collections.sort(file1);
        Collections.sort(file2);
        System.out.println(file1);
        System.out.println(file2);
//        List<String> file1sorted = new ArrayList<>(1000);
//        List<String> file2sorted = new ArrayList<>(1000);
//        int starter = 999;
//        while (file1.size() > 0) {
//            int lowestl1 = 99999;
//            int lowestl2 = 99999;
//            int remove1 = 100000;
//            int remove2 = 100000;
//
//            for (int i = 0; i < starter; i++) {
//                if (Integer.parseInt(file1.get(i)) < lowestl1) {
//                    lowestl1 = Integer.parseInt(file1.get(i));
//                    remove1 = i;
//
//                }
//
//
//                if (Integer.parseInt(file2.get(i)) < lowestl2) {
//                    lowestl2 = Integer.parseInt(file2.get(i));
//                    remove2 = i;
//
//
//                }
//
//            }
//            if (remove1 == 100000)
//                break;
//            file1sorted.add(file1.get(remove1));
//            file2sorted.add(file2.get(remove2));
//            file1.remove(remove1);
//            file2.remove(remove2);
//
//            starter -= 1;
//
//        }
//        System.out.println(file1sorted);
//        System.out.println(file2sorted);
        int finalTotal = 0;
        int finalFinalTotal = 0;
        for(int i = 0; i < file1.size(); i++){
            int toL1 = Integer.parseInt((file1.get(i)));

            for(int ii = 0; ii < file2.size(); ii++){
            int toL2 = Integer.parseInt(file2.get(ii));
            if (toL1 == toL2){
                finalTotal++;
            }


            }
            finalFinalTotal += (finalTotal * toL1);
            finalTotal = 0;


        }
        System.out.println(finalFinalTotal);

    }
    public static ArrayList<String> getFileData(String fileName) {
        ArrayList<String> fileData = new ArrayList<String>();
        try {
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                if (!line.equals(""))
                    fileData.add(line);
            }
            return fileData;
        }
        catch (FileNotFoundException e) {
            return fileData;
        }
    }


}