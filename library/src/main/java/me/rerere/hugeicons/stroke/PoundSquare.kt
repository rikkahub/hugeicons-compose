package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PoundSquare: ImageVector
    get() {
        if (_poundSquare != null) {
            return _poundSquare!!
        }
        _poundSquare = ImageVector.Builder(
            name = "PoundSquare",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.77027f, 2.5f, 5.6554f, 3.69797f, 4.25276f)
        curveTo(3.86808f, 4.05358f, 4.05358f, 3.86808f, 4.25276f, 3.69797f)
        curveTo(5.6554f, 2.5f, 7.77027f, 2.5f, 12f, 2.5f)
        curveTo(16.2297f, 2.5f, 18.3446f, 2.5f, 19.7472f, 3.69797f)
        curveTo(19.9464f, 3.86808f, 20.1319f, 4.05358f, 20.302f, 4.25276f)
        curveTo(21.5f, 5.6554f, 21.5f, 7.77027f, 21.5f, 12f)
        curveTo(21.5f, 16.2297f, 21.5f, 18.3446f, 20.302f, 19.7472f)
        curveTo(20.1319f, 19.9464f, 19.9464f, 20.1319f, 19.7472f, 20.302f)
        curveTo(18.3446f, 21.5f, 16.2297f, 21.5f, 12f, 21.5f)
        curveTo(7.77027f, 21.5f, 5.6554f, 21.5f, 4.25276f, 20.302f)
        curveTo(4.05358f, 20.1319f, 3.86808f, 19.9464f, 3.69797f, 19.7472f)
        curveTo(2.5f, 18.3446f, 2.5f, 16.2297f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.0221f, 10.2342f)
        curveTo(14.979f, 9.65426f, 14.6508f, 8.24919f, 13.3893f, 7.73006f)
        curveTo(11.8126f, 7.08115f, 9.73629f, 7.89773f, 9.54202f, 10.0011f)
        curveTo(9.45087f, 10.988f, 9.96203f, 12.0228f, 10.7048f, 12.534f)
        curveTo(11.3873f, 13.0037f, 12.4229f, 12.98f, 13.3893f, 12.98f)
        horizontalLineTo(8.02637f)
        moveTo(11.266f, 12.98f)
        curveTo(11.0842f, 13.6694f, 10.0866f, 15.6514f, 8.49675f, 16.4785f)
        horizontalLineTo(14.2823f)
        curveTo(14.5061f, 16.4785f, 15.1376f, 16.5331f, 16.0318f, 15.9331f)
        }
        }.build()

        return _poundSquare!!
    }

private var _poundSquare: ImageVector? = null
