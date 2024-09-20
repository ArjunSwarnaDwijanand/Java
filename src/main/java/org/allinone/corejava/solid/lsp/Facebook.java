package org.allinone.corejava.solid.lsp;

public class Facebook extends SocialMedia {

    @Override
    public void chatWithFriend() {
        System.out.println("Chatting with friend on Facebook");
    }

    @Override
    public void publishPost(Object post) {
        System.out.println("Publishing post on Facebook");
    }

    @Override
    public void sendPhotosAndVideos() {
        System.out.println("Sending photos and videos on Facebook");
    }

    @Override
    public void groupVideoCall(String... users) {
        System.out.println("Group video call on Facebook");
    }
}
