package org.acme.graph.model;

import java.util.ArrayList;
import java.util.List;

public class Path {
    private List<Edge> edges= new ArrayList<>();

    private double lenght;

    Path(List<Edge> edges){
    this.edges=edges;
    this.lenght=this.getLenght();


    }



    public List<Edge> getEdges() {
        return edges;
    }

    public double getLenght(){
    double l =0;
        for (Edge edge : edges){
            l += edge.getCost();
        }
        return l;
    }

}
