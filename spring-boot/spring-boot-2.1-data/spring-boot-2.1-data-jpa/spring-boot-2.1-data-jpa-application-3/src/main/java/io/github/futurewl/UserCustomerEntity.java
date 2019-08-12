package io.github.futurewl;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Getter
@Setter
@Entity
@Table(name = "user_customer", schema = "db_spring_boot_21_data_jpa_application_3", catalog = "")
@EntityListeners(AuditingEntityListener.class)
public class UserCustomerEntity {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @CreatedDate
    @Column(name = "create_time", nullable = true)
    private Date createTime;


    @CreatedBy
    @Column(name = "create_user_id", nullable = true)
    private Integer createUserId;

    @LastModifiedBy
    @Column(name = "last_modified_user_id", nullable = true)
    private Integer lastModifiedUserId;

    @LastModifiedDate
    @Column(name = "last_modified_time", nullable = true)
    private Date lastModifiedTime;

    @Column(name = "customer_name", nullable = true, length = 50)
    private String customerName;

    @Column(name = "customer_email", nullable = true, length = 50)
    private String customerEmail;

    public UserCustomerEntity(String customerName, String customerEmail) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
    }
}
