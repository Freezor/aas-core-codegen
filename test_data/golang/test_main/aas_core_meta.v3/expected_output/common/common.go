// Package common provides common functions shared among the other packages.
package common

// This code has been automatically generated by aas-core-codegen.
// Do NOT edit or append.

import (
	"strings"
)

func Concat(
	parts ...string,
) string {
	b := new(strings.Builder)
	for _, part := range parts {
		b.WriteString(part)
	}
	return b.String()
}

// Check if the map contains the given key.
func MapContains[K comparable, V any](m map[K]V, k K) bool {
	_, ok := m[k]
	return ok
}

// Check if any of the elements satisfy the condition.
func Some[V any](condition func(V) bool, l []V) bool {
	ok := false
	for _, v := range l {
		ok = ok || condition(v)
	}
	return ok
}

// Check if all the elements satisfy the condition.
func All[V any](condition func(V) bool, l []V) bool {
	for _, v := range l {
		if !condition(v) {
			return false
		}
	}
	return true
}

// Check if some of the elements in the given range satisfy the condition.
func SomeRange(condition func(int) bool, start int, end int) bool {
	for i := start; i < end; i++ {
		if condition(i) {
			return true
		}
	}
	return false
}

// Check if all the elements in the given range satisfy the condition.
func AllRange(condition func(int) bool, start int, end int) bool {
	for i := start; i < end; i++ {
		if !condition(i) {
			return false
		}
	}
	return true
}

// Create a new instance of the `value` and return the pointer to it.
func NewBool(value bool) *bool {
	return &value
}

// Create a new instance of the `value` and return the pointer to it.
func NewInt(value int) *int {
	return &value
}

// Create a new instance of the `value` and return the pointer to it.
func NewInt64(value int64) *int64 {
	return &value
}

// Create a new instance of the `value` and return the pointer to it.
func NewFloat64(value float64) *float64 {
	return &value
}

// Create a new instance of the `value` and return the pointer to it.
func NewString(value string) *string {
	return &value
}

// This code has been automatically generated by aas-core-codegen.
// Do NOT edit or append.