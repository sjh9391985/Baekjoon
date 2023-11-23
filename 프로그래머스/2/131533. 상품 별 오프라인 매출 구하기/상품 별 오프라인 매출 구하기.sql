SELECT p.product_code product_code, SUM(p.price * o.sales_amount) sales
FROM product p, offline_sale o
WHERE p.product_id = o.product_id
GROUP BY p.product_id
ORDER BY sales DESC, product_code;
