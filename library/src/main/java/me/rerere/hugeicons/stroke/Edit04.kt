package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Edit04: ImageVector
    get() {
        if (_edit04 != null) {
            return _edit04!!
        }
        _edit04 = ImageVector.Builder(
            name = "Edit04",
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
        moveTo(8.17151f, 19.8284f)
        lineTo(19.8284f, 8.17157f)
        curveTo(20.3736f, 7.62632f, 20.6462f, 7.3537f, 20.792f, 7.0596f)
        curveTo(21.0693f, 6.50005f, 21.0693f, 5.8431f, 20.792f, 5.28354f)
        curveTo(20.6462f, 4.98945f, 20.3736f, 4.71682f, 19.8284f, 4.17157f)
        curveTo(19.2831f, 3.62632f, 19.0105f, 3.3537f, 18.7164f, 3.20796f)
        curveTo(18.1568f, 2.93068f, 17.4999f, 2.93068f, 16.9403f, 3.20796f)
        curveTo(16.6462f, 3.3537f, 16.3736f, 3.62632f, 15.8284f, 4.17157f)
        lineTo(4.17151f, 15.8284f)
        curveTo(3.59345f, 16.4064f, 3.30442f, 16.6955f, 3.15218f, 17.063f)
        curveTo(2.99994f, 17.4305f, 2.99994f, 17.8393f, 2.99994f, 18.6568f)
        verticalLineTo(20.9999f)
        horizontalLineTo(5.34308f)
        curveTo(6.16059f, 20.9999f, 6.56934f, 20.9999f, 6.93688f, 20.8477f)
        curveTo(7.30442f, 20.6955f, 7.59345f, 20.4064f, 8.17151f, 19.8284f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 21f)
        horizontalLineTo(18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 5.5f)
        lineTo(18.5f, 9.5f)
        }
        }.build()

        return _edit04!!
    }

private var _edit04: ImageVector? = null
