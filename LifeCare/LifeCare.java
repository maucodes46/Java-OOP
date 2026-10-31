/**
 * @author Maheen Fatima
 * @version 1.0
 * This program demonstrates inheritance and encapsulation
 * by managing InPatient and OutPatient records.
 * It calculates and displays the total medical bill
 * based on consultation fees, room charges, and test charges.
 */
class Patient{
    private String patientId;
    private String name;
    private double consultationFee;
    Patient(){}
    // constructor
    Patient(String patientId, String name, double consultationFee){
    this.patientId=patientId;
    this.name=name;
    this.consultationFee=consultationFee;
    }
    // setters
    public void setpatientId(String patientId){
        this.patientId=patientId;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setconsultationFee(double consultationFee){
        this.consultationFee=consultationFee;
    }
    // getters
    public String getpatientId(){
        return patientId;
    }
    public String getname(){
        return name;
    }
    public double getconsultationFee(){
        return consultationFee;
    }
    // bill
    public double calculateBill(){
        return consultationFee;
    }
    // displayInfo
    public void displayInfo(){
        System.out.println("================================");
        System.out.println("       Patient Details");
        System.out.println("================================");
        System.out.println("ID: "+patientId);
        System.out.println("Name: "+name);
        System.out.println("Consultation Fee: "+consultationFee);
    }
}
class InPatient extends Patient {
    private int numberOfDaysadmitted;
    private double roomChargesPerDay;
    // empty consturctor
    InPatient(){}
    // parameterized constructor
    InPatient(String patiendId, String name, double consultationFee,int numberOfDaysadmitted,double roomChargesPerDay){
        super(patiendId, name, consultationFee);
        this.numberOfDaysadmitted=numberOfDaysadmitted;
        this.roomChargesPerDay=roomChargesPerDay;
    }
    // setters
    public void setnumberOfDaysAdmitted(int numberOfDaysadmitted){
        this.numberOfDaysadmitted=numberOfDaysadmitted;
    }
    public void setroomChargesPerDay(double roomChargesPerDay){
        this.roomChargesPerDay=roomChargesPerDay;
    }
    // getters
    public int getNumberOfDaysAdmitted() {
    return numberOfDaysadmitted;
    }
    public double getRoomChargesPerDay() {
    return roomChargesPerDay;
    }
    // bill
    public double calculateBill(){
        return super.calculateBill()+(numberOfDaysadmitted*roomChargesPerDay);
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Total Bill: "+calculateBill()+"\n");
    }
}
class OutPatient extends Patient{
    private double testCharges;
    // constructor
    OutPatient(){}
    OutPatient(String patiendId, String name, double consultationFee,double testCharges){
        super(patiendId, name, consultationFee);
        this.testCharges=testCharges;
    }
    // setter
    public void settestcharges(double testCharges){
        this.testCharges=testCharges;
    }
    // getter
    public double getTestCharges() {
    return testCharges;
    }
    // bill
    public double calculateBill(){
        return super.calculateBill()+testCharges;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Total Bill: "+calculateBill()+"\n");
    }
}

public class LifeCare {
    public static void main(String[] args) {
        InPatient P1 = new InPatient("InP100013","Maheen Fatima",
        3450.9,7,350);
        P1.displayInfo();

        OutPatient P2 = new OutPatient();
        P2.setpatientId("Op100043");
        P2.setname("Zainab Fatima");
        P2.setconsultationFee(4500);
        P2.settestcharges(8900);
        P2.displayInfo();
        }
}

