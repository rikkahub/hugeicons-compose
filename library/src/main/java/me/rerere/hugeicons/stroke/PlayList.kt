package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PlayList: ImageVector
    get() {
        if (_playList != null) {
            return _playList!!
        }
        _playList = ImageVector.Builder(
            name = "PlayList",
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
        moveTo(2.50012f, 7.5f)
        horizontalLineTo(21.5001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.0001f, 2.5f)
        lineTo(14.0001f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.0001f, 2.5f)
        lineTo(7.00012f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.9531f, 14.8948f)
        curveTo(14.8016f, 15.5215f, 14.0857f, 15.9644f, 12.6539f, 16.8502f)
        curveTo(11.2697f, 17.7064f, 10.5777f, 18.1346f, 10.0199f, 17.9625f)
        curveTo(9.78934f, 17.8913f, 9.57925f, 17.7562f, 9.40982f, 17.57f)
        curveTo(9f, 17.1198f, 9f, 16.2465f, 9f, 14.5f)
        curveTo(9f, 12.7535f, 9f, 11.8802f, 9.40982f, 11.4299f)
        curveTo(9.57925f, 11.2438f, 9.78934f, 11.1087f, 10.0199f, 11.0375f)
        curveTo(10.5777f, 10.8654f, 11.2697f, 11.2936f, 12.6539f, 12.1498f)
        curveTo(14.0857f, 13.0356f, 14.8016f, 13.4785f, 14.9531f, 14.1052f)
        curveTo(15.0156f, 14.3639f, 15.0156f, 14.6361f, 14.9531f, 14.8948f)
        }
        }.build()

        return _playList!!
    }

private var _playList: ImageVector? = null
