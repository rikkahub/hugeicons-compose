package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PlayListFavourite01: ImageVector
    get() {
        if (_playListFavourite01 != null) {
            return _playListFavourite01!!
        }
        _playListFavourite01 = ImageVector.Builder(
            name = "PlayListFavourite01",
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
        moveTo(20.9977f, 12f)
        curveTo(21f, 11.5299f, 21f, 12.0307f, 21f, 11.5f)
        curveTo(21f, 7.02166f, 21f, 4.78249f, 19.6088f, 3.39124f)
        curveTo(18.2175f, 2f, 15.9783f, 2f, 11.5f, 2f)
        curveTo(7.02166f, 2f, 4.78249f, 2f, 3.39124f, 3.39124f)
        curveTo(2f, 4.78249f, 2f, 7.02166f, 2f, 11.5f)
        curveTo(2f, 15.9783f, 2f, 18.2175f, 3.39124f, 19.6088f)
        curveTo(4.78249f, 21f, 7.02166f, 21f, 11.5f, 21f)
        curveTo(11.6699f, 21f, 11.8365f, 21f, 12f, 20.9999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 7f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 2f)
        lineTo(13.5f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 2f)
        lineTo(6.5f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.015f, 15.3866f)
        curveTo(16.0876f, 14.7469f, 17.0238f, 15.0047f, 17.5863f, 15.4153f)
        curveTo(17.8169f, 15.5837f, 17.9322f, 15.6679f, 18f, 15.6679f)
        curveTo(18.0678f, 15.6679f, 18.1831f, 15.5837f, 18.4137f, 15.4153f)
        curveTo(18.9762f, 15.0047f, 19.9124f, 14.7469f, 20.985f, 15.3866f)
        curveTo(22.3928f, 16.2261f, 22.7113f, 18.9958f, 19.4642f, 21.3324f)
        curveTo(18.8457f, 21.7775f, 18.5365f, 22f, 18f, 22f)
        curveTo(17.4635f, 22f, 17.1543f, 21.7775f, 16.5358f, 21.3324f)
        curveTo(13.2887f, 18.9958f, 13.6072f, 16.2261f, 15.015f, 15.3866f)
        }
        }.build()

        return _playListFavourite01!!
    }

private var _playListFavourite01: ImageVector? = null
