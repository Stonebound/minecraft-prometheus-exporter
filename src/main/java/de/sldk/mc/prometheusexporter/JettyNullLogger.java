package de.sldk.mc.prometheusexporter;

import org.eclipse.jetty.util.log.Logger;

public class JettyNullLogger implements Logger {
    public String getName() {
        return "Jetty";
    }

    public void warn(String s, Object... objects) {
    }

    public void warn(Throwable throwable) {
    }

    public void warn(String s, Throwable throwable) {
    }

    public void info(String s, Object... objects) {
    }

    public void info(Throwable throwable) {
    }

    public void info(String s, Throwable throwable) {
    }

    public boolean isDebugEnabled() {
        return false;
    }

    public void setDebugEnabled(boolean b) {
    }

    public void debug(String s, Object... objects) {
    }

    public void debug(String msg, long value) {

    }

    public void debug(Throwable throwable) {
    }

    public void debug(String s, Throwable throwable) {
    }

    public Logger getLogger(String s) {
        return this;
    }

    public void ignore(Throwable throwable) {
    }
}