package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RichiestaAppuntiTest {

    private AppuntiDAO dao = new AppuntiDAO();

    @Test
    public void TC_1_1_1() throws Exception{
        AppuntiBean appuntiBean = new AppuntiBean();
        appuntiBean.setTitolo("");
        appuntiBean.setMateria("Scientifico");
        appuntiBean.setTesto("hjdankas");
        Assertion.assertNull(dao.doSave(appuntiBean));
    }

    @Test
    public void TC_1_1_2() throws Exception{
        AppuntiBean appuntiBean = new AppuntiBean();
        appuntiBean.setTitolo("Napoleone");
        appuntiBean.setMateria("Scientifico");
        appuntiBean.setTesto("");
        Assertion.assertNull(dao.doSave(appuntiBean));
    }

    @Test
    public void TC_1_1_3() throws Exception{
        AppuntiBean appuntiBean = new AppuntiBean();
        appuntiBean.setTitolo("");
        appuntiBean.setMateria("Scientifico");
        appuntiBean.setTesto("");
        Assertion.assertNull(dao.doSave(appuntiBean));
    }

    @Test
    public void TC_1_1_4() throws Exception{
        AppuntiBean appuntiBean = new AppuntiBean();
        appuntiBean.setTitolo("");
        appuntiBean.setMateria("baksnksnalknsa");
        appuntiBean.setTesto("Psicologia");
        Assertion.assertNull(dao.doSave(appuntiBean));
    }

    @Test
    public void TC_1_1_5() throws Exception{
        AppuntiBean appuntiBean = new AppuntiBean();
        appuntiBean.setTitolo("Napoleone");
        appuntiBean.setMateria("Umanistica");
        appuntiBean.setTesto("bdskjnslnls");
        Assertion.assertNull(dao.doSave(appuntiBean));
    }

}

