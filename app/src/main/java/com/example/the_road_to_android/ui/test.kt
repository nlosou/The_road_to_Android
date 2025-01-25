package com.example.the_road_to_android.ui

import java.util.Scanner



fun main() {
    // 从命令行读取输入
    val scanner = Scanner(System.`in`)

    // 提示用户输入矩阵
    println("请输入矩阵（每行一个，输入空行结束）：")
    val matrix = mutableListOf<List<Char>>()
    while (scanner.hasNextLine()) {
        val line = scanner.nextLine().trim()
        if (line.isEmpty()) {
            break
        }
        matrix.add(line.map { it })
    }

    // 检查矩阵是否为空
    if (matrix.isEmpty()) {
        println("矩阵为空，无法进行计算。")
        return
    }

    // 获取矩阵的行数和列数
    val rows = matrix.size
    val cols = matrix[0].size

    // 定义目标模式
    val target = listOf('2', '0', '2', '0')

    // 计数器
    var count = 0

    // 检查行
    for (i in 0 until rows) {
        for (j in 0 until cols - 3) { // 确保有足够的长度
            if (matrix[i].subList(j, j + 4) == target) {
                count++
            }
        }
    }

    // 检查列
    for (j in 0 until cols) {
        for (i in 0 until rows - 3) { // 确保有足够的高度
            val column = mutableListOf<Char>()
            for (k in i until i + 4) {
                column.add(matrix[k][j])
            }
            if (column == target) {
                count++
            }
        }
    }

    // 检查对角线
    for (i in 0 until rows - 3) {
        for (j in 0 until cols - 3) { // 确保有足够的对角线长度
            val diagonal = mutableListOf<Char>()
            for (k in 0 until 4) {
                diagonal.add(matrix[i + k][j + k])
            }
            if (diagonal == target) {
                count++
            }
        }
    }

    // 输出结果
    println("总共有 $count 个 2020")
}