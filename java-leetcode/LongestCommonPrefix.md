# 14. Longest Common Prefix (Easy)

## Question:

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.





Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].

---
## 解題思路
- Data Structure: Array
- Algorithm: 排序演算法&比較演算法

### ex:["flower","flow","flight"]
1. 先拿prefix = arr[0] "flower"
2. 從flower開始 subString(0,prefiex[length]-1) --> flower
3. 比較flower

從flower開始 subString(0,prefiex[length]-2) --> flowe

從flower開始 subString(0,prefiex[length]-3) --> flow