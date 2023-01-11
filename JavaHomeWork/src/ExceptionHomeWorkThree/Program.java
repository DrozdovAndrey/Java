package ExceptionHomeWorkThree;


import java.time.format.DateTimeParseException;


public class Program {
    public static void main(String[] args) {
        Data data = new Data();
        while (true){
            try {
                String inputString = GetData.getData();
                String [] dataArray = GetData.parseToArray(inputString);
                Check.checkCountData(dataArray);
                Check.checkFIO(dataArray, data);
                Check.checkBirthdate(dataArray, data);
                Check.checkNumber(dataArray, data);
                Check.checkGender(dataArray, data);
                data.setData();
                WriteData.writeData(data);
                break;
            }catch (DateTimeParseException e){
                System.out.println("Incorrect format birthday data (dd.mm.yyyy)");
            }catch (NumberFormatException e){
                System.out.println("Incorrect format phone number");
            }catch (LotsDataException | LessDataException | FIOException | GenderException e){
                System.out.println(e.getMessage());

            }
        }

    }


}
