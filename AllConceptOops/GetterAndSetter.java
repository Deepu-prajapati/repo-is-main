package AllConceptOops;

import java.util.ArrayList;

public class GetterAndSetter {
    
    public static class YoutubeVideo{

        String name;
        int noOfViews , noOfLikes;
        ArrayList<String> comments;
        boolean containsCaptions;

        // Setters
        
        void setName(String  newName){
            name = newName;
        }
        void setnoOfViews(int views){
            noOfViews = views;
        }
        void setnoOfLikes(int likes){
            noOfLikes = likes;
        }
        void setComments(ArrayList<String> newComments){
            newComments = comments;
        }
        
        // Getter
        String getName(){
            return name;
        }
        int getnoOfViews(){
            return noOfViews;
        }
        int getnoOfLikes(){
            return noOfLikes;
        }
        ArrayList<String>getComments(){
            return comments;
        }
        
    }
    public static void main(String[] args) {
        
        YoutubeVideo songVideo = new YoutubeVideo();
        
        ArrayList<String> comms = new ArrayList<>();
        comms.add("Good");
        comms.add("Nice");

        songVideo.setName("Mahadev");
        songVideo.setnoOfLikes(1000);
        songVideo.setnoOfViews(5000);
        songVideo.setComments(comms);


        System.out.println("Song name" + songVideo.getName());
        System.out.println("no of likes"+songVideo.getnoOfLikes());
        System.out.println("no of views"+songVideo.getnoOfViews());
        System.out.println("comments"+songVideo.getComments());
    }
}
