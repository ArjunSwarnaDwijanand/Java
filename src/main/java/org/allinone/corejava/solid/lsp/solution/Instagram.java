package org.allinone.corejava.solid.lsp.solution;

public class Instagram implements SocialMedia, PostMediaManager {

    @Override
    public void chatWithFriend() {
        System.out.println("Chat with friend in Instagram");
    }

    @Override
    public void sendPhotosAndVideos() {
        System.out.println("Send photos and videos in Instagram");
    }

    @Override
    public void publishPost(Object post) {
        System.out.println("Publish post in Instagram");
    }
}
