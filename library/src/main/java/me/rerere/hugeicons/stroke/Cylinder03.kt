package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cylinder03: ImageVector
    get() {
        if (_cylinder03 != null) {
            return _cylinder03!!
        }
        _cylinder03 = ImageVector.Builder(
            name = "Cylinder03",
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
        moveTo(22f, 19f)
        curveTo(22f, 20.6569f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 20.6569f, 2f, 19f)
        curveTo(2f, 17.3431f, 6.47715f, 16f, 12f, 16f)
        curveTo(17.5228f, 16f, 22f, 17.3431f, 22f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 5f)
        curveTo(22f, 6.65685f, 17.5228f, 8f, 12f, 8f)
        curveTo(6.47715f, 8f, 2f, 6.65685f, 2f, 5f)
        curveTo(2f, 3.34315f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 3.34315f, 22f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 5f)
        verticalLineTo(19f)
        moveTo(2f, 5f)
        verticalLineTo(19f)
        }
        }.build()

        return _cylinder03!!
    }

private var _cylinder03: ImageVector? = null
