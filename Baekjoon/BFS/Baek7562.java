package Baekjoon.BFS;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Night {
    int x;
    int y;
    int stack;

    public Night(int y, int x, int stack) {
        this.x = x;
        this.y = y;
        this.stack = stack;
    }

}

public class Main {
    private static int[] dx = {-2, -1, -2, -1, 1, 2, 2, 1};
    private static int[] dy = {-1, -2, 1, 2, -2, -1, 1, 2};

    public static int bfs(Night cp, Night lp, int size) {
        Queue<Night> q = new LinkedList<>();
        boolean[][] visited = new boolean[size][size];
        q.add(cp);
        visited[cp.y][cp.x] = true;

        while (!q.isEmpty()) {
            Night n = q.poll();

            if(n.y == lp.y && n.x == lp.x) {
                return n.stack;
            }

            for(int i=0;i<8;i++) {
                int tx = n.x + dx[i];
                int ty = n.y + dy[i];

                if(tx < 0 || tx >= size || ty < 0 || ty >= size) {
                    continue;
                }

                if(!visited[ty][tx]) {
                    q.add(new Night(ty, tx, n.stack + 1));
                    visited[ty][tx] = true;
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++) {
            int size = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine());
            Night curPoint = new Night(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),0);

            st = new StringTokenizer(br.readLine());
            Night lastPoint = new Night(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),0);

            bw.write(bfs(curPoint, lastPoint, size) + "\n");
        }

        bw.flush();
        bw.close();

    }
}