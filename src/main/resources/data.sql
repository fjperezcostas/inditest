INSERT INTO BRANDS
VALUES (1, 'Zara');

INSERT INTO PRODUCTS
VALUES (35455, 'T-shirt');

SET @DATE_FORMAT = 'yyyy-MM-dd-HH.mm.ss';

INSERT INTO PRICES (PRICE_LIST, BRAND_ID, PRODUCT_ID, START_DATE, END_DATE, PRIORITY, PRICE, CURR)
VALUES (1, 1, 35455, parsedatetime('2020-06-14-00.00.00', @DATE_FORMAT), parsedatetime('2020-12-31-23.59.59', @DATE_FORMAT), 0, 35.50, 'EUR'),
       (2, 1, 35455, parsedatetime('2020-06-14-15.00.00', @DATE_FORMAT), parsedatetime('2020-06-14-18.30.00', @DATE_FORMAT), 1, 25.45, 'EUR'),
       (3, 1, 35455, parsedatetime('2020-06-15-00.00.00', @DATE_FORMAT), parsedatetime('2020-06-15-11.00.00', @DATE_FORMAT), 1, 30.50, 'EUR'),
       (4, 1, 35455, parsedatetime('2020-06-15-16.00.00', @DATE_FORMAT), parsedatetime('2020-12-31-23.59.59', @DATE_FORMAT), 1, 38.95, 'EUR');

