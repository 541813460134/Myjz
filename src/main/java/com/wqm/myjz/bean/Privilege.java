package com.wqm.myjz.bean;

import java.io.Serializable;

public class Privilege implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_privilege.id
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_privilege.name
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_privilege.path
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    private String path;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_privilege.type
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_privilege.icon
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    private String icon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_privilege.hidden
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    private Integer hidden;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_privilege.parent_id
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    private Long parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table base_privilege
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_privilege.id
     *
     * @return the value of base_privilege.id
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_privilege.id
     *
     * @param id the value for base_privilege.id
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_privilege.name
     *
     * @return the value of base_privilege.name
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_privilege.name
     *
     * @param name the value for base_privilege.name
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_privilege.path
     *
     * @return the value of base_privilege.path
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_privilege.path
     *
     * @param path the value for base_privilege.path
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_privilege.type
     *
     * @return the value of base_privilege.type
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_privilege.type
     *
     * @param type the value for base_privilege.type
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_privilege.icon
     *
     * @return the value of base_privilege.icon
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_privilege.icon
     *
     * @param icon the value for base_privilege.icon
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_privilege.hidden
     *
     * @return the value of base_privilege.hidden
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public Integer getHidden() {
        return hidden;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_privilege.hidden
     *
     * @param hidden the value for base_privilege.hidden
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_privilege.parent_id
     *
     * @return the value of base_privilege.parent_id
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_privilege.parent_id
     *
     * @param parentId the value for base_privilege.parent_id
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}