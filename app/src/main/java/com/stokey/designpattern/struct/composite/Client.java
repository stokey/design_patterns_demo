package com.stokey.designpattern.struct.composite;

/**
 * Created by tiangen on 2017/8/9.
 */

/**
 * 组合模式——单个对象／组合对象（部分-整体关系）
 *
 * 将对象组合成树形结构以表示"部分-整体"的层次结构
 * 使得用户对单个对象和组合对象的使用具有一致性
 *
 * 构成：
 * 1、Component——抽象构件角色（所有节点的抽象对象）
 * 2、Leaf——叶子构件
 * 3、Composite——树枝构件（组合树枝节点和叶子节点形成一个树形结构）
 *
 *  Composite持有多个树枝节点和叶子节点，叶子节点附着在树枝节点上
 *
 *  优点：
 *  1、高层模块调用简单，不用关心处理的是单个对象还是整个组合对象
 *  2、节点自由增加，增加树枝节点、叶子节点较为容易
 *
 *  缺点：
 *  与依赖倒置原则冲突，树枝节点和叶子节点都是使用了实现类
 *
 *  使用场景：
 *  1、维护和展示部分-整体关系的场景，如树形菜单、文件和文件夹管理（树形结构）
 *  2、从一个整体中能够独立出部分模块或功能的场景（局部和整体）
 *
 *  组合模式：
 *  1、安全模式
 *  2、透明模式——将用来组合的方法放到抽象类中
 */
public class Client {
    public static void main(String[] args){
        // 创建一个根节点
        Composite root = new Composite();
        root.doSomething();

        // 创建一个树枝构件
        Composite branch = new Composite();
        // 创建一个叶子节点
        Leaf leaf = new Leaf();
        branch.add(leaf);
        root.add(branch);

        display(root);

    }

    private static void display(Composite root){
        for (Component component : root.getChildren()){
            if (component instanceof Leaf){
                component.doSomething();
            } else {
                component.doSomething();
                display((Composite) component);
            }
        }
    }
}
