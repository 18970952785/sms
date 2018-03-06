package com.malicn.server.enums.handler;

import com.malicn.server.enums.sys.CompareEnums;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by yanghuoyun on 2017/4/11.
 */
public class CompareEnumsHandler extends BaseTypeHandler<CompareEnums> {

    private Class<CompareEnums> type;

    private final CompareEnums[] enums;

    /**
     * 设置配置文件设置的转换类以及枚举类内容，供其他方法更便捷高效的实现
     *
     * @param type 配置文件中设置的转换类
     */
    public CompareEnumsHandler(Class<CompareEnums> type) {
        if (type == null)
            throw new IllegalArgumentException("Type argument cannot be null");
        this.type = type;
        this.enums = type.getEnumConstants();
        if (this.enums == null)
            throw new IllegalArgumentException(type.getSimpleName() + " does not represent an enums type.");
    }

    @Override
    public CompareEnums getNullableResult(ResultSet rs, String columnName) throws SQLException {
        // 根据数据库存储类型决定获取类型，本例子中数据库中存放INT类型
        if (rs.wasNull()) {
            return null;
        } else {
            // 根据数据库中的code值，定位EnumStatus子类
            String value = rs.getString(columnName);
            return CompareEnums.get(value);
        }
    }

    @Override
    public CompareEnums getNullableResult(ResultSet rs, int columnIndex) throws SQLException {

        if (rs.wasNull()) {
            return null;
        } else {
            // 根据数据库存储类型决定获取类型，本例子中数据库中存放INT类型
            String value = rs.getString(columnIndex);
            // 根据数据库中的code值，定位EnumStatus子类
            return CompareEnums.get(value);
        }
    }

    @Override
    public CompareEnums getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {

        if (cs.wasNull()) {
            return null;
        } else {
            // 根据数据库存储类型决定获取类型，本例子中数据库中存放INT类型
            String value = cs.getString(columnIndex);
            // 根据数据库中的code值，定位EnumStatus子类
            return CompareEnums.get(value);
        }
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, CompareEnums parameter, JdbcType jdbcType) throws SQLException {
        // baseTypeHandler已经帮我们做了parameter的null判断
        ps.setString(i, parameter.getValue());
    }
}