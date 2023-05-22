package me.dimitri.algorithms.queue;

import me.dimitri.algorithms.queue.object.Player;

public interface QueueInterface {
    public void offerPlayer(Player player);
    public Player peekPlayer();
    public Player pollPlayer();
    public int queueSize();
}
