package hello0727;

import java.util.*;

class Student implements Comparable {
    String name;
    int ban;
    int no;
    int kor, eng, math;

    public Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal(){
        return kor + eng + math;
    }

    float getAverage(){
        return (int)((getTotal() / 3f) * 10 + 0.5) / 10f;
    }

    public String toString(){
        return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", " + getAverage();
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Student){
            Student tmp = (Student)o;
            return name.compareTo(tmp.name);
        }
        else{
            return -1;
        }
        
    }
}


public class exercise11_3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student("이재성", 1, 1, 100, 100, 100));
        list.add(new Student("손흥민", 1, 2, 90, 70, 80));
        list.add(new Student("박지성", 1, 3, 80, 80 ,90));
        list.add(new Student("김무열", 1, 4, 70, 90, 70));
        list.add(new Student("이승우", 1, 5, 60, 100, 80));

        Collections.sort(list);
        Iterator it = list.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

}




