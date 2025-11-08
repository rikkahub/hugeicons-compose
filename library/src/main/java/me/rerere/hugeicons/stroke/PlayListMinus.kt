package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PlayListMinus: ImageVector
    get() {
        if (_playListMinus != null) {
            return _playListMinus!!
        }
        _playListMinus = ImageVector.Builder(
            name = "PlayListMinus",
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
        moveTo(1.99994f, 7.5f)
        horizontalLineTo(20.9999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.4999f, 2.5f)
        lineTo(13.4999f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.49994f, 2.5f)
        lineTo(6.49994f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.4999f, 21f)
        curveTo(7.0216f, 21f, 4.78242f, 21f, 3.39118f, 19.6088f)
        curveTo(1.99994f, 18.2175f, 1.99994f, 15.9783f, 1.99994f, 11.5f)
        curveTo(1.99994f, 7.02166f, 1.99994f, 4.78249f, 3.39118f, 3.39124f)
        curveTo(4.78242f, 2f, 7.0216f, 2f, 11.4999f, 2f)
        curveTo(15.9783f, 2f, 18.2175f, 2f, 19.6087f, 3.39124f)
        curveTo(20.9999f, 4.78249f, 20.9999f, 7.02166f, 20.9999f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.9999f, 18f)
        horizontalLineTo(21.9999f)
        }
        }.build()

        return _playListMinus!!
    }

private var _playListMinus: ImageVector? = null
