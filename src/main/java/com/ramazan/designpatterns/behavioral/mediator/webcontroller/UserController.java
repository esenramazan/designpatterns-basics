package com.ramazan.designpatterns.behavioral.mediator.webcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

//    @Autowired
//    private UserService userService;
//
//    @PostMapping("/users")
//    public User createUser(@RequestBody User user) {
//        return userService.createUser(user);
//    }
//
//    @GetMapping("/users/{id}")
//    public User getUser(@PathVariable Long id) {
//        return userService.getUser(id);
//    }

    // Diğer metodlar...
}

/**
 * Spring MVC’deki @RestController anotasyonu ile işaretlenmiş bir sınıf, Mediator Pattern’ın bir örneği olarak düşünülebilir.
 * Bu sınıflar, istemciden gelen HTTP isteklerini alır ve bu istekleri uygun hizmetlere yönlendirir.
 * Bu, Mediator Pattern’ın temel bir örneğidir çünkü @RestController sınıfı, istemci ve hizmetler arasındaki iletişimi yönetir.
 *
 * Ancak, @RestController sınıfları genellikle çok daha fazla sorumluluğa sahiptir. Örneğin, HTTP isteklerini doğrulama, HTTP yanıtlarını oluşturma,
 * hata durumlarını işleme ve bazen de veritabanı işlemlerini yönlendirme gibi görevleri de üstlenebilirler.
 * Bu nedenle, @RestController sınıfları genellikle Mediator Pattern’dan daha karmaşıktır ve genellikle diğer tasarım modellerini de içerir.
 *
 * Bu nedenle, bir @RestController sınıfı, bir Mediator sınıfı olarak düşünülebilir,
 * ancak genellikle çok daha fazla sorumluluğa sahiptir ve genellikle diğer tasarım modellerini de içerir.
 */
