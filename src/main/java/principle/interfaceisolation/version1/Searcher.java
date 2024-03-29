package principle.interfaceisolation.version1;

import principle.interfaceisolation.version1.AbstractSearcher;
import principle.interfaceisolation.version1.IPettyGirl;

/**
 * @author Lan
 * @createTime 2024-03-13  11:17
 **/
public class Searcher extends AbstractSearcher {
    public Searcher(IPettyGirl _pettyGirl) {
        super(_pettyGirl);
    }

    //展示美女的信息
    public void show() {
        System.out.println("--------美女的信息如下：---------------");
        //展示面容
        super.pettyGirl.goodLooking();
        //展示身材
        super.pettyGirl.niceFigure();
        //展示气质
        super.pettyGirl.greatTemperament();
    }
}
