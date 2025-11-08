package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChessPawn: ImageVector
    get() {
        if (_chessPawn != null) {
            return _chessPawn!!
        }
        _chessPawn = ImageVector.Builder(
            name = "ChessPawn",
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
        moveTo(9.5f, 10f)
        curveTo(9.5f, 12.6667f, 9f, 15.3333f, 7f, 18f)
        moveTo(14.5f, 10f)
        curveTo(14.5f, 12.6667f, 15f, 15.3333f, 17f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 5.42857f)
        curveTo(15.5f, 6.18741f, 15.2483f, 6.88867f, 14.8223f, 7.45663f)
        curveTo(14.4776f, 7.91614f, 14.134f, 8f, 13.5704f, 8f)
        horizontalLineTo(10.4296f)
        curveTo(9.866f, 8f, 9.52236f, 7.91614f, 9.17768f, 7.45663f)
        curveTo(8.75166f, 6.88867f, 8.5f, 6.18741f, 8.5f, 5.42857f)
        curveTo(8.5f, 3.53502f, 10.067f, 2f, 12f, 2f)
        curveTo(13.933f, 2f, 15.5f, 3.53502f, 15.5f, 5.42857f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 10f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.2049f, 20.6489f)
        lineTo(4.22572f, 20.5955f)
        curveTo(5.06668f, 18.4398f, 5.72681f, 18f, 8.12187f, 18f)
        horizontalLineTo(15.8781f)
        curveTo(18.2732f, 18f, 18.9333f, 18.4398f, 19.7743f, 20.5955f)
        lineTo(19.7951f, 20.6489f)
        curveTo(20.2188f, 21.735f, 20.0278f, 22f, 18.8211f, 22f)
        horizontalLineTo(5.17893f)
        curveTo(3.9722f, 22f, 3.78118f, 21.735f, 4.2049f, 20.6489f)
        }
        }.build()

        return _chessPawn!!
    }

private var _chessPawn: ImageVector? = null
