package com.nerydlg.daily.coding.problems.hard;

public class ReachingPoints {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        // we are going to iterate until our target
        // be equal to our point the search is being doing
        // backwards
        if(sx == tx && sy == ty) {
            return true;
        }
        // if tx is lower than our starting point
        // we are out
        if(sx > tx || sy > ty) {
            return false;
        }
        // if x's are equal lets see if we can reach Y
        if(sx == tx) {
            return (ty - sy) % sx == 0;
        }
        // if y's are equal lets see if we can reach X
        if(sy == ty) {
            return (tx - sx) % sy == 0;
        }
        // if tx is higher then we are going to substract ty
        // since module is a repeated substraction we can apply module
        if(tx > ty) {
            return reachingPoints(sx, sy, tx % ty, ty);
            // if ty is higher then we are going to substract tx
            // since module is a repeated substraction we can apply module
        } else if(ty > tx) {
            return reachingPoints(sx, sy, tx, ty % tx);
        } else {
            // if both are equal there is no point on continue searching
            return false;
        }
    }
}
