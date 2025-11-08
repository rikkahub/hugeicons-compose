package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TextCreation: ImageVector
    get() {
        if (_textCreation != null) {
            return _textCreation!!
        }
        _textCreation = ImageVector.Builder(
            name = "TextCreation",
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
        moveTo(20f, 18f)
        verticalLineTo(6f)
        moveTo(6f, 20f)
        horizontalLineTo(18f)
        moveTo(18f, 4f)
        horizontalLineTo(6f)
        moveTo(4f, 6f)
        verticalLineTo(18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.99901f, 10f)
        curveTo(7.70512f, 8.43128f, 8.73403f, 8.05948f, 11.9564f, 8f)
        moveTo(11.9564f, 8f)
        curveTo(14.9534f, 8.06735f, 16.1887f, 8.30534f, 15.9138f, 10f)
        moveTo(11.9564f, 8f)
        verticalLineTo(16f)
        moveTo(10.4724f, 16f)
        horizontalLineTo(13.4405f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 2f)
        horizontalLineTo(19f)
        curveTo(18.4477f, 2f, 18f, 2.44772f, 18f, 3f)
        verticalLineTo(5f)
        curveTo(18f, 5.55228f, 18.4477f, 6f, 19f, 6f)
        horizontalLineTo(21f)
        curveTo(21.5523f, 6f, 22f, 5.55228f, 22f, 5f)
        verticalLineTo(3f)
        curveTo(22f, 2.44772f, 21.5523f, 2f, 21f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 2f)
        horizontalLineTo(3f)
        curveTo(2.44772f, 2f, 2f, 2.44772f, 2f, 3f)
        verticalLineTo(5f)
        curveTo(2f, 5.55228f, 2.44772f, 6f, 3f, 6f)
        horizontalLineTo(5f)
        curveTo(5.55228f, 6f, 6f, 5.55228f, 6f, 5f)
        verticalLineTo(3f)
        curveTo(6f, 2.44772f, 5.55228f, 2f, 5f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 18f)
        horizontalLineTo(19f)
        curveTo(18.4477f, 18f, 18f, 18.4477f, 18f, 19f)
        verticalLineTo(21f)
        curveTo(18f, 21.5523f, 18.4477f, 22f, 19f, 22f)
        horizontalLineTo(21f)
        curveTo(21.5523f, 22f, 22f, 21.5523f, 22f, 21f)
        verticalLineTo(19f)
        curveTo(22f, 18.4477f, 21.5523f, 18f, 21f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 18f)
        horizontalLineTo(3f)
        curveTo(2.44772f, 18f, 2f, 18.4477f, 2f, 19f)
        verticalLineTo(21f)
        curveTo(2f, 21.5523f, 2.44772f, 22f, 3f, 22f)
        horizontalLineTo(5f)
        curveTo(5.55228f, 22f, 6f, 21.5523f, 6f, 21f)
        verticalLineTo(19f)
        curveTo(6f, 18.4477f, 5.55228f, 18f, 5f, 18f)
        }
        }.build()

        return _textCreation!!
    }

private var _textCreation: ImageVector? = null
