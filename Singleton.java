public class Singleton {
    private static Singleton instance;
    private String data;
    

    private Singleton(String data){
    this.data = data;
    }

public static Singleton getInstance(String data) {
    // Checks to see if an instance already exists
    if (instance == null) {
        // If not, creates a new Singleton instance
        instance = new Singleton(data);
        }
    // Returns the existing or newly created instance
    return instance;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
