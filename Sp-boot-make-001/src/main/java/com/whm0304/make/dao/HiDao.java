package com.whm0304.make.dao;

import com.whm0304.make.models.HiVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HiDao extends JpaRepository<HiVO,String> {
}
