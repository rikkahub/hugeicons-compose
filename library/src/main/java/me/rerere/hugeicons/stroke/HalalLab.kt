package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HalalLab: ImageVector
    get() {
        if (_halalLab != null) {
            return _halalLab!!
        }
        _halalLab = ImageVector.Builder(
            name = "HalalLab",
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
        moveTo(7f, 3f)
        horizontalLineTo(3f)
        verticalLineTo(21f)
        horizontalLineTo(7f)
        curveTo(7f, 18.2386f, 9.23858f, 16f, 12f, 16f)
        curveTo(14.7614f, 16f, 17f, 18.2386f, 17f, 21f)
        horizontalLineTo(21f)
        curveTo(21f, 16.0294f, 16.9706f, 12f, 12f, 12f)
        curveTo(10.1499f, 12f, 8.4301f, 12.5583f, 7f, 13.5155f)
        verticalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 3f)
        curveTo(12f, 7.97056f, 16.0294f, 12f, 21f, 12f)
        verticalLineTo(8f)
        curveTo(18.2386f, 8f, 16f, 5.76142f, 16f, 3f)
        horizontalLineTo(12f)
        }
        }.build()

        return _halalLab!!
    }

private var _halalLab: ImageVector? = null
