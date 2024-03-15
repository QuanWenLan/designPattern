package principle.interfaceisolation.version1;

import principle.interfaceisolation.version1.AbstractSearcher;
import principle.interfaceisolation.version1.IPettyGirl;
import principle.interfaceisolation.version1.PettyGirl;
import principle.interfaceisolation.version1.Searcher;
import principle.interfaceisolation.version2.IGoodBodyGirl;
import principle.interfaceisolation.version2.PettyGirl2;

/**
 * @author Lan
 * @createTime 2024-03-13  11:18
 **/
public class Client {
    public static void main(String[] args) {
        //定义一个美女
        IPettyGirl yanYan = new PettyGirl("嫣嫣");
        AbstractSearcher searcher = new Searcher(yanYan);
        searcher.show();
    }
}
/**
 * 思考一下IPettyGirl这个接口，这个接口是否做到了最优化设计？答案是没有，还可以对接口进行优化。
 * 我们的审美观点都在改变，美女的定义也在变化。唐朝的杨贵妃如果活在现在这个年代
 * 非羞愧而死不可，为什么？胖呀！但是胖并不影响她入选中国四大美女，说明当时的审美观
 * 与现在是有差异的。当然，随着时代的发展我们的审美观也在变化，当你发现有一个女孩，
 * 脸蛋不怎么样，身材也一般般，但是气质非常好，我相信大部分人都会把这样的女孩叫美
 * 女，审美素质提升了，就产生了气质型美女，但是我们的接口却定义了美女必须是三者都具
 * 备，按照这个标准，气质型美女就不能算美女，那怎么办？可能你要说了，我重新扩展一个
 * 美女类，只实现greatTemperament方法，其他两个方法置空，什么都不写，不就可以了吗？
 * 聪明，但是行不通！为什么呢？星探AbstractSearcher依赖的是IPettyGirl接口，它有三个方
 * 法，你只实现了两个方法，星探的方法是不是要修改？我们上面的程序打印出来的信息少了
 * 两条，还让星探怎么去辨别是不是美女呢？
 *
 * 分析到这里，我们发现接口IPettyGirl的设计是有缺陷的，过于庞大了，容纳了一些可变
 * 的因素，根据接口隔离原则，星探AbstractSearcher应该依赖于具有部分特质的女孩子，而我
 * 们却把这些特质都封装了起来，放到了一个接口中，封装过度了！
 *
 * 把原IPettyGirl接口拆分为两个接口，一种是外形美的美女IGoodBodyGirl，这类美女的特
 * 点就是脸蛋和身材极棒，超一流，但是没有审美素质，比如随地吐痰，文化程度比较低；另
 * 外一种是气质美的美女IGreatTemperamentGirl，谈吐和修养都非常高。我们把一个比较臃肿
 * 的接口拆分成了两个专门的接口，灵活性提高了，可维护性也增加了，不管以后是要外形美
 * 的美女还是气质美的美女都可以轻松地通过PettyGirl定义。
 */
