# Polish_notation
Polish Notation, lojik işlemlerin daha kolay ifade edilebilmesi için, matematiksel operatörlerin sayıların önüne alınması esasına dayanır. 3+4 ifadesi +34 şeklinde ifade edilir.
Daha karmaşık bir ifade ise şu şekilde ifade edilecektir.

((15 ÷ (7 − (1 + 1))) × 3) − (2 + (1 + 1)) = 5

![image](https://4.bp.blogspot.com/-mYTtaywCSAs/WJJPY5KKK6I/AAAAAAAAETQ/Mzpkti_8xzY2tiOTApw66DULw95Ix_QEwCLcB/s400/Clipboard01.jpg)

Verilen Polish Notation sağdan başlanarak tüm karakterlerin incelenmesi ile yapılır. Eğer operatör varsa öncesindeki iki sayı ile işlem gerçekleştirilir ve sıraya yazılır.
Yukaridaki örnek bu algoritma ile çözülürse aşağıdaki sıra gözetilir;
![image](https://4.bp.blogspot.com/--n6K9EZWdj4/WJJYTSe5-TI/AAAAAAAAETk/AYzBY8jbzP8sZMLGXywDT6aDJ57HZiFEgCLcB/s400/Clipboard01.jpg)

Yazdğım algoritma böyle soruları çözmektedir. Programın girdisi “* + * + 1 2 + 3 4 5 6” benzeri bir metin olacaktır. Metinde ayraç olarak bir BOŞLUK kullanılacaktır.
