public class Movie {
    private String name;
    protected String origin;
    public String genre;
    public float rating;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }


    public void setOrigin(String origin){
        this.origin = origin;
    }
    public String getOrigin(){
        return origin;
    }


    public Movie(String name, String origin, String genre, float rating){
        this.name = name;
        this.origin = origin;
        this.genre = genre;
        this.rating = rating;
    }

    public Movie(String name, String genre){
        this.name = name;
        this.genre = genre;
    }

    public void Details(){
        System.out.println("You are watching SHUTTER ISLAND");
        System.out.println("Origin: " + origin);
        System.out.println("Genre: " + genre);
        System.out.println("Rating:" + rating);
    }
}
