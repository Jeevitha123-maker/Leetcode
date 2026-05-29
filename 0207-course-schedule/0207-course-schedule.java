class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        int indegree[]=new int[numCourses];
        for(int []pre:prerequisites){
            adj.get(pre[1]).add(pre[0]);
            indegree[pre[0]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        int finish=0;
        while(!q.isEmpty()){
            int temp=q.poll();
            finish++;
            for(int neigh:adj.get(temp)){
                indegree[neigh]--;
                if(indegree[neigh]==0){
                    q.offer(neigh);
                }
            }
        }
        return finish==numCourses;
    }
}