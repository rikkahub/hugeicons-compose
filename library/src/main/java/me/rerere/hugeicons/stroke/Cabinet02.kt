package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cabinet02: ImageVector
    get() {
        if (_cabinet02 != null) {
            return _cabinet02!!
        }
        _cabinet02 = ImageVector.Builder(
            name = "Cabinet02",
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
        moveTo(6.5f, 16f)
        lineTo(5f, 20f)
        moveTo(17.5f, 16f)
        lineTo(19f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 4f)
        horizontalLineTo(3f)
        lineTo(3.21498f, 9.15955f)
        curveTo(3.3499f, 12.3977f, 3.41736f, 14.0167f, 4.28607f, 15.0084f)
        curveTo(5.15478f, 16f, 6.50569f, 16f, 9.2075f, 16f)
        horizontalLineTo(14.7925f)
        curveTo(17.4943f, 16f, 18.8452f, 16f, 19.7139f, 15.0084f)
        curveTo(20.5826f, 14.0167f, 20.6501f, 12.3977f, 20.785f, 9.15955f)
        lineTo(21f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 16f)
        verticalLineTo(4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 4f)
        horizontalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.99981f, 10f)
        lineTo(9.00879f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.9998f, 10f)
        lineTo(15.0088f, 10f)
        }
        }.build()

        return _cabinet02!!
    }

private var _cabinet02: ImageVector? = null
