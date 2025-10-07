public class Song {
    String title;
    int like;
    int dislike;
    String share;

    public String displayLikes() {
        if(like < 1000) {
            return String.valueOf(like);
        }
        else {
            float k = like / 1000.0f;
            return String.valueOf(k) + "K";
        }
    }

    public static void main(String[] args) {
        Song song1 = new Song();
        song1.title = "Hello";
        song1.like = 1500;
        song1.dislike = 100;
        song1.share = "www.hello.com";

        System.out.println("Title: " + song1.title);
        System.out.println("Likes: " + song1.displayLikes());
        System.out.println("Dislikes: " + song1.dislike);
        System.out.println("Share: " + song1.share);
    }
}