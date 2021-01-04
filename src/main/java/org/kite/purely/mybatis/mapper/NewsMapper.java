package org.kite.purely.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.kite.purely.mybatis.entity.News;
import org.kite.purely.mybatis.entity.User;

import java.util.List;

/**
 * UserMapper
 *
 * @author fengzheng
 * @date 2020/2/19
 */
public interface NewsMapper {

    List<News> selectNewsLikeTitle(@Param("keyword") String keyword);
}
