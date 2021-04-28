package com.amall.dao;

import com.amall.pojo.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryMapper {
    /**
     * 通过主键删除商品种类
     * @param id 主键
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入商品种类
     * @param record 商品种类类
     * @return
     */
    int insert(@Param("record") Category record);

    /**
     * 有选择的插入
     * @param record 商品种类类
     * @return
     */
    int insertSelective(@Param("record") Category record);

    /**
     * 通过主键查询
     * @param id 主键
     * @return
     */
    Category selectByPrimaryKey(Integer id);

    /**
     * 有选择的通过主键更新
     * @param record 商品种类类
     * @return
     */
    int updateByPrimaryKeySelective(@Param("record") Category record);

    /**
     * 通过主键更新
     * @param record 商品种类类
     * @return
     */
    int updateByPrimaryKey(@Param("record") Category record);

    /**
     * 通过父id查询商品子类
     * @param parentId 父id
     * @return
     */
    List<Category> selectCategoryChildrenByParentId(Integer parentId);
}