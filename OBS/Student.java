package OBS;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    int grade;
    double average;
    boolean isPass;

    Student(String name, int grade, String stuNo, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.grade = grade;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    Student(String name, int grade, String stuNo, String fullCode1, String fullCode2, String fullCode3){
        this.name = name;
        this.stuNo = stuNo;
        this.grade = grade;
        this.c1 = new Course(fullCode1);
        this.c2 = new Course(fullCode2);
        this.c3 = new Course(fullCode3);
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3){
        if(note1 >= 0 && note1 <= 100 && this.c1.code != null){
            this.c1.note = note1;
        }else System.out.printf("Geçersiz giriş - %d%n",note1);
        if(note2 >= 0 && note2 <= 100 && this.c2.code != null){
            this.c2.note = note2;
        }else System.out.printf("Geçersiz giriş - %d%n",note2);
        if(note3 >= 0 && note3 <= 100 && this.c3.code != null){
            this.c3.note = note3;
        }else System.out.printf("Geçersiz giriş - %d%n",note3);
    }

    void addBulkOpinionNote(int note1, int note2, int note3){
        if(note1 >= 0 && note1 <= 100 && this.c1.code != null){
            this.c1.opinionNote = note1;
        }else System.out.printf("Geçersiz giriş - %d%n",note1);
        if(note2 >= 0 && note2 <= 100 && this.c2.code != null){
            this.c2.opinionNote = note2;
        }else System.out.printf("Geçersiz giriş - %d%n",note2);
        if(note3 >= 0 && note3 <= 100 && this.c3.code != null){
            this.c3.opinionNote = note3;
        }else System.out.printf("Geçersiz giriş - %d%n",note3);
    }

    void calcAverage(){
        double noteAvg = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        double opinionNoteAvg = (this.c1.opinionNote + this.c2.opinionNote + this.c3.opinionNote) / 3.0;
        this.average = 0.8 * noteAvg + 0.2 * opinionNoteAvg;
    }

    void isPass(){
        this.isPass = isCheckPass();
        System.out.print("Geçme durumu: ");
        if(isPass){
            System.out.println("Başarılı!");
        }else{
            System.out.println("Başarısız.");
        }
        System.out.printf("Ortalamanız: %.2f%n", this.average);
    }

    boolean isCheckPass(){
        calcAverage();
        if(this.average >= 55){
            return true;
        }else{
            return false;
        }
    }

    void printNote(){
        System.out.println(this.c1.name + " dersinin notu: " + this.c1.note);
        System.out.println(this.c2.name + " dersinin notu: " + this.c2.note);
        System.out.println(this.c3.name + " dersinin notu: " + this.c3.note);
    }

    void printOpinionNote(){
        System.out.println(this.c1.name + " dersinin kanaat notu: " + this.c1.opinionNote);
        System.out.println(this.c2.name + " dersinin kanaat notu: " + this.c2.opinionNote);
        System.out.println(this.c3.name + " dersinin kanaat notu: " + this.c3.opinionNote);
    }
}

