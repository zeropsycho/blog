package com.zero.blog.dao;

import com.zero.blog.entity.ZBlogAuthority;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ZBlogAuthorityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_authority
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_authority
     *
     * @mbggenerated
     */
    int insert(ZBlogAuthority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_authority
     *
     * @mbggenerated
     */
    int insertSelective(ZBlogAuthority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_authority
     *
     * @mbggenerated
     */
    ZBlogAuthority selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_authority
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ZBlogAuthority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_authority
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ZBlogAuthority record);
}