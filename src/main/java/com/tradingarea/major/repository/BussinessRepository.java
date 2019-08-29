/* CopyRight UMF */
package com.tradingarea.major.repository;

import com.tradingarea.major.entity.Bussiness;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author wangyu
 * @date 2019/8/16 14:49
 */
public interface BussinessRepository extends JpaRepository<Bussiness, Integer> {

    @Modifying
    @Transactional
    @Query(value = "select * from Bussiness where status > 0 and level > 0 order by id desc limit 5", nativeQuery = true)
    List<Bussiness> findLastest5();

    Bussiness findAllById(int id);

    /**********************************************************************/

    Bussiness findByName(String name);

    @Modifying
    @Transactional
    @Query(value = "select * from Bussiness where 1=1 limit 0,10", nativeQuery = true)
    public List<Bussiness> findten();

    @Modifying
    @Transactional
    @Query("update Bussiness u set u.name=:name,u.introduction=:introduction,u.detail=:detail,u.address=:address,u.logo=:logo,u.picture=:picture,u.status=:status,u.level=:level where u.id=:id")
    void updateById(@Param("id") Integer id, @Param("name") String name, @Param("introduction") String introduction, @Param("detail") String detail, @Param("address") String address, @Param("logo") String logo, @Param("picture") String picture, @Param("status") Integer status, @Param("level") Integer level);


    Page<Bussiness> findAll(Pageable pageable);

    Page<Bussiness> findByName(@Param("name") String name2, Pageable pageable);
}
