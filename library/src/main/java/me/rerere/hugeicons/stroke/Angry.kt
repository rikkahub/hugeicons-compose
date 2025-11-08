package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Angry: ImageVector
    get() {
        if (_angry != null) {
            return _angry!!
        }
        _angry = ImageVector.Builder(
            name = "Angry",
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
        moveTo(8f, 17f)
        curveTo(8.91212f, 15.7856f, 10.3643f, 15f, 12f, 15f)
        curveTo(13.6357f, 15f, 15.0879f, 15.7856f, 16f, 17f)
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
        moveTo(17f, 9.01067f)
        curveTo(17f, 9.01067f, 15.5906f, 8.88341f, 14.8041f, 9.50798f)
        moveTo(14.8041f, 9.50798f)
        lineTo(15.0672f, 10.3427f)
        curveTo(15.171f, 10.6719f, 14.8997f, 11f, 14.5236f, 11f)
        curveTo(14.1283f, 11f, 13.8673f, 10.6434f, 14.0708f, 10.3348f)
        curveTo(14.2512f, 10.0612f, 14.4969f, 9.75196f, 14.8041f, 9.50798f)
        }
        }.build()

        return _angry!!
    }

private var _angry: ImageVector? = null
