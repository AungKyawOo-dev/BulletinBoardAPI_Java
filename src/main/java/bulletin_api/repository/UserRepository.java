package bulletin_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bulletin_api.entity.User;

/**
 * @author Aung Kyaw Oo
 *
 */
public interface UserRepository extends JpaRepository<User, Integer> {

}
