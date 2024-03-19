import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Snakes extends JPanel implements Runnable, KeyListener {
    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;
    private static final int BLOCK_SIZE = 10;
    private static final int FPS = 3;
    private static final Random random = new Random();
    
    // Directions
    private static final int DIR_UP = 0;
    private static final int DIR_DOWN = 1;
    private static final int DIR_LEFT = 2;
    private static final int DIR_RIGHT = 3;
    
    // Colors
    private static final Color COLOR_BACKGROUND = Color.BLACK;
    private static final Color COLOR_SNAKE = Color.GREEN;
    private static final Color COLOR_FOOD = Color.RED;
    
    private JFrame frame;
    private Thread gameThread;
    private Snake snake;
    private Food food;
    private boolean running;
    
    public Snakes() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(COLOR_BACKGROUND);
        setFocusable(true);
        addKeyListener(this);
        
        frame = new JFrame("Snakes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(this);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public void start() {
        running = true;
        snake = new Snake();
        food = new Food();
        
        gameThread = new Thread(this);
        gameThread.start();
    }
    
    public void stop() {
        running = false;
        try {
            gameThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public void run() {
        long start, elapsed, wait;
        while (running) {
            start = System.nanoTime();
            
            // Update the game state
            snake.move();
            if (snake.collidesWith(food.getPosition())) {
                snake.grow();
                food = new Food();
            }
            if (snake.collidesWith(snake.getBody().get(0)) && snake.getBody().size() > 1) {
                stop();
            }
            
            // Repaint the screen
            repaint();
            
            // Wait for the next frame
            elapsed = System.nanoTime() - start;
            wait = 1000 / FPS - elapsed / 1000000;
            if (wait < 0) {
                wait = 0;
            }
            try {
                Thread.sleep(wait);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Draw the snake
        g.setColor(COLOR_SNAKE);
        for (Point segment : snake.getBody()) {
            g.fillRect(segment.x * BLOCK_SIZE, segment.y * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
        }
        
        // Draw the food
        g.setColor(COLOR_FOOD);
        g.fillRect(food.getPosition().x * BLOCK_SIZE, food.getPosition().y * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
    }
    
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                snake.setDirection(DIR_UP);
                break;
            case KeyEvent.VK_DOWN:
                snake.setDirection(DIR_DOWN);
                break;
            case KeyEvent.VK_LEFT:
                snake.setDirection(DIR_LEFT);
                break;
            case KeyEvent.VK_RIGHT:
                snake.setDirection(DIR_RIGHT);
                break;
                }
                }



                public void keyReleased(KeyEvent e) {}
                public void keyTyped(KeyEvent e) {}
                
                private class Snake {
                    private ArrayList<Point> body;
                    private int direction;
                    
                    public Snake() {
                        body = new ArrayList<>();
                        body.add(new Point(WIDTH / 2 / BLOCK_SIZE, HEIGHT / 2 / BLOCK_SIZE));
                        direction = DIR_RIGHT;
                    }
                    
                    public ArrayList<Point> getBody() {
                        return body;
                    }
                    
                    public void setDirection(int direction) {
                        if (Math.abs(this.direction - direction) != 2) {
                            this.direction = direction;
                        }
                    }
                    
                    public void move() {
                        Point head = body.get(0);
                        switch (direction) {
                            case DIR_UP:
                                body.add(0, new Point(head.x, head.y - 1));
                                break;
                            case DIR_DOWN:
                                body.add(0, new Point(head.x, head.y + 1));
                                break;
                            case DIR_LEFT:
                                body.add(0, new Point(head.x - 1, head.y));
                                break;
                            case DIR_RIGHT:
                                body.add(0, new Point(head.x + 1, head.y));
                                break;
                        }
                        body.remove(body.size() - 1);
                    }
                    
                    public void grow() {
                        Point tail = body.get(body.size() - 1);
                        switch (direction) {
                            case DIR_UP:
                                body.add(new Point(tail.x, tail.y + 1));
                                break;
                            case DIR_DOWN:
                                body.add(new Point(tail.x, tail.y - 1));
                                break;
                            case DIR_LEFT:
                                body.add(new Point(tail.x + 1, tail.y));
                                break;
                            case DIR_RIGHT:
                                body.add(new Point(tail.x - 1, tail.y));
                                break;
                        }
                    }
                    
                    public boolean collidesWith(Point point) {
                        for (Point segment : body) {
                            if (segment.equals(point)) {
                                return true;
                            }
                        }
                        return false;
                    }
                }
                
                private class Food {
                    private Point position;
                    
                    public Food() {
                        do {
                            position = new Point(random.nextInt(WIDTH / BLOCK_SIZE), random.nextInt(HEIGHT / BLOCK_SIZE));
                        } while (snake.collidesWith(position));
                    }
                    
                    public Point getPosition() {
                        return position;
                    }
                }
                
                public static void main(String[] args) {
                    Snakes game = new Snakes();
                    game.start();
                }
            }                














