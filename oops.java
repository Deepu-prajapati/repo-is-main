import java.util.ArrayList;

public class oops {
    public static class YoutubeVideo{

        String name;
        int noOfViews , noOfLikes;
        ArrayList<String> comments;
        boolean containsCaption;

    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        
        YoutubeVideo songVideo = new YoutubeVideo();

        songVideo.name = "RadheRadhe";
        songVideo.noOfLikes = 500;
        songVideo.noOfViews = 1000;
        songVideo.comments = new ArrayList<>();
        songVideo.comments.add("Good");
        songVideo.comments.add("Nice");

        
        System.out.println("Name of video : "+ songVideo.name);
        System.out.println("Views :"+ songVideo.noOfViews);
        System.out.println("Likes :"+ songVideo.noOfLikes);
        System.out.println("comments :"+songVideo.comments);
        System.out.println("Captions :"+songVideo.containsCaption);

    }
}
