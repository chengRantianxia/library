package com.guangc.library.library.bean;

public class Order_book {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Order_book.Order_ID
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    private Integer orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Order_book.User_ID
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Order_book.Book_ID
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    private Integer bookId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Order_book.Order_State
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    private String orderState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Order_book.Order_Address
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    private String orderAddress;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Order_book.Order_ID
     *
     * @return the value of Order_book.Order_ID
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Order_book.Order_ID
     *
     * @param orderId the value for Order_book.Order_ID
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Order_book.User_ID
     *
     * @return the value of Order_book.User_ID
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Order_book.User_ID
     *
     * @param userId the value for Order_book.User_ID
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Order_book.Book_ID
     *
     * @return the value of Order_book.Book_ID
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Order_book.Book_ID
     *
     * @param bookId the value for Order_book.Book_ID
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Order_book.Order_State
     *
     * @return the value of Order_book.Order_State
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    public String getOrderState() {
        return orderState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Order_book.Order_State
     *
     * @param orderState the value for Order_book.Order_State
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    public void setOrderState(String orderState) {
        this.orderState = orderState == null ? null : orderState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Order_book.Order_Address
     *
     * @return the value of Order_book.Order_Address
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    public String getOrderAddress() {
        return orderAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Order_book.Order_Address
     *
     * @param orderAddress the value for Order_book.Order_Address
     *
     * @mbg.generated Thu May 23 10:05:21 CST 2019
     */
    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress == null ? null : orderAddress.trim();
    }
}