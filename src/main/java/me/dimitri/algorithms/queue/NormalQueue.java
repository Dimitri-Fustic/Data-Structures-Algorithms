package me.dimitri.algorithms.queue;

import me.dimitri.algorithms.queue.object.Player;

import java.util.LinkedList;
import java.util.Queue;

public class NormalQueue implements QueueInterface {

    /*
    So I didn't really have an idea for a use case for this data structure, so I'm going to make
    a literal queue system. Some Minecraft multiplayer servers often have trouble with too many players joining
    on a full server, so I'm just going to make that I guess.

    I used an object for the player instead of just the string to show how the priority queue is different.
     */

    private final Queue<Player> queue = new LinkedList<Player>();
    
    @Override
    public void offerPlayer(Player player) {
        queue.offer(player);
    }

    @Override
    public Player peekPlayer() {
        return queue.peek();
    }

    @Override
    public Player pollPlayer() {
        // Poll also doesn't throw out an exception
        return queue.poll();
    }

    @Override
    public int queueSize() {
        return queue.size();
    }

    public static void main(String[] args) {
        NormalQueue normalQueue = new NormalQueue();

        normalQueue.offerPlayer(new Player("Player1", 1));
        normalQueue.offerPlayer(new Player("CraftMaster", 2));
        normalQueue.offerPlayer(new Player("BlockBreaker", 1));
        normalQueue.offerPlayer(new Player("RedstoneWizard", 3));
        normalQueue.offerPlayer(new Player("CreeperSlayer", 1));
        normalQueue.offerPlayer(new Player("DiamondMiner", 2));
        normalQueue.offerPlayer(new Player("EndermanHunter", 1));
        normalQueue.offerPlayer(new Player("PotionBrewer", 3));
        normalQueue.offerPlayer(new Player("EnchantingPro", 1));
        normalQueue.offerPlayer(new Player("BuildArchitect", 4));

        System.out.println("> Queue Size");
        System.out.println(normalQueue.queueSize());
        System.out.println("\n\n");

        System.out.println("> Queue Peek");
        System.out.println(normalQueue.peekPlayer().getUsername());
        System.out.println("\n\n");

        System.out.println("> Queue Iterate");
        while (!normalQueue.queue.isEmpty()) {
            Player player = normalQueue.pollPlayer();
            System.out.println(player.getPermission() + " | " + player.getUsername());
        }
    }

}
