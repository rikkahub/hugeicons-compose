package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Gravity: ImageVector
    get() {
        if (_gravity != null) {
            return _gravity!!
        }
        _gravity = ImageVector.Builder(
            name = "Gravity",
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
        moveTo(12f, 22f)
        curveTo(15.3137f, 22f, 18f, 19.3137f, 18f, 16f)
        curveTo(18f, 12.6863f, 15.3137f, 10f, 12f, 10f)
        curveTo(8.68629f, 10f, 6f, 12.6863f, 6f, 16f)
        curveTo(6f, 19.3137f, 8.68629f, 22f, 12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 2f)
        verticalLineTo(4f)
        moveTo(17f, 2f)
        verticalLineTo(4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.0006f, 2f)
        verticalLineTo(7.5f)
        moveTo(12.0006f, 7.5f)
        curveTo(12.5005f, 7.4925f, 13.135f, 6.56222f, 14.0605f, 5.50277f)
        moveTo(12.0006f, 7.5f)
        curveTo(11.5005f, 7.4925f, 11.1849f, 6.81248f, 10.0605f, 5.50277f)
        }
        }.build()

        return _gravity!!
    }

private var _gravity: ImageVector? = null
