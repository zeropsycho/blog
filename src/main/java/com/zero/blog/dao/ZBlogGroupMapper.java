package com.zero.blog.dao;

import com.zero.blog.entity.ZBlogGroup;

public interface ZBlogGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_group
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long gId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_group
     *
     * @mbggenerated
     */
    int insert(ZBlogGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_group
     *
     * @mbggenerated
     */
    int insertSelective(ZBlogGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_group
     *
     * @mbggenerated
     */
    ZBlogGroup selectByPrimaryKey(Long gId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_group
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ZBlogGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_group
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ZBlogGroup record);
}