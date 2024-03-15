package principle.interfaceisolation.version2;


/**
 * @author Lan
 * @createTime 2024-03-13  11:12
 * 星探抽象类
 **/
public abstract class AbstractSearcher2 {
    protected IGoodBodyGirl goodBodyGirl;
    protected IGreatTemperamentGirl greatTemperamentGirl;

    public AbstractSearcher2(IGoodBodyGirl _goodBodyGirl) {
        this.goodBodyGirl = _goodBodyGirl;
    }

    public AbstractSearcher2(IGreatTemperamentGirl _greatTemperamentGirl) {
        this.greatTemperamentGirl = _greatTemperamentGirl;
    }

    //搜索美女，列出美女信息
    public abstract void show();
}
