package com.serviceDao.serviceImp;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.PowerMapper;
import com.mode.po.TBCharet;
import com.mode.po.TBEmploy;
import com.mode.po.TBMainMeal;
import com.mode.po.TBMeal;
import com.mode.po.TBMinor;
import com.mode.po.TBPower;
import com.mode.po.TBProject;
import com.mode.po.TBWorkUnit;
import com.serviceDao.PowerServiceDao;

@Service
public class PowerServiceDaoImp implements PowerServiceDao {

	//@Resource
	private PowerMapper powerMapper;
	
	@Override
	public boolean givePower(Integer charetId, Integer powerId) {
		// TODO Auto-generated method stub
		powerMapper.givePower(charetId, powerId);
		return false;
	}

	@Override
	public Map<Integer, TBPower> findAllPower() {
		// TODO Auto-generated method stub
		
		return powerMapper.findAllPower();
	}

	@Override
	public Boolean userBanOrStart(Integer empId) {
		// TODO Auto-generated method stub
		
		return powerMapper.userBanOrStart(empId);
	}

	@Override
	public Boolean updateUser(TBEmploy emp) {
		// TODO Auto-generated method stub
		return powerMapper.updateUser(emp);
	}

	@Override
	public Boolean deleteUser(Integer tbempId) {
		// TODO Auto-generated method stub
		return powerMapper.deleteUser(tbempId);
	}

	@Override
	public Boolean addUser(TBEmploy tbemp) {
		// TODO Auto-generated method stub
		return powerMapper.addUser(tbemp);
	}

	@Override
	public Boolean addCharet(TBCharet charet) {
		// TODO Auto-generated method stub
		return powerMapper.addCharet(charet);
	}

	@Override
	public Boolean updateCharet(TBCharet charet) {
		// TODO Auto-generated method stub
		return powerMapper.updateCharet(charet);
	}

	@Override
	public Boolean deleteCharet(Integer charetId) {
		// TODO Auto-generated method stub
		return powerMapper.deleteCharet(charetId);
	}

	@Override
	public Boolean addMainMeal(TBMainMeal mainMeal) {
		// TODO Auto-generated method stub
		return powerMapper.addMainMeal(mainMeal);
	}

	@Override
	public Boolean updateMainMeal(TBMainMeal mainMeal) {
		// TODO Auto-generated method stub
		return powerMapper.updateMainMeal(mainMeal);
	}

	@Override
	public Boolean deleteMainMeal(Integer charetId) {
		// TODO Auto-generated method stub
		return powerMapper.deleteMainMeal(charetId);
	}

	@Override
	public Boolean addUnit(TBWorkUnit unit) {
		// TODO Auto-generated method stub
		return powerMapper.addUnit(unit);
	}

	@Override
	public Boolean updateUnit(TBWorkUnit unit) {
		// TODO Auto-generated method stub
		return powerMapper.updateUnit(unit);
	}

	@Override
	public Boolean deleteUnit(Integer unitId) {
		// TODO Auto-generated method stub
		return powerMapper.deleteUnit(unitId);
	}

	@Override
	public Boolean addMinor(TBMinor minor) {
		// TODO Auto-generated method stub
		return powerMapper.addMinor(minor);
	}

	@Override
	public Boolean updateMinor(TBMinor minor) {
		// TODO Auto-generated method stub
		return powerMapper.updateMinor(minor);
	}

	@Override
	public Boolean deleteMinor(Integer minorId) {
		// TODO Auto-generated method stub
		return powerMapper.deleteMinor(minorId);
	}

	@Override
	public Boolean addProject(TBProject project) {
		// TODO Auto-generated method stub
		return powerMapper.addProject(project);
	}

	@Override
	public Boolean updateProject(TBProject project) {
		// TODO Auto-generated method stub
		return powerMapper.updateProject(project);
	}

	@Override
	public Boolean deleteProject(Integer projectId) {
		// TODO Auto-generated method stub
		return powerMapper.deleteProject(projectId);
	}

	@Override
	public Boolean addMeal(TBMeal meal) {
		// TODO Auto-generated method stub
		return powerMapper.addMeal(meal);
	}

	@Override
	public Boolean updateMeal(TBMeal meal) {
		// TODO Auto-generated method stub
		return powerMapper.updateMeal(meal);
	}

	@Override
	public Boolean deleteMeal(Integer mealId) {
		// TODO Auto-generated method stub
		return powerMapper.deleteMeal(mealId);
	}

	@Override
	public List<TBEmploy> findAllEmploy() {
		// TODO Auto-generated method stub
		return powerMapper.findAllEmploy();
	}

	@Override
	public List<TBWorkUnit> findAllUnit() {
		// TODO Auto-generated method stub
		return powerMapper.findAllUnit();
	}

	@Override
	public List<TBMainMeal> findAllMainMeal() {
		// TODO Auto-generated method stub
		return powerMapper.findAllMainMeal();
	}

	@Override
	public List<TBCharet> findAllCharet() {
		// TODO Auto-generated method stub
		return powerMapper.findAllCharet();
	}

	@Override
	public List<TBMinor> findAllMinor() {
		// TODO Auto-generated method stub
		return powerMapper.findAllMinor();
	}

	@Override
	public List<TBProject> findAllProject() {
		// TODO Auto-generated method stub
		return powerMapper.findAllProject();
	}

	@Override
	public List<TBMeal> findAllMeal() {
		// TODO Auto-generated method stub
		return powerMapper.findAllMeal();
	}


}
