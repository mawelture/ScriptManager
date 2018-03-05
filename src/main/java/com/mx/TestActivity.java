package com.mx;

import com.mx.dao.IMachineDao;
import com.mx.dao.IQQDao;
import com.mx.entity.Machine;
import com.mx.entity.QQ;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

public class TestActivity {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();
        try {
            //推荐使用namespace+id
            IQQDao qqDao = session.getMapper(IQQDao.class);
            QQ qq = qqDao.getById("21733738");

            IMachineDao machineDao = session.getMapper(IMachineDao.class);
            Machine machine = new Machine();
            machine.setMachine_number(12);
            machine.setQq(qq);
            machine.setScript_code("123123123");
            machineDao.insert(machine);

            session.commit();
        } finally {
            session.close();
        }
    }


    public static <T> void loopPrint(List<T> list) {
        for (Iterator<T> iter = list.iterator(); iter.hasNext(); ) {
            T obj = iter.next();
            System.out.println(obj);
        }
    }
}
