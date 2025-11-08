package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Magnet: ImageVector
    get() {
        if (_magnet != null) {
            return _magnet!!
        }
        _magnet = ImageVector.Builder(
            name = "Magnet",
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
        moveTo(3.925f, 2.5f)
        horizontalLineTo(9.15f)
        curveTo(9.15f, 2.5f, 8.2f, 7.7f, 8.2f, 10.1f)
        curveTo(8.2f, 13.1f, 10.1f, 15.5f, 12f, 15.5f)
        curveTo(13.9f, 15.5f, 15.8f, 13.1f, 15.8f, 10.1f)
        curveTo(15.8f, 7.7f, 14.85f, 2.5f, 14.85f, 2.5f)
        horizontalLineTo(20.075f)
        curveTo(20.075f, 2.5f, 21.5f, 7.13842f, 21.5f, 11.5f)
        curveTo(21.5f, 17f, 17.7f, 21.5f, 12f, 21.5f)
        curveTo(6.3f, 21.5f, 2.5f, 17f, 2.5f, 11.5f)
        curveTo(2.5f, 7.13842f, 3.925f, 2.5f, 3.925f, 2.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.97266f, 7.25f)
        horizontalLineTo(8.19766f)
        moveTo(15.7977f, 7.25f)
        lineTo(21.0227f, 7.25f)
        }
        }.build()

        return _magnet!!
    }

private var _magnet: ImageVector? = null
