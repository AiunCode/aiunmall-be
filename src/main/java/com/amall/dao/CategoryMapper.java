package com.amall.dao;

import com.amall.pojo.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(@Param("record") Category record);

    int insertSelective(@Param("record") Category record);

    Category selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(@Param("record") Category record);

    int updateByPrimaryKey(@Param("record") Category record);

    List<Category> selectCategoryChildrenByParentId(Integer parentId);
}