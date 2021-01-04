package org.kite.purely.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.kite.purely.mybatis.entity.User;

/**
 * UserMapper
 *
 * @author fengzheng
 * @date 2020/2/19
 */
public interface UserMapper {

    User selectOneUser(@Param("id") int id, @Param("id2") int id2);
}
