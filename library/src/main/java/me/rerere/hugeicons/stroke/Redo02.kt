package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Redo02: ImageVector
    get() {
        if (_redo02 != null) {
            return _redo02!!
        }
        _redo02 = ImageVector.Builder(
            name = "Redo02",
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
        moveTo(12f, 21f)
        curveTo(7.02944f, 21f, 3f, 16.9706f, 3f, 12f)
        curveTo(3f, 7.02944f, 7.02944f, 3f, 12f, 3f)
        curveTo(15.3313f, 3f, 18.2398f, 4.80989f, 19.796f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.9991f, 3f)
        verticalLineTo(4.27816f)
        curveTo(20.9991f, 6.47004f, 20.9991f, 7.56599f, 20.2918f, 8.16512f)
        curveTo(19.5846f, 8.76425f, 18.5036f, 8.58408f, 16.3415f, 8.22373f)
        lineTo(14.9991f, 8f)
        }
        }.build()

        return _redo02!!
    }

private var _redo02: ImageVector? = null
