package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WaveSquare: ImageVector
    get() {
        if (_waveSquare != null) {
            return _waveSquare!!
        }
        _waveSquare = ImageVector.Builder(
            name = "WaveSquare",
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
        moveTo(3f, 12f)
        horizontalLineTo(7f)
        curveTo(7.55228f, 12f, 8f, 11.5523f, 8f, 11f)
        verticalLineTo(6f)
        curveTo(8f, 5.44772f, 8.44772f, 5f, 9f, 5f)
        horizontalLineTo(11f)
        curveTo(11.5523f, 5f, 12f, 5.44772f, 12f, 6f)
        verticalLineTo(18f)
        curveTo(12f, 18.5523f, 12.4477f, 19f, 13f, 19f)
        lineTo(14.9996f, 19f)
        curveTo(15.5519f, 19f, 15.9996f, 18.5523f, 15.9996f, 18f)
        lineTo(15.9996f, 13f)
        curveTo(15.9996f, 12.4477f, 16.4473f, 12f, 16.9996f, 12f)
        horizontalLineTo(20.9996f)
        }
        }.build()

        return _waveSquare!!
    }

private var _waveSquare: ImageVector? = null
