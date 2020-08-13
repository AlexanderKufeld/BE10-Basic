package de.telran;

import java.util.ArrayList;
import java.util.List;

public class SegmentsAndPoints {
    public List<Integer> getNumCover(List<Integer> points, List<Segment> segments) {
        List result = new ArrayList();
        for (int point : points) {
            int count = 0;
            for (Segment segment : segments) {
                if (point >= segment.left && point <= segment.right) {
                    count++;
                }
            }
            result.add(count);
        }
        return result;
    }
}
