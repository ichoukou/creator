package cn.jbolt._admin.dictionary;

import com.jfinal.aop.Inject;
import com.jfinal.kit.Kv;
import com.jfinal.kit.Ret;

import cn.jbolt.base.BaseService;
import cn.jbolt.common.config.Msg;
import cn.jbolt.common.model.DictionaryType;
import cn.jbolt.common.model.SystemLog;
import cn.jbolt.common.util.CACHE;

/**
* @author 小木 qq:909854136
* @version 创建时间：2019年3月15日 下午3:28:21
*/
public class DictionaryTypeService extends BaseService<DictionaryType> {
	@Inject
	private DictionaryService dictionaryService;
	@Override
	protected DictionaryType dao() {
		return DictionaryType.dao;
	}
	/**
	 * 新增 保存
	 * @param userId
	 * @param type
	 * @return
	 */
	public Ret save(Integer userId,DictionaryType type) {
		if(type==null||isOk(type.getId())||notOk(type.getName())||notOk(type.getModeLevel())||notOk(type.getTypeKey())){
			return fail(Msg.PARAM_ERROR);
		}
		if(existsName(type.getName())){
			return fail("数据分类["+type.getName()+"]已经存在");
		}
		if(exists("typeKey",type.getTypeKey())){
			return fail("数据分类标识Key["+type.getTypeKey()+"]已经存在");
		}
		boolean success=type.save();
		if(success){
			//添加日志
			addSaveSystemLog(type.getId(), userId, SystemLog.TARGETTYPE_DICTIONARY_TYPE,type.getName());
		}
		return success?success(Msg.SUCCESS):fail(Msg.FAIL);
	}
	/**
	 * 更新
	 * @param userId
	 * @param type
	 * @return
	 */
	public Ret update(Integer userId,DictionaryType type) {
		if(type==null||notOk(type.getId())||notOk(type.getName())||notOk(type.getModeLevel())||notOk(type.getTypeKey())){
			return fail(Msg.PARAM_ERROR);
		}
		if(existsName(type.getName(), type.getId())){
			return fail("数据分类["+type.getName()+"]已经存在");
		}
		if(exists("typeKey",type.getTypeKey(), type.getId())){
			return fail("数据分类标识Key["+type.getTypeKey()+"]已经存在");
		}
		boolean success=type.update();
		if(success){
			addUpdateSystemLog(type.getId(), userId, SystemLog.TARGETTYPE_DICTIONARY_TYPE,type.getName());
			CACHE.me.removeDictionaryType(type.getId());
			CACHE.me.removeDictionaryType(type.getTypeKey());
		}
		return success?success(Msg.SUCCESS):fail(Msg.FAIL);
	}
	
	/**
	 * 删除字典分类
	 * @param userId
	 * @param id
	 * @return
	 */
	public Ret delete(Integer userId, Integer id) {
		Ret ret=deleteById(id, true);
		if(ret.isOk()){
			DictionaryType type=ret.getAs("data");
			addDeleteSystemLog(id, userId, SystemLog.TARGETTYPE_DICTIONARY_TYPE,type.getName());
			CACHE.me.removeDictionaryType(id);
			CACHE.me.removeDictionaryType(type.getTypeKey());
		}
		return ret;
	}
	/**
	 * 通过typeKey获取字典分类
	 * @param typeKey
	 * @return
	 */
	public DictionaryType findByTypeKey(String typeKey) {
		return findFirst(Kv.by("typeKey", typeKey));
	}
	
	/**
	 * 检测是否被使用
	 */
	@Override
	public String checkInUse(DictionaryType dictionaryType) {
		boolean inUse=dictionaryService.checkTypeInUse(dictionaryType.getId());
		return inUse?"此类型下已经存在数据项，不能直接删除":null;
	}

}
