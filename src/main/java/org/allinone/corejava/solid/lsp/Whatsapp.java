package org.allinone.corejava.solid.lsp;

public class Whatsapp  extends SocialMedia{

    @Override
    public void chatWithFriend() {
        System.out.println("Chatting with friend on WhatsApp");
    }

    @Override
    public void publishPost(Object post) {
        throw new UnsupportedOperationException("WhatsApp does not support publish post");
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
