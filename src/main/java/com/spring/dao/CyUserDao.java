package com.spring.dao;

import com.spring.model.CyUser;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface CyUserDao {

	@Select("SELECT * FROM cy_user cu WHERE cu.id = #{id}")
	CyUser getUserById(Long id);

}
