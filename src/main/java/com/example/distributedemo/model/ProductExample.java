package com.example.distributedemo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProductExample {

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table
   * product
   *
   * @mbg.generated Fri Aug 09 11:20:17 CST 2019
   */
  protected String orderByClause;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table
   * product
   *
   * @mbg.generated Fri Aug 09 11:20:17 CST 2019
   */
  protected boolean distinct;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table
   * product
   *
   * @mbg.generated Fri Aug 09 11:20:17 CST 2019
   */
  protected List<Criteria> oredCriteria;

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * product
   *
   * @mbg.generated Fri Aug 09 11:20:17 CST 2019
   */
  public ProductExample() {
    oredCriteria = new ArrayList<Criteria>();
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * product
   *
   * @mbg.generated Fri Aug 09 11:20:17 CST 2019
   */
  public void setOrderByClause(String orderByClause) {
    this.orderByClause = orderByClause;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * product
   *
   * @mbg.generated Fri Aug 09 11:20:17 CST 2019
   */
  public String getOrderByClause() {
    return orderByClause;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * product
   *
   * @mbg.generated Fri Aug 09 11:20:17 CST 2019
   */
  public void setDistinct(boolean distinct) {
    this.distinct = distinct;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * product
   *
   * @mbg.generated Fri Aug 09 11:20:17 CST 2019
   */
  public boolean isDistinct() {
    return distinct;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * product
   *
   * @mbg.generated Fri Aug 09 11:20:17 CST 2019
   */
  public List<Criteria> getOredCriteria() {
    return oredCriteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * product
   *
   * @mbg.generated Fri Aug 09 11:20:17 CST 2019
   */
  public void or(Criteria criteria) {
    oredCriteria.add(criteria);
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * product
   *
   * @mbg.generated Fri Aug 09 11:20:17 CST 2019
   */
  public Criteria or() {
    Criteria criteria = createCriteriaInternal();
    oredCriteria.add(criteria);
    return criteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * product
   *
   * @mbg.generated Fri Aug 09 11:20:17 CST 2019
   */
  public Criteria createCriteria() {
    Criteria criteria = createCriteriaInternal();
    if (oredCriteria.size() == 0) {
      oredCriteria.add(criteria);
    }
    return criteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * product
   *
   * @mbg.generated Fri Aug 09 11:20:17 CST 2019
   */
  protected Criteria createCriteriaInternal() {
    Criteria criteria = new Criteria();
    return criteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * product
   *
   * @mbg.generated Fri Aug 09 11:20:17 CST 2019
   */
  public void clear() {
    oredCriteria.clear();
    orderByClause = null;
    distinct = false;
  }

  /**
   * This class was generated by MyBatis Generator. This class corresponds to the database table
   * product
   *
   * @mbg.generated Fri Aug 09 11:20:17 CST 2019
   */
  protected abstract static class GeneratedCriteria {

    protected List<Criterion> criteria;

    protected GeneratedCriteria() {
      super();
      criteria = new ArrayList<Criterion>();
    }

    public boolean isValid() {
      return criteria.size() > 0;
    }

    public List<Criterion> getAllCriteria() {
      return criteria;
    }

    public List<Criterion> getCriteria() {
      return criteria;
    }

    protected void addCriterion(String condition) {
      if (condition == null) {
        throw new RuntimeException("Value for condition cannot be null");
      }
      criteria.add(new Criterion(condition));
    }

    protected void addCriterion(String condition, Object value, String property) {
      if (value == null) {
        throw new RuntimeException("Value for " + property + " cannot be null");
      }
      criteria.add(new Criterion(condition, value));
    }

    protected void addCriterion(String condition, Object value1, Object value2, String property) {
      if (value1 == null || value2 == null) {
        throw new RuntimeException("Between values for " + property + " cannot be null");
      }
      criteria.add(new Criterion(condition, value1, value2));
    }

    protected void addCriterionForJDBCTime(String condition, Date value, String property) {
      if (value == null) {
        throw new RuntimeException("Value for " + property + " cannot be null");
      }
      addCriterion(condition, new java.sql.Time(value.getTime()), property);
    }

    protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
      if (values == null || values.size() == 0) {
        throw new RuntimeException("Value list for " + property + " cannot be null or empty");
      }
      List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
      Iterator<Date> iter = values.iterator();
      while (iter.hasNext()) {
        timeList.add(new java.sql.Time(iter.next().getTime()));
      }
      addCriterion(condition, timeList, property);
    }

    protected void addCriterionForJDBCTime(
        String condition, Date value1, Date value2, String property) {
      if (value1 == null || value2 == null) {
        throw new RuntimeException("Between values for " + property + " cannot be null");
      }
      addCriterion(
          condition,
          new java.sql.Time(value1.getTime()),
          new java.sql.Time(value2.getTime()),
          property);
    }

    public Criteria andIdIsNull() {
      addCriterion("id is null");
      return (Criteria) this;
    }

    public Criteria andIdIsNotNull() {
      addCriterion("id is not null");
      return (Criteria) this;
    }

    public Criteria andIdEqualTo(Integer value) {
      addCriterion("id =", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdNotEqualTo(Integer value) {
      addCriterion("id <>", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdGreaterThan(Integer value) {
      addCriterion("id >", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("id >=", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdLessThan(Integer value) {
      addCriterion("id <", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdLessThanOrEqualTo(Integer value) {
      addCriterion("id <=", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdIn(List<Integer> values) {
      addCriterion("id in", values, "id");
      return (Criteria) this;
    }

    public Criteria andIdNotIn(List<Integer> values) {
      addCriterion("id not in", values, "id");
      return (Criteria) this;
    }

    public Criteria andIdBetween(Integer value1, Integer value2) {
      addCriterion("id between", value1, value2, "id");
      return (Criteria) this;
    }

    public Criteria andIdNotBetween(Integer value1, Integer value2) {
      addCriterion("id not between", value1, value2, "id");
      return (Criteria) this;
    }

    public Criteria andProductNameIsNull() {
      addCriterion("product_name is null");
      return (Criteria) this;
    }

    public Criteria andProductNameIsNotNull() {
      addCriterion("product_name is not null");
      return (Criteria) this;
    }

    public Criteria andProductNameEqualTo(String value) {
      addCriterion("product_name =", value, "productName");
      return (Criteria) this;
    }

    public Criteria andProductNameNotEqualTo(String value) {
      addCriterion("product_name <>", value, "productName");
      return (Criteria) this;
    }

    public Criteria andProductNameGreaterThan(String value) {
      addCriterion("product_name >", value, "productName");
      return (Criteria) this;
    }

    public Criteria andProductNameGreaterThanOrEqualTo(String value) {
      addCriterion("product_name >=", value, "productName");
      return (Criteria) this;
    }

    public Criteria andProductNameLessThan(String value) {
      addCriterion("product_name <", value, "productName");
      return (Criteria) this;
    }

    public Criteria andProductNameLessThanOrEqualTo(String value) {
      addCriterion("product_name <=", value, "productName");
      return (Criteria) this;
    }

    public Criteria andProductNameLike(String value) {
      addCriterion("product_name like", value, "productName");
      return (Criteria) this;
    }

    public Criteria andProductNameNotLike(String value) {
      addCriterion("product_name not like", value, "productName");
      return (Criteria) this;
    }

    public Criteria andProductNameIn(List<String> values) {
      addCriterion("product_name in", values, "productName");
      return (Criteria) this;
    }

    public Criteria andProductNameNotIn(List<String> values) {
      addCriterion("product_name not in", values, "productName");
      return (Criteria) this;
    }

    public Criteria andProductNameBetween(String value1, String value2) {
      addCriterion("product_name between", value1, value2, "productName");
      return (Criteria) this;
    }

    public Criteria andProductNameNotBetween(String value1, String value2) {
      addCriterion("product_name not between", value1, value2, "productName");
      return (Criteria) this;
    }

    public Criteria andPriceIsNull() {
      addCriterion("price is null");
      return (Criteria) this;
    }

    public Criteria andPriceIsNotNull() {
      addCriterion("price is not null");
      return (Criteria) this;
    }

    public Criteria andPriceEqualTo(BigDecimal value) {
      addCriterion("price =", value, "price");
      return (Criteria) this;
    }

    public Criteria andPriceNotEqualTo(BigDecimal value) {
      addCriterion("price <>", value, "price");
      return (Criteria) this;
    }

    public Criteria andPriceGreaterThan(BigDecimal value) {
      addCriterion("price >", value, "price");
      return (Criteria) this;
    }

    public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
      addCriterion("price >=", value, "price");
      return (Criteria) this;
    }

    public Criteria andPriceLessThan(BigDecimal value) {
      addCriterion("price <", value, "price");
      return (Criteria) this;
    }

    public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
      addCriterion("price <=", value, "price");
      return (Criteria) this;
    }

    public Criteria andPriceIn(List<BigDecimal> values) {
      addCriterion("price in", values, "price");
      return (Criteria) this;
    }

    public Criteria andPriceNotIn(List<BigDecimal> values) {
      addCriterion("price not in", values, "price");
      return (Criteria) this;
    }

    public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
      addCriterion("price between", value1, value2, "price");
      return (Criteria) this;
    }

    public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
      addCriterion("price not between", value1, value2, "price");
      return (Criteria) this;
    }

    public Criteria andCountIsNull() {
      addCriterion("count is null");
      return (Criteria) this;
    }

    public Criteria andCountIsNotNull() {
      addCriterion("count is not null");
      return (Criteria) this;
    }

    public Criteria andCountEqualTo(Integer value) {
      addCriterion("count =", value, "count");
      return (Criteria) this;
    }

    public Criteria andCountNotEqualTo(Integer value) {
      addCriterion("count <>", value, "count");
      return (Criteria) this;
    }

    public Criteria andCountGreaterThan(Integer value) {
      addCriterion("count >", value, "count");
      return (Criteria) this;
    }

    public Criteria andCountGreaterThanOrEqualTo(Integer value) {
      addCriterion("count >=", value, "count");
      return (Criteria) this;
    }

    public Criteria andCountLessThan(Integer value) {
      addCriterion("count <", value, "count");
      return (Criteria) this;
    }

    public Criteria andCountLessThanOrEqualTo(Integer value) {
      addCriterion("count <=", value, "count");
      return (Criteria) this;
    }

    public Criteria andCountIn(List<Integer> values) {
      addCriterion("count in", values, "count");
      return (Criteria) this;
    }

    public Criteria andCountNotIn(List<Integer> values) {
      addCriterion("count not in", values, "count");
      return (Criteria) this;
    }

    public Criteria andCountBetween(Integer value1, Integer value2) {
      addCriterion("count between", value1, value2, "count");
      return (Criteria) this;
    }

    public Criteria andCountNotBetween(Integer value1, Integer value2) {
      addCriterion("count not between", value1, value2, "count");
      return (Criteria) this;
    }

    public Criteria andProductDescIsNull() {
      addCriterion("product_desc is null");
      return (Criteria) this;
    }

    public Criteria andProductDescIsNotNull() {
      addCriterion("product_desc is not null");
      return (Criteria) this;
    }

    public Criteria andProductDescEqualTo(String value) {
      addCriterion("product_desc =", value, "productDesc");
      return (Criteria) this;
    }

    public Criteria andProductDescNotEqualTo(String value) {
      addCriterion("product_desc <>", value, "productDesc");
      return (Criteria) this;
    }

    public Criteria andProductDescGreaterThan(String value) {
      addCriterion("product_desc >", value, "productDesc");
      return (Criteria) this;
    }

    public Criteria andProductDescGreaterThanOrEqualTo(String value) {
      addCriterion("product_desc >=", value, "productDesc");
      return (Criteria) this;
    }

    public Criteria andProductDescLessThan(String value) {
      addCriterion("product_desc <", value, "productDesc");
      return (Criteria) this;
    }

    public Criteria andProductDescLessThanOrEqualTo(String value) {
      addCriterion("product_desc <=", value, "productDesc");
      return (Criteria) this;
    }

    public Criteria andProductDescLike(String value) {
      addCriterion("product_desc like", value, "productDesc");
      return (Criteria) this;
    }

    public Criteria andProductDescNotLike(String value) {
      addCriterion("product_desc not like", value, "productDesc");
      return (Criteria) this;
    }

    public Criteria andProductDescIn(List<String> values) {
      addCriterion("product_desc in", values, "productDesc");
      return (Criteria) this;
    }

    public Criteria andProductDescNotIn(List<String> values) {
      addCriterion("product_desc not in", values, "productDesc");
      return (Criteria) this;
    }

    public Criteria andProductDescBetween(String value1, String value2) {
      addCriterion("product_desc between", value1, value2, "productDesc");
      return (Criteria) this;
    }

    public Criteria andProductDescNotBetween(String value1, String value2) {
      addCriterion("product_desc not between", value1, value2, "productDesc");
      return (Criteria) this;
    }

    public Criteria andCreateTimeIsNull() {
      addCriterion("create_time is null");
      return (Criteria) this;
    }

    public Criteria andCreateTimeIsNotNull() {
      addCriterion("create_time is not null");
      return (Criteria) this;
    }

    public Criteria andCreateTimeEqualTo(Date value) {
      addCriterionForJDBCTime("create_time =", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeNotEqualTo(Date value) {
      addCriterionForJDBCTime("create_time <>", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeGreaterThan(Date value) {
      addCriterionForJDBCTime("create_time >", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
      addCriterionForJDBCTime("create_time >=", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeLessThan(Date value) {
      addCriterionForJDBCTime("create_time <", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
      addCriterionForJDBCTime("create_time <=", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeIn(List<Date> values) {
      addCriterionForJDBCTime("create_time in", values, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeNotIn(List<Date> values) {
      addCriterionForJDBCTime("create_time not in", values, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeBetween(Date value1, Date value2) {
      addCriterionForJDBCTime("create_time between", value1, value2, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
      addCriterionForJDBCTime("create_time not between", value1, value2, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateUserIsNull() {
      addCriterion("create_user is null");
      return (Criteria) this;
    }

    public Criteria andCreateUserIsNotNull() {
      addCriterion("create_user is not null");
      return (Criteria) this;
    }

    public Criteria andCreateUserEqualTo(String value) {
      addCriterion("create_user =", value, "createUser");
      return (Criteria) this;
    }

    public Criteria andCreateUserNotEqualTo(String value) {
      addCriterion("create_user <>", value, "createUser");
      return (Criteria) this;
    }

    public Criteria andCreateUserGreaterThan(String value) {
      addCriterion("create_user >", value, "createUser");
      return (Criteria) this;
    }

    public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
      addCriterion("create_user >=", value, "createUser");
      return (Criteria) this;
    }

    public Criteria andCreateUserLessThan(String value) {
      addCriterion("create_user <", value, "createUser");
      return (Criteria) this;
    }

    public Criteria andCreateUserLessThanOrEqualTo(String value) {
      addCriterion("create_user <=", value, "createUser");
      return (Criteria) this;
    }

    public Criteria andCreateUserLike(String value) {
      addCriterion("create_user like", value, "createUser");
      return (Criteria) this;
    }

    public Criteria andCreateUserNotLike(String value) {
      addCriterion("create_user not like", value, "createUser");
      return (Criteria) this;
    }

    public Criteria andCreateUserIn(List<String> values) {
      addCriterion("create_user in", values, "createUser");
      return (Criteria) this;
    }

    public Criteria andCreateUserNotIn(List<String> values) {
      addCriterion("create_user not in", values, "createUser");
      return (Criteria) this;
    }

    public Criteria andCreateUserBetween(String value1, String value2) {
      addCriterion("create_user between", value1, value2, "createUser");
      return (Criteria) this;
    }

    public Criteria andCreateUserNotBetween(String value1, String value2) {
      addCriterion("create_user not between", value1, value2, "createUser");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeIsNull() {
      addCriterion("update_time is null");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeIsNotNull() {
      addCriterion("update_time is not null");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeEqualTo(Date value) {
      addCriterionForJDBCTime("update_time =", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeNotEqualTo(Date value) {
      addCriterionForJDBCTime("update_time <>", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeGreaterThan(Date value) {
      addCriterionForJDBCTime("update_time >", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
      addCriterionForJDBCTime("update_time >=", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeLessThan(Date value) {
      addCriterionForJDBCTime("update_time <", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
      addCriterionForJDBCTime("update_time <=", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeIn(List<Date> values) {
      addCriterionForJDBCTime("update_time in", values, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeNotIn(List<Date> values) {
      addCriterionForJDBCTime("update_time not in", values, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeBetween(Date value1, Date value2) {
      addCriterionForJDBCTime("update_time between", value1, value2, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
      addCriterionForJDBCTime("update_time not between", value1, value2, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateUserIsNull() {
      addCriterion("update_user is null");
      return (Criteria) this;
    }

    public Criteria andUpdateUserIsNotNull() {
      addCriterion("update_user is not null");
      return (Criteria) this;
    }

    public Criteria andUpdateUserEqualTo(String value) {
      addCriterion("update_user =", value, "updateUser");
      return (Criteria) this;
    }

    public Criteria andUpdateUserNotEqualTo(String value) {
      addCriterion("update_user <>", value, "updateUser");
      return (Criteria) this;
    }

    public Criteria andUpdateUserGreaterThan(String value) {
      addCriterion("update_user >", value, "updateUser");
      return (Criteria) this;
    }

    public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
      addCriterion("update_user >=", value, "updateUser");
      return (Criteria) this;
    }

    public Criteria andUpdateUserLessThan(String value) {
      addCriterion("update_user <", value, "updateUser");
      return (Criteria) this;
    }

    public Criteria andUpdateUserLessThanOrEqualTo(String value) {
      addCriterion("update_user <=", value, "updateUser");
      return (Criteria) this;
    }

    public Criteria andUpdateUserLike(String value) {
      addCriterion("update_user like", value, "updateUser");
      return (Criteria) this;
    }

    public Criteria andUpdateUserNotLike(String value) {
      addCriterion("update_user not like", value, "updateUser");
      return (Criteria) this;
    }

    public Criteria andUpdateUserIn(List<String> values) {
      addCriterion("update_user in", values, "updateUser");
      return (Criteria) this;
    }

    public Criteria andUpdateUserNotIn(List<String> values) {
      addCriterion("update_user not in", values, "updateUser");
      return (Criteria) this;
    }

    public Criteria andUpdateUserBetween(String value1, String value2) {
      addCriterion("update_user between", value1, value2, "updateUser");
      return (Criteria) this;
    }

    public Criteria andUpdateUserNotBetween(String value1, String value2) {
      addCriterion("update_user not between", value1, value2, "updateUser");
      return (Criteria) this;
    }
  }

  /**
   * This class was generated by MyBatis Generator. This class corresponds to the database table
   * product
   *
   * @mbg.generated do_not_delete_during_merge Fri Aug 09 11:20:17 CST 2019
   */
  public static class Criteria extends GeneratedCriteria {

    protected Criteria() {
      super();
    }
  }

  /**
   * This class was generated by MyBatis Generator. This class corresponds to the database table
   * product
   *
   * @mbg.generated Fri Aug 09 11:20:17 CST 2019
   */
  public static class Criterion {

    private String condition;

    private Object value;

    private Object secondValue;

    private boolean noValue;

    private boolean singleValue;

    private boolean betweenValue;

    private boolean listValue;

    private String typeHandler;

    public String getCondition() {
      return condition;
    }

    public Object getValue() {
      return value;
    }

    public Object getSecondValue() {
      return secondValue;
    }

    public boolean isNoValue() {
      return noValue;
    }

    public boolean isSingleValue() {
      return singleValue;
    }

    public boolean isBetweenValue() {
      return betweenValue;
    }

    public boolean isListValue() {
      return listValue;
    }

    public String getTypeHandler() {
      return typeHandler;
    }

    protected Criterion(String condition) {
      super();
      this.condition = condition;
      this.typeHandler = null;
      this.noValue = true;
    }

    protected Criterion(String condition, Object value, String typeHandler) {
      super();
      this.condition = condition;
      this.value = value;
      this.typeHandler = typeHandler;
      if (value instanceof List<?>) {
        this.listValue = true;
      } else {
        this.singleValue = true;
      }
    }

    protected Criterion(String condition, Object value) {
      this(condition, value, null);
    }

    protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
      super();
      this.condition = condition;
      this.value = value;
      this.secondValue = secondValue;
      this.typeHandler = typeHandler;
      this.betweenValue = true;
    }

    protected Criterion(String condition, Object value, Object secondValue) {
      this(condition, value, secondValue, null);
    }
  }
}
