package com.zero.blog.dao;

import com.zero.blog.entity.ZBlogUr;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ZBlogUrMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_ur
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long urId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_ur
     *
     * @mbggenerated
     */
    int insert(ZBlogUr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_ur
     *
     * @mbggenerated
     */
    int insertSelective(ZBlogUr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_ur
     *
     * @mbggenerated
     */
    ZBlogUr selectByPrimaryKey(Long urId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_ur
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ZBlogUr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_ur
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ZBlogUr record);
}