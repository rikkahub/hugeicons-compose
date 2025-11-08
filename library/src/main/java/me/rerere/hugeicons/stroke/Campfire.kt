package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Campfire: ImageVector
    get() {
        if (_campfire != null) {
            return _campfire!!
        }
        _campfire = ImageVector.Builder(
            name = "Campfire",
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
        moveTo(17.6709f, 16f)
        curveTo(18.5134f, 14.8191f, 19f, 13.4095f, 19f, 12f)
        curveTo(19f, 8f, 17.5f, 7f, 17.5f, 7f)
        curveTo(16.9615f, 8.5f, 15.5f, 9f, 15.5f, 9f)
        curveTo(15.5f, 3.5f, 12f, 2f, 12f, 2f)
        curveTo(12f, 2f, 8.5f, 3.5f, 8.5f, 9f)
        curveTo(8.5f, 9f, 7.03846f, 8.5f, 6.5f, 7f)
        curveTo(6.5f, 7f, 5f, 8f, 5f, 12f)
        curveTo(5f, 13.4095f, 5.48656f, 14.8191f, 6.32905f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 19f)
        horizontalLineTo(5f)
        curveTo(4.44772f, 19f, 4f, 19.4477f, 4f, 20f)
        verticalLineTo(21f)
        curveTo(4f, 21.5523f, 4.44772f, 22f, 5f, 22f)
        horizontalLineTo(19f)
        curveTo(19.5523f, 22f, 20f, 21.5523f, 20f, 21f)
        verticalLineTo(20f)
        curveTo(20f, 19.4477f, 19.5523f, 19f, 19f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 16f)
        curveTo(14.5f, 13.5f, 12f, 11f, 12f, 11f)
        curveTo(12f, 11f, 9.5f, 13.5f, 9.5f, 16f)
        }
        }.build()

        return _campfire!!
    }

private var _campfire: ImageVector? = null
