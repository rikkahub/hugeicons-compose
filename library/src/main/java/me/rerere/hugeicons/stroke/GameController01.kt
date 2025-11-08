package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GameController01: ImageVector
    get() {
        if (_gameController01 != null) {
            return _gameController01!!
        }
        _gameController01 = ImageVector.Builder(
            name = "GameController01",
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
        moveTo(11f, 13f)
        horizontalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 9f)
        verticalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.1526f, 20.9174f)
        curveTo(22.0143f, 20.3289f, 22.5597f, 16.7547f, 21.3708f, 12.9344f)
        curveTo(20.1819f, 9.11398f, 17.709f, 6.49405f, 15.8474f, 7.08259f)
        curveTo(14.6972f, 7.44619f, 14.6438f, 8.86174f, 13.6968f, 9.378f)
        curveTo(13.473f, 9.5f, 13.1595f, 9.5f, 12.5324f, 9.5f)
        horizontalLineTo(11.4676f)
        curveTo(10.8405f, 9.5f, 10.527f, 9.5f, 10.3032f, 9.378f)
        curveTo(9.35625f, 8.86174f, 9.30278f, 7.44619f, 8.15264f, 7.08259f)
        curveTo(6.29102f, 6.49405f, 3.8181f, 9.11398f, 2.62922f, 12.9344f)
        curveTo(1.44035f, 16.7547f, 1.98573f, 20.3289f, 3.84736f, 20.9174f)
        curveTo(5.20631f, 21.347f, 6.891f, 20.067f, 8.16417f, 17.8583f)
        curveTo(9.01333f, 16.3851f, 9.39787f, 16f, 11.1039f, 16f)
        horizontalLineTo(12.8961f)
        curveTo(14.6021f, 16f, 14.9867f, 16.3851f, 15.8358f, 17.8583f)
        curveTo(17.109f, 20.067f, 18.7937f, 21.347f, 20.1526f, 20.9174f)
        }
        }.build()

        return _gameController01!!
    }

private var _gameController01: ImageVector? = null
