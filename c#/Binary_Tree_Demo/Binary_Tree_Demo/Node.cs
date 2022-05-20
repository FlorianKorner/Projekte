using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Binary_Tree_Demo
{
    class Node<T> where T : IComparable<T>
    {
        private readonly T _value;
        private Node<T> _left;
        private Node<T> _right;

        public Node(T value)
        {
            _value = value;

        }
        public void Add(T value)
        {
            if (_value.CompareTo(value) < 0)
            {
                if (_right == null) _right = new Node<T>(value);
                else _right.Add(value);
            }
            else
            {
                if (_left == null) _left = new Node<T>(value);
                else _left.Add(value);
            }
        }

        public List<T> ToOrderedList()
        {
            List<T> list = new List<T>();
            return TraverseTree(this, list);
        }
        private List<T> TraverseTree(Node<T> node, List<T> list)
        {
            if (node is null)
            {
                return list;
            }
            TraverseTree(node._left, list);
            list.Add(node._value);
            TraverseTree(node._right, list);
            return list;
        }
        public bool Exists(T value)
        {
            if (_value.CompareTo(value) > 0)
            {
                if (_left is null) return false;
                return _left.Exists(value);
            }
            else if (_value.CompareTo(value) < 0)
            {
                if (_right is null) return false;
                return _right.Exists(value);
            }
            else return true;
        }
    }
}