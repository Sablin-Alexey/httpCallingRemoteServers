import com.fasterxml.jackson.annotation.JsonProperty;



public class Post {


    private final int upvotes;
    private final String id;



    private final String text;
    private final String type;
    private final String user;


    public Post(@JsonProperty("upvotes") int upvotes,
                @JsonProperty("id") String id,
                @JsonProperty("text") String text,
                @JsonProperty("type") String type,
                @JsonProperty("user") String user) {


        this.upvotes = upvotes;
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
    }

    public int getUpvotes() {
        return upvotes;
    }
    @Override
    public String toString() {
        return "Post: " +
                "\n user=" + user +
                "\n id=" + id +
                "\n text ='" + text +
                "\n type ='" + type +
                "\n upvotes ='" + upvotes
                ;
    }

}
