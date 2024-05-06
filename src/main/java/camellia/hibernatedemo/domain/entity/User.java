package camellia.hibernatedemo.domain.entity;

import lombok.Data;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author anthea
 * @date 2023/9/3 19:29
 */
@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "sex")
    private String sex;

    @Column(name = "phone_num")
    private String phoneNum;
}
