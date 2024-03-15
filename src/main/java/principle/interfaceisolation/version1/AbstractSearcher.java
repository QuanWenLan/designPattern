package principle.interfaceisolation.version1;

import principle.interfaceisolation.version1.IPettyGirl;

/**
 * @author Lan
 * @createTime 2024-03-13  11:12
 * 星探抽象类
 **/
public abstract class AbstractSearcher {
    protected IPettyGirl pettyGirl;

    public AbstractSearcher(IPettyGirl _pettyGirl) {
        this.pettyGirl = _pettyGirl;
    }

    //搜索美女，列出美女信息
    public abstract void show();
}
