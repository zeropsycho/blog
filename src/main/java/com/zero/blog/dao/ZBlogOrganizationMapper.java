package com.zero.blog.dao;

import com.zero.blog.entity.ZBlogOrganization;

public interface ZBlogOrganizationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_organization
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_organization
     *
     * @mbggenerated
     */
    int insert(ZBlogOrganization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_organization
     *
     * @mbggenerated
     */
    int insertSelective(ZBlogOrganization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_organization
     *
     * @mbggenerated
     */
    ZBlogOrganization selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_organization
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ZBlogOrganization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_organization
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ZBlogOrganization record);
}