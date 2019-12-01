package com.serviceDao;

import org.springframework.stereotype.Service;

@Service
public interface PowerServiceDao {

	/**
	 * 给角色分配权限
	 * @param charetId:角色ID
	 * @param powerId:权限ID
	 * @return 分配权限成功与否
	 */
	public boolean givePower(String charetId, String powerId);
}
