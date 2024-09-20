package org.allinone.corejava.solid.lsp.solution;

public class WhatsApp implements SocialMedia, VideoCallManager {

    @Override
    public void chatWithFriend() {
        System.out.println("Chatting with friend on WhatsApp");
    }

    @Override
    public void sendPhotosAndVideos() {
        System.out.println("Sending photos and videos on WhatsApp");
    }

    @Override
    public void groupVideoCall(String... users) {
        System.out.println("Group video call on WhatsApp");
    }
}
