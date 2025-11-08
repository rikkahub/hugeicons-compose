package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Suspicious: ImageVector
    get() {
        if (_suspicious != null) {
            return _suspicious!!
        }
        _suspicious = ImageVector.Builder(
            name = "Suspicious",
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
        moveTo(9f, 16.9998f)
        curveTo(9.83563f, 16.372f, 10.8744f, 16f, 12f, 16f)
        curveTo(13.1256f, 16f, 14.1644f, 16.372f, 15f, 16.9998f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 8.01067f)
        curveTo(7f, 8.01067f, 8.40944f, 7.88341f, 9.19588f, 8.50798f)
        moveTo(9.19588f, 8.50798f)
        lineTo(8.93275f, 9.34267f)
        curveTo(8.82896f, 9.67191f, 9.10031f, 10f, 9.4764f, 10f)
        curveTo(9.87165f, 10f, 10.1327f, 9.64338f, 9.92918f, 9.33476f)
        curveTo(9.74877f, 9.06118f, 9.50309f, 8.75196f, 9.19588f, 8.50798f)
        moveTo(14f, 8.01067f)
        curveTo(14f, 8.01067f, 15.4094f, 7.88341f, 16.1959f, 8.50798f)
        moveTo(16.1959f, 8.50798f)
        lineTo(15.9328f, 9.34267f)
        curveTo(15.829f, 9.67191f, 16.1003f, 10f, 16.4764f, 10f)
        curveTo(16.8717f, 10f, 17.1327f, 9.64338f, 16.9292f, 9.33476f)
        curveTo(16.7488f, 9.06118f, 16.5031f, 8.75196f, 16.1959f, 8.50798f)
        }
        }.build()

        return _suspicious!!
    }

private var _suspicious: ImageVector? = null
