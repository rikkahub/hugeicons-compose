package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Blur: ImageVector
    get() {
        if (_blur != null) {
            return _blur!!
        }
        _blur = ImageVector.Builder(
            name = "Blur",
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
        moveTo(12.5926f, 2.21f)
        curveTo(12.2371f, 1.93f, 11.7433f, 1.93f, 11.3877f, 2.21f)
        curveTo(9.51122f, 3.66f, 3.97049f, 8.39f, 4.00012f, 13.9f)
        curveTo(4.00012f, 18.36f, 7.58531f, 22f, 12.0001f, 22f)
        curveTo(16.4149f, 22f, 20f, 18.37f, 20f, 13.91f)
        curveTo(20.0099f, 8.48f, 14.4593f, 3.67f, 12.5926f, 2.21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 19f)
        lineTo(20f, 15f)
        moveTo(12f, 14.1806f)
        lineTo(19f, 10.5f)
        moveTo(12f, 9.36145f)
        lineTo(16.5727f, 7f)
        }
        }.build()

        return _blur!!
    }

private var _blur: ImageVector? = null
