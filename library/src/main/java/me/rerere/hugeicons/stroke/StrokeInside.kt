package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.StrokeInside: ImageVector
    get() {
        if (_strokeInside != null) {
            return _strokeInside!!
        }
        _strokeInside = ImageVector.Builder(
            name = "StrokeInside",
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
        moveTo(8f, 19f)
        curveTo(8f, 20.6569f, 6.65685f, 22f, 5f, 22f)
        curveTo(3.34315f, 22f, 2f, 20.6569f, 2f, 19f)
        curveTo(2f, 17.3431f, 3.34315f, 16f, 5f, 16f)
        curveTo(6.65685f, 16f, 8f, 17.3431f, 8f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 22f)
        horizontalLineTo(18f)
        curveTo(19.8856f, 22f, 20.8284f, 22f, 21.4142f, 21.4142f)
        curveTo(22f, 20.8284f, 22f, 19.8856f, 22f, 18f)
        verticalLineTo(17f)
        curveTo(22f, 15.1144f, 22f, 14.1716f, 21.4142f, 13.5858f)
        curveTo(20.8284f, 13f, 19.8856f, 13f, 18f, 13f)
        lineTo(15f, 13f)
        curveTo(13.1144f, 13f, 12.1716f, 13f, 11.5858f, 12.4142f)
        curveTo(11f, 11.8284f, 11f, 10.8856f, 11f, 9f)
        verticalLineTo(6f)
        curveTo(11f, 4.11438f, 11f, 3.17157f, 10.4142f, 2.58579f)
        curveTo(9.82843f, 2f, 8.88562f, 2f, 7f, 2f)
        lineTo(6f, 2f)
        curveTo(4.11438f, 2f, 3.17157f, 2f, 2.58579f, 2.58579f)
        curveTo(2f, 3.17157f, 2f, 4.11438f, 2f, 6f)
        verticalLineTo(13f)
        }
        }.build()

        return _strokeInside!!
    }

private var _strokeInside: ImageVector? = null
