package ru.netology.nmedia

    fun short(number: Number): String {
        return if (number in 1..999) {
            number.toString()
        } else if (number in 1000..1099) {
            (number.toInt() / 1000).toString() + "K"
        } else if (number in 1100..9999) {
            number.toString()[0].toString() + "." + number.toString()[1].toString() + "K"
        } else if (number in 10_000..99_999) {
            number.toString()[0].toString() + number.toString()[1].toString() + "K"
        } else if (number in 100_000..999_999) {
            number.toString()[0].toString() + number.toString()[1].toString() + number.toString()[2].toString() + "K"
        } else if (number in 1_000_000..999_999_999) {
            number.toString()[0].toString() + "." + number.toString()[1].toString() + "M"
        } else ""
    }
