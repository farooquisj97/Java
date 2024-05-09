interface Language {
    void getName();
    void getVersion();
}

class ProgLang implements Language {
    String name;
    String version;
    public ProgLang(String name, String version) {
        this.name = name;
        this.version = version;
    }
    public void getName() {
        System.out.println("Language: " + name);
    }
    public void getVersion() {
        System.out.println("Version: " + version);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        ProgLang java = new ProgLang("Java", "21.1");
        java.getName();
        java.getVersion();
        ProgLang python = new ProgLang("Python", "3.9");
        python.getName();
        python.getVersion();
        ProgLang cpp = new ProgLang("C++", "16.2");
        cpp.getName();
        cpp.getVersion();
    }
}
 