### 总结：
紧张愉快的两个月的时间一转眼就过去了，这期间获益良多，老师的讲解配合精选的题目对编程能力的提升有很大帮助。数据结构与算法是难点也是重点，要继续保持学习的状态，坚持做题，不断巩固知识点。
#### Week1
1.  
切题四件套：
  - clarification, 
  - possible solutions (compare time/space, optimal), 
  - repeat coding, 
  - test cases
##### 五遍刷题 

2. 时间复杂度
	- 1）二叉树遍历：前中后o（n）
	- 2）图的遍历：o（n）
	- 3）dfs，bfs：o（n）
	- 4）二分查找：o(logn)
3. array 
	- 1）增加元素，中间插入要移动后面的o（n）
	- 2）删除元素，中间删除要把后面的前移o(n)
4. linked list
	- 1）复杂度：
		 - Prepend o(1)	Append o(1) insert o(1) delete o(1) Lookup o(n)
5. skip list : 升维，空间换时间
	- 1）只能用于链表里的元素有序的情况
	- 2）对标替代平衡树和二分查找
	- 3）插入 删除 搜索 都是log n
	- 4）空间复杂度o（n）
	
6. 
 - Stack：先入后出；添加，删除皆为o（1）
 - Queue：先入先出；添加，删除皆为o（1）		
 - Deque: 两端都可以进出的queue；插入删除都是o（1）查询都为o（n）
 - PriorityQueue：插入o（1）（斐波那契堆，二叉堆为ologn），取出o（logn）
    - 按照元素的优先级取出
    - 底层实现多样+复杂：heap，bst，treap

#### Week2
- 1) hash table
	- 根据关键码值（key value）而直接进行访问的数据结构
	- 通过把关键码值映射到表中一个位置来访问记录，以加快查找的速度
	- 映射函数叫hash function散列函数，存放记录的数组叫做哈希表
	- 类比：电话号码表，用户信息表
	- 一种collision解决方案：将键值相同的元素用链表连接
	- 作业：看懂hashmap的get，put，写个总结
- 2）回顾做题四件套：clarification，possible solutions，coding，test cases
- 3）tree，binary tree，bst
	- 二叉树的遍历：
	- 二叉搜索树 查询 插入：logn复杂度
	- 二叉搜索树 删除：找到第一个大于该节点的数来替换要删除的节点（右子树最小值）
	- 二叉搜索树 查找worst case：当树从根节点开始只有右子树，此时树变成了链表，查找为o（n）
	- 思考：二叉树解法为何都是递归的？

- 4) 堆heap，二叉堆binary heap	
	 - 可以迅速找到一堆数中的最大或者最小值的数据结构
	 - time：
        - find-max: o(1)
        - delete-max: o(logn)
        - insert(create): o(logn) or o(1) (fibo heap)
	 - 二叉堆只是堆的一种实现，比较简单，但time复杂度不是最好，还有很多其他更好的实现，比如fibonacci堆
	
	 - 二叉堆（大顶）性质：
        - 1、通过完全二叉树来实现
        - 2、树中任意节点的值总是大于等于其子节点的值
   - 二叉堆实现细节：
		  - 1. 通过数组实现
		  - 2. 数组中各索引i所对应的节点：
			  - 索引i的左孩子：2*i + 1
			  - 索引i的右孩子：2*i + 2
			  - 索引i的父节点是floor（（i-1）/2）
      - 3. 二叉堆insert插入操作
	      - 新元素一律先插入到堆的底部
    	  - 依次向上调整整个堆的结构（一直到根即可）heapify-up
      - 4. delete max删除堆顶操作
        - 为了保证堆一直保持一个完全二叉树的形态，此时需要将堆尾元素替换到顶部（等价于堆顶元素被替代删除掉）
        - 依次从顶部向下调整整个堆的结构（一直到堆尾即可）heapify-down

		  - 5. 堆的实现代码：
		    - [https://shimo.im/docs/Lw86vJzOGOMpWZz2/read]
		
		  - 6. heap sort
		    - [https://www.geeksforgeeks.org/heap-sort/]
-	5）图:
		- 表示:adjacency matrix；adjacency list;
		- 常用bfs，dfs:
			  - 重点: 使用visited = set（）记录已经遍历过的点
		- 拓扑排序:
		  - [https://zhuanlan.zhihu.com/p/34871092]
		- Dijkstra: 
        - [https://www.bilibili.com/video/av25829980?from=search&seid=13391343514095937158]
		- minimum spanning tree:
        - [https://www.bilibili.com/video/av84820276?from=search&seid=17476598104352152051]
			
#### week3
- 1) 递归
      - 模版
      - 注意
		      - 利用数学归纳法
  		    - 不要人肉递归
		      - 找最近最简单方法, 将其拆解成可重复解决的问题（重复子问题）
- 2）分治, 回溯
	    - 分治:大问题由细的子问题组成
	    - 模版:
		        - 1）Base case
		        - 2）处理数据 + 准备subproblem
		        - 3）做计算/处理subproblem
		        - 4）返回结果
	    - 回溯:试错思想
	      - 注意:熟悉牛顿迭代法
          	  - [http://www.voidcn.com/article/p-eudisdmk-zm.html]
            
#### Week4：DFS/BFS 遍历

- 1) DFS深度优先
	  - 遍历顺序：一冲到底 stack
		  - 树
		  - 图
	
    - 递归写法：
	  - 迭代写法：自主维护一个stack来模拟系统的stack
		
- 2) BFS广度优先
	  - 遍历顺序：层层展开 queue
	  - 树
    - 写法：维护一个queue
- 3）贪心算法
    - 局限：每一步选取结果只按一种策略，无法保证最优
    - 定义： 贪心算法是一种在每一步选择中都采取在当前状态下最好或最优（最有利）的选择，从而希望导致结果是全局最好或最优的算法
    - 与动态规划区别：贪心对子问题的解决方案（解决子问题的方案一旦设定，则每次都会运用相同的方案）不能回退；动规则会保存以前的运算结果，并可以根据以前结果对当前进行选择，有回退功能
    - 主要解决最优化问题
        - 适用场景：问题能够分解成子问题来解决，子问题的最优解能递推到最终问题的最优解；这种子问题最优解称为最优子结构；

- 4）二分查找
	 - 使用前提 为什么能用？？？：
		  - 1）目标函数单调性
		  - 2）存在上下界
		  - 3）能够通过索引访问
	 - 代码模版：
		  - 牛顿迭代法
    		[http://www.matrix67.com/blog/archives/361]
		- 四步做题：
      - 审题（细节，边界条件，input，output）；
      - 考虑所有解法得出最优法；
      - 写代码；
      - 测试case；

#### week5：midterm
#### week6
	- 1) 牢记递归模版
		  - 终止条件
		  - 处理当前层逻辑
		  - 下探到下一层
		  - 恢复到下一层
	
	- 2）分治代码模版

  - 3）一般思路：找到最近最简方法，将问题拆解成可重复解决的问题
		  - 数学归纳法
		  - 寻找重复性-〉计算机指令集（if else，for，recursion）
  -	4）dp = 分治 + 最优子结构
			  - 分治过程中，每一步不需要保存所有状态，只需要保存最优的状态
			  - 动态规划 和 递归或者分治没有根本上的区别（关键看有无最优子结构）
				  - 共性：找到重复子问题
				  - 差异性：最优子结构，中途可以淘汰次优解
			  - 自底向上写循环：
			  - dp关键点：
				  - 最优子结构 opt[n] = best_of( opt[n-1], opt[n-2], …)
				  - 储存中间状态：opt[i]
				  - 递推公式（状态转移方程）
					    - Fib: opt[i] = opt[i-2] + opt[i-2]
  					  - 二维路径：opt[i,j] = opt[i+1][j] + opt[i][j+1] （且判断a[i,j]是否空地）

#### week7: 树的性质;前中后序遍历
	- 1)字典树
      [https://leetcode-cn.com/problems/implement-trie-prefix-tree/solution/shi-xian-trie-qian-zhui-shu-by-leetcode/]
		  - 性质:
			  - 1. 节点本身不存单词，只存要去到的路径上的这个路径所代表的字符
			  - 2. 从根节点到某一节点，路径上经过的字符连接起来，为该节点对应的字符串
			  - 3. 每个节点的所有子节点路径代表的字符都不相同
			
		  - 节点可以存储额外信息（例如该节点被访问过的频次）
      - 核心思想: 空间换时间，利用字符串的公共前缀来降低查询时间的开销以达到提高效率的目的

      - todo: 实现trie
	- 2）并查集, union find
		  - 组团+配对, 用于快速判断某两个个体是否在同一个集合中
		  - group or not? a 和 b是不是朋友
		  - 实现过程：
			    - 一开始各自节点各自为一个集合
    			- 随着各集合节点的增加，不断地扩充集合树
    			- find: 找该集合的领头元素，不断的往上跳跃直到parent【i】=i
			    - 路径压缩: 让集合中的各个节点直接跟老大连接，方便find	
		  - todo: 实现union find
		
	- 3）高级搜索
		  - 数形结合，状态树
		  - 剪枝
		  - 回溯
			  - 递归+分治+试错
      - 回溯法采用试错的思想，它尝试分步的去解决一个问题，在分步解决问题的过程中，当它通过尝试发现现有的分步答案不能得到有效的正确的解答时，它将取消上一步甚至是上几步的计算，再通过其它的可能的分步解答再次尝试寻找问题的答案
      - 双向bfs (单词接龙1，2)
		  - 启发式搜索（a*）heuristic search
			- 智能搜索基于bfs
			    - 根据某一项条件，我们来不断优化搜索的方向
			    - 一边搜索，一边思考
			    - 通过优先级不断找要找的点，先用优先级高的拿出来搜索即可
          - 利用启发函数h（n），（估价函数）来找到我们需要找的点，h（n）会返回一个非负实数，也可以认为是从节点n到目标节点路径的估计成本
	- 4）红黑树和avl树
		  - 复习树的遍历：
			  - preorder：根左右
			  - inorder：左根右
			  - postorder：左右根
			- binary search tree
        - 二叉搜索树的中序遍历都是升序排列的
			  - 增加，查找，o（logn），worst case o（n）（链表）
        - 删除
        - bst保证性能的关键是
      	- 保证二维维度
    	  - balanced
      		- 2,3 tree, avl tree, b-tree, red-black tree, splay tree
     - avl			
			  - 通过旋转来使得平衡因子保持在1范围内
				- 右右子树 = 左旋转
				- 左左子树 = 右旋转
				- 左右子树 = 左右旋转
				- 右左子树 = 右左旋转
				- avl总结：
					  - 1. 平衡二叉搜索树
					  - 2. 每个结点存balance factor = 【-1，0，1】
					  - 3. 四种旋转操作
  					- 不足：结点需要存储额外信息，且调整次数频繁，维护高

      - red black tree（近似平衡二叉树，不需要常维护）
          - 关键性质：从根到叶子的最长的可能路径不多于最短的可能路径的两倍长（高度差小于两倍）
			
			- 概述，面试重点：
        - avl trees provide faster lookups than red black trees because they are more strictly balanced
        - red black trees provide faster insertion and removal operations than avl trees as fewer rotations are done due to relatively relaxed balancing
        - avl trees store balance factors or heights with each node, thus requires storage for an integer per node whereas red black tree requires only 1-bit (red or black) information per node
        - red black trees are used in most of the language libraries like map, multimap, multiset in c++ whereas avl trees are used in databases where faster retrievals are required，database读多写少
        - 查询插入一半一半可以用红黑树，因为简洁好实现

#### week 8:
- 1) 位运算
	- 2，10进制转换:对2取余
		  - 补零
	- 异或：相同为0，不同为1，不进位加法
- 2) 布隆过滤器，bloom filter
	  - 一个很长的二进制向量和一系列随机映射函数
	  - 一开始二进制位数组全为零
    - 映射函数决定了进来的元素要分成几个二进制位，每映射一次就将对应的二进制位变成1
	  - 用于检索一个元素是否在一个集合中
	  - 而hash table不但可以检索元素是否在集合，还可以存元素本身的各种信息
	  - 优点：时间空间效率，查询时间都超过一般算法
	  - 缺点：一定的误识别率和删除困难
    - 布隆过滤器能查到(A, B)，说明元素可能在集合中，也可能不在；布隆过滤器查不到(C)的就一定不在
    - 布隆过滤器只是挡在机器前面快速查询的缓存，真正要确定元素一定存在就必须访问机器的存储器（数据库）
    - 应用
    - 实现
- 3）LRU – Cache
	  - cache缓存：
		  - 记忆，钱包，代码模块
	  - lru，least recently used，最近最少使用的，放在最后淘汰
	  - lru实现：
		    - [https://leetcode-cn.com/problems/lru-cache/%23/]
	  - LFU : least frequently used, 最少用的频次最少的淘汰

- 3) 排序算法
	  - [https://www.cnblogs.com/onepixel/p/7674659.html]
  - 重点看nlogn排序：堆排序，快速排序，归并排序
	- 初级排序n^2: 会写
		  - 选择排序：每次找最小值，然后放到待排序数组的起始位置
	    - 插入排序：从前到后逐步构建有序序列；对未排序数据，在已排序序列中从后向	前扫描，找到相应位置并插入
      - 冒泡排序：每一轮两两交换都把最大的元素送到到最后（冒泡出来），与选择排序相反
	- 高级排序nlogn：会写
		  - 快速排序quick sort
          - 数组取标杆pivot，将小元素放在pivot左边，大元素放在pivot右边，然后再依次对右边和左边的子数组继续快排，直到整个序列有序
		  - 归并排序merge sort
			    - 把长度为n的输入序列分成两个长度为n/2的子序列
			    - 对这两个子序列分别采用归并排序
			    - 将两个排序好的子序列合并成一个最终的排序序列
		  - 堆排序 heap sort
	        - [https://courses.cs.washington.edu/courses/cse373/16wi/Hashing/visualization/HeapSort.html]
			    - 堆插入logn，取最大最小o（1）
	- 特殊排序
  
#### week9
- 高级动态规划
- 复习递归
- 复习分治
	- 分治典型：归并排序
	- 要点是找到重复子结构，最近重复性
- 动态规划：
	- 分治（找重复子问题） + 最优子结构，中途淘汰次优解
	- dp最后一步的状态 = 前一步子问题的最优解
	- 多维dp，每个维度代表了问题的一个状态，把问题抽象化
	- 股票买卖：
- 高阶动态规划 
	- 编辑距离：
		- 增加和删除的情况是相通的
	- 字符串
		- python，java中的string为immutable，不可变，每次改变string都创建了新string
		- c++中的string为mutable，要改为不可变就加const
		- java中字符串的比较
			- 虽然x，y的内容一样，但是二者是不同的内存地址，所以==比较会false
- 字符串匹配算法
	- 暴力法 ,o（mn）
	- rabin-karp
	- kmp
		

