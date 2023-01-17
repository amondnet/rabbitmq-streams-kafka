package net.amond

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication

class KafkaServer {

  fun fetchApi() {

  }

}

fun main(args: Array<String>) {
  runApplication<KafkaServer>(*args)

}
