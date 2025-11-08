package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PercentCircle: ImageVector
    get() {
        if (_percentCircle != null) {
            return _percentCircle!!
        }
        _percentCircle = ImageVector.Builder(
            name = "PercentCircle",
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
        moveTo(8f, 16f)
        lineTo(16f, 8f)
        moveTo(10f, 9f)
        curveTo(10f, 9.55228f, 9.55228f, 10f, 9f, 10f)
        curveTo(8.44772f, 10f, 8f, 9.55228f, 8f, 9f)
        curveTo(8f, 8.44772f, 8.44772f, 8f, 9f, 8f)
        curveTo(9.55228f, 8f, 10f, 8.44772f, 10f, 9f)
        moveTo(16f, 14.8284f)
        curveTo(16f, 15.3807f, 15.5523f, 15.8284f, 15f, 15.8284f)
        curveTo(14.4477f, 15.8284f, 14f, 15.3807f, 14f, 14.8284f)
        curveTo(14f, 14.2761f, 14.4477f, 13.8284f, 15f, 13.8284f)
        curveTo(15.5523f, 13.8284f, 16f, 14.2761f, 16f, 14.8284f)
        }
        }.build()

        return _percentCircle!!
    }

private var _percentCircle: ImageVector? = null
