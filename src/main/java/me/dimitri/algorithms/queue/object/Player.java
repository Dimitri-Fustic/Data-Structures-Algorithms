package me.dimitri.algorithms.queue.object;

public class Player {

    private final String username;
    private final int permission;

    public Player(String username, int permission) {
        this.username = username;
        this.permission = permission;
    }

    public String getUsername() {
        return username;
    }

    public int getPermission() {
        return permission;
    }
}
