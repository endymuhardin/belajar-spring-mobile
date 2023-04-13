# Menggunakan Spring Mobile di Spring Boot 3.0.5 #

Spring Mobile sudah tidak dimaintain lagi sejak tahun 2022. Ini menimbulkan kesulitan untuk digunakan di Java 17, karena class-class internalnya masih banyak yang import `javax.servlet.http`, sedangkan di Java 17, nama packagenya berubah menjadi `jakarta.servlet.http`.

Di sample project ini, beberapa class yang bermasalah terpaksa diimplement ulang supaya bisa digunakan di Spring Boot 3 dengan Java 17.