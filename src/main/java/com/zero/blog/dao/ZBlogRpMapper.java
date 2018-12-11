package com.zero.blog.dao;

import com.zero.blog.entity.ZBlogRp;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ZBlogRpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_rp
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long rpId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_rp
     *
     * @mbggenerated
     */
    int insert(ZBlogRp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_rp
     *
     * @mbggenerated
     */
    int insertSelective(ZBlogRp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_rp
     *
     * @mbggenerated
     */
    ZBlogRp selectByPrimaryKey(Long rpId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_rp
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ZBlogRp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table z_blog_rp
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ZBlogRp record);
}