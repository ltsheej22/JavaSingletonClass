public class Singleton {
    private static Singleton instance;
    private String data;
    

    private Singleton(String data){
    this.data = data;
    }

    // provides a global point of access to the Singleton instance
public static Singleton getInstance(String data) {
    // Checks to see if a Singleton instance already exists
    if (instance == null) {
        // If not, creates a new Singleton instance
        instance = new Singleton(data);
        }
    // Returns the existing or newly created  Singleton instance
    return instance;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}