package my.practice;

public class Guest implements Comparable<Guest>{
    private String name;
    private String email;

    public Guest(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }



    @Override
    public int compareTo(Guest o) {
        if(this.name.compareTo(o.getName())>0){
            return 1;
        }
        if(this.name.compareTo(o.getName())<0){
            return -1;
        }
        else
        return 0;
    }
}
