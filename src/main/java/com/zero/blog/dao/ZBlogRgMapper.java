package com.zero.blog.dao;

import com.zero.blog.entity.ZBlogRg;

public interface ZBlogRgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_rg
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long grId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_rg
     *
     * @mbggenerated
     */
    int insert(ZBlogRg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_rg
     *
     * @mbggenerated
     */
    int insertSelective(ZBlogRg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_rg
     *
     * @mbggenerated
     */
    ZBlogRg selectByPrimaryKey(Long grId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_rg
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ZBlogRg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_rg
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ZBlogRg record);
}