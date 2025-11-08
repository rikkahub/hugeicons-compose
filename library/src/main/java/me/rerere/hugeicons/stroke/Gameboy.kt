package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Gameboy: ImageVector
    get() {
        if (_gameboy != null) {
            return _gameboy!!
        }
        _gameboy = ImageVector.Builder(
            name = "Gameboy",
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
        moveTo(14.5f, 6f)
        curveTo(15.2766f, 6f, 15.6649f, 6f, 15.9711f, 6.12687f)
        curveTo(16.3795f, 6.29602f, 16.704f, 6.62048f, 16.8731f, 7.02886f)
        curveTo(17f, 7.33515f, 17f, 7.72343f, 17f, 8.5f)
        curveTo(17f, 9.27657f, 17f, 9.66485f, 16.8731f, 9.97114f)
        curveTo(16.704f, 10.3795f, 16.3795f, 10.704f, 15.9711f, 10.8731f)
        curveTo(15.6649f, 11f, 15.2766f, 11f, 14.5f, 11f)
        lineTo(9.5f, 11f)
        curveTo(8.72343f, 11f, 8.33515f, 11f, 8.02886f, 10.8731f)
        curveTo(7.62048f, 10.704f, 7.29602f, 10.3795f, 7.12687f, 9.97114f)
        curveTo(7f, 9.66485f, 7f, 9.27657f, 7f, 8.5f)
        curveTo(7f, 7.72343f, 7f, 7.33515f, 7.12687f, 7.02886f)
        curveTo(7.29602f, 6.62048f, 7.62048f, 6.29602f, 8.02886f, 6.12687f)
        curveTo(8.33515f, 6f, 8.72343f, 6f, 9.5f, 6f)
        lineTo(14.5f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 17f)
        horizontalLineTo(9f)
        moveTo(9f, 17f)
        lineTo(7f, 17f)
        moveTo(9f, 17f)
        lineTo(9f, 19f)
        moveTo(9f, 17f)
        lineTo(9f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 18f)
        verticalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 13f)
        verticalLineTo(11f)
        curveTo(21f, 7.25027f, 21f, 5.3754f, 20.0451f, 4.06107f)
        curveTo(19.7367f, 3.6366f, 19.3634f, 3.26331f, 18.9389f, 2.95491f)
        curveTo(17.6246f, 2f, 15.7497f, 2f, 12f, 2f)
        curveTo(8.25027f, 2f, 6.3754f, 2f, 5.06107f, 2.95491f)
        curveTo(4.6366f, 3.26331f, 4.26331f, 3.6366f, 3.95491f, 4.06107f)
        curveTo(3f, 5.3754f, 3f, 7.25027f, 3f, 11f)
        verticalLineTo(13f)
        curveTo(3f, 16.7497f, 3f, 18.6246f, 3.95491f, 19.9389f)
        curveTo(4.26331f, 20.3634f, 4.6366f, 20.7367f, 5.06107f, 21.0451f)
        curveTo(6.3754f, 22f, 8.25027f, 22f, 12f, 22f)
        curveTo(15.7497f, 22f, 17.6246f, 22f, 18.9389f, 21.0451f)
        curveTo(19.3634f, 20.7367f, 19.7367f, 20.3634f, 20.0451f, 19.9389f)
        curveTo(21f, 18.6246f, 21f, 16.7497f, 21f, 13f)
        }
        }.build()

        return _gameboy!!
    }

private var _gameboy: ImageVector? = null
