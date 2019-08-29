/* CopyRight UMF */
package com.tradingarea.major.repository;

import com.tradingarea.major.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wangyu
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    User findAllById(int id);
}
