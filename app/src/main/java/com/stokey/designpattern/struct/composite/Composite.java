package com.stokey.designpattern.struct.composite;

/**
 * Created by tiangen on 2017/8/10.
 */

import java.util.ArrayList;

/**
 * 树枝构件——组合树枝节点和叶子节点组成一个树形结构
 *
 * 将有关系的对象组合成新对象后再给外部调用
 */
public class Composite extends Component {
    private ArrayList<Component> componentArrayList = new ArrayList<>();

    // 增加一个叶子构件或树枝构件
    public void add(Component component){
        this.componentArrayList.add(component);
    }

    // 删除一个叶子构件或树枝构件
    public boolean remove(Component component){
        return this.componentArrayList.remove(component);
    }

    // 获得分支下的所有叶子构件和树枝构件
    public ArrayList<Component> getChildren(){
        return this.componentArrayList;
    }
}
