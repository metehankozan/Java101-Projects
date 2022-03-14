package OBS;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("İnek Şaban", 4, "140144015", "MAT101", "FZK102", "KMY101");
        s1.addBulkExamNote(50,50,50);
        s1.addBulkOpinionNote(80, 80, 80);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", "MAT101", "FZK102", "KMY101");
        s2.addBulkExamNote(100,50,40);
        s2.addBulkOpinionNote(55,40,70);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", "MAT101", "FZK102", "KMY101");
        s3.addBulkExamNote(50,20,40);
        s3.addBulkOpinionNote(80, 90, 100);
        s3.isPass();
    }
}
