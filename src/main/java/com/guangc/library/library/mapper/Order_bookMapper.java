package com.guangc.library.library.mapper;

import com.guangc.library.library.bean.Order_book;
import com.guangc.library.library.bean.Order_bookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Order_bookMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Order_book
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    long countByExample(Order_bookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Order_book
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    int deleteByExample(Order_bookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Order_book
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    int deleteByPrimaryKey(Integer orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Order_book
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    int insert(Order_book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Order_book
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    int insertSelective(Order_book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Order_book
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    List<Order_book> selectByExample(Order_bookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Order_book
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    Order_book selectByPrimaryKey(Integer orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Order_book
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    int updateByExampleSelective(@Param("record") Order_book record, @Param("example") Order_bookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Order_book
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    int updateByExample(@Param("record") Order_book record, @Param("example") Order_bookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Order_book
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    int updateByPrimaryKeySelective(Order_book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Order_book
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    int updateByPrimaryKey(Order_book record);
}