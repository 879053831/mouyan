package com.mapper;

import org.springframework.stereotype.Repository;

@Repository
public interface PowerMapper {

	/**
	 * 给某个角色分配权限
	 * @param charetId:角色ID
	 * @param powerId:权限ID
	 * @return 分配成功与否
	 * @author 94655
	 */
	public int givePower(String charetId, String powerId);
}
