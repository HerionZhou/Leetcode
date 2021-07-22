### 1.撤销commit

--soft：不删除工作空间改动代码。

--hard：删除工作空间改动代码，回到上一次commit状态。

```
git reset --soft HEAD~1 //撤销前一个版本
git reset --soft HEAD~2 //撤销前两个版本
```

### 2.本地与远端冲突

```
git stash save "save message" //暂存本地代码
git pull
git stash pop //将存储代码与本地代码合并
```

