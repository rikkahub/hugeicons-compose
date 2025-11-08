package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Bookmark03: ImageVector
    get() {
        if (_bookmark03 != null) {
            return _bookmark03!!
        }
        _bookmark03 = ImageVector.Builder(
            name = "Bookmark03",
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
        moveTo(12f, 22.0002f)
        curveTo(7.75736f, 22.0002f, 5.63604f, 22.0002f, 4.31802f, 20.5358f)
        curveTo(3f, 19.0713f, 3f, 16.7143f, 3f, 12.0002f)
        curveTo(3f, 7.28617f, 3f, 4.92915f, 4.31802f, 3.46468f)
        curveTo(5.63604f, 2.00022f, 7.75736f, 2.00022f, 12f, 2.00022f)
        curveTo(16.2426f, 2.00022f, 18.364f, 2.00022f, 19.682f, 3.46468f)
        curveTo(21f, 4.92915f, 21f, 7.28617f, 21f, 12.0002f)
        curveTo(21f, 16.7143f, 21f, 19.0713f, 19.682f, 20.5358f)
        curveTo(18.364f, 22.0002f, 16.2426f, 22.0002f, 12f, 22.0002f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 2.5f)
        verticalLineTo(9.82621f)
        curveTo(8f, 11.0733f, 8f, 11.6969f, 8.38642f, 11.9201f)
        curveTo(9.13473f, 12.3523f, 10.5384f, 10.9103f, 11.205f, 10.4761f)
        curveTo(11.5916f, 10.2243f, 11.7849f, 10.0984f, 12f, 10.0984f)
        curveTo(12.2151f, 10.0984f, 12.4084f, 10.2243f, 12.795f, 10.4761f)
        curveTo(13.4616f, 10.9103f, 14.8653f, 12.3523f, 15.6136f, 11.9201f)
        curveTo(16f, 11.6969f, 16f, 11.0733f, 16f, 9.82621f)
        verticalLineTo(2.5f)
        }
        }.build()

        return _bookmark03!!
    }

private var _bookmark03: ImageVector? = null
