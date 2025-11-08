package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MusicNote04: ImageVector
    get() {
        if (_musicNote04 != null) {
            return _musicNote04!!
        }
        _musicNote04 = ImageVector.Builder(
            name = "MusicNote04",
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
        moveTo(12.5f, 3f)
        lineTo(12.5f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 17f)
        curveTo(12.5f, 19.2091f, 10.7091f, 21f, 8.5f, 21f)
        curveTo(6.29086f, 21f, 4.5f, 19.2091f, 4.5f, 17f)
        curveTo(4.5f, 14.7909f, 6.29086f, 13f, 8.5f, 13f)
        curveTo(10.7091f, 13f, 12.5f, 14.7909f, 12.5f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 3f)
        curveTo(16.366f, 3f, 19.5f, 6.13401f, 19.5f, 10f)
        curveTo(18f, 8.5f, 14.0556f, 6.26667f, 12.5f, 8.44444f)
        }
        }.build()

        return _musicNote04!!
    }

private var _musicNote04: ImageVector? = null
