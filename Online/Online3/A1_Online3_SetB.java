package Online.Online3;

class Worker{
    private String designation;
    private int hourWorked;

    public Worker(String designation, int hourWorked) {
        this.designation = designation;
        this.hourWorked = hourWorked;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getHourWorked() {
        return hourWorked;
    }

    public void setHourWorked(int hourWorked) {
        this.hourWorked = hourWorked;
    }
}

class SalaryCalculator{
    public double calculateSalary(Worker w){
        if(w.getDesignation().equals("Salesman")){
            return w.getHourWorked()*100;
        }
        else if(w.getDesignation().equals("Manager")){
            return w.getHourWorked()*110;
        }
        else{
            return w.getHourWorked()*60;
        }
    }
}

public class A1_Online3_SetB {
    public static void main(String[] args) {
        Worker w = new Worker("Manager",11);
        SalaryCalculator sc = new SalaryCalculator();

        System.out.println(sc.calculateSalary(w));
    }
}
