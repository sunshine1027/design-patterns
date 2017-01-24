package com.sunshine1027.facade;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class DrawFacade {
    private Line straightLine;
    private Line curve;
    private Shape triangle;
    private Shape square;

    private DrawFacade() {
    }

    public void drawCurveAndSquare() {
        System.out.println("-------begin drawCurveAndSquare--------");
        curve.drawLine();
        square.drawShape();
        System.out.println("-------end drawCurveAndSquare--------\n");
    }

    public void drawStraightLineAndTriangle() {
        System.out.println("-------begin drawStraightLineAndTriangle--------");
        straightLine.drawLine();
        triangle.drawShape();
        System.out.println("-------end drawStraightLineAndTriangle--------\n");
    }

    public void drawCurveAndTriangle() {
        System.out.println("-------begin drawCurveAndTriangle--------");
        curve.drawLine();
        triangle.drawShape();
        System.out.println("-------end drawCurveAndTriangle--------\n");
    }

    public static class DrawFacadeBuilder {
        private Line straightLine;
        private Line curve;
        private Shape triangle;
        private Shape square;

        public DrawFacadeBuilder buildStraightLine(Line _straightLine) {
            this.setStraightLine(_straightLine);
            return this;
        }

        public DrawFacadeBuilder buildCurve(Line _curve) {
            this.setCurve(_curve);
            return this;
        }

        public DrawFacadeBuilder buildTriangle(Shape _triangle) {
            this.setTriangle(_triangle);
            return this;
        }

        public DrawFacadeBuilder buildSquare(Shape _square) {
            this.setSquare(_square);
            return this;
        }

        public DrawFacade build() {
            DrawFacade drawFacade = new DrawFacade();
            drawFacade.setCurve(getCurve());
            drawFacade.setSquare(getSquare());
            drawFacade.setStraightLine(getStraightLine());
            drawFacade.setTriangle(getTriangle());
            return drawFacade;
        }

        public Line getStraightLine() {
            return straightLine;
        }

        public void setStraightLine(Line straightLine) {
            this.straightLine = straightLine;
        }

        public Line getCurve() {
            return curve;
        }

        public void setCurve(Line curve) {
            this.curve = curve;
        }

        public Shape getTriangle() {
            return triangle;
        }

        public void setTriangle(Shape triangle) {
            this.triangle = triangle;
        }

        public Shape getSquare() {
            return square;
        }

        public void setSquare(Shape square) {
            this.square = square;
        }
    }


    private void setStraightLine(Line straightLine) {
        this.straightLine = straightLine;
    }


    private void setCurve(Line curve) {
        this.curve = curve;
    }



    private void setTriangle(Shape triangle) {
        this.triangle = triangle;
    }


    private void setSquare(Shape square) {
        this.square = square;
    }
}
