package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WashingtonMonument: ImageVector
    get() {
        if (_washingtonMonument != null) {
            return _washingtonMonument!!
        }
        _washingtonMonument = ImageVector.Builder(
            name = "WashingtonMonument",
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
        moveTo(7f, 19f)
        lineTo(8.76762f, 6.62668f)
        curveTo(8.88311f, 5.81824f, 8.94085f, 5.41402f, 9.10135f, 5.04395f)
        curveTo(9.26184f, 4.67389f, 9.51749f, 4.35549f, 10.0288f, 3.71871f)
        lineTo(10.5858f, 3.02497f)
        curveTo(11.2524f, 2.34166f, 11.5858f, 2f, 12f, 2f)
        curveTo(12.4142f, 2f, 12.7475f, 2.34166f, 13.4142f, 3.02497f)
        lineTo(13.9712f, 3.71871f)
        curveTo(14.4825f, 4.35549f, 14.7382f, 4.67389f, 14.8987f, 5.04395f)
        curveTo(15.0591f, 5.41402f, 15.1169f, 5.81825f, 15.2324f, 6.62668f)
        lineTo(17f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 22f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 22f)
        lineTo(19.7812f, 21.6718f)
        curveTo(18.9093f, 20.3639f, 18.4733f, 19.71f, 17.81f, 19.355f)
        curveTo(17.1467f, 19f, 16.3608f, 19f, 14.7889f, 19f)
        horizontalLineTo(9.2111f)
        curveTo(7.63921f, 19f, 6.85326f, 19f, 6.18998f, 19.355f)
        curveTo(5.5267f, 19.71f, 5.09073f, 20.3639f, 4.2188f, 21.6718f)
        lineTo(4f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 6f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 19f)
        lineTo(12f, 13f)
        }
        }.build()

        return _washingtonMonument!!
    }

private var _washingtonMonument: ImageVector? = null
