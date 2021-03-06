package com.zero.blog.dao;

import com.zero.blog.entity.ZBlogGp;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ZBlogGpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_gp
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long gpId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_gp
     *
     * @mbggenerated
     */
    int insert(ZBlogGp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_gp
     *
     * @mbggenerated
     */
    int insertSelective(ZBlogGp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_gp
     *
     * @mbggenerated
     */
    ZBlogGp selectByPrimaryKey(Long gpId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_gp
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ZBlogGp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_gp
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ZBlogGp record);
}