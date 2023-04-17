package com.solponge.domain.jobinfo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface jopInfoRepository extends JpaRepository<JopInfoVo, Integer> {

    @Query(value = "select * from job_info ORDER BY infonum DESC LIMIT 8 OFFSET 0", nativeQuery=true)
    List<JopInfoVo> jopInfoNew8();
}
