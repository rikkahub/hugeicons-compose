package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FilmRoll02: ImageVector
    get() {
        if (_filmRoll02 != null) {
            return _filmRoll02!!
        }
        _filmRoll02 = ImageVector.Builder(
            name = "FilmRoll02",
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
        moveTo(10.4998f, 10.5f)
        horizontalLineTo(10.5075f)
        moveTo(14f, 7f)
        lineTo(13f, 8f)
        moveTo(8f, 13f)
        lineTo(7f, 14f)
        moveTo(14f, 14f)
        lineTo(13f, 13f)
        moveTo(8f, 8f)
        lineTo(7f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 18.5f)
        lineTo(19.3225f, 17.5348f)
        curveTo(20.7193f, 17.2917f, 22f, 18.3514f, 22f, 19.7503f)
        curveTo(22f, 20.9928f, 20.9787f, 22f, 19.7189f, 22f)
        horizontalLineTo(18.7f)
        }
        }.build()

        return _filmRoll02!!
    }

private var _filmRoll02: ImageVector? = null
