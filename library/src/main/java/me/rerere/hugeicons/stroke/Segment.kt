package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Segment: ImageVector
    get() {
        if (_segment != null) {
            return _segment!!
        }
        _segment = ImageVector.Builder(
            name = "Segment",
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
        moveTo(11f, 14f)
        lineTo(9.07143f, 8.5f)
        moveTo(9.07143f, 8.5f)
        lineTo(7.37934f, 3.67442f)
        curveTo(7.33237f, 3.54046f, 7.30888f, 3.47349f, 7.27917f, 3.4166f)
        curveTo(7.16531f, 3.19858f, 6.97093f, 3.0495f, 6.74934f, 3.01024f)
        curveTo(6.69153f, 3f, 6.62769f, 3f, 6.5f, 3f)
        curveTo(6.37231f, 3f, 6.30847f, 3f, 6.25066f, 3.01024f)
        curveTo(6.02907f, 3.0495f, 5.83469f, 3.19858f, 5.72083f, 3.4166f)
        curveTo(5.69112f, 3.47349f, 5.66763f, 3.54046f, 5.62066f, 3.67442f)
        lineTo(3.92857f, 8.5f)
        moveTo(9.07143f, 8.5f)
        lineTo(3.92857f, 8.5f)
        moveTo(3.92857f, 8.5f)
        lineTo(2f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 19f)
        curveTo(20f, 20.1046f, 19.1046f, 21f, 18f, 21f)
        curveTo(16.8954f, 21f, 16f, 20.1046f, 16f, 19f)
        moveTo(20f, 19f)
        curveTo(20f, 17.8954f, 19.1046f, 17f, 18f, 17f)
        curveTo(16.8954f, 17f, 16f, 17.8954f, 16f, 19f)
        moveTo(20f, 19f)
        horizontalLineTo(22f)
        moveTo(16f, 19f)
        horizontalLineTo(8f)
        moveTo(8f, 19f)
        curveTo(8f, 20.1046f, 7.10457f, 21f, 6f, 21f)
        curveTo(4.89543f, 21f, 4f, 20.1046f, 4f, 19f)
        moveTo(8f, 19f)
        curveTo(8f, 17.8954f, 7.10457f, 17f, 6f, 17f)
        curveTo(4.89543f, 17f, 4f, 17.8954f, 4f, 19f)
        moveTo(4f, 19f)
        horizontalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 8.5f)
        verticalLineTo(5f)
        curveTo(15f, 4.05719f, 15f, 3.58579f, 15.2929f, 3.29289f)
        curveTo(15.5858f, 3f, 16.0572f, 3f, 17f, 3f)
        horizontalLineTo(18.25f)
        curveTo(19.7688f, 3f, 21f, 4.23122f, 21f, 5.75f)
        curveTo(21f, 7.26878f, 19.7688f, 8.5f, 18.25f, 8.5f)
        horizontalLineTo(15f)
        moveTo(15f, 8.5f)
        horizontalLineTo(19.25f)
        curveTo(20.7688f, 8.5f, 22f, 9.73122f, 22f, 11.25f)
        curveTo(22f, 12.7688f, 20.7688f, 14f, 19.25f, 14f)
        horizontalLineTo(17f)
        curveTo(16.0572f, 14f, 15.5858f, 14f, 15.2929f, 13.7071f)
        curveTo(15f, 13.4142f, 15f, 12.9428f, 15f, 12f)
        verticalLineTo(8.5f)
        }
        }.build()

        return _segment!!
    }

private var _segment: ImageVector? = null
