package OBS;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int opinionNote;
    
    static Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
    static Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
    static Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.opinionNote = 0;
    }

    Course(String fullCode){
        String prefix = fullCode.substring(0, 3);
        String code = fullCode.substring(3);
        switch(prefix){
            case "MAT":
                this.name = "Matematik";
                this.code = code;
                this.prefix = prefix;
                this.note = 0;
                this.opinionNote = 0;
                this.teacher = addTeacher(prefix);
                break;

            case "FZK":
                this.name = "Fizik";
                this.code = code;
                this.prefix = prefix;
                this.note = 0;
                this.opinionNote = 0;
                this.teacher = addTeacher(prefix);
                break;

            case "KMY":
                this.name = "Kimya";
                this.code = code;
                this.prefix = prefix;
                this.note = 0;
                this.opinionNote = 0;
                this.teacher = addTeacher(prefix);;
                break;
                
            default:
                System.out.printf("[%s] - Bu ders katalogta bulunmuyor.%n",fullCode);
        }
    }

    Teacher addTeacher(String prefix){
        switch(prefix){
            case "MAT":
                return t1;
            
            case "FZK":
                return t2;

            case "KMY":
                return t3;

            default:
                System.out.println("Bu ders için bir öğretim görevlisi bulunmuyor.");
                return new Teacher();
        }
    }

    void changeTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            System.out.println("İşlem başarılı!");
        }else{
            System.out.println("Öğretmen ile ders alanı uyuşmuyor!");
        }
    }

    void printTeacher(){
        if(this.teacher.name != null){
            this.teacher.print();
        }else{
            System.out.println("Bu ders için bir öğretim görevlisi bulunmuyor.");
        }
        
    }
}
