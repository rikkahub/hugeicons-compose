package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Move: ImageVector
    get() {
        if (_move != null) {
            return _move!!
        }
        _move = ImageVector.Builder(
            name = "Move",
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
        moveTo(12f, 3.00006f)
        verticalLineTo(9.00006f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 12.0001f)
        horizontalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 12.0001f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 21.0001f)
        verticalLineTo(14.5001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 6f)
        lineTo(10.705f, 4.04824f)
        curveTo(11.3155f, 3.34941f, 11.6207f, 3f, 12f, 3f)
        curveTo(12.3793f, 3f, 12.6845f, 3.34941f, 13.295f, 4.04824f)
        lineTo(15f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 18f)
        lineTo(13.295f, 19.9518f)
        curveTo(12.6845f, 20.6506f, 12.3793f, 21f, 12f, 21f)
        curveTo(11.6207f, 21f, 11.3155f, 20.6506f, 10.705f, 19.9518f)
        lineTo(9f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 9f)
        lineTo(19.9518f, 10.705f)
        curveTo(20.6506f, 11.3155f, 21f, 11.6207f, 21f, 12f)
        curveTo(21f, 12.3793f, 20.6506f, 12.6845f, 19.9518f, 13.295f)
        lineTo(18f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 15f)
        lineTo(4.04824f, 13.295f)
        curveTo(3.34941f, 12.6845f, 3f, 12.3793f, 3f, 12f)
        curveTo(3f, 11.6207f, 3.34941f, 11.3155f, 4.04824f, 10.705f)
        lineTo(6f, 9f)
        }
        }.build()

        return _move!!
    }

private var _move: ImageVector? = null
