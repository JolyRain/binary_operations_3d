package screen;

import math.Vector3;
import rasterization.buffer.ZValueResolver;
import third.Polygon;

import java.awt.*;

public class ScreenPolygon implements ZValueResolver {
    private Polygon polygon;
    private ScreenDepthPoint depthPoint1;
    private ScreenDepthPoint depthPoint2;
    private ScreenDepthPoint depthPoint3;
    private Color color;

    public ScreenPolygon(Polygon polygon, ScreenDepthPoint depthPoint1, ScreenDepthPoint depthPoint2, ScreenDepthPoint depthPoint3, Color color) {
        this.polygon = polygon;
        this.depthPoint1 = depthPoint1;
        this.depthPoint2 = depthPoint2;
        this.depthPoint3 = depthPoint3;
        this.color = color;
    }


    public ScreenPoint getScreenPoint1() {
        return depthPoint1.getScreenPoint();
    }

    public ScreenPoint getScreenPoint2() {
        return depthPoint2.getScreenPoint();
    }

    public ScreenPoint getScreenPoint3() {
        return depthPoint3.getScreenPoint();
    }

    public Polygon getPolygon() {
        return polygon;
    }

    public void setPolygon(Polygon polygon) {
        this.polygon = polygon;
    }

    public ScreenDepthPoint getDepthPoint1() {
        return depthPoint1;
    }

    public void setDepthPoint1(ScreenDepthPoint depthPoint1) {
        this.depthPoint1 = depthPoint1;
    }

    public ScreenDepthPoint getDepthPoint2() {
        return depthPoint2;
    }

    public void setDepthPoint2(ScreenDepthPoint depthPoint2) {
        this.depthPoint2 = depthPoint2;
    }

    public ScreenDepthPoint getDepthPoint3() {
        return depthPoint3;
    }

    public void setDepthPoint3(ScreenDepthPoint depthPoint3) {
        this.depthPoint3 = depthPoint3;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public float resolve(ScreenPoint point) {
        float a = polygon.getNormal().getX();
        float b = polygon.getNormal().getY();
        float c = polygon.getNormal().getZ();

        return 0;
    }
}
