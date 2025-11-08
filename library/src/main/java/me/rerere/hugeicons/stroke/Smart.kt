package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Smart: ImageVector
    get() {
        if (_smart != null) {
            return _smart!!
        }
        _smart = ImageVector.Builder(
            name = "Smart",
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
        moveTo(11f, 17.7844f)
        curveTo(13.6177f, 18.5609f, 15.9391f, 17.1496f, 17f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 9.01067f)
        curveTo(7f, 9.01067f, 8.40944f, 8.88341f, 9.19588f, 9.50798f)
        moveTo(9.19588f, 9.50798f)
        lineTo(8.93275f, 10.3427f)
        curveTo(8.82896f, 10.6719f, 9.10031f, 11f, 9.4764f, 11f)
        curveTo(9.87165f, 11f, 10.1327f, 10.6434f, 9.92918f, 10.3348f)
        curveTo(9.74877f, 10.0612f, 9.50309f, 9.75196f, 9.19588f, 9.50798f)
        moveTo(14f, 9.01067f)
        curveTo(14f, 9.01067f, 15.4094f, 8.88341f, 16.1959f, 9.50798f)
        moveTo(16.1959f, 9.50798f)
        lineTo(15.9328f, 10.3427f)
        curveTo(15.829f, 10.6719f, 16.1003f, 11f, 16.4764f, 11f)
        curveTo(16.8717f, 11f, 17.1327f, 10.6434f, 16.9292f, 10.3348f)
        curveTo(16.7488f, 10.0612f, 16.5031f, 9.75196f, 16.1959f, 9.50798f)
        }
        }.build()

        return _smart!!
    }

private var _smart: ImageVector? = null
