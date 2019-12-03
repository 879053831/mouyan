package com.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.mode.po.TBCharet;
import com.mode.po.TBEmploy;
import com.mode.po.TBMainMeal;
import com.mode.po.TBMeal;
import com.mode.po.TBMinor;
import com.mode.po.TBPower;
import com.mode.po.TBProject;
import com.mode.po.TBWorkUnit;

@Repository
public interface PowerMapper {

	/**
	 * 给某个角色分配权限
	 * @param charetId:角色ID
	 * @param powerId:权限ID
	 * @return 分配成功与否
	 * @author yaoman
	 */
	public Integer givePower(@Param("mainMealId")Integer mainMealId, @Param("charetId")Integer charetId);
	
	/**
	 * 查找全部权限，即每个角色所对应的菜单
	 * @return 
	 * @author yaoman
	 */
	public Map<Integer,TBPower> findAllPower();

	/**
	 * 禁用账号或开启账号
	 * @param empId
	 * @return
	 */
	public Boolean userBanOrStart(Integer empId);

	/**
	 * 修改账号信息
	 * @param emp
	 * @return
	 */
	public Boolean updateUser(TBEmploy emp);

	/**
	 * 删除账号
	 * @param tbemp 员工ID
	 * @return
	 */
	public Boolean deleteUser(Integer tbempId);

	/**
	 * 添加账号
	 * @param tbemp 员工及工作单位信息信息
	 * @return
	 */
	public Boolean addUser(TBEmploy tbemp);

	/**
	 * 添加角色
	 * @param charet 角色信息
	 * @return
	 */
	public Boolean addCharet(TBCharet charet);

	/**
	 * 修改角色信息，角色ID不可修改
	 * @param charet 修改后角色信息
	 * @return
	 */
	public Boolean updateCharet(TBCharet charet);

	/**
	 * 删除角色
	 * @param charetId 角色ID
	 * @return
	 */
	public Boolean deleteCharet(Integer charetId);

	/**
	 * 添加新菜单
	 * @param mainMeal 菜单信息
	 * @return
	 */
	public Boolean addMainMeal(TBMainMeal mainMeal);

	/**
	 * 更新菜单信息，菜单ID不可改
	 * @param mainMeal
	 * @return
	 */
	public Boolean updateMainMeal(TBMainMeal mainMeal);

	/**
	 * 删除菜单
	 * @param charetId 菜单ID
	 * @return
	 */
	public Boolean deleteMainMeal(Integer charetId);

	/**
	 * 添加工作单位
	 * @param unit 新工作单位信息
	 * @return
	 */
	public Boolean addUnit(TBWorkUnit unit);

	/**
	 * 更新工作单位信息，工作单位ID不可改
	 * @param unit 新工作单位信息
	 * @return
	 */
	public Boolean updateUnit(TBWorkUnit unit);

	/**
	 * 删除工作单位
	 * @param unitId 工作单位ID
	 * @return
	 */
	public Boolean deleteUnit(Integer unitId);

	/**
	 * 添加细项信息
	 * @param minor 新细项信息
	 * @return
	 */
	public Boolean addMinor(TBMinor minor);

	/**
	 * 更新细项信息，细项ID不可改
	 * @param minor 修改后细项信息
	 * @return
	 */
	public Boolean updateMinor(TBMinor minor);

	/**
	 * 删除细项
	 * @param minorId 细项ID
	 * @return
	 */
	public Boolean deleteMinor(Integer minorId);

	/**
	 * 添加新项目
	 * @param project 新项目信息
	 * @return
	 */
	public Boolean addProject(TBProject project);

	/**
	 * 更新项目信息，项目ID不可修改
	 * @param project 修改后信息
	 * @return
	 */
	public Boolean updateProject(TBProject project);

	/**
	 * 删除项目信息
	 * @param projectId 项目ID
	 * @return
	 */
	public Boolean deleteProject(Integer projectId);

	/**
	 * 添加新套餐
	 * @param meal 套餐信息
	 * @return
	 */
	public Boolean addMeal(TBMeal meal);

	/**
	 * 更新套餐信息，套餐ID不可改
	 * @param meal 修改后套餐信息
	 * @return
	 */
	public Boolean updateMeal(TBMeal meal);

	/**
	 * 删除套餐
	 * @param mealId 套餐ID
	 * @return
	 */
	public Boolean deleteMeal(Integer mealId);
	
	/**
	 * 查询所有员工信息
	 * @return
	 */
	public List<TBEmploy> findAllEmploy();

	/**
	 * 查询所有工作单位
	 * @return
	 */
	public List<TBWorkUnit> findAllUnit();


	/**
	 * 查询所有菜单
	 * @return
	 */
	public List<TBMainMeal> findAllMainMeal();

	/**
	 * 查询所有角色
	 * @return
	 */
	public List<TBCharet> findAllCharet();

	/**
	 * 查询所有细项
	 * @return
	 */
	public List<TBMinor> findAllMinor();

	/**
	 * 查询所有项目
	 * @return
	 */
	public List<TBProject> findAllProject();

	/**
	 * 查询所有套餐
	 * @return
	 */
	public List<TBMeal> findAllMeal();
	
}
