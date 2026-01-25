package Else;

public class Postava {
    private String jmeno;
    private String monolog;

    public Postava(String jmeno, String monolog) {
        this.jmeno = jmeno;
        this.monolog = monolog;
    }

    public String getJmeno() { return jmeno; }
    public String mluv() { return monolog; }
}