 class Student {
     private String name;
     private int age ;

     public void setter(String name, int age)
     {
       this.name=name;
       this.age=age;
     }

     @Override
     public String toString() {
         return "Student{" +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 '}';
     }

     public void getter() {
         System.out.println(this.name);
         System.out.println(this.age);

     }
 }
 class teacher
 {
    public static void main(String[] args) {
    Student student=new Student();
    student.setter("Name", 30);
//    student.getter();
        System.out.println(student);

    }

}
