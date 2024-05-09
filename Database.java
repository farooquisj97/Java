class Staff{
    int code;
    String name;
    Staff(int code, String name) {
        this.code = code;
        this.name = name;
    }
    void show(){
        System.out.println("\n" +code + ": " + name);
    }
}
class Officer extends Staff {
    char offClass;
    String area;
    Officer(Staff s1, char c, String ar) {
        super(s1.code, s1.name);
        offClass = c;
        area = ar;
    }
    void show(){
        super.show();
        System.out.println("Class " + offClass + " Officer");
        System.out.println("Officer area of work: " + area);
    }
}
class Peon extends Staff {
    String type_of_work;
    Peon(Staff s1, String tow){
        super(s1.code,s1.name);
        type_of_work = tow;
    }
    void show(){
        super.show();
        System.out.println("Peon type of work: " + type_of_work);
    }
}
class Clerk extends Staff {
    int typingSpeed;
    String type_of_work;
    Clerk (Staff s1, String tow, int ts){
        super(s1.code,s1.name);
        type_of_work = tow;
        typingSpeed = ts;
    }
    void show(){
        super.show();
        System.out.println("Clerk work: " + type_of_work);
        System.out.println("Typing speed in words per min: " + typingSpeed);
    }
}
class Regular extends Peon {
    char bool; // 'y' or 'n'
    int yrs;
    Regular (Peon p1, char regular, int yr){
        super(p1, p1.type_of_work);
        bool = regular;
        yrs = yr;
    }
    void show(){
        super.show();
        if (bool=='y') System.out.println("Regular");
        else System.out.println("Part time");
        System.out.println("No. of yrs of service: " + yrs);      
    }
}
class Adhoc extends Peon {
    int dailyWage = 70;
    int workingDays, bonus;
    Adhoc(Peon p1,int nday){
        super(p1, p1.type_of_work);
        workingDays = nday;
        bonus = dailyWage*workingDays;
    }
    void show(){
        super.show();
        System.out.println("Adhoc: " + bonus);
    }
}
class Database {
    public static void main(String[] args) {
        Staff s1 = new Staff(101, "Zeher");
        Officer o1 = new Officer(s1, 'A', "Education");
        Staff s2 = new Staff(102, "Shehad");
        Clerk c1 = new Clerk(s2, "Registration desk",27);
        Staff s3 = new Staff(103, "Pyaaz");
        Peon p1 = new Peon(s3, "Canteen helper");
        Regular r1 = new Regular(p1, 'y', 5);
        Staff s4 = new Staff(104, "Kalesh");
        Peon p2 = new Peon(s4, "Cleaning");
        Adhoc a1 = new Adhoc(p2, 10);
        o1.show();
        c1.show();
        r1.show();
        a1.show();
    }
}