package com.ramazan.hash;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) {

        // HashMap örneği
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("bir", 1);
        hashMap.put("iki", 2);
        hashMap.put("dört",4);
        hashMap.put("dört",2);
        hashMap.put("beş",2);
        hashMap.put("üç", 3);
        System.out.println(hashMap); // 2

        // LinkedHashMap örneği
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("bir", 1);
        linkedHashMap.put("iki", 2);
        linkedHashMap.put("üç", 3);
        System.out.println(linkedHashMap); // 2
    }
}


/*
 *HashMap Nedir?
 * Java’da HashMap, Java’nın koleksiyonlar çerçevesinin bir parçasıdır. Verileri (Anahtar, Değer) çiftleri olarak saklar ve
 * onlara başka bir türün indeksi (örneğin bir Integer) ile erişebilirsiniz. HashMap, bir anahtarın altında bir değer eklediğinizde,
 * anahtar nesnesinin hashCode() API’si çağrılır ve bu da başlangıç hash değerini alır.

Nasıl Bir Yapı Sunar ve Nasıl Tutulur?
* HashMap, hashtable prensiplerine dayalı bir uygulamadır. Anahtar-değer çiftleri, bir tablo olarak adlandırılan şeyi oluşturan kovalar
*  olarak bilinen bir şeyde saklanır. Bu tablo aslında bir iç dizidir. Bir nesnenin hangi anahtar altında saklandığını veya saklanacağını
*  bildiğimizde, depolama ve alma işlemleri sabit zamanda, iyi boyutlandırılmış bir hash haritasında O(1), gerçekleşir.

Neden Hızlıdır?
*
* HashMap’ler, hashtable prensiplerine dayanır ve anahtar-değer çiftlerini saklarlar. Bir anahtarın altında bir nesne saklandığında veya
* saklanacaksa, depolama ve alma işlemleri sabit zamanda, yani O(1) zamanda gerçekleşir. Bu, HashMap’in hızlı olduğunun ana sebeplerinden
* biridir.

Neden Sıralı Değildir?
*
* HashMap, anahtarlarına göre sıralı bir düzen sunmaz. Bu, HashMap’in tasarımının bir parçasıdır. HashMap, anahtarlarına göre sıralı bir düzen
*  sunmaz çünkü anahtarların hash kodlarına dayalı olarak verileri saklar ve bu hash kodları genellikle rastgele dağıtılır. Bu, HashMap’in
*  anahtarlarına göre herhangi bir sıralı düzen sunmamasının ana sebebidir.
 */


/*
 *Bucket Nedir?
 * Bucket, HashMap’in verileri sakladığı bir yapıdır. Bir bucket, HashMap’in altında yatan dizinin her bir öğesidir. Her bir bucket, bir
 * anahtar-değer çiftini veya bir çiftler listesini saklar.

Bucket Nasıl Oluşturulur ve Nasıl Yerleştirilir?
* Bir HashMap oluşturulduğunda, belirli bir kapasiteye sahip bir dizi oluşturulur. Bu dizi, HashMap’in bucket’larını içerir. Her bucket,
* bir anahtar-değer çiftini veya bir çiftler listesini saklar. Bu, birden çok anahtarın aynı hash değerine sahip olması durumunda,
*  yani hash çakışması durumunda, aynı bucket’a yerleştirilmesini sağlar.

Bucket Nasıl Çalışır?
* Bir anahtar-değer çifti eklediğinizde, anahtarın hashCode() API’si çağrılır ve bu hash kodu, bucket’ın indeksini belirlemek için kullanılır.
*  Bu indeks, anahtar-değer çiftinin hangi bucket’a yerleştirileceğini belirler. Eğer bir çakışma olursa, yani iki farklı anahtar aynı hash
* kodunu üretirse, her iki anahtar-değer çifti de aynı bucket’a yerleştirilir. Bu durumda, bucket içindeki anahtar-değer çiftleri bir liste gibi
*  işlenir.
 */


/*
 *Hashcode Nedir?
 * Java’da, her nesnenin bir hashcode’u vardır. Hashcode, bir nesnenin durumunu temsil eden bir tam sayı değeridir. JVM, bir nesne
 * oluşturulduğunda bu hashcode’u üretir. Hashcode, bir nesnenin eşsiz bir kodunu sağlar ve bu kod, hashtable, hashmap gibi hash tabanlı
 * algoritmaların bazı işlemlerini gerçekleştirmek için kullanılabilir.

Hashcode Nasıl Çalışır?
* Bir nesnenin hashCode() API’si çağrıldığında, bu API bir tam sayı değeri döndürür. Bu değer, bir hash algoritması tarafından üretilir.
* Eşit olan nesneler (yani equals() API’sine göre eşit olan nesneler), aynı hash kodunu döndürmelidir. Farklı nesnelerin farklı hash kodları
* döndürmesi gerekmez.

Hashcode’un Kullanımı Hashcode, bir nesnenin hangi "bucket"ta saklanacağını belirlemek için kullanılır. Bir bucket, bir hash tablosundaki bir
* hücreyi temsil eder. Bir nesne bir HashMap’e eklenirken, nesnenin hash kodu hesaplanır ve bu kod, nesnenin hangi bucket’a yerleştirileceğini
*  belirler.
 */


