package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Translate: ImageVector
    get() {
        if (_translate != null) {
            return _translate!!
        }
        _translate = ImageVector.Builder(
            name = "Translate",
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
        moveTo(5f, 5.82759f)
        horizontalLineTo(7.7f)
        moveTo(11f, 5.82759f)
        horizontalLineTo(9.5f)
        moveTo(7.7f, 5.82759f)
        horizontalLineTo(9.5f)
        moveTo(7.7f, 5.82759f)
        verticalLineTo(5f)
        moveTo(9.5f, 5.82759f)
        curveTo(9.18351f, 6.95937f, 8.52075f, 8.02923f, 7.76429f, 8.96946f)
        moveTo(5.83571f, 11f)
        curveTo(6.44723f, 10.4377f, 7.13788f, 9.74802f, 7.76429f, 8.96946f)
        moveTo(7.76429f, 8.96946f)
        curveTo(7.37857f, 8.51724f, 6.83857f, 7.78558f, 6.68429f, 7.45455f)
        moveTo(7.76429f, 8.96946f)
        lineTo(8.92143f, 10.1724f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 19f)
        lineTo(14.3333f, 17f)
        moveTo(18.5f, 19f)
        lineTo(17.6667f, 17f)
        moveTo(14.3333f, 17f)
        lineTo(16f, 13f)
        lineTo(17.6667f, 17f)
        moveTo(14.3333f, 17f)
        horizontalLineTo(17.6667f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 10f)
        verticalLineTo(8f)
        curveTo(14f, 5.17157f, 14f, 3.75736f, 13.1213f, 2.87868f)
        curveTo(12.2426f, 2f, 10.8284f, 2f, 8f, 2f)
        curveTo(5.17157f, 2f, 3.75736f, 2f, 2.87868f, 2.87868f)
        curveTo(2f, 3.75736f, 2f, 5.17157f, 2f, 8f)
        curveTo(2f, 10.8284f, 2f, 12.2426f, 2.87868f, 13.1213f)
        curveTo(3.75736f, 14f, 5.17157f, 14f, 8f, 14f)
        horizontalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 16f)
        curveTo(10f, 13.1716f, 10f, 11.7574f, 10.8787f, 10.8787f)
        curveTo(11.7574f, 10f, 13.1716f, 10f, 16f, 10f)
        curveTo(18.8284f, 10f, 20.2426f, 10f, 21.1213f, 10.8787f)
        curveTo(22f, 11.7574f, 22f, 13.1716f, 22f, 16f)
        curveTo(22f, 18.8284f, 22f, 20.2426f, 21.1213f, 21.1213f)
        curveTo(20.2426f, 22f, 18.8284f, 22f, 16f, 22f)
        curveTo(13.1716f, 22f, 11.7574f, 22f, 10.8787f, 21.1213f)
        curveTo(10f, 20.2426f, 10f, 18.8284f, 10f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 16.5f)
        curveTo(4f, 17.9045f, 4f, 18.6067f, 4.33706f, 19.1111f)
        curveTo(4.48298f, 19.3295f, 4.67048f, 19.517f, 4.88886f, 19.6629f)
        curveTo(5.39331f, 20f, 6.09554f, 20f, 7.5f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 7.5f)
        curveTo(20f, 6.09554f, 20f, 5.39331f, 19.6629f, 4.88886f)
        curveTo(19.517f, 4.67048f, 19.3295f, 4.48298f, 19.1111f, 4.33706f)
        curveTo(18.6067f, 4f, 17.9045f, 4f, 16.5f, 4f)
        }
        }.build()

        return _translate!!
    }

private var _translate: ImageVector? = null
