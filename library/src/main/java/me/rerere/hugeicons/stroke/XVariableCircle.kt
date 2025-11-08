package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.XVariableCircle: ImageVector
    get() {
        if (_xVariableCircle != null) {
            return _xVariableCircle!!
        }
        _xVariableCircle = ImageVector.Builder(
            name = "XVariableCircle",
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
        moveTo(16f, 8.9895f)
        curveTo(12.8164f, 8.9895f, 11.1837f, 15.0103f, 8f, 15.0103f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5409f, 15.0106f)
        curveTo(14.7321f, 15.0106f, 14.2877f, 15.0106f, 13.9468f, 14.8896f)
        curveTo(13.7532f, 14.8208f, 13.5769f, 14.7247f, 13.4265f, 14.6058f)
        curveTo(13.1619f, 14.3967f, 13.0167f, 14.097f, 12.7263f, 13.4976f)
        lineTo(11.2755f, 10.5027f)
        curveTo(10.9852f, 9.90334f, 10.84f, 9.60366f, 10.5753f, 9.39448f)
        curveTo(10.425f, 9.27566f, 10.2487f, 9.17953f, 10.0551f, 9.11078f)
        curveTo(9.71415f, 8.98975f, 9.26975f, 8.98975f, 8.46094f, 8.98975f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        }
        }.build()

        return _xVariableCircle!!
    }

private var _xVariableCircle: ImageVector? = null
