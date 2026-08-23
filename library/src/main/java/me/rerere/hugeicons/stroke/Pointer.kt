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

val HugeIcons.Pointer: ImageVector
    get() {
        if (_pointer != null) {
            return _pointer!!
        }
        _pointer = ImageVector.Builder(
            name = "Pointer",
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
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(11.4929f, 9f)
            verticalLineTo(11.4211f)
            moveTo(11.4929f, 9f)
            verticalLineTo(4f)
            curveTo(11.4929f, 3.17157f, 10.8213f, 2.5f, 9.99289f, 2.5f)
            curveTo(9.16446f, 2.5f, 8.49289f, 3.17157f, 8.49289f, 4f)
            verticalLineTo(14f)
            lineTo(6.18518f, 11.8369f)
            curveTo(5.38668f, 11.238f, 4.24541f, 11.4616f, 3.73188f, 12.3174f)
            curveTo(3.40149f, 12.8681f, 3.41319f, 13.5587f, 3.76205f, 14.0979f)
            lineTo(6.32173f, 18.0095f)
            curveTo(7.39715f, 19.6529f, 7.93486f, 20.4746f, 8.74311f, 20.9492f)
            curveTo(8.82434f, 20.9969f, 8.90722f, 21.0417f, 8.99161f, 21.0836f)
            curveTo(9.83135f, 21.5f, 10.8133f, 21.5f, 12.7773f, 21.5f)
            horizontalLineTo(13.4925f)
            curveTo(16.3015f, 21.5f, 17.7059f, 21.5f, 18.7148f, 20.8259f)
            curveTo(19.1517f, 20.534f, 19.5267f, 20.1589f, 19.8186f, 19.7221f)
            curveTo(20.4926f, 18.7131f, 20.4925f, 17.3087f, 20.4924f, 14.4997f)
            lineTo(20.4923f, 13.6755f)
            curveTo(20.4923f, 13.0472f, 20.4923f, 12.733f, 20.4223f, 12.4754f)
            curveTo(20.2362f, 11.7908f, 19.7013f, 11.256f, 19.0167f, 11.07f)
            curveTo(18.7592f, 11f, 18.445f, 11f, 17.8166f, 11f)
            moveTo(11.4929f, 9f)
            curveTo(12.4245f, 9f, 12.8904f, 9f, 13.2578f, 9.15218f)
            curveTo(13.7479f, 9.35512f, 14.1372f, 9.7444f, 14.3403f, 10.2344f)
            curveTo(14.4925f, 10.6019f, 14.4926f, 11.0677f, 14.4928f, 11.9993f)
            lineTo(14.4929f, 12.3546f)
            moveTo(17.4929f, 13f)
            lineTo(17.4928f, 12.7667f)
            curveTo(17.4927f, 12.053f, 17.4927f, 11.6962f, 17.4026f, 11.4063f)
            curveTo(17.2071f, 10.7776f, 16.7148f, 10.2854f, 16.0861f, 10.0901f)
            curveTo(15.7962f, 10f, 15.4394f, 10f, 14.7257f, 10f)
        }
        }.build()

        return _pointer!!
    }

private var _pointer: ImageVector? = null
