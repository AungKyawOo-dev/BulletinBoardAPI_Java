package bulletin_api.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    public Integer id;

    /**
     * name
     */
    @Column(unique = true, length = 100, nullable = false)
    public String name;

    /**
     * email
     */
    @Column(unique = true, length = 100, nullable = false)
    public String email;

    /**
     * password
     */
    @Column(length = 100, nullable = false)
    public String password;

    /**
     * profile
     */
    @Column(length = 100, nullable = false)
    public String profile;

    /**
     * type
     */
    @Column(nullable = false, columnDefinition = "tinyint not null default 0")
    public int type;

    /**
     * phone
     */
    @Column(length = 20, nullable = false)
    public String phone;

    /**
     * address
     */
    @Column(length = 255, nullable = false)
    public String address;

    /**
     * dob
     */
    @Column(length = 100, nullable = false)
    public Date dob;

    /**
     * remember_token
     */
    @Column(length = 255, nullable = false)
    public String remember_token;

    /**
     * created_at
     */
    @CreationTimestamp
    @Column(updatable = false)
    public Date created_at;

    /**
     * updated_at
     */
    @UpdateTimestamp
    public Date updated_at;

    /**
     * deleted_at
     */
    public Date deleted_at;
}
