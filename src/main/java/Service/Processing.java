package Service;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Processing {
    String[] data;
    public Processing(String[] data) {
        this.data = data;
    }
    public String[] processingData() {
        if(data.length == 6){
            if(isDateValid(data[3], "dd.MM.yyyy")){
                if (data[4].length() == 6) {
                    if (data[5].equals("m") || data[5].equals("f")) {
                        return data;
                    }
                    else throw new RuntimeException("Gender is not valid");
                }
                else throw new RuntimeException("Number is not valid");
            }
            else throw new RuntimeException("Date is not valid");
        }
        else throw new RuntimeException("Incorrect number of arguments");
    }
    public static boolean isDateValid(String date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        sdf.setLenient(false);
        try {
            sdf.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

}
