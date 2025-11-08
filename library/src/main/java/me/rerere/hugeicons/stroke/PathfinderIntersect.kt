package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PathfinderIntersect: ImageVector
    get() {
        if (_pathfinderIntersect != null) {
            return _pathfinderIntersect!!
        }
        _pathfinderIntersect = ImageVector.Builder(
            name = "PathfinderIntersect",
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
        moveTo(9.76082f, 10.3157f)
        curveTo(9.92442f, 10.1105f, 10.1105f, 9.92442f, 10.3157f, 9.76082f)
        curveTo(11.0862f, 9.14637f, 12.1482f, 9.02577f, 13.9994f, 9.0021f)
        curveTo(14.4721f, 8.99606f, 14.7084f, 8.99303f, 14.8577f, 9.14231f)
        curveTo(15.007f, 9.29159f, 15.0039f, 9.52792f, 14.9979f, 10.0006f)
        curveTo(14.9743f, 11.8517f, 14.8538f, 12.9135f, 14.2393f, 13.684f)
        curveTo(14.0757f, 13.8892f, 13.8896f, 14.0753f, 13.6845f, 14.2389f)
        curveTo(12.914f, 14.8534f, 11.8519f, 14.9742f, 10.0006f, 14.9979f)
        curveTo(9.52793f, 15.004f, 9.29161f, 15.007f, 9.14232f, 14.8577f)
        curveTo(8.99303f, 14.7084f, 8.99606f, 14.4721f, 9.0021f, 13.9994f)
        curveTo(9.02577f, 12.1482f, 9.14637f, 11.0862f, 9.76082f, 10.3157f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 14.5f)
        verticalLineTo(16.5f)
        moveTo(16.5f, 22f)
        horizontalLineTo(14.5f)
        moveTo(22f, 12f)
        curveTo(21.9345f, 11.1196f, 21.7782f, 10.5249f, 21.4047f, 10.0579f)
        curveTo(21.2673f, 9.88599f, 21.1109f, 9.73003f, 20.9385f, 9.59294f)
        curveTo(20.4718f, 9.22181f, 19.8778f, 9.06568f, 19f, 9f)
        horizontalLineTo(18.5f)
        moveTo(22f, 19f)
        curveTo(21.9343f, 19.8778f, 21.7782f, 20.4718f, 21.4071f, 20.9385f)
        curveTo(21.27f, 21.1109f, 21.114f, 21.2673f, 20.9421f, 21.4047f)
        curveTo(20.4751f, 21.7782f, 19.8804f, 21.9345f, 19f, 22f)
        moveTo(12f, 22f)
        curveTo(11.1222f, 21.9343f, 10.5282f, 21.7782f, 10.0615f, 21.4071f)
        curveTo(9.88914f, 21.27f, 9.73274f, 21.114f, 9.59527f, 20.9421f)
        curveTo(9.22182f, 20.4751f, 9.06547f, 19.8804f, 9f, 19f)
        lineTo(9f, 18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 12f)
        curveTo(2.06547f, 12.8804f, 2.22182f, 13.4751f, 2.59527f, 13.9421f)
        curveTo(2.73274f, 14.114f, 2.88914f, 14.27f, 3.06153f, 14.4071f)
        curveTo(3.52821f, 14.7782f, 4.12216f, 14.9343f, 5f, 15f)
        horizontalLineTo(5.5f)
        moveTo(2f, 5f)
        curveTo(2.06568f, 4.12216f, 2.22181f, 3.52821f, 2.59294f, 3.06153f)
        curveTo(2.73003f, 2.88914f, 2.88599f, 2.73274f, 3.0579f, 2.59527f)
        curveTo(3.52488f, 2.22182f, 4.11965f, 2.06547f, 5f, 2f)
        moveTo(12f, 2f)
        curveTo(12.8778f, 2.06568f, 13.4718f, 2.22181f, 13.9385f, 2.59294f)
        curveTo(14.1109f, 2.73003f, 14.2673f, 2.88599f, 14.4047f, 3.0579f)
        curveTo(14.7782f, 3.52488f, 14.9345f, 4.11965f, 15f, 5f)
        verticalLineTo(5.5f)
        moveTo(2f, 7.5f)
        lineTo(2f, 9.5f)
        moveTo(9.5f, 2f)
        lineTo(7.5f, 2f)
        }
        }.build()

        return _pathfinderIntersect!!
    }

private var _pathfinderIntersect: ImageVector? = null
