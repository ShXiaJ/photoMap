package com.shxiaj.ssm.mapper;

import com.shxiaj.ssm.pojo.Photo;
import java.util.List;

public interface PhotoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_photo
     *
     * @mbggenerated Wed Jun 29 00:55:01 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_photo
     *
     * @mbggenerated Wed Jun 29 00:55:01 CST 2022
     */
    int insert(Photo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_photo
     *
     * @mbggenerated Wed Jun 29 00:55:01 CST 2022
     */
    Photo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_photo
     *
     * @mbggenerated Wed Jun 29 00:55:01 CST 2022
     */
    List<Photo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_photo
     *
     * @mbggenerated Wed Jun 29 00:55:01 CST 2022
     */
    int updateByPrimaryKey(Photo record);
}