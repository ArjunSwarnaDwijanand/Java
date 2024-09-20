package org.allinone.corejava.solid.ocp;

public interface NotificationService {

    void sendOTP(String medium);

    void sendTransactionReport(String medium);
}
