package AllConceptOops;

import java.util.ArrayList;

public class ThisFuction {

    public static class YoutubeVideo{

        String name;
        int noOfLikes , noOfViews;
        ArrayList<String> comments;
        boolean CommentsCaption;

        // void CommentsCaption(){
        //      CommentsCaption = true;
        // }

        void setName(String name){
            this.name = name;
        }
        void setNoOfLikes(int noOfLikes){
            this.noOfLikes = noOfLikes;
        }
        void setNoOfViews(int noOfViews){
            this.noOfViews = noOfViews;
        }
        void setComments(ArrayList<String>comments){
            this.comments = comments;
        }
        
        String getName(){
            return this.name;
        }
        int getNoOfLikes(){
            return this.noOfLikes; 
        }
        int getNoOfViews(){
            return noOfViews;
        }
        ArrayList<String> getComments(){
            return comments;
        }

    }
    public static void main(String[] args) {
        
        YoutubeVideo newSong = new YoutubeVideo();

        ArrayList<String> comms = new ArrayList<>();
        comms.add("Nice Lyrics");
        comms.add("WonderFull Song");
        
        newSong.setName("moh moh ke dhage");
        newSong.setNoOfLikes(100);
        newSong.setNoOfViews(500);
        newSong.setComments(comms);

        System.out.println(newSong.getName());
        System.out.println(newSong.getNoOfViews());
        System.out.println(newSong.getNoOfLikes());
        System.out.println(newSong.getComments());
        System.out.println(newSong.CommentsCaption);
    }
}
