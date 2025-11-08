package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Droplet: ImageVector
    get() {
        if (_droplet != null) {
            return _droplet!!
        }
        _droplet = ImageVector.Builder(
            name = "Droplet",
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
        moveTo(3.5f, 13.678f)
        curveTo(3.5f, 9.49387f, 7.08079f, 5.35907f, 9.59413f, 2.97222f)
        curveTo(10.9591f, 1.67593f, 13.0409f, 1.67593f, 14.4059f, 2.97222f)
        curveTo(16.9192f, 5.35907f, 20.5f, 9.49387f, 20.5f, 13.678f)
        curveTo(20.5f, 17.7804f, 17.2812f, 22f, 12f, 22f)
        curveTo(6.71878f, 22f, 3.5f, 17.7804f, 3.5f, 13.678f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 14f)
        curveTo(16f, 16.2091f, 14.2091f, 18f, 12f, 18f)
        }
        }.build()

        return _droplet!!
    }

private var _droplet: ImageVector? = null
