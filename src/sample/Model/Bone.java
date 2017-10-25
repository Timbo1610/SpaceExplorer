package sample.Model;

public class Bone {

    SkeletonNode from;
    SkeletonNode to;
    Vector direction;

    public Bone(SkeletonNode from, SkeletonNode to)
    {
        this.from = from;
        this.to = to;
    }

}
