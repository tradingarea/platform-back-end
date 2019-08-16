/* CopyRight UMF */
package com.tradingarea.major.repository;

import com.tradingarea.major.entity.WyTest;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wangyu
 * @date 2019/8/16 14:49
 */
public interface WyTestRepository extends JpaRepository<WyTest, Long> {
    WyTest findAllById(Long id);
}
