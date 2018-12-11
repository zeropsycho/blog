package com.zero.blog.entity;

import java.util.Date;

public class ZBlogOrganization {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column z_blog_organization.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column z_blog_organization.parent_id
     *
     * @mbggenerated
     */
    private Long parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column z_blog_organization.o_name
     *
     * @mbggenerated
     */
    private String oName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column z_blog_organization.o_create
     *
     * @mbggenerated
     */
    private Date oCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column z_blog_organization.o_describe
     *
     * @mbggenerated
     */
    private String oDescribe;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column z_blog_organization.id
     *
     * @return the value of z_blog_organization.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column z_blog_organization.id
     *
     * @param id the value for z_blog_organization.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column z_blog_organization.parent_id
     *
     * @return the value of z_blog_organization.parent_id
     *
     * @mbggenerated
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column z_blog_organization.parent_id
     *
     * @param parentId the value for z_blog_organization.parent_id
     *
     * @mbggenerated
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column z_blog_organization.o_name
     *
     * @return the value of z_blog_organization.o_name
     *
     * @mbggenerated
     */
    public String getoName() {
        return oName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column z_blog_organization.o_name
     *
     * @param oName the value for z_blog_organization.o_name
     *
     * @mbggenerated
     */
    public void setoName(String oName) {
        this.oName = oName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column z_blog_organization.o_create
     *
     * @return the value of z_blog_organization.o_create
     *
     * @mbggenerated
     */
    public Date getoCreate() {
        return oCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column z_blog_organization.o_create
     *
     * @param oCreate the value for z_blog_organization.o_create
     *
     * @mbggenerated
     */
    public void setoCreate(Date oCreate) {
        this.oCreate = oCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column z_blog_organization.o_describe
     *
     * @return the value of z_blog_organization.o_describe
     *
     * @mbggenerated
     */
    public String getoDescribe() {
        return oDescribe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column z_blog_organization.o_describe
     *
     * @param oDescribe the value for z_blog_organization.o_describe
     *
     * @mbggenerated
     */
    public void setoDescribe(String oDescribe) {
        this.oDescribe = oDescribe;
    }
}