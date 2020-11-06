package main

import "fmt"

func main() {

	_a1 := []int{2, 1}
	_a2 := []int{9, 3, 6, 1, 8, 4, 5, 2, 7, 0}
	_a3 := []int{3, 5, 4890, 2, 568, 3, 6, 56, 4, 3, 1, 34789, 23, 12, 13, 4, 23, 123,
		3, 72, 4, 274, 12, 34, 7861, 463, 65, 3435, 13, 453, 75, 34567}

	sort(_a1)
	sort(_a2)
	sort(_a3)

	show(_a1)
	show(_a2)
	show(_a3)

}

func sort(array []int) {

	l := len(array)

	for i := 0; i < l; i++ {

		menor := i

		for j := i; j < l; j++ {
			if array[j] < array[menor] {
				menor = j
			}
		}

		tmp := array[i]
		array[i] = array[menor]
		array[menor] = tmp
	}
}

func show(array []int) {
	l := len(array)
	fmt.Print("[")
	for i := 0; i < l; i++ {
		fmt.Print(array[i])
		if i < l-1 {
			fmt.Print(", ")
		}
	}
	fmt.Println("]")
}
