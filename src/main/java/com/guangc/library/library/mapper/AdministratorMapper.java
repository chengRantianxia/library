package com.guangc.library.library.mapper;

import com.guangc.library.library.bean.Administrator;
import com.guangc.library.library.bean.AdministratorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdministratorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Administrator
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    long countByExample(AdministratorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Administrator
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    int deleteByExample(AdministratorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Administrator
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    int deleteByPrimaryKey(Integer admId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Administrator
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    int insert(Administrator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Administrator
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    int insertSelective(Administrator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Administrator
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    List<Administrator> selectByExample(AdministratorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Administrator
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    Administrator selectByPrimaryKey(Integer admId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Administrator
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    int updateByExampleSelective(@Param("record") Administrator record, @Param("example") AdministratorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Administrator
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    int updateByExample(@Param("record") Administrator record, @Param("example") AdministratorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Administrator
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    int updateByPrimaryKeySelective(Administrator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Administrator
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    int updateByPrimaryKey(Administrator record);
}