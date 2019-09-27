package com.wrox.site.entities;

import org.hibernate.search.annotations.*;

@Entity
@Table(name = "Post")
@Indexed
public class ForumPost {
    private long id;
    private User user;
    private String title;
    private String body;
    private String keywords;

    @Id
    @DocumentId
    @Column(name = "PostId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "UserId")
    @IndexedEmbedded
    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Basic
    @Field
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Lob
    @Field
    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Basic
    @Field(boost = @Boost(2.0F))
    public String getKeywords() {
        return this.keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
}
