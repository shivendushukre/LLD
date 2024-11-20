package com.builderexample;

/**
 * Code becomes less lengthy as using already defined constructors,
 * but still need to define multiple constructors
 * */
public class URLTelescope {

    private String protocol;

    private String hostname;

    private String port;

    private String pathParam;

    private String queryParam;

    public URLTelescope() {
    }

    public URLTelescope(String protocol) {
        this.protocol = protocol;
    }

    public URLTelescope(String protocol, String hostname) {
        this(protocol);
        this.hostname = hostname;
    }

    public URLTelescope(String protocol, String hostname, String port) {
        this(protocol, hostname);
        this.port = port;
    }

    public URLTelescope(String protocol, String hostname, String port, String pathParam) {
        this(protocol, hostname, port);
        this.pathParam = pathParam;
    }

    public URLTelescope(String protocol, String hostname, String port, String pathParam, String queryParam) {
        this(protocol, hostname, port, pathParam);
        this.queryParam = queryParam;
    }
}
