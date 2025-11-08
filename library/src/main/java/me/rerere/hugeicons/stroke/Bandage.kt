package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Bandage: ImageVector
    get() {
        if (_bandage != null) {
            return _bandage!!
        }
        _bandage = ImageVector.Builder(
            name = "Bandage",
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
        moveTo(13.9525f, 4.84083f)
        curveTo(15.1797f, 3.61361f, 15.7933f, 3f, 16.5558f, 3f)
        curveTo(17.3183f, 3f, 17.9319f, 3.61361f, 19.1592f, 4.84083f)
        curveTo(20.3864f, 6.06806f, 21f, 6.68167f, 21f, 7.44417f)
        curveTo(21f, 8.20667f, 20.3864f, 8.82028f, 19.1592f, 10.0475f)
        moveTo(10.0475f, 19.1592f)
        curveTo(8.82028f, 20.3864f, 8.20667f, 21f, 7.44417f, 21f)
        curveTo(6.68167f, 21f, 6.06806f, 20.3864f, 4.84084f, 19.1592f)
        curveTo(3.61361f, 17.9319f, 3f, 17.3183f, 3f, 16.5558f)
        curveTo(3f, 15.7933f, 3.61361f, 15.1797f, 4.84084f, 13.9525f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.79333f, 12f)
        lineTo(4.84084f, 10.0475f)
        curveTo(3.61361f, 8.82028f, 3f, 8.20667f, 3f, 7.44417f)
        curveTo(3f, 6.68167f, 3.61361f, 6.06806f, 4.84084f, 4.84083f)
        curveTo(6.06806f, 3.61361f, 6.68167f, 3f, 7.44417f, 3f)
        curveTo(8.20667f, 3f, 8.82028f, 3.61361f, 10.0475f, 4.84083f)
        lineTo(12f, 6.79333f)
        moveTo(6.79333f, 12f)
        lineTo(12f, 6.79333f)
        moveTo(6.79333f, 12f)
        lineTo(12f, 17.2067f)
        moveTo(12f, 6.79333f)
        lineTo(17.2067f, 12f)
        moveTo(17.2067f, 12f)
        lineTo(19.1592f, 13.9525f)
        curveTo(20.3864f, 15.1797f, 21f, 15.7933f, 21f, 16.5558f)
        curveTo(21f, 17.3183f, 20.3864f, 17.9319f, 19.1592f, 19.1592f)
        curveTo(17.9319f, 20.3864f, 17.3183f, 21f, 16.5558f, 21f)
        curveTo(15.7933f, 21f, 15.1797f, 20.3864f, 13.9525f, 19.1592f)
        lineTo(12f, 17.2067f)
        moveTo(17.2067f, 12f)
        lineTo(12f, 17.2067f)
        }
        }.build()

        return _bandage!!
    }

private var _bandage: ImageVector? = null
