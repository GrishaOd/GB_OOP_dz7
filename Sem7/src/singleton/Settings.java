package singleton;

public class Settings {

    private static Settings instance;
    private String param1;
    private int param2;
    private boolean param3;

    private Settings(){

    }

    public static Settings getInstance(){
        if (instance == null){
            instance = new Settings();
            instance.param1 = "A";
            instance.param2 = 2;
            instance.param3 = true;
        }
        return instance;
    }

    public String getParam1() {
        return param1;
    }

    public int getParam2() {
        return param2;
    }

    public boolean isParam3() {
        return param3;
    }
}
