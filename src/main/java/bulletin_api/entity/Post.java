package bulletin_api.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Aung Kyaw Oo
 *
 */
@Entity
@Table(name = "posts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Post implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
     * int id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    /**
     * String title
     */
    @Column(length = 125, nullable = false)
    public String title;

    /**
     * String description
     */
    @Column(length = 255, nullable = false)
    public String description;

    /**
     * short status
     */
    @Column(length = 2, nullable = false)
    public short status;

    /**
     * User user
     */
    @OneToOne(targetEntity = User.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "create_user_id", referencedColumnName = "id")
    private User user;

    /**
     * Date created_at
     */
    @CreationTimestamp
    @Column(updatable = false)
    public Date created_at;

    /**
     * Date updated_at
     */
    @UpdateTimestamp
    public Date updated_at;

    /**
     * Date deleted_at
     */
    public Date deleted_at;

}
