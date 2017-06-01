package wangshq.a2017_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * @author wangshq
 *Given n points on a 2D plane, 
 *find the maximum number of points that lie on the same straight line.
 *
 */
public class MaxPointsOnALine {

	static class Point {
		int x;
		int y;

		Point() {
			x = 0;
			y = 0;
		}

		Point(int a, int b) {
			x = a;
			y = b;
		}
	}
	public static void main(String[] args) {
		//[(2,3),(3,3),(-5,3)]
		maxPoints(new Point[]{new Point(1,1),new Point(1,1),new Point(1,1)});
	}
	public static int maxPoints(Point[] points) {
		if(points.length <= 2){
			return points.length;
		}
		int max = 2;
		for (int i = 0; i < points.length; i++) {
			Point a = points[i];
			Map<Float, Integer> lineMap = new HashMap<Float, Integer>();
			int sameCount = 1;
			int czCount = 1;
			for (int j = i+1; j < points.length; j++) {
				Point b = points[j];
				int yC = b.y - a.y;
				int xC = b.x - a.x;
				
				
				if(yC == 0 && xC == 0){
					sameCount++;
				}else if(xC == 0){
					//说明是垂直的
					czCount++;
				}else{
					float key = 0;
					if(yC != 0){
						key = (float)yC/xC;
					}
					Integer count = lineMap.get(key);
					if(count == null ){
						lineMap.put(key, 1);
					}else{
						lineMap.put(key, count+1);
					}
				}
			}
			for (Entry<Float, Integer> line : lineMap.entrySet()) {
				int num = line.getValue()+sameCount;
				if(num > max){
					max = num;
				}
			}
			max = czCount+sameCount>max?czCount+sameCount:max;
		}
		return max;
	}
}
