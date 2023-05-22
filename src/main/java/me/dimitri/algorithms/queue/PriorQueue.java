package me.dimitri.algorithms.queue;

import me.dimitri.algorithms.queue.object.Player;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorQueue implements QueueInterface {

    /*
    Some Minecraft servers that have a queue system to join the server also offer players, when buying something in their web-shop, to get
    permissions to skip a large chunk of the queue. Meaning if you have this permission you will pass all the people without it. In this case
    the larger the number in your permissions integer the more priority you have.

    I just used Minecraft servers as an example, I'm not sure why.
     */

    private final PriorityQueue<Player> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(Player::getPermission).reversed());

    @Override
    public void offerPlayer(Player player) {
        priorityQueue.offer(player);
    }

    @Override
    public Player peekPlayer() {
        return priorityQueue.peek();
    }

    @Override
    public Player pollPlayer() {
        return priorityQueue.poll();
    }

    @Override
    public int queueSize() {
        return priorityQueue.size();
    }

    public static void main(String[] args) {
        PriorQueue priorityQueue = new PriorQueue();

        // Giving players a higher number will get them a better position in the queue
        priorityQueue.offerPlayer(new Player("Player1", 1));
        priorityQueue.offerPlayer(new Player("CraftMaster", 2));
        priorityQueue.offerPlayer(new Player("BlockBreaker", 1));
        priorityQueue.offerPlayer(new Player("RedstoneWizard", 3));
        priorityQueue.offerPlayer(new Player("CreeperSlayer", 1));
        priorityQueue.offerPlayer(new Player("DiamondMiner", 2));
        priorityQueue.offerPlayer(new Player("EndermanHunter", 1));
        priorityQueue.offerPlayer(new Player("PotionBrewer", 3));
        priorityQueue.offerPlayer(new Player("EnchantingPro", 1));
        priorityQueue.offerPlayer(new Player("BuildArchitect", 4));

        System.out.println("> Queue Size");
        System.out.println(priorityQueue.queueSize());
        System.out.println("\n\n");

        System.out.println("> Queue Peek");
        System.out.println(priorityQueue.peekPlayer().getUsername());
        System.out.println("\n\n");

        while (!priorityQueue.priorityQueue.isEmpty()) {
            Player player = priorityQueue.pollPlayer();
            System.out.println(player.getPermission() + " | " + player.getUsername());
        }
    }
}
