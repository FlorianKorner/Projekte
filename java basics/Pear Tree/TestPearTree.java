/**
 * tis class tests the funktionality of the "PearTree"
 * 
 * @author Florian Körner 
 * @Date 19.11.2019
 */
public class TestPearTree
{
    /**
     * Tests the PearTree
     */
    public void TestPearTree()
    {
        PearTree p =new PearTree();
        p.water(1);
        p.print();
        PearTree a =new PearTree();
        a.water(50);
        a.print();
        PearTree s =new PearTree();
        s.water(200);
        s.print();
        PearTree d =new PearTree();
        d.water(100);
        d.print();
    }
}
