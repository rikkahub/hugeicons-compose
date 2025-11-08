package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Door02: ImageVector
    get() {
        if (_door02 != null) {
            return _door02!!
        }
        _door02 = ImageVector.Builder(
            name = "Door02",
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
        moveTo(5f, 22f)
        verticalLineTo(8f)
        curveTo(5f, 5.17157f, 5f, 3.75736f, 5.87868f, 2.87868f)
        curveTo(6.75736f, 2f, 8.17157f, 2f, 11f, 2f)
        horizontalLineTo(13f)
        curveTo(15.8284f, 2f, 17.2426f, 2f, 18.1213f, 2.87868f)
        curveTo(19f, 3.75736f, 19f, 5.17157f, 19f, 8f)
        verticalLineTo(22f)
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
        moveTo(15f, 12.01f)
        lineTo(15f, 12f)
        }
        }.build()

        return _door02!!
    }

private var _door02: ImageVector? = null
