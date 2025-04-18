package Comparable_Interface;

public class Game implements Comparable<Game> {
    private String title;
    private double rating;
    private int releaseDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", releaseDate=" + releaseDate +
                '}';
    }
        @Override
        public int compareTo(Game o){
            if (this.getRating()>o.getRating()){
                return 1;
            }else if (this.getRating()<o.getRating()){
                return -1;
            }else
                return 0;
        }
    }


