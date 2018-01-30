package com.zking.gofcrm.dictionary.mapper;

import com.zking.gofcrm.dictionary.model.Dictionary;

import java.util.List;
import java.util.Map;

public interface DictionaryMapper {


    /**
     * 插入新的字典数据
     * @param record
     * @return
     */
    int insert(Dictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crm_dict
     *
     * @mbg.generated
     */
    Dictionary selectByPrimaryKey(Integer dictId);

    /**
     * 修改字典表的数据
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Dictionary record);

    /**
     * 查询一个集合
     * @param dictionary
     * @return
     */
    List<Dictionary> selectByMap(Dictionary dictionary);

}