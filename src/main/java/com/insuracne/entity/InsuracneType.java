package com.insuracne.entity;

public class InsuracneType {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_insuracne_type.id
     *
     * @mbggenerated Sat Mar 25 12:55:25 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_insuracne_type.ins_name
     *
     * @mbggenerated Sat Mar 25 12:55:25 CST 2017
     */
    private String insName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_insuracne_type.id
     *
     * @return the value of t_insuracne_type.id
     *
     * @mbggenerated Sat Mar 25 12:55:25 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_insuracne_type.id
     *
     * @param id the value for t_insuracne_type.id
     *
     * @mbggenerated Sat Mar 25 12:55:25 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_insuracne_type.ins_name
     *
     * @return the value of t_insuracne_type.ins_name
     *
     * @mbggenerated Sat Mar 25 12:55:25 CST 2017
     */
    public String getInsName() {
        return insName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_insuracne_type.ins_name
     *
     * @param insName the value for t_insuracne_type.ins_name
     *
     * @mbggenerated Sat Mar 25 12:55:25 CST 2017
     */
    public void setInsName(String insName) {
        this.insName = insName == null ? null : insName.trim();
    }
}