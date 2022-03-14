package OBS;

public class Teacher {
    String name;
    String mobileNumber;
    String branch;

    Teacher(){}
    
    Teacher(String name, String mobileNumber, String branch){
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.branch = branch;
    }

    void print(){
        System.out.println("Ad: " + this.name);
        System.out.println("Telefon: " + this.mobileNumber);
        System.out.println("Bölüm: " + this.branch);
    }
}
