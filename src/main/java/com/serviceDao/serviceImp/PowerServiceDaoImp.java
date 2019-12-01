package com.serviceDao.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapper.PowerMapper;
import com.serviceDao.PowerServiceDao;

@Service
public class PowerServiceDaoImp implements PowerServiceDao {

	//@Autowired
	//private PowerMapper powerMapper;
	
	@Override
	@Transactional
	public boolean givePower(String charetId, String powerId) {
		// TODO Auto-generated method stub
		return false;
	}

}
