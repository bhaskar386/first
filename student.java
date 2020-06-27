impor java.util.*;
class Student
{
public static void main(String[] args)throws intrupted exception
{
Scanner sc=new Scanner(system.in);
 Treeset<student> ts=new Treeset<>();
String req="Y";
while(req.equalsIgnorecase("y"))
{
system.out.print("enter the student name");
String name=sc.naxtLine();
stuent st=new student(name);
student.add(st);
system.out.println("want to add more student[y/n]:"));
req=sc.NextLine();
}
Iterator <student> it=student.Iterator();
while(it.hasNext());
{
student st=it.next();
system.out.println(st);
thread.sleep(1000);
}
}
}
