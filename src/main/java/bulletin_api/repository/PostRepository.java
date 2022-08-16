package bulletin_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bulletin_api.entity.Post;

/**
 * @author Aung Kyaw Oo
 *
 */
public interface PostRepository extends JpaRepository<Post, Integer>{

}
