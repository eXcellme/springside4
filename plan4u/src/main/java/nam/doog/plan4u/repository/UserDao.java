package nam.doog.plan4u.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import nam.doog.plan4u.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}
