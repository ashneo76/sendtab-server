def defaultPattern = "%-4relative %-5level %logger{32} - %msg%n"

appender("STDOUT", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = defaultPattern
    }
}

appender("FILE", FileAppender) {
    def currentTime = timestamp("yyyyMMdd'T'HHmmss")
    file = "logs/console_${currentTime}.log"
    encoder(PatternLayoutEncoder) {
        pattern = defaultPattern
    }
}

root(ERROR, [ "STDOUT" ])

