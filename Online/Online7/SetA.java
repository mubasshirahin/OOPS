package Online.Online7;

class InvalidNameException extends Exception{
    InvalidNameException(String message){
        super(message);
    }
}

class InvalidException extends Exception{
    InvalidException(String message){
        super(message);
    }
}
class Student{
    private String name;
    private int id;

    public Student(String name, int id) throws InvalidException,InvalidNameException{
        setId(id);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidNameException{
        if(name == null || name.isEmpty()){
            throw new InvalidNameException("Handled");
        }
            this.name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws InvalidException{
        if(id<1 || id>1000){
            throw new InvalidException("Handled");
        }
        this.id = id;
    }

    public String createMail(){
        String s = "ahin";
        return s;
    }

}

public class SetA {
    public static void main(String[] args) {
        try{
            Student s1 = new Student("Ahin",1010101035);
            System.out.println(s1.createMail());
        }catch (Exception e) {
            System.out.println("Handled");
        }
    }
}
