package com.zero.blog.entity;

import java.util.Date;

public class ZBlogRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column z_blog_role.r_id
     *
     * @mbggenerated
     */
    private Long rId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column z_blog_role.r_parent_id
     *
     * @mbggenerated
     */
    private Long rParentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column z_blog_role.r_name
     *
     * @mbggenerated
     */
    private String rName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column z_blog_role.r_create
     *
     * @mbggenerated
     */
    private Date rCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column z_blog_role.r_describe
     *
     * @mbggenerated
     */
    private String rDescribe;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column z_blog_role.r_id
     *
     * @return the value of z_blog_role.r_id
     *
     * @mbggenerated
     */
    public Long getrId() {
        return rId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column z_blog_role.r_id
     *
     * @param rId the value for z_blog_role.r_id
     *
     * @mbggenerated
     */
    public void setrId(Long rId) {
        this.rId = rId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column z_blog_role.r_parent_id
     *
     * @return the value of z_blog_role.r_parent_id
     *
     * @mbggenerated
     */
    public Long getrParentId() {
        return rParentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column z_blog_role.r_parent_id
     *
     * @param rParentId the value for z_blog_role.r_parent_id
     *
     * @mbggenerated
     */
    public void setrParentId(Long rParentId) {
        this.rParentId = rParentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column z_blog_role.r_name
     *
     * @return the value of z_blog_role.r_name
     *
     * @mbggenerated
     */
    public String getrName() {
        return rName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column z_blog_role.r_name
     *
     * @param rName the value for z_blog_role.r_name
     *
     * @mbggenerated
     */
    public void setrName(String rName) {
        this.rName = rName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column z_blog_role.r_create
     *
     * @return the value of z_blog_role.r_create
     *
     * @mbggenerated
     */
    public Date getrCreate() {
        return rCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column z_blog_role.r_create
     *
     * @param rCreate the value for z_blog_role.r_create
     *
     * @mbggenerated
     */
    public void setrCreate(Date rCreate) {
        this.rCreate = rCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column z_blog_role.r_describe
     *
     * @return the value of z_blog_role.r_describe
     *
     * @mbggenerated
     */
    public String getrDescribe() {
        return rDescribe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column z_blog_role.r_describe
     *
     * @param rDescribe the value for z_blog_role.r_describe
     *
     * @mbggenerated
     */
    public void setrDescribe(String rDescribe) {
        this.rDescribe = rDescribe;
    }
}