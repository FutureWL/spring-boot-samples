package com.wrox.site.entities;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wrox.site.validation.NotBlank;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@XmlRootElement(name = "attachment")
@XmlAccessorType(XmlAccessType.NONE)
@JsonAutoDetect(creatorVisibility = JsonAutoDetect.Visibility.NONE,
        fieldVisibility = JsonAutoDetect.Visibility.NONE,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        isGetterVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE)
public class Attachment implements Serializable {
    private static final long serialVersionUID = 1L;

    private long id;

    @NotBlank(message = "{validate.attachment.name}")
    private String name;

    @NotBlank(message = "{validate.attachment.mimeContentType}")
    private String mimeContentType;

    @Size(min = 1, message = "{validate.attachment.contents}")
    private byte[] contents;

    @Id
    @Column(name = "AttachmentId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @XmlElement
    @JsonProperty
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "AttachmentName")
    @XmlElement
    @JsonProperty
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @XmlElement
    @JsonProperty
    public String getMimeContentType() {
        return this.mimeContentType;
    }

    public void setMimeContentType(String mimeContentType) {
        this.mimeContentType = mimeContentType;
    }

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @XmlElement
    @XmlSchemaType(name = "base64Binary")
    @JsonProperty
    public byte[] getContents() {
        return this.contents;
    }

    public void setContents(byte[] contents) {
        this.contents = contents;
    }
}
