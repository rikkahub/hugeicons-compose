package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ListTodo: ImageVector
    get() {
        if (_listTodo != null) {
            return _listTodo!!
        }
        _listTodo = ImageVector.Builder(
            name = "ListTodo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12.9961f, 6f)
            lineTo(20.9961f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12.9961f, 12f)
            lineTo(20.9961f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12.9961f, 18f)
            lineTo(20.9961f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(4.23073f, 19.3478f)
            curveTo(4.59827f, 19.5f, 5.06421f, 19.5f, 5.99609f, 19.5f)
            curveTo(6.92798f, 19.5f, 7.39392f, 19.5f, 7.76146f, 19.3478f)
            curveTo(8.25152f, 19.1448f, 8.64086f, 18.7554f, 8.84385f, 18.2654f)
            curveTo(8.99609f, 17.8978f, 8.99609f, 17.4319f, 8.99609f, 16.5f)
            curveTo(8.99609f, 15.5681f, 8.99609f, 15.1022f, 8.84385f, 14.7346f)
            curveTo(8.64086f, 14.2446f, 8.25152f, 13.8552f, 7.76146f, 13.6522f)
            curveTo(7.39392f, 13.5f, 6.92798f, 13.5f, 5.99609f, 13.5f)
            curveTo(5.06421f, 13.5f, 4.59827f, 13.5f, 4.23073f, 13.6522f)
            curveTo(3.74067f, 13.8552f, 3.35132f, 14.2446f, 3.14833f, 14.7346f)
            curveTo(2.99609f, 15.1022f, 2.99609f, 15.5681f, 2.99609f, 16.5f)
            curveTo(2.99609f, 17.4319f, 2.99609f, 17.8978f, 3.14833f, 18.2654f)
            curveTo(3.35132f, 18.7554f, 3.74067f, 19.1448f, 4.23073f, 19.3478f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2.99609f, 7.16667f)
            curveTo(2.99609f, 7.16667f, 3.74609f, 7.16667f, 4.49609f, 8.5f)
            curveTo(4.49609f, 8.5f, 6.87845f, 5.16667f, 8.99609f, 4.5f)
        }
        }.build()

        return _listTodo!!
    }

private var _listTodo: ImageVector? = null
