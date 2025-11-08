package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Manager: ImageVector
    get() {
        if (_manager != null) {
            return _manager!!
        }
        _manager = ImageVector.Builder(
            name = "Manager",
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
        verticalLineTo(17.0002f)
        curveTo(20f, 15.1146f, 20f, 14.1718f, 19.4142f, 13.586f)
        curveTo(18.8284f, 13.0002f, 17.8856f, 13.0002f, 16f, 13.0002f)
        lineTo(12f, 22.0002f)
        lineTo(8f, 13.0002f)
        curveTo(6.11438f, 13.0002f, 5.17157f, 13.0002f, 4.58579f, 13.586f)
        curveTo(4f, 14.1718f, 4f, 15.1146f, 4f, 17.0002f)
        verticalLineTo(22.0002f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 15f)
        lineTo(11.5f, 19f)
        lineTo(12f, 20.5f)
        lineTo(12.5f, 19f)
        lineTo(12f, 15f)
        moveTo(12f, 15f)
        lineTo(11f, 13f)
        horizontalLineTo(13f)
        lineTo(12f, 15f)
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
        }.build()

        return _manager!!
    }

private var _manager: ImageVector? = null
