package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Doctor03: ImageVector
    get() {
        if (_doctor03 != null) {
            return _doctor03!!
        }
        _doctor03 = ImageVector.Builder(
            name = "Doctor03",
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
        moveTo(20f, 22.0002f)
        verticalLineTo(19.0002f)
        curveTo(20f, 16.1718f, 20f, 14.7576f, 19.1213f, 13.8789f)
        curveTo(18.2426f, 13.0002f, 16.8284f, 13.0002f, 14f, 13.0002f)
        lineTo(12f, 15.0002f)
        lineTo(10f, 13.0002f)
        curveTo(7.17157f, 13.0002f, 5.75736f, 13.0002f, 4.87868f, 13.8789f)
        curveTo(4f, 14.7576f, 4f, 16.1718f, 4f, 19.0002f)
        verticalLineTo(22.0002f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 6.50012f)
        verticalLineTo(5.50012f)
        curveTo(15.5f, 3.56713f, 13.933f, 2.00012f, 12f, 2.00012f)
        curveTo(10.067f, 2.00012f, 8.5f, 3.56713f, 8.5f, 5.50012f)
        verticalLineTo(6.50012f)
        curveTo(8.5f, 8.43312f, 10.067f, 10.0001f, 12f, 10.0001f)
        curveTo(13.933f, 10.0001f, 15.5f, 8.43312f, 15.5f, 6.50012f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 16.0001f)
        verticalLineTo(19.0001f)
        moveTo(17.5f, 17.5001f)
        lineTo(14.5f, 17.5001f)
        }
        }.build()

        return _doctor03!!
    }

private var _doctor03: ImageVector? = null
