# 13.Roman to Integer (Easy)

## Question:
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.



Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].

---
## 解題思路
- 使用hashMap,將羅馬數字對應數字形成key value pair
- 將羅馬字串拆成一個一個單字存在陣列
- 遍歷陣列每個字,並判斷下一個字是否大於當前的字,是的話要重新計算

### ex:III
將III拆成[I,I,I]
遍歷每個值,去hashmap對應key value 得到 1,1,1
將其相加

### ex:MMXXIV (2024)
拆成[M,M,X,X,I,V]
遍歷陣列
判斷array[0] M 沒有小於 array[1]M
sum+=array[0]

array[1] M 沒有小於 array[2]X
sum+=array[1]

array[2] X 沒有小於 array[3]X
sum+=array[2]

array[3] X 沒有小於 array[4]I
sum+=array[3]

array[4] I "有"小於 array[5] V
sum+= array[5]-array[4]
也可以是 sum -= array[4]
然後再sum+=array[5]

length = 6
i < i+1