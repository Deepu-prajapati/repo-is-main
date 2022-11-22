import java.util.ArrayList;

public class oops {
    public static class YoutubeVideo{

        String name;
        int noOfViews , noOfLikes;
        ArrayList<String> comments;
        boolean containsCaption;

        // Default Constructor has no retrun type
        void pressLikeButton(){
            noOfLikes++;
        }
        // default constructor
        void caption(){
            containsCaption = true;
        }
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
        songVideo.pressLikeButton();
        System.out.println("Likes :"+ songVideo.noOfLikes);
        System.out.println("comments :"+songVideo.comments);
        songVideo.caption();
        System.out.println("Captions :"+songVideo.containsCaption);

    }
}
