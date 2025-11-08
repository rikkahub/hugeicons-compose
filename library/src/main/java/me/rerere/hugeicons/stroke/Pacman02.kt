package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pacman02: ImageVector
    get() {
        if (_pacman02 != null) {
            return _pacman02!!
        }
        _pacman02 = ImageVector.Builder(
            name = "Pacman02",
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
        moveTo(20f, 10f)
        curveTo(20f, 5.58172f, 16.4183f, 2f, 12f, 2f)
        curveTo(7.58172f, 2f, 4f, 5.58172f, 4f, 10f)
        verticalLineTo(20.4f)
        curveTo(4f, 21.2837f, 4.71634f, 22f, 5.6f, 22f)
        curveTo(6.48366f, 22f, 7.2f, 21.2837f, 7.2f, 20.4f)
        verticalLineTo(19.6f)
        curveTo(7.2f, 18.7163f, 7.91634f, 18f, 8.8f, 18f)
        curveTo(9.68366f, 18f, 10.4f, 18.7163f, 10.4f, 19.6f)
        verticalLineTo(20.4f)
        curveTo(10.4f, 21.2837f, 11.1163f, 22f, 12f, 22f)
        curveTo(12.8837f, 22f, 13.6f, 21.2837f, 13.6f, 20.4f)
        verticalLineTo(19.6f)
        curveTo(13.6f, 18.7163f, 14.3163f, 18f, 15.2f, 18f)
        curveTo(16.0837f, 18f, 16.8f, 18.7163f, 16.8f, 19.6f)
        verticalLineTo(20.4f)
        curveTo(16.8f, 21.2837f, 17.5163f, 22f, 18.4f, 22f)
        curveTo(19.2837f, 22f, 20f, 21.2837f, 20f, 20.4f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.00896f, 10f)
        horizontalLineTo(9f)
        moveTo(15f, 10f)
        horizontalLineTo(14.991f)
        }
        }.build()

        return _pacman02!!
    }

private var _pacman02: ImageVector? = null
