package principle.interfaceisolation.version2;

import principle.interfaceisolation.version1.AbstractSearcher;
import principle.interfaceisolation.version1.IPettyGirl;

/**
 * @author Lan
 * @createTime 2024-03-13  11:17
 **/
public class Searcher2 extends AbstractSearcher2 {


    public Searcher2(IGoodBodyGirl _goodBodyGirl) {
        super(_goodBodyGirl);
    }

    public Searcher2(IGreatTemperamentGirl _greatTemperamentGirl) {
        super(_greatTemperamentGirl);
    }

    //展示美女的信息
    public void show() {
        System.out.println("--------美女的信息如下：---------------");
        if (super.goodBodyGirl != null) {
            //展示面容
            super.goodBodyGirl.goodLooking();
            //展示身材
            super.goodBodyGirl.niceFigure();
        }
        if (super.greatTemperamentGirl != null) {
            //展示气质
            super.greatTemperamentGirl.greatTemperament();
        }
    }
}
