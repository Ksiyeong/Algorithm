import java.util.ArrayList;

public class TreeBFS {
    public static void main(String[] args) {
        TreeBFS.tree root = new TreeBFS.tree("1");
        TreeBFS.tree rootChild1 = root.addChildNode(new TreeBFS.tree("2"));
        TreeBFS.tree rootChild2 = root.addChildNode(new TreeBFS.tree("3"));
        TreeBFS.tree leaf1 = rootChild1.addChildNode(new TreeBFS.tree("4"));
        TreeBFS.tree leaf2 = rootChild1.addChildNode(new TreeBFS.tree("5"));
        ArrayList<String> output = bfs(root);
        System.out.println(output); // --> ["1", "2", "3", "4", "5"]

        leaf1.addChildNode(new TreeBFS.tree("6"));
        rootChild2.addChildNode(new TreeBFS.tree("7"));
        output = bfs(root);
        System.out.println(output); // --> ["1", "2", "3", "4", "5", "7", "6"]
    }

    public static ArrayList<String> bfs(tree node) {
        // TODO:
        ArrayList<String> result = new ArrayList<>();
        ArrayList<tree> tmp = new ArrayList<>();
        tmp.add(node);

        while (tmp.size() > 0) {
            tree now = tmp.remove(0);

            result.add(now.getValue());

            if (now.getChildrenNode() != null) {
                tmp.addAll(now.getChildrenNode());
            }
        }

        return result;
    }

    //아래 클래스의 내용은 수정하지 말아야 합니다.
    public static class tree {
        private String value;
        private ArrayList<tree> children;

        public tree(String data) {
            this.value = data;
            this.children = null;
        }

        public tree addChildNode(tree node) {
            if (children == null) children = new ArrayList<>();
            children.add(node);
            return children.get(children.size() - 1);
        }

        public String getValue() {      //현재 노드의 데이터를 반환
            return value;
        }

        public ArrayList<tree> getChildrenNode() {
            return children;
        }
    }
}
