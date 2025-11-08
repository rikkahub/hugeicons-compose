package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CoffeeBeans: ImageVector
    get() {
        if (_coffeeBeans != null) {
            return _coffeeBeans!!
        }
        _coffeeBeans = ImageVector.Builder(
            name = "CoffeeBeans",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 5.64868f)
        curveTo(10.158f, 2.80666f, 6.20842f, 2.1484f, 4.17841f, 4.17841f)
        moveTo(4.17841f, 4.17841f)
        curveTo(2.1484f, 6.20842f, 2.80666f, 10.158f, 5.64868f, 13f)
        moveTo(4.17841f, 4.17841f)
        curveTo(4.42346f, 5.40363f, 5.72249f, 8.07432f, 8.95707f, 8.95647f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.21114f, 19.7889f)
        curveTo(11.2975f, 21.8753f, 15.3568f, 21.1987f, 18.2778f, 18.2778f)
        curveTo(21.1987f, 15.3568f, 21.8753f, 11.2975f, 19.7889f, 9.21114f)
        moveTo(9.21114f, 19.7889f)
        curveTo(7.12475f, 17.7025f, 7.80129f, 13.6432f, 10.7222f, 10.7222f)
        curveTo(13.6432f, 7.80129f, 17.7025f, 7.12475f, 19.7889f, 9.21114f)
        moveTo(9.21114f, 19.7889f)
        curveTo(10.7222f, 19.2852f, 13.5829f, 18.8717f, 14.8781f, 14.1225f)
        curveTo(15.7847f, 10.7981f, 18.5296f, 9.46299f, 19.7889f, 9.21114f)
        }
        }.build()

        return _coffeeBeans!!
    }

private var _coffeeBeans: ImageVector? = null
