public class binarysearch {

    /**
     *  node 
     */
    public class  node  {

        int key;
        node left;
        node right;

        node(int key){
            this.key=key;
            left=null;
            right=null;
        }    
    }
node root;
    binarysearch(){
        root=null;
    }

    public node insert(int key, node root){
        if (root==null){
            root=new node(key);
            return root;
        }else if(key >root.key){
            root.right=insert(key, root.right);

        }else{
            root.left=insert(key, root.left);
        }

        return root;
    }
    
        public boolean search(int key,node root){

            if (root==null){
                return false;
            }else if (root.key==key){
                return true;
            }else if (key>root.key){
                return search(key,root.right);
            }else{
                return search(key, root.left);
            }

        }
    }
    

