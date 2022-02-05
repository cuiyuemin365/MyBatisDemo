package com.example.demo.MyBatis3DynamicSql;

import static com.example.demo.MyBatis3DynamicSql.PkfieldsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.example.demo.MyBatis3DynamicSql.Pkfields;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface PkfieldsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-06T00:24:45.74+08:00", comments="Source Table: PKFIELDS")
    BasicColumn[] selectList = BasicColumn.columnList(id2, id1, firstname, lastname, datefield, timefield, timestampfield, decimal30field, decimal60field, decimal100field, decimal155field, wierdField, birthDate, stringboolean);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-06T00:24:45.73+08:00", comments="Source Table: PKFIELDS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-06T00:24:45.73+08:00", comments="Source Table: PKFIELDS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-06T00:24:45.731+08:00", comments="Source Table: PKFIELDS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Pkfields> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-06T00:24:45.732+08:00", comments="Source Table: PKFIELDS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Pkfields> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-06T00:24:45.732+08:00", comments="Source Table: PKFIELDS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PkfieldsResult")
    Optional<Pkfields> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-06T00:24:45.733+08:00", comments="Source Table: PKFIELDS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PkfieldsResult", value = {
        @Result(column="ID2", property="id2", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ID1", property="id1", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="FIRSTNAME", property="firstname", jdbcType=JdbcType.VARCHAR),
        @Result(column="LASTNAME", property="lastname", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATEFIELD", property="datefield", jdbcType=JdbcType.DATE),
        @Result(column="TIMEFIELD", property="timefield", jdbcType=JdbcType.TIME),
        @Result(column="TIMESTAMPFIELD", property="timestampfield", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DECIMAL30FIELD", property="decimal30field", jdbcType=JdbcType.DECIMAL),
        @Result(column="DECIMAL60FIELD", property="decimal60field", jdbcType=JdbcType.DECIMAL),
        @Result(column="DECIMAL100FIELD", property="decimal100field", jdbcType=JdbcType.DECIMAL),
        @Result(column="DECIMAL155FIELD", property="decimal155field", jdbcType=JdbcType.DECIMAL),
        @Result(column="wierd$Field", property="wierdField", jdbcType=JdbcType.INTEGER),
        @Result(column="birth date", property="birthDate", jdbcType=JdbcType.DATE),
        @Result(column="STRINGBOOLEAN", property="stringboolean", jdbcType=JdbcType.CHAR)
    })
    List<Pkfields> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-06T00:24:45.734+08:00", comments="Source Table: PKFIELDS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-06T00:24:45.734+08:00", comments="Source Table: PKFIELDS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, pkfields, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-06T00:24:45.734+08:00", comments="Source Table: PKFIELDS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, pkfields, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-06T00:24:45.735+08:00", comments="Source Table: PKFIELDS")
    default int deleteByPrimaryKey(Integer id2_, Integer id1_) {
        return delete(c -> 
            c.where(id2, isEqualTo(id2_))
            .and(id1, isEqualTo(id1_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-06T00:24:45.735+08:00", comments="Source Table: PKFIELDS")
    default int insert(Pkfields record) {
        return MyBatis3Utils.insert(this::insert, record, pkfields, c ->
            c.map(id2).toProperty("id2")
            .map(id1).toProperty("id1")
            .map(firstname).toProperty("firstname")
            .map(lastname).toProperty("lastname")
            .map(datefield).toProperty("datefield")
            .map(timefield).toProperty("timefield")
            .map(timestampfield).toProperty("timestampfield")
            .map(decimal30field).toProperty("decimal30field")
            .map(decimal60field).toProperty("decimal60field")
            .map(decimal100field).toProperty("decimal100field")
            .map(decimal155field).toProperty("decimal155field")
            .map(wierdField).toProperty("wierdField")
            .map(birthDate).toProperty("birthDate")
            .map(stringboolean).toProperty("stringboolean")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-06T00:24:45.737+08:00", comments="Source Table: PKFIELDS")
    default int insertMultiple(Collection<Pkfields> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, pkfields, c ->
            c.map(id2).toProperty("id2")
            .map(id1).toProperty("id1")
            .map(firstname).toProperty("firstname")
            .map(lastname).toProperty("lastname")
            .map(datefield).toProperty("datefield")
            .map(timefield).toProperty("timefield")
            .map(timestampfield).toProperty("timestampfield")
            .map(decimal30field).toProperty("decimal30field")
            .map(decimal60field).toProperty("decimal60field")
            .map(decimal100field).toProperty("decimal100field")
            .map(decimal155field).toProperty("decimal155field")
            .map(wierdField).toProperty("wierdField")
            .map(birthDate).toProperty("birthDate")
            .map(stringboolean).toProperty("stringboolean")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-06T00:24:45.737+08:00", comments="Source Table: PKFIELDS")
    default int insertSelective(Pkfields record) {
        return MyBatis3Utils.insert(this::insert, record, pkfields, c ->
            c.map(id2).toPropertyWhenPresent("id2", record::getId2)
            .map(id1).toPropertyWhenPresent("id1", record::getId1)
            .map(firstname).toPropertyWhenPresent("firstname", record::getFirstname)
            .map(lastname).toPropertyWhenPresent("lastname", record::getLastname)
            .map(datefield).toPropertyWhenPresent("datefield", record::getDatefield)
            .map(timefield).toPropertyWhenPresent("timefield", record::getTimefield)
            .map(timestampfield).toPropertyWhenPresent("timestampfield", record::getTimestampfield)
            .map(decimal30field).toPropertyWhenPresent("decimal30field", record::getDecimal30field)
            .map(decimal60field).toPropertyWhenPresent("decimal60field", record::getDecimal60field)
            .map(decimal100field).toPropertyWhenPresent("decimal100field", record::getDecimal100field)
            .map(decimal155field).toPropertyWhenPresent("decimal155field", record::getDecimal155field)
            .map(wierdField).toPropertyWhenPresent("wierdField", record::getWierdField)
            .map(birthDate).toPropertyWhenPresent("birthDate", record::getBirthDate)
            .map(stringboolean).toPropertyWhenPresent("stringboolean", record::getStringboolean)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-06T00:24:45.741+08:00", comments="Source Table: PKFIELDS")
    default Optional<Pkfields> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, pkfields, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-06T00:24:45.741+08:00", comments="Source Table: PKFIELDS")
    default List<Pkfields> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, pkfields, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-06T00:24:45.741+08:00", comments="Source Table: PKFIELDS")
    default List<Pkfields> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, pkfields, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-06T00:24:45.742+08:00", comments="Source Table: PKFIELDS")
    default Optional<Pkfields> selectByPrimaryKey(Integer id2_, Integer id1_) {
        return selectOne(c ->
            c.where(id2, isEqualTo(id2_))
            .and(id1, isEqualTo(id1_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-06T00:24:45.742+08:00", comments="Source Table: PKFIELDS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, pkfields, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-06T00:24:45.743+08:00", comments="Source Table: PKFIELDS")
    static UpdateDSL<UpdateModel> updateAllColumns(Pkfields record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id2).equalTo(record::getId2)
                .set(id1).equalTo(record::getId1)
                .set(firstname).equalTo(record::getFirstname)
                .set(lastname).equalTo(record::getLastname)
                .set(datefield).equalTo(record::getDatefield)
                .set(timefield).equalTo(record::getTimefield)
                .set(timestampfield).equalTo(record::getTimestampfield)
                .set(decimal30field).equalTo(record::getDecimal30field)
                .set(decimal60field).equalTo(record::getDecimal60field)
                .set(decimal100field).equalTo(record::getDecimal100field)
                .set(decimal155field).equalTo(record::getDecimal155field)
                .set(wierdField).equalTo(record::getWierdField)
                .set(birthDate).equalTo(record::getBirthDate)
                .set(stringboolean).equalTo(record::getStringboolean);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-06T00:24:45.743+08:00", comments="Source Table: PKFIELDS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Pkfields record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id2).equalToWhenPresent(record::getId2)
                .set(id1).equalToWhenPresent(record::getId1)
                .set(firstname).equalToWhenPresent(record::getFirstname)
                .set(lastname).equalToWhenPresent(record::getLastname)
                .set(datefield).equalToWhenPresent(record::getDatefield)
                .set(timefield).equalToWhenPresent(record::getTimefield)
                .set(timestampfield).equalToWhenPresent(record::getTimestampfield)
                .set(decimal30field).equalToWhenPresent(record::getDecimal30field)
                .set(decimal60field).equalToWhenPresent(record::getDecimal60field)
                .set(decimal100field).equalToWhenPresent(record::getDecimal100field)
                .set(decimal155field).equalToWhenPresent(record::getDecimal155field)
                .set(wierdField).equalToWhenPresent(record::getWierdField)
                .set(birthDate).equalToWhenPresent(record::getBirthDate)
                .set(stringboolean).equalToWhenPresent(record::getStringboolean);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-06T00:24:45.744+08:00", comments="Source Table: PKFIELDS")
    default int updateByPrimaryKey(Pkfields record) {
        return update(c ->
            c.set(firstname).equalTo(record::getFirstname)
            .set(lastname).equalTo(record::getLastname)
            .set(datefield).equalTo(record::getDatefield)
            .set(timefield).equalTo(record::getTimefield)
            .set(timestampfield).equalTo(record::getTimestampfield)
            .set(decimal30field).equalTo(record::getDecimal30field)
            .set(decimal60field).equalTo(record::getDecimal60field)
            .set(decimal100field).equalTo(record::getDecimal100field)
            .set(decimal155field).equalTo(record::getDecimal155field)
            .set(wierdField).equalTo(record::getWierdField)
            .set(birthDate).equalTo(record::getBirthDate)
            .set(stringboolean).equalTo(record::getStringboolean)
            .where(id2, isEqualTo(record::getId2))
            .and(id1, isEqualTo(record::getId1))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-06T00:24:45.745+08:00", comments="Source Table: PKFIELDS")
    default int updateByPrimaryKeySelective(Pkfields record) {
        return update(c ->
            c.set(firstname).equalToWhenPresent(record::getFirstname)
            .set(lastname).equalToWhenPresent(record::getLastname)
            .set(datefield).equalToWhenPresent(record::getDatefield)
            .set(timefield).equalToWhenPresent(record::getTimefield)
            .set(timestampfield).equalToWhenPresent(record::getTimestampfield)
            .set(decimal30field).equalToWhenPresent(record::getDecimal30field)
            .set(decimal60field).equalToWhenPresent(record::getDecimal60field)
            .set(decimal100field).equalToWhenPresent(record::getDecimal100field)
            .set(decimal155field).equalToWhenPresent(record::getDecimal155field)
            .set(wierdField).equalToWhenPresent(record::getWierdField)
            .set(birthDate).equalToWhenPresent(record::getBirthDate)
            .set(stringboolean).equalToWhenPresent(record::getStringboolean)
            .where(id2, isEqualTo(record::getId2))
            .and(id1, isEqualTo(record::getId1))
        );
    }
}