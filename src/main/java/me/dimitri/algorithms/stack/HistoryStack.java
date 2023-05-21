package me.dimitri.algorithms.stack;

import java.util.Stack;

public class HistoryStack {

    /*
     A really simple "feature" used in web browsers for the back and forward buttons for history
     */

    private final Stack<String> back = new Stack<String>();
    private final Stack<String> forward = new Stack<String>();

    public void newBack(String url) {
        back.push(url);
    }

    public void newForward(String url) {
        forward.push(url);
    }

    /*
    Prints out the last 5 back urls, some browsers allow you to quickly view your back urls
    when holding the back button (FireFox I think)
     */
    public void getBacks() {
        if (back.size() >= 1) {
            for (int i = back.size() - 1; i >= 0; i--) {
                if (back.size() - i > 5)
                    break;

                System.out.println(back.get(i));
            }
        }
    }

    public void getForwards() {
        if (forward.size() >= 1) {
            for (int i = forward.size() - 1; i >= 0; i--) {
                if (forward.size() - i > 5)
                    break;

                System.out.println(forward.get(i));
            }
        }
    }

    public void popBack() {
        System.out.println(back.pop());
    }

    public void popForward() {
        System.out.println(forward.pop());
    }

    public static void main(String[] args) {
        HistoryStack historyStack = new HistoryStack();

        historyStack.newBack("twitter.com");
        historyStack.newBack("discord.com");
        historyStack.newBack("github.com");
        historyStack.newBack("youtube.com");
        historyStack.newBack("google.com");
        historyStack.newBack("amazon.com");

        System.out.println("> Get Backs");
        historyStack.getBacks();
        System.out.println("\n\n");

        System.out.println("> Pop Back");
        historyStack.popBack();
        System.out.println("\n\n");

        historyStack.newForward("minecraft.net");
        historyStack.newForward("microsoft.net");
        historyStack.newForward("oracle.com");

        System.out.println("> Get Forwards");
        historyStack.getForwards();
        System.out.println("\n\n");

        System.out.println("> Pop Forward");
        historyStack.popForward();
        System.out.println("\n\n");
    }

}
