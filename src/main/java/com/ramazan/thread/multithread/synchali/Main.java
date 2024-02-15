package com.ramazan.thread.multithread.synchali;

public class Main {
    public static void main(String[] args) {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            MultithreadingDemo object = new MultithreadingDemo();
            object.start();
        }
    }
}


/*
 *Kodunuzda, synchronized anahtar kelimesi kullanılarak bir kilit oluşturulmuştur.
 * Ancak, her MultithreadingDemo örneği için yeni bir lock nesnesi oluşturulur.
 * Bu nedenle, her thread kendi lock nesnesini senkronize eder ve bu, thread’ler arasında bir senkronizasyon sağlamaz1.

Thread’lerin başlatılma sırası, işletim sistemi tarafından belirlenir ve genellikle belirli bir
* sıraya göre olmaz.synchronized anahtar kelimesi, birden fazla thread’in aynı anda belirli bir kod bloğuna erişmesini önlemek için kullanılır.
*  Ancak, synchronized anahtar kelimesi thread’lerin başlatılma sırasını garanti etmez.

Thread’lerin belirli bir sırayla çalışmasını sağlamak için, özel çabalar harcamanız ve thread’lerinizi senkronize etmeniz gerekir.
* Java’da, bunu join() metodu veya CountDownLatch ve CyclicBarrier gibi yüksek seviye senkronizasyon yardımcıları
*  kullanarak yapabilirsiniz.
 */