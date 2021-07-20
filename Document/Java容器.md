[TOC]

### 1.list、set、map区别

list：有序，可重复。

set：无序，不可重复。

map：使用键值对存储，key无序，不可重复，value无序，可重复。每个key最多映射到一个value。

### 2.选用集合

1.需要用键值获取元素值就用map，需要排序用TreeMap，不需要用HashMap，需要保证线程安全用ConcurrentHashMap。

2.只需要存元素值就用实现Collection接口的集合，保证元素唯一就用HashSet，TreeSet，不需要唯一就用List下的ArrryList，LinkedList。

### 3.为何使用集合

当需要存储相同类型的数据时，需要使用一个容器，就是数组。但是数组有些缺点：有序可重复，特点单一，一旦声明长度不可变。

集合长度可变，根据有无序，可否重复选择合适的集合，提高存储数据的灵活性。

### 4.ArrayList、Vector、LinkedList

##### 1.ArrayList

List接口的主要实现类，底层实现是Object数组，线程不安全，支持快速随机访问。添加删除时间复杂度O(1),在指定位置添加删除时间复杂度O(n-i)。

##### 2.LinkedList

底层实现是双向链表，不支持高效的快速随机访问。添加删除时间复杂度O(1),在指定位置添加删除时间复杂度O(n)。线程不安全。内存占用大，需要存储前驱、后继、数据。

##### 3.Vector

List接口的古老实现类，线程安全，底层是Object数组。

### 5.RandomAccess接口

接口内没有任何实现，作为一个标识，表示实现这个接口的类具有随机访问功能。

### 6.HashSet、LinkedHashSet、TreeSet

##### 1.HashSet

set接口的主要实现类，底层实现是HashMap，线程不安全，可以存储null。

##### 2.LinkedHashMap

HashSet的子类，可以按添加的顺序遍历，增加了双向链表。

##### 3.TreeSet

底层实现是红黑树，可以按添加的顺序遍历。

### 7.HashMap、Hashtable

##### 1.线程安全

HashMap线程不安全，Hashtable线程安全，内部方法用Synchronized修饰。

##### 2.效率

因为Hashtable线程安全，效率不如HashMap高。

##### 3.null

HashMap的key、value支持null，null作为key只能有一个，value可以有多个，Hashtable不支持null。

##### 4.初始容量及扩充

Hashtable初始容量为11，扩充后大小为2n+1；HashMap初始容量为16，扩充后为两倍。

给定初始值，Hashtable大小为给定值，HashMap大小为2的幂次方。

##### 5.底层结构

jdk1.7时，HashMap底层结构式分段数组+链表，jdk1.8后底层结构为数组+链表/红黑树。当链表程度大于阈值时，将链表转变为红黑树，减少搜索时间。Hashtable没有这种机制。

### 8.HashMap、HashSet

HashSet底层是HashMap实现的。

HashMap实现了Map接口，HashSet实现了Set接口。

HashMap存储键值对，HashSet存储值。

HashMap用put方法添加键值对，HashSet用add方法添加值。

HashMap使用key计算hashcode，HashSet使用成员对象计算hashcode，两个对象的hashcode可能相等，使用equals方法判断两个对象是否相同。

### 9.TreeMap

继承自AbstractMap，还实现了NavigableMap、SortedMap接口。

NavigableMap接口让TreeMap有集合内元素的搜索能力。

SortedMap接口实现按键排序的功能，默认按key升序排序。