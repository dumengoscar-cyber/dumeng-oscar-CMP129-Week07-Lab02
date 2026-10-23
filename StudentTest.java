  public class StudentTest {

    public static void main(String[] args) {

        // PART 1: Mutable Student
        // TODO: Create a MutableStudent object.
MutableStudent student1 = new MutableStudent("oscar", 19);

        // TODO: Display the student's original information.
student1.displayInfo();

        // TODO: Use the setter methods to change the student's data.
student1.setName("dumeng");
student1.setAge(190);

        // TODO: Display the student again.
        // Question: Did the SAME object change?
        //yes, the values changed
student1.displayInfo();

        System.out.println();

        // PART 2: Immutable Student
        // TODO: Create an ImmutableStudent object.
ImmutableStudent student2 = new ImmutableStudent("junior", 20);

        // TODO: Display the student's information.
student2.displayInfo();

        // Try to answer this in a comment:
        // Why can you not change the ImmutableStudent object
        // using setter methods?
//it doesnt have setters and its info is final/definitive 

        // PART 3: Compare
        // Add comments that answer:
        // 1. Which class is mutable?
        // 2. Which class is immutable?
        // 3. What is the biggest difference you noticed?
   //mutable student
   //immutable
   //immutable cannot be changed and it private while mutable can be changed and 
    }
}
