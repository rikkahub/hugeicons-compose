package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pan03: ImageVector
    get() {
        if (_pan03 != null) {
            return _pan03!!
        }
        _pan03 = ImageVector.Builder(
            name = "Pan03",
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
        moveTo(12f, 20f)
        lineTo(12f, 18.5f)
        moveTo(16f, 20f)
        verticalLineTo(18.5f)
        moveTo(20f, 20f)
        verticalLineTo(18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 20f)
        lineTo(22f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5556f, 11f)
        horizontalLineTo(10.4444f)
        curveTo(10.199f, 11f, 10f, 11.2487f, 10f, 11.5556f)
        curveTo(10f, 14.0102f, 11.5919f, 16f, 13.5556f, 16f)
        horizontalLineTo(18.4444f)
        curveTo(20.4081f, 16f, 22f, 14.0102f, 22f, 11.5556f)
        curveTo(22f, 11.2487f, 21.801f, 11f, 21.5556f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 8f)
        curveTo(14.652f, 6.97775f, 12.348f, 5.02225f, 14f, 4f)
        moveTo(16f, 8f)
        curveTo(17.652f, 6.97775f, 15.348f, 5.02225f, 17f, 4f)
        moveTo(19f, 8f)
        curveTo(20.652f, 6.97775f, 18.348f, 5.02225f, 20f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 11f)
        lineTo(8f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.36797f, 4.36797f)
        curveTo(3.85859f, 3.87734f, 4.65404f, 3.87734f, 5.14466f, 4.36797f)
        lineTo(7.63203f, 6.85534f)
        curveTo(8.12266f, 7.34596f, 8.12266f, 8.14141f, 7.63203f, 8.63203f)
        curveTo(7.14141f, 9.12266f, 6.34596f, 9.12266f, 5.85534f, 8.63203f)
        lineTo(3.36797f, 6.14466f)
        curveTo(2.87734f, 5.65404f, 2.87734f, 4.85859f, 3.36797f, 4.36797f)
        }
        }.build()

        return _pan03!!
    }

private var _pan03: ImageVector? = null
