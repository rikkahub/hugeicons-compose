package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pound: ImageVector
    get() {
        if (_pound != null) {
            return _pound!!
        }
        _pound = ImageVector.Builder(
            name = "Pound",
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
        moveTo(10.625f, 14f)
        curveTo(9.375f, 16.9167f, 7.5f, 19.8333f, 5f, 21f)
        horizontalLineTo(16.875f)
        curveTo(16.875f, 21f, 18.75f, 21f, 20f, 19.8333f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 14f)
        horizontalLineTo(4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 8.5f)
        curveTo(18f, 5.46243f, 15.5376f, 3f, 12.5f, 3f)
        curveTo(9.46243f, 3f, 7f, 5.46243f, 7f, 8.5f)
        curveTo(7f, 11.5376f, 9.46243f, 14f, 12.5f, 14f)
        }
        }.build()

        return _pound!!
    }

private var _pound: ImageVector? = null
