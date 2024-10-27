#include <iostream>  
#include <queue>  
#include <vector>  
 
using namespace std;  
 
struct Point {  
    int x, y, distance;  
};  
 
int main() {  
    int R, C;  
    cin >> R >> C;  
 
    vector<vector<int>> maze(R, vector<int>(C));  
 
    for (int i = 0; i < R; ++i) {  
        for (int j = 0; j < C; ++j) {  
            cin >> maze[i][j];  
        }  
    }  
 
    int startX, startY, targetX, targetY;  
    cin >> startX >> startY;  
    cin >> targetX >> targetY;  
 
    vector<vector<vector<bool>>> visited(R, vector<vector<bool>>(C, vector<bool>(3, false)));  
 
    queue<Point> q;  
    q.push({startX, startY, 0});  
    visited[startX][startY][0] = true;  
 
    int dx[] = {-1, 1, 0, 0};  
    int dy[] = {0, 0, -1, 1};  
 
    while (!q.empty()) {  
        Point current = q.front();  
        q.pop();  
 
        if (current.x == targetX && current.y == targetY) {  
            cout << current.distance;  
            return 0;  
        }  
 
        for (int i = 0; i < 4; ++i) {  
            int nx = current.x + dx[i];  
            int ny = current.y + dy[i];  
 
            if (nx >= 0 && nx < R && ny >= 0 && ny < C) {  
                if (!visited[nx][ny][current.distance % 3]) {  
                    if (maze[nx][ny] == 1) {  
                        continue;  
                    }  
 
                    if (maze[nx][ny] == 3 && current.distance % 3 == 0) {  
                        continue;  
                    }  
 
                    visited[nx][ny][current.distance % 3] = true;  
                    q.push({nx, ny, current.distance + 1});  
                }  
            }  
        }  
    }  
 
    cout << "STUCK";  
 
    return 0;  
}