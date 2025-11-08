package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Waste: ImageVector
    get() {
        if (_waste != null) {
            return _waste!!
        }
        _waste = ImageVector.Builder(
            name = "Waste",
            defaultWidth = 25.dp,
            defaultHeight = 24.dp,
            viewportWidth = 25f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.25f, 5f)
        horizontalLineTo(8.67963f)
        curveTo(9.34834f, 5f, 9.9728f, 4.6658f, 10.3437f, 4.1094f)
        lineTo(11.1563f, 2.8906f)
        curveTo(11.5272f, 2.3342f, 12.1517f, 2f, 12.8204f, 2f)
        horizontalLineTo(17.3085f)
        curveTo(18.1693f, 2f, 18.9336f, 2.55086f, 19.2058f, 3.36754f)
        lineTo(19.75f, 5f)
        moveTo(21.25f, 5f)
        horizontalLineTo(8.25f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.75f, 5f)
        lineTo(19.1303f, 14.906f)
        curveTo(19.1088f, 15.2333f, 19.0887f, 15.5385f, 19.0685f, 15.8235f)
        moveTo(4.75f, 5f)
        lineTo(5.35461f, 14.8966f)
        curveTo(5.50945f, 17.3107f, 5.58688f, 18.5177f, 6.22868f, 19.3857f)
        curveTo(6.546f, 19.8149f, 6.9548f, 20.1771f, 7.42905f, 20.4493f)
        curveTo(8.3883f, 21f, 9.67312f, 21f, 12.2427f, 21f)
        horizontalLineTo(14.75f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.25f, 19f)
        curveTo(20.25f, 17.3431f, 18.9069f, 16f, 17.25f, 16f)
        curveTo(15.5931f, 16f, 14.25f, 17.3431f, 14.25f, 19f)
        curveTo(14.25f, 20.6569f, 15.5931f, 22f, 17.25f, 22f)
        curveTo(18.9069f, 22f, 20.25f, 20.6569f, 20.25f, 19f)
        }
        }.build()

        return _waste!!
    }

private var _waste: ImageVector? = null
