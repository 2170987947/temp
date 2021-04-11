package org.example;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/10 13:13
 */
public class Client {
    public static void main(String[] args) {
        Institution bjHeadquarters, hnSubSchool, csTeachPost, xtTeachingPost;
        Unit tOffice1, tOffice2, tOffice3, tOffice4, aOffice1, aOffice2, aOffice3, aOffice4;
        bjHeadquarters = new Institution("北京总部");
        hnSubSchool = new Institution("湖南分校");
        csTeachPost = new Institution("长沙教学点");
        xtTeachingPost = new Institution("湘潭教学点");
        tOffice1 = new Office("北京教务办公室");
        tOffice2 = new Office("湖南教务办公室");
        tOffice3 = new Office("长沙教务办公室");
        tOffice4 = new Office("湘潭教务办公室");
        aOffice1 = new Office("北京行政办公室");
        aOffice2 = new Office("湖南行政办公室");
        aOffice3 = new Office("长沙行政办公室");
        aOffice4 = new Office("湘潭行政办公室");

        bjHeadquarters.add(hnSubSchool);
        bjHeadquarters.add(tOffice1);
        bjHeadquarters.add(aOffice1);

        hnSubSchool.add(csTeachPost);
        hnSubSchool.add(xtTeachingPost);
        hnSubSchool.add(tOffice2);
        hnSubSchool.add(aOffice2);

        csTeachPost.add(tOffice3);
        csTeachPost.add(aOffice3);

        xtTeachingPost.add(tOffice4);
        xtTeachingPost.add(aOffice4);

        bjHeadquarters.handleArchives();

    }
}
