package com.bdc.jpatest.repository;

import com.bdc.jpatest.domain.MemberVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberJpaRepository extends JpaRepository<MemberVo, Long> {

    public List<MemberVo> findById(String id);

    public List<MemberVo> findByName(String name);

    public List<MemberVo> findByNameLike(String keyword);
}
