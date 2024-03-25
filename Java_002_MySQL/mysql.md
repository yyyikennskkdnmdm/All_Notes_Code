**先了解大体，先不深入，最后在深入。**



###### 正则表达式

```sql
^b  :  匹配以b开头的字符串
$b  :  匹配以b结尾的字符串
a.b :  匹配a和b之间有一个字符的字符串
a*b :  匹配以a开头b结尾的字符串，匹配a和b中间有0个或多个字符的字符串 
ba+ :  匹配ba,baa，b后面有1个或多个a的字符串
<fa>:  匹配包含fa的字符串
[xz]:  匹配包含x或z的字符串
[^abc] :  匹配任何不包含a、b、c的字符串
b{2}:  匹配2个或更多的b
b{2,4}: 匹配最少2个b，最多4个b
```

SELECT * FROM fruits WHERE f_name **REGEXP** '^b';

**order by 排序**（Desc）倒序

**limit 分页**

```sql
SELECT * FROM table
LIMIT(PageNo - 1)*PageSize,PageSize;
```

###### 多表查询

**join**

**left join**

**right join**

**inner join**

**union**

```sql
SELECT * FROM student WHERE id IN (1,2,3)
UNION
SELECT * FROM student WHERE classid = 2
```

###### 函数

```sql
select ascii('a')
select char_length("char")
select length("char")
select concat("123","abc","456","def")
select concat_ws("___","abc","123","edf")
select insert("12345678",2,3,"abc")
select replace("11111","11","22")
select Upper("abc")
select ucase("abc")
select lower("ABC")
select lcase("ABC")
select left("123456",3)
select right("123456",3)
```

