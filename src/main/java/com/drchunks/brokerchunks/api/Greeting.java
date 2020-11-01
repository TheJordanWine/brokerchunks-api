package com.drchunks.brokerchunks.api;

import org.springframework.data.annotation.Id;

public class Greeting {

    @Id
    private String id;

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
