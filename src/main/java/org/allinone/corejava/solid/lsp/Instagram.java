package org.allinone.corejava.solid.lsp;

public class Instagram extends SocialMedia{

    @Override
    public void chatWithFriend() {
        System.out.println("Chatting with friend on Instagram");
    }

    @Override
    public void publishPost(Object post) {
        System.out.println("Publishing post on Instagram");
    }

    @Override
    public void sendPhotosAndVideos() {
        System.out.println("Sending photos and videos on Instagram");
    }

    @Override
    public void groupVideoCall(String... users) {
        throw new UnsupportedOperationException("Instagram does not support group video call");
    }
}
