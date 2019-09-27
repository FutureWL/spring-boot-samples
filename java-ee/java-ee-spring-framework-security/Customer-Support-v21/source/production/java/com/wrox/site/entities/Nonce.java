package com.wrox.site.entities;

import java.io.Serializable;

@Entity
@Table(name = "OAuthNonce")
public class Nonce implements Serializable {
    private static final long serialVersionUID = 1L;

    private long id;
    private String value;
    private long timestamp;

    public Nonce() {
    }

    public Nonce(String value, long timestamp) {
        this.value = value;
        this.timestamp = timestamp;
    }

    @Id
    @Column(name = "OAuthNonceId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Column(name = "NonceTimestamp")
    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
