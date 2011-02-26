script {
    profile ('SopCast') {
        pattern {
            match { SOPCAST }
            protocol 'sop'
        }

        action {
            def quotedURI = quoteURI($URI)
            $HOOK = "$SOPCAST ${quotedURI}"
            $URI = SOPCAST_URI ?: 'http://127.0.0.1:8902/stream'
        }
    }
}
