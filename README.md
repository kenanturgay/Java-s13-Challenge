# Java Çalışanlar Uygulaması


## Görev 1: 
 * 3 tane sınıf oluşturmalısınız. ```Company```, ```Healthplan```, ```Employee```
 * Yazılacak tüm sınıflardaki sınıf değişkenleri  ```private``` olarak tanımlanmalı. Hepsi için getter & setter metodları yazılmalı. Her sınıfın toString() metodu ezilmeli. Her sınıf için en az bir tane ```constructor``` tanımlanmalı.
 * ```Healthplan``` sınıfı  ```id```, ```name``` ve ```plan``` isminde 3 adet sınıf değişkeninden oluşmalı.
 * ```plan``` enum tipinde olmalı. ```name``` ve ```price``` değerlerini almalı.
 * Employee sınıfı içerisinde ```id, fullName, email, password``` ve ```String[] healthplans``` isminde toplamda 5 sınıf değişkeni olmalı.
 * Employee sınıfı içerisinde ```addHealthplan(int index, String name)``` isimli bir metod tanımlayınız. Amacımız healthplans dizisine parametre olarak gelen name değerini atamak. İlgili index değeri dizi içerisinde boşsa parametre olarak gelen ```name``` değişkeni ilgili indexe yazılmalı. İlgili index doluysa dolu olduğuna dair bir mesaj verilmeli. İlgili index değerinin dizi içerisinde hiç var olmadığı durumda kontrol edilmeli.
 * Company sınıfı içerisinde ```id, name, giro, String[] developerNames``` isminde 4 adet sınıf değişkeni olmalı.
 * giro değeri hiçbir şekilde 0 altında değer alamamalı.
 * Company sınıfı içerisinde ```addEmployee(int index, String name)``` isimli bir metod tanımlayınız. Amacımız developerNames dizisine parametre olarak gelen name değerini atamak. İlgili index değeri dizi içerisinde boşsa parametre olarak gelen ```name``` değişkeni ilgili indexe yazılmalı. İlgili index doluysa dolu olduğuna dair bir mesaj verilmeli. İlgili index değerinin dizi içerisinde hiç var olmadığı durumda kontrol edilmeli.


## Görev 2: Main metodun içinden başka bir metod çağırımı yapın. Tüm işlemler bu yeni çağırım yaptığınız metod içinde yapılmalı

### Sonuçlar
 * Her sınıf için en az bir tane obje oluşturmalısınız
 * Her obje için toString() metodunu mutlaka çağırmalı ve ekran görüntüsünü görmelisiniz
 * Encapsulation kurallarını doğru bir şekilde uygulamalısnız. Örneğin Company için giro değeri hiçbir zaman negatif bir değer almamalı.
   
 
