import com.elm.dao.BusinessDao;
import com.elm.dao.impl.BusinessDaoImpl;
import com.elm.dao.impl.po.Business;
import com.elm.util.DBUtil;
import org.junit.Test;

import java.sql.Connection;
import java.util.List;

public class DBConnectTest {
    @Test
    public void testConnect(){
        Connection connection = DBUtil.getConnection();
        System.out.println("11111");
    }

    @Test
    public void testBusinessDao(){
        BusinessDao dao = new BusinessDaoImpl();
        List<Business> list = dao.listBusiness("","");
        System.out.println("11111");
    }
    @Test
    public void BusinessDaoTest(){
        BusinessDao dao = new BusinessDaoImpl();
        List <Business> list = dao.listBusiness("万家饺子（软件园E18店）","沈阳市浑南区软件园E18楼1-121-3号");
        System.out.println(list);

    }
}
