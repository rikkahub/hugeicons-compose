package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Trolley02: ImageVector
    get() {
        if (_trolley02 != null) {
            return _trolley02!!
        }
        _trolley02 = ImageVector.Builder(
            name = "Trolley02",
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
        moveTo(3f, 2f)
        horizontalLineTo(4.30116f)
        curveTo(5.48672f, 2f, 6.0795f, 2f, 6.4814f, 2.37142f)
        curveTo(6.88331f, 2.74285f, 6.96165f, 3.36307f, 7.11834f, 4.60351f)
        lineTo(8.24573f, 13.5287f)
        curveTo(8.45464f, 15.1826f, 8.5591f, 16.0095f, 9.09497f, 16.5048f)
        curveTo(9.63085f, 17f, 10.4212f, 17f, 12.002f, 17f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 14f)
        horizontalLineTo(16f)
        curveTo(14.1144f, 14f, 13.1716f, 14f, 12.5858f, 13.4142f)
        curveTo(12f, 12.8284f, 12f, 11.8856f, 12f, 10f)
        verticalLineTo(8f)
        curveTo(12f, 6.11438f, 12f, 5.17157f, 12.5858f, 4.58579f)
        curveTo(13.1716f, 4f, 14.1144f, 4f, 16f, 4f)
        horizontalLineTo(18f)
        curveTo(19.8856f, 4f, 20.8284f, 4f, 21.4142f, 4.58579f)
        curveTo(22f, 5.17157f, 22f, 6.11438f, 22f, 8f)
        verticalLineTo(10f)
        curveTo(22f, 11.8856f, 22f, 12.8284f, 21.4142f, 13.4142f)
        curveTo(20.8284f, 14f, 19.8856f, 14f, 18f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 7f)
        lineTo(17.5f, 7f)
        }
        }.build()

        return _trolley02!!
    }

private var _trolley02: ImageVector? = null
