package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import lombok.Data;

@Data
public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Sun Feb 06 01:24:55 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name
     *
     * @mbg.generated Sun Feb 06 01:24:55 CST 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbg.generated Sun Feb 06 01:24:55 CST 2022
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.age
     *
     * @mbg.generated Sun Feb 06 01:24:55 CST 2022
     */
    private Integer age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sex
     *
     * @mbg.generated Sun Feb 06 01:24:55 CST 2022
     */
    private Integer sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.schoolName
     *
     * @mbg.generated Sun Feb 06 01:24:55 CST 2022
     */
    private String schoolname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.gmt_create
     *
     * @mbg.generated Sun Feb 06 01:24:55 CST 2022
     */
    private Date gmtCreate;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sun Feb 06 01:24:55 CST 2022
     */
    public User(Integer id, String name, String email, Integer age, Integer sex, String schoolname, Date gmtCreate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.sex = sex;
        this.schoolname = schoolname;
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sun Feb 06 01:24:55 CST 2022
     */
    public User() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sun Feb 06 01:24:55 CST 2022
     */
    public static User.Builder builder() {
        return new User.Builder();
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user
     *
     * @mbg.generated Sun Feb 06 01:24:55 CST 2022
     */
    public static class Builder {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table user
         *
         * @mbg.generated Sun Feb 06 01:24:55 CST 2022
         */
        private User obj;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user
         *
         * @mbg.generated Sun Feb 06 01:24:55 CST 2022
         */
        public Builder() {
            this.obj = new User();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.id
         *
         * @param id the value for user.id
         *
         * @mbg.generated Sun Feb 06 01:24:55 CST 2022
         */
        public Builder id(Integer id) {
            obj.setId(id);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.name
         *
         * @param name the value for user.name
         *
         * @mbg.generated Sun Feb 06 01:24:55 CST 2022
         */
        public Builder name(String name) {
            obj.setName(name);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.email
         *
         * @param email the value for user.email
         *
         * @mbg.generated Sun Feb 06 01:24:55 CST 2022
         */
        public Builder email(String email) {
            obj.setEmail(email);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.age
         *
         * @param age the value for user.age
         *
         * @mbg.generated Sun Feb 06 01:24:55 CST 2022
         */
        public Builder age(Integer age) {
            obj.setAge(age);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.sex
         *
         * @param sex the value for user.sex
         *
         * @mbg.generated Sun Feb 06 01:24:55 CST 2022
         */
        public Builder sex(Integer sex) {
            obj.setSex(sex);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.schoolName
         *
         * @param schoolname the value for user.schoolName
         *
         * @mbg.generated Sun Feb 06 01:24:55 CST 2022
         */
        public Builder schoolname(String schoolname) {
            obj.setSchoolname(schoolname);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.gmt_create
         *
         * @param gmtCreate the value for user.gmt_create
         *
         * @mbg.generated Sun Feb 06 01:24:55 CST 2022
         */
        public Builder gmtCreate(Date gmtCreate) {
            obj.setGmtCreate(gmtCreate);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user
         *
         * @mbg.generated Sun Feb 06 01:24:55 CST 2022
         */
        public User build() {
            return this.obj;
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table user
     *
     * @mbg.generated Sun Feb 06 01:24:55 CST 2022
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        name("name", "name", "VARCHAR", false),
        email("email", "email", "VARCHAR", false),
        age("age", "age", "INTEGER", false),
        sex("sex", "sex", "INTEGER", false),
        schoolname("schoolName", "schoolname", "VARCHAR", false),
        gmtCreate("gmt_create", "gmtCreate", "TIMESTAMP", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table user
         *
         * @mbg.generated Sun Feb 06 01:24:55 CST 2022
         */
        private static final String BEGINNING_DELIMITER = "\"";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table user
         *
         * @mbg.generated Sun Feb 06 01:24:55 CST 2022
         */
        private static final String ENDING_DELIMITER = "\"";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table user
         *
         * @mbg.generated Sun Feb 06 01:24:55 CST 2022
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table user
         *
         * @mbg.generated Sun Feb 06 01:24:55 CST 2022
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table user
         *
         * @mbg.generated Sun Feb 06 01:24:55 CST 2022
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table user
         *
         * @mbg.generated Sun Feb 06 01:24:55 CST 2022
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user
         *
         * @mbg.generated Sun Feb 06 01:24:55 CST 2022
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user
         *
         * @mbg.generated Sun Feb 06 01:24:55 CST 2022
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user
         *
         * @mbg.generated Sun Feb 06 01:24:55 CST 2022
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user
         *
         * @mbg.generated Sun Feb 06 01:24:55 CST 2022
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user
         *
         * @mbg.generated Sun Feb 06 01:24:55 CST 2022
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user
         *
         * @mbg.generated Sun Feb 06 01:24:55 CST 2022
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user
         *
         * @mbg.generated Sun Feb 06 01:24:55 CST 2022
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user
         *
         * @mbg.generated Sun Feb 06 01:24:55 CST 2022
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user
         *
         * @mbg.generated Sun Feb 06 01:24:55 CST 2022
         */
        public static Column[] all() {
            return Column.values();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user
         *
         * @mbg.generated Sun Feb 06 01:24:55 CST 2022
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user
         *
         * @mbg.generated Sun Feb 06 01:24:55 CST 2022
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}