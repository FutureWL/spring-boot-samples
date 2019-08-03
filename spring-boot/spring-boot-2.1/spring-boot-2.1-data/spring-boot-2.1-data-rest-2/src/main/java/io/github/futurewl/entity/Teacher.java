package io.github.futurewl.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Data
@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    /**
     * CascadeType.PERSIST：级联新增（又称级联保存）：
     * CascadeType.DETACH：级联分离
     * CascadeType.MERGE：级联合并（级联更新）
     * CascadeType.REMOVE：级联删除：
     * CascadeType.REFRESH：级联刷新
     */

    @OneToOne(mappedBy = "teacher", cascade = {
//            CascadeType.REFRESH,
//            CascadeType.DETACH,
//            CascadeType.MERGE,
//            CascadeType.PERSIST,
//            CascadeType.REMOVE
    })
    private Course course;

}
