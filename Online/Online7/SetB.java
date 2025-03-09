package Online.Online7;

class InvalidNameExceptions extends Exception{
    InvalidNameExceptions(String message){
        super(message);
    }
}
class InvalidBirthYearException extends Exception{
    InvalidBirthYearException(String message){
        super(message);
    }
}
class Employee{
    private String name;
    private String birthDate;

    Employee(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Employee(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public void checkName(String name) throws InvalidNameException{
        if(name == null){
            throw new InvalidNameException("Handled");
        }
        else{
            System.out.println("Ok");
        }
    }

    public void checkBirth(String birthDate) throws InvalidBirthYearException{
        int size = birthDate.length();
        String str = "";
        str += birthDate.charAt(size-4);
        str += birthDate.charAt(size-3);
        str += birthDate.charAt(size-3);
        str += birthDate.charAt(size-1);

        int year = Integer.parseInt(str);

        if(year>1990 && year<2010){
            throw new InvalidBirthYearException("Handled");
        }
        else{
            System.out.println("OK");
        }
    }
}

public class SetB {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setName("Ahin");

        try{
            e.checkName("Ahin");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        try{
            e.checkBirth("30-10-1770");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}
