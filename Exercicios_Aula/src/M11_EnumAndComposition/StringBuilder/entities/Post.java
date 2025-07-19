package M11_EnumAndComposition.StringBuilder.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    //constante declarada para acesso no método StringBuilder
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    //private static para que não se tenha uma cópia do objeto para cada post da aplicação, e sim apenas uma cópia para a aplicação toda

    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> comments = new ArrayList<>(); //associação

    public Post(Date moment, String title, String content, Integer likes){
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }
    //list Comments não pode ter set (não pode ser trocada por putro list)

    public void addComment(Comment comment /*comment é o argumento*/){
        comments.add(comment);
    }

    public void removeComment(Comment comment){
        comments.remove(comment);
    }

    //StringBuilder - ideal p/ montar um String muito grande a partir de vários Strings menores.
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n"); //append acrescentar no final
        sb.append(likes);
        sb.append(" likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments: \n");
        for (Comment c : comments) {
            sb.append(c.getText() + "\n"); //acrescenta comentários no StringBuilder
        }
        return sb.toString();
    }
}
