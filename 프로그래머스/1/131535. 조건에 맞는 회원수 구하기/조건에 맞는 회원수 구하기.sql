-- 코드를 입력하세요
SELECT count(USER_ID)
FROM USER_INFO
WHERE DATE_FORMAT(JOINED, '%Y') = '2021'
AND AGE >= 20 && AGE <= 29;