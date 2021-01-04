package org.kite;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.kite.purely.mybatis.entity.News;
import org.kite.purely.mybatis.entity.User;
import org.kite.purely.mybatis.mapper.NewsMapper;
import org.kite.purely.mybatis.mapper.UserMapper;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        FileReader fileReader = null;
        try {
            URL url = App.class.getClassLoader().getResource("");
            fileReader = new FileReader(url.getPath()+"mybatis-config.xml");
        }catch (IOException e){
            e.printStackTrace();
        }
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(fileReader,"development");
        try (SqlSession sqlSession = factory.openSession()){
            NewsMapper newsMapper = sqlSession.getMapper(NewsMapper.class);

            while (true) {
                Scanner reader = new Scanner(System.in);
                String sqlParam = reader.nextLine();
                if(sqlParam!=null && !"".equals(sqlParam.trim())){
                    try {
                        List<News> newsList = newsMapper.selectNewsLikeTitle(sqlParam);
                        if (newsList != null && newsList.size() > 0) {
                            for (News news : newsList) {
                                System.out.println(news);
                            }
                        }
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }

//            User user = userMapper.selectOneUser(1,2);
//            if(user!=null) {
//                System.out.println(user.toString());
//            }

//            Object o = sqlSession.selectOne("org.kite.purely.mybatis.mapper.UserMapper.selectOneUser",1);
//            System.out.println(o.toString());
        }
    }
}
