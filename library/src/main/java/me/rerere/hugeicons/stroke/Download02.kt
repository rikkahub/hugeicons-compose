package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Download02: ImageVector
    get() {
        if (_download02 != null) {
            return _download02!!
        }
        _download02 = ImageVector.Builder(
            name = "Download02",
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
        moveTo(16.0001f, 12f)
        curveTo(16.0001f, 12f, 13.0542f, 16f, 12.0001f, 16f)
        curveTo(10.946f, 16f, 8.00012f, 12f, 8.00012f, 12f)
        moveTo(12.0001f, 15.5f)
        lineTo(12.0001f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.0001f, 8f)
        curveTo(19.2093f, 8f, 21.0001f, 9.79086f, 21.0001f, 12f)
        verticalLineTo(14.5f)
        curveTo(21.0001f, 16.8346f, 21.0001f, 18.0019f, 20.5278f, 18.8856f)
        curveTo(20.1549f, 19.5833f, 19.5834f, 20.1547f, 18.8857f, 20.5277f)
        curveTo(18.0021f, 21f, 16.8348f, 21f, 14.5001f, 21f)
        horizontalLineTo(9.50052f)
        curveTo(7.16551f, 21f, 5.99801f, 21f, 5.11426f, 20.5275f)
        curveTo(4.41677f, 20.1546f, 3.84547f, 19.5834f, 3.47258f, 18.8859f)
        curveTo(3.00012f, 18.0021f, 3.00012f, 16.8346f, 3.00012f, 14.4996f)
        verticalLineTo(11.999f)
        curveTo(3.00067f, 9.79114f, 4.78999f, 8.00125f, 6.99785f, 8f)
        horizontalLineTo(7.00012f)
        }
        }.build()

        return _download02!!
    }

private var _download02: ImageVector? = null
